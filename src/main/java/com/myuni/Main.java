package com.myuni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 Main Class
 */
@SpringBootApplication
public class Main {
    public static void main (String[] args) {
        System.out.println("Starting My Uni...");
        SpringApplication.run (Main.class, args);
    }
}
