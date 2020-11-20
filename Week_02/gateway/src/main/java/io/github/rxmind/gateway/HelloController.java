package io.github.rxmind.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @description 
 *
 * @author renxin
 * @email renxinzhiliangzhi@163.com
 * @date 2020/11/19 上午11:44
 */
@EnableScheduling
@RestController
public class HelloController {

    public static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("api/hello")
    public Object hello(){

        return "{\"word\":\"hello\"}";
    }


    @Scheduled(cron = "0/1 * * * * ?")
    public void error(){

        LOGGER.error("测试信息");
        LOGGER.info("info message");
        LOGGER.warn("debug message");

    }

}
