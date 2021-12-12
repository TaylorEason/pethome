package cn.jsc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 启动类
 */
@SpringBootApplication
@MapperScan("cn.jsc.*.mapper")
public class PetHomeApplication {
    public static void main(String[] args) {
        /**
         * 启动入口
         */
        SpringApplication.run(PetHomeApplication .class,args);
    }
}
