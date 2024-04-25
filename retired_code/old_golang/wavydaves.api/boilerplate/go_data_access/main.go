package main

import (
	"database/sql"
	"fmt"

	_ "github.com/lib/pq"
)

func main() {
	//Capture connection properties

	// Connection string syntax
	// const conString = "postgres://YourUserName:YourPassword@YourHostname:5432/YourDatabaseName";
	connStr := "postgres://Go:asdf@localhost:5432/Go?sslmode=disable"
	db, err := sql.Open("postgres", connStr)

	if err == nil {
		fmt.Println("Successfully connected to postgresql database")
		fmt.Println(db)
	}

	// Write a SQL query to get all of the John Coltrane albums
	name := "John Coltrane"
	rows, err := db.Query("Select * FROM album WHERE artist = $1", name)

	if err != nil {
		fmt.Println("Error while executing query: ")
		fmt.Println(err)
	}

	// Iterate over each row returned from query
	for rows.Next() {

		// Define variables to store data from each column
		var id int
		var title string
		var artist string
		var price float32

		// Scan the current row into the variables
		err := rows.Scan(&id, &title, &artist, &price)

		if err != nil {
			fmt.Println("Error while scanning row: ", err)
			continue
		}

		//Print the retrieved data
		fmt.Printf("ID: %d, Title: %s, Artist: %s, Price: %.2f\n", id, title, artist, price)
	}

}
