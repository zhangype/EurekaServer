package com.zhangype.cloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心启动类
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2018/1/9
 */
@EnableEurekaServer
@SpringBootApplication
public class CloudServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerApplication.class, args);
    }

}
