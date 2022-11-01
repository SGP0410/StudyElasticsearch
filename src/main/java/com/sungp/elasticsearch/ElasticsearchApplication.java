package com.sungp.elasticsearch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.net.UnknownHostException;

/**
 * @author sungp
 * @description: 启动类  ALL < TRACE < DEBUG < INFO < WARN < ERROR < FATAL < OFF
 * @date 2022年10月17日 14:00
 */
@Slf4j
@SpringBootApplication
public class ElasticsearchApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ElasticsearchApplication.class);
        log.info("启动成功");
//        Environment env = applicationContext.getEnvironment();
//        String ip = InetAddress.getLocalHost().getHostAddress();
//        String port = env.getProperty("server.port");
//        log.info("\n----------------------------------------------------------\n\t" +
//                "Application Jeecg-Boot is running! Access URLs:\n\t" +
//                "Local: \t\thttp://localhost:" + port + "/\n\t" +
//                "External: \thttp://" + ip + ":" + port + "/\n\t" +
//                "Swagger文档: \thttp://" + ip + ":" + port + "/doc.html\n" +
//                "----------------------------------------------------------");

    }

}
