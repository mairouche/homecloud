package org.wizio.homecloud.api.config;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.wizio.homecloud.business.config.BusinessApplication;
import org.wizio.homecloud.persistence.configuration.PersistenceApplication;
import org.wizio.homecloud.service.configuration.ServiceApplication;

@ComponentScan("org.wizio.homecloud")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
		.bannerMode(Banner.Mode.CONSOLE)
		.sources(PersistenceApplication.class, ServiceApplication.class, BusinessApplication.class)
		.run(args);
	}
}
