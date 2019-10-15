/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uereka.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * @author Yesison aristizabal Clase construida para parender a manejar eureka
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class, args);
    }
}
