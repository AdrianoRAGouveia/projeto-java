package one.digitalInovation.gof;

import one.digitalInovation.gof.facade.Facade;
import one.digitalInovation.gof.singleton.SingletonEager;
import one.digitalInovation.gof.singleton.SingletonLazy;
import one.digitalInovation.gof.singleton.SingletonLazyHolder;
import one.digitalInovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        // Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);


        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);



        //STRATEGY


        Comportamento deferncivo = new ComportamentoDefencivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();



        //FACADE  ("FACEIDE")



        Facade facade = new Facade();
        Facade.migrarCliente("Adriano", "030154-454");







    }
}

