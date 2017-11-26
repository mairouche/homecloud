package org.wizio.homecloud.service.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("org.wizio.homecloud.persistence.repository")
@EntityScan("org.wizio.homecloud.persistence.entity")
@ComponentScan("org.wizio.homecloud")
@SpringBootApplication
public class ServiceApplicationTest {

	public static void main(String[] args) {
        SpringApplication.run(ServiceApplicationTest.class, args);
    }
}
