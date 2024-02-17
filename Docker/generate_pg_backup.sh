#!/bin/bash

# Get current date in the format yyyyMMdd
current_date=$(date +"%Y%m%d")

# Set the filename for the backup
backup_file="${current_date}.bak"

# Run pg_dump command inside the Docker container
docker exec wavydaves-postgres pg_dump -U WavyDaves -d WavyDaves -f "${backup_file}"

# Copy the backup file to the same directory as the script
docker cp wavydaves-postgres:"${backup_file}" "$(dirname "$(realpath "$0")")/Backups/${backup_file}"

echo "Backup completed: ${backup_file}"
