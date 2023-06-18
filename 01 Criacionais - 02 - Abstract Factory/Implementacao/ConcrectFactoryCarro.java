package Implementacao;

public class ConcrectFactoryCarro implements AbstractFactoryVeiculo{
    public ConcrectProductPneuCarro pneu;
    public ConcrectProductCarroceriaCarro carroceria;


    @Override
    public void criarPneu() {
        this.pneu = new ConcrectProductPneuCarro();
    }

    @Override
    public void criarCarroceria() {
        this.carroceria = new ConcrectProductCarroceriaCarro();
    }

    public void getAll(){
        System.out.println(pneu.pneu);
        System.out.println(carroceria.carroceria);
    }
}
