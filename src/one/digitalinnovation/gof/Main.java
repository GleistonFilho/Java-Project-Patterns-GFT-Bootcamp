package one.digitalinnovation.gof;
import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.strategy.*;

import one.digitalinnovation.gof.singleton.*;

public class Main {
    public static void main(String[] args) {
        singletonTesting();
        strategyTesting();
        facadeTesting();
    }

    public static void singletonTesting(){
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lh = SingletonLazyHolder.getInstancia();
        System.out.println(lh);
        lh = SingletonLazyHolder.getInstancia();
        System.out.println(lh);
    }

    public static void strategyTesting(){
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }

    public static void facadeTesting(){
        Facade facade = new Facade();
        facade.migrarCliente("Name MCNameface", "11302101");
    }
}
