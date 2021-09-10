package com.baeldung.lsd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.baeldung.lsd.persistence.repository.ProjectRepository;

@SpringBootApplication
public class AuditingApp implements ApplicationRunner {

    private static final Logger LOG = LoggerFactory.getLogger(AuditingApp.class);

    @Autowired
    private ProjectRepository projectRepository;

    public static void main(final String... args) {
        SpringApplication.run(AuditingApp.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }

}
