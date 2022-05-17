package com.crud.crudtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;


@SpringBootApplication
public class CrudTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudTestApplication.class, args);



        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        //converter uma LocalDate para LocalDateTime no formato yyyy-MM-dd HH:mm:ss
        LocalDateTime localDateTime = localDate.atStartOfDay();
        System.out.println(localDateTime);






    }
}