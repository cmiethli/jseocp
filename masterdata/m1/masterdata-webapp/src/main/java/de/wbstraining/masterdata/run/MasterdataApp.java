package de.wbstraining.masterdata.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

import de.wbstraining.masterdata.persistence.setup.MyApplicationContextInitializer;
import de.wbstraining.masterdata.spring.MasterdataContextConfig;
import de.wbstraining.masterdata.spring.MasterdataPersistenceJpaConfig;
import de.wbstraining.masterdata.spring.MasterdataServiceConfig;
import de.wbstraining.masterdata.spring.MasterdataWebConfig;

/*
 * Auswahl des Speichers in
 * /masterdata-webapp-m1/src/main/java/de/wbstraining/masterdata/spring/
 * MasterdataPersistenceJpaConfig.java
 *
 * ueber @PropertySource(...) steuern:
 * 1) MySQL DB >> @PropertySource(...h2}.properties) auskommentieren
 * 2) h2 InMemDB >> @PropertySource(...mysql}.properties) auskommentieren
 */
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class,
		ErrorMvcAutoConfiguration.class })
public class MasterdataApp {

	private final static Class<?>[] CONFIGS = { MasterdataContextConfig.class,
			MasterdataPersistenceJpaConfig.class, MasterdataServiceConfig.class

			, MasterdataWebConfig.class

			, MasterdataApp.class };

	public static void main(final String... args) {
		final SpringApplication springApplication = new SpringApplication(CONFIGS);
		springApplication.addInitializers(new MyApplicationContextInitializer());
		springApplication.run(args);
	}

}
