package it.epicode.EsercizioS1G1;

import it.epicode.EsercizioS1G1.appConfig.AppConfig;
import it.epicode.EsercizioS1G1.bean.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EsercizioS1G1Application {
	public static void main(String[] args) {
		SpringApplication.run(EsercizioS1G1Application.class, args);

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Menu menu = ctx.getBean(Menu.class);

		menu.stampaMenu();

	}


}

