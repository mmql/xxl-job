#!/usr/bin/env bash

docker-compose down --volumes

docker volume prune -f
docker network prune -f