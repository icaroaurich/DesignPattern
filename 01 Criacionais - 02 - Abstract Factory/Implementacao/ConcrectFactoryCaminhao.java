package Implementacao;

public class ConcrectFactoryCaminhao implements AbstractFactoryVeiculo{
    public ConcrectProductPneuCaminhao pneu;
    public ConcrectProductCarroceriaCaminhao carroceria;  


    @Override
    public void criarPneu() {
        this.pneu = new ConcrectProductPneuCaminhao();
    }

    @Override
    public void criarCarroceria() {
        this.carroceria = new ConcrectProductCarroceriaCaminhao();
    }

    public void getAll(){
        System.out.println(pneu.pneu);
        System.out.println(carroceria.carroceria);
    }
    
}
