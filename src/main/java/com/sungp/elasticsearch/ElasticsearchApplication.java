package com.sungp.elasticsearch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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

        log.debug("-------------------debug-----------------------");
        log.info("-----------------------info-------------------");
        log.error("--------------------error----------------------");

    }

}
