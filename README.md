# xxl-job

分布式任务调度框架xxl-job整理和快速demo

## 前提 搭建 xxl-job-admin(调度中心) 项目

  - 执行docker 下的 start.sh(启动项目xxl-job-admin，通过镜像，并依赖于 mysql镜像)
  - 浏览器打开 http://localhost:8080/xxl-job-admin
  - 这个项目代码不不需要自己写的(有别人现成的镜像可以使用)

## xxl-job

  - xxl-job，是自己的项目，需要在代码里集成xxl-job
  - 直接启动运行xxl-job
  - 在调度中心 配置好自己的xxl-job(与代码里命名一致)
  - 在调度中心 手动/定时 执行 所配置的job，观察日志
  

 