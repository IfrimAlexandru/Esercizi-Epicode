package it.epicode.EsercizioS1G4;

import it.epicode.EsercizioS1G4.bean.Menu;
import it.epicode.EsercizioS1G4.bean.Ordine;
import it.epicode.EsercizioS1G4.enumerators.StatoOrdine;
import it.epicode.EsercizioS1G4.bean.Tavolo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.util.List;

//@Component
public class NewCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(EsercizioS1G4Application.class);

        Menu menu = ctx.getBean(Menu.class);
        menu.stampaMenu();

        Tavolo tavolo1 = ctx.getBean("tavolo1", Tavolo.class);

        Ordine ordine = new Ordine(5, tavolo1);

        ordine.setNumeroOrdine(1);
        ordine.setDataAcquisizione(LocalDateTime.now());
        ordine.setStatoOrdine(StatoOrdine.IN_CORSO);
        ordine.setBevande(List.of(menu.getBevande().get(0), menu.getBevande().get(1)));
        ordine.setToppings(List.of(
                menu.getToppings().get(0), menu.getToppings().get(1)));
        ordine.setPizze(List.of(menu.getPizze().get(0), menu.getPizze().get(0),
                menu.getPizze().get(1), menu.getPizze().get(1)));

        ordine.stampaOrdine();

    }

}
