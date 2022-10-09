package com.adminserver.adminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//EnableAdminServer annotáció felhelyezése és indítható
@SpringBootApplication
@EnableAdminServer
public class AdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
    }

}

/*
localhost:8080/applications
kliensbe be kell tenni a server codecentric dependecyjét

 */