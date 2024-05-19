package it.epicode.EsercizioS1G4;

import it.epicode.EsercizioS1G4.bean.Bevanda;
import it.epicode.EsercizioS1G4.bean.Pizza;
import it.epicode.EsercizioS1G4.bean.Topping;
import it.epicode.EsercizioS1G4.service.VoceDiMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private VoceDiMenuService voceDiMenuService;
    @Override
    public void run(String... args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(EsercizioS1G4Application.class);

//        Bevanda b1 = ctx.getBean("birra", Bevanda.class);
//        voceDiMenuService.salvaVoceDiMenu(b1);
//
//        Bevanda b2 = ctx.getBean("acqua", Bevanda.class);
//        voceDiMenuService.salvaVoceDiMenu(b2);
//
//        Bevanda b3 = ctx.getBean("cocacola", Bevanda.class);
//        voceDiMenuService.salvaVoceDiMenu(b3);
//
//        Topping t1 = ctx.getBean("ananas", Topping.class);
//        voceDiMenuService.salvaVoceDiMenu(t1);
//
//        Topping t2 = ctx.getBean("mozzarella", Topping.class);
//        voceDiMenuService.salvaVoceDiMenu(t2);
//
//        Topping t3 = ctx.getBean("prosciuttoCotto", Topping.class);
//        voceDiMenuService.salvaVoceDiMenu(t3);
//
//        Topping t4 = ctx.getBean("pomodoro", Topping.class);
//        voceDiMenuService.salvaVoceDiMenu(t4);
//
//        Topping t5 = ctx.getBean("salame", Topping.class);
//        voceDiMenuService.salvaVoceDiMenu(t5);
//
//        Pizza p1 = ctx.getBean("margherita", Pizza.class);
//        voceDiMenuService.salvaVoceDiMenu(p1);
//
//        Pizza p2 = ctx.getBean("diavola", Pizza.class);
//        voceDiMenuService.salvaVoceDiMenu(p2);
//
//        Pizza p3 = ctx.getBean("hawaii", Pizza.class);
//        voceDiMenuService.salvaVoceDiMenu(p3);

        System.out.println(voceDiMenuService.getPizzaPriceLessThan(6));
        System.out.println(voceDiMenuService.countPizze());
    }
}
