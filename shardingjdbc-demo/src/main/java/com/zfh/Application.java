package com.zfh; /**
 * @author zhangfanghui
 * @since 2017/9/13
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.zfh.exam")
/*SpringBootApplication中默认的扫描规则：自动扫描启动器类的同包或者其子包的下的注解*/
public class Application {
/*************  访问地址：http://localhost:8888/user/dev  ****************/
/***************************************/

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

