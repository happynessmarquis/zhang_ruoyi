package com.zhang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;


@SpringBootApplication
public class ZhangApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZhangApplication.class, args);
        System.out.println("自创系统启动成功");

//        //创建模板引擎
//        TemplateEngine engine = new TemplateEngine();
//        //准备模板
//        String input = "<input type='text' th: value='hello_thymeleaf'/>";
//
//        //准本数据，使用Context
//        Context context = new Context();
//        //调用引擎，处理模板数据
//        String out = engine.process(input, context);
//        System.out.println("结果数据: " + out);
    }

}
