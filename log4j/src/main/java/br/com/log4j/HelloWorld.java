/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.log4j;

import org.apache.log4j.Logger;

/**
 *
 * @author Willi
 */
public class HelloWorld {

    private static final Logger logger = Logger.getLogger(Class.class);

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.teste();
    }

    public void teste() {
        logger.info("Hello World :)");
    }
}
