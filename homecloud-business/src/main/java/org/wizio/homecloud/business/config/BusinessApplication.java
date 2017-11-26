package org.wizio.homecloud.business.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("org.wizio.homecloud.persistence.repository")
@EntityScan("org.wizio.homecloud.persistence.entity")
@ComponentScan("org.wizio.homecloud.business")
@SpringBootApplication
public class BusinessApplication {

	public static void main(String[] args) {
        SpringApplication.run(BusinessApplication.class, args);
    }
}
