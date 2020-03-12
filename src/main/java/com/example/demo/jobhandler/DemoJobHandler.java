package com.example.demo.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

@Component
public class DemoJobHandler {

    /**
     * 方法名自定义
     *
     * @param param
     * @return
     */
    @XxlJob("demoJobHandler")
    public ReturnT<String> test(String param) {
        XxlJobLogger.log("demoJobHandler begin");

        long currentTime = System.currentTimeMillis();

        XxlJobLogger.log("传参为：" + param);

        Long spendTime = System.currentTimeMillis() - currentTime;
        XxlJobLogger.log("demoJobHandler finish, spend time " + spendTime + "ms");

        return ReturnT.SUCCESS;
    }
}
