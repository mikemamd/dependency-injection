package com.diexmpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.diexmpl.service.IPersonaService;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    // Esta clase  implementa el CommandLineRunner porque se prueba a partir de la consola
    // no es necesario implementarla ni los métodos derivados de esta.
    private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);
    
    // Se indica a Spring qué se debe inyectar
    @Autowired
    private IPersonaService service;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run (String... args) throws Exception {

        // Se ejecuta su método registrar pasando un String
        service.registrar("MIKE MAMD");
    
    }
}