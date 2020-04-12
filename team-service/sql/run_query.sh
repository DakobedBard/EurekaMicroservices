#!/bin/bash

docker cp sql/initialize_teams.sql db:/init.sql
docker exec db  psql -d database1 -U database1_role -f init.sql
