package models

type Address struct {
	ID      int    `json: "id"`
	Country string `json: country`
	State   string `json: state`
	City    string `json: city`
}
