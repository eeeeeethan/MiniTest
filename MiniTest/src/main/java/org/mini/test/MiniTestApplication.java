package org.mini.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * author Ethan Hu
 * date 2019-03-21
 */
@SpringBootApplication
@Configuration("application.yml")
public class MiniTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(MiniTestApplication.class, args);

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }

    }
}
