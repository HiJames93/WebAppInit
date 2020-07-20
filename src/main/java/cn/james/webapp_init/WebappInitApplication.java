package cn.james.webapp_init;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "cn.james.webapp_init.mapper")
@ComponentScan(basePackages = {"cn.james.webapp_init.service","cn.james.webapp_init.controller","cn.james.webapp_init.config","cn.james.webapp_init.realm"})
public class WebappInitApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappInitApplication.class, args);
	}

}
