package one.digitalInovation.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover(){
        System.out.println("Comportamento agressivo");
    }
}
