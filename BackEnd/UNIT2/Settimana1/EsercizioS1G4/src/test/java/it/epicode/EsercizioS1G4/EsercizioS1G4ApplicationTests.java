package it.epicode.EsercizioS1G4;

import it.epicode.EsercizioS1G4.bean.Tavolo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class EsercizioS1G4ApplicationTests {


	private static ApplicationContext ctx;  //il metodo e la variabile devono essere statici
	@BeforeAll
	public static void getApplicationContext() { //il metodo e la variabile devono essere statici
		ctx = new AnnotationConfigApplicationContext(EsercizioS1G4Application.class);
	}
	@Test
	void verificaCostoCopertoTavolo1() {
		Tavolo  tavolo = ctx.getBean("tavolo1", Tavolo.class);
		Assertions.assertEquals(2, tavolo.getCoperto());
	}

	@ParameterizedTest
	@CsvSource({"tavolo1, 2","tavolo2, 3","tavolo3, 2.5"})
	public void verificaCostoCopertoPerTuttiITavoli(String tavolo, double coperto){
		Tavolo t = ctx.getBean(tavolo, Tavolo.class);
		Assertions.assertEquals(coperto, t.getCoperto());
	}

}
