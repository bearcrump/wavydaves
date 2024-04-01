#!/bin/bash

# Check if the file argument is provided
if [ $# -eq 0 ]; then
    echo "Usage: $0 <file>"
    exit 1
fi

# Get the filename from the first argument
file="$1"

# Check if the file exists
if [ ! -f "$file" ]; then
    echo "File '$file' not found."
    exit 1
fi

# Now you can use the $file variable in your script
echo "The specified file is: $file"

#docker exec -it wavydaves-postgres pg_restore -U WavyDaves -d WavyDaves "$file"
docker exec -it wavydaves-postgres psql -U WavyDaves -d WavyDaves < "$file"

echo "pg_restore on container using "$file" complete.
