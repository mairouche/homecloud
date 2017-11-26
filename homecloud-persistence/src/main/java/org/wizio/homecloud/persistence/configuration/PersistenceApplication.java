package org.wizio.homecloud.persistence.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("org.wizio.homecloud.persistence.repository")
@EntityScan("org.wizio.homecloud.persistence.entity")
@SpringBootApplication
public class PersistenceApplication {

	public static void main(String[] args) {
        SpringApplication.run(PersistenceApplication.class, args);
    }
}
