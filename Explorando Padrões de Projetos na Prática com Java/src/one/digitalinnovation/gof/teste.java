package one.digitalinnovation.gof;


import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.facade.SingletonLazy;
import one.digitalinnovation.gof.facade.SingletonLazyHolder;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.strategy.*;

public class teste {
    public static  void main(String[] args) {
        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento defensivo =  new ComportamentoDefensivo();
        Comportamento normal =  new ComportamentoNormal();
        Comportamento agressivo =  new ComportamentoAgresivo();

        Robo robo = new Robo();
        robo.setComportamento((one.digitalinnovation.gof.strategy.Comportamento) normal);
        robo.mover();
        robo.mover();
        robo.setComportamento((one.digitalinnovation.gof.strategy.Comportamento) defensivo);
        robo.mover();
        robo.setComportamento((one.digitalinnovation.gof.strategy.Comportamento) agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade

        Facade facade = new Facade();
        Facade.migrarCliente("André Luiz", "09132150");
    }
}
