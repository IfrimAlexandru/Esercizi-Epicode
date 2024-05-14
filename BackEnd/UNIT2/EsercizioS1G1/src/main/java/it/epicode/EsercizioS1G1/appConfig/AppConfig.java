package it.epicode.EsercizioS1G1.appConfig;

import it.epicode.EsercizioS1G1.bean.Bevanda;
import it.epicode.EsercizioS1G1.bean.Menu;
import it.epicode.EsercizioS1G1.bean.Pizza;
import it.epicode.EsercizioS1G1.bean.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;


@Configuration
public class AppConfig {

   @Bean
   public Bevanda birra(){
       Bevanda birra = new Bevanda();
       birra.setNome("Peroni");
       birra.setMl(330);
       birra.setGradoAlcohol(5);
       birra.setCalorie(250);
       birra.setPrezzo(3);
       return birra;
   }

    @Bean
    public Bevanda acqua(){
        Bevanda acqua = new Bevanda();
        acqua.setNome("Ferrarelle");
        acqua.setMl(500);
        acqua.setGradoAlcohol(0);
        acqua.setCalorie(0);
        acqua.setPrezzo(2);
        return acqua;
    }

    @Bean
    public Bevanda cocacola(){
        Bevanda cocacola = new Bevanda();
        cocacola.setNome("cocacola");
        cocacola.setMl(500);
        cocacola.setGradoAlcohol(0);
        cocacola.setCalorie(300);
        cocacola.setPrezzo(3);
        return cocacola;
    }
    @Bean
    public Topping mozzarella(){
        Topping mozzarella = new Topping();
        mozzarella.setNome("mozzarella");
        mozzarella.setCalorie(100);
        mozzarella.setPrezzo(1);
        return mozzarella;
    }

    @Bean
    public Topping pomodoro(){
        Topping pomodoro = new Topping();
        pomodoro.setNome("pomodoro");
        pomodoro.setCalorie(100);
        pomodoro.setPrezzo(1);
        return pomodoro;
    }

    @Bean
    public Topping salame(){
        Topping salame = new Topping();
        salame.setNome("salame");
        salame.setCalorie(150);
        salame.setPrezzo(1.5);
        return salame;
    }

    @Bean
    public Topping prosciuttoCotto(){
        Topping prosciuttoCotto = new Topping();
        prosciuttoCotto.setNome("prosciuttoCotto()");
        prosciuttoCotto.setCalorie(250);
        prosciuttoCotto.setPrezzo(2);
        return prosciuttoCotto;
    }

    @Bean
    public Topping ananas(){
        Topping ananas = new Topping();
        ananas.setNome("ananas");
        ananas.setCalorie(140);
        ananas.setPrezzo(2);
        return ananas;
    }

    public Pizza base(){
        Pizza base = new Pizza();
        ArrayList<Topping> toppings = new ArrayList<>();
        toppings.add(mozzarella());
        base.setToppings(toppings);
        return base;
    }

    @Bean
    public Pizza hawaii(){
        Pizza hawaii = base();
        hawaii.setNome("hawaii");
        hawaii.setCalorie(900);
        hawaii.setPrezzo(9);
        hawaii.getToppings().add(pomodoro());
        hawaii.getToppings().add(prosciuttoCotto());
        hawaii.getToppings().add(ananas());

        return hawaii;
    }


    @Bean
    public Pizza margherita(){
        Pizza margherita = base();
        margherita.setNome("margherita");
        margherita.setCalorie(700);
        margherita.setPrezzo(5);
        margherita.getToppings().add(pomodoro());
        return margherita;
    }


    @Bean
    public Pizza diavola(){
        Pizza diavola = base();
        diavola.setNome("diavola");
        diavola.setCalorie(800);
        diavola.setPrezzo(6);
        diavola.getToppings().add(salame());
        diavola.getToppings().add(pomodoro());
        return diavola;
    }

    @Bean
    public Menu menu(){
       Menu menu = new Menu();
       ArrayList<Bevanda> bevande = new ArrayList<>();
       bevande.add(birra());
       bevande.add(acqua());
       bevande.add(cocacola());

       ArrayList<Topping> toppings = new ArrayList<>();
       toppings.add(mozzarella());
       toppings.add(pomodoro());
       toppings.add(salame());

       ArrayList<Pizza> pizze = new ArrayList<>();
       pizze.add(margherita());
       pizze.add(diavola());
       pizze.add(hawaii());

       menu.setToppings(toppings);
       menu.setBevande(bevande);
       menu.setPizze(pizze);

        return menu;
    }




}
