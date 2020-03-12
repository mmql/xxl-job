#!/usr/bin/env bash

echo "启动mysql————>"
docker-compose up -d mysql

sleep 5

echo "启动调度中心 xxl-job-admin————>"
docker-compose up -d xxl-job-admin

sleep 10
echo '打开ui...'
open http://localhost:8080/xxl-job-admin/