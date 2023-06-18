package Implementacao;

public class App{
    public static void main(String[] args) {

        AbstractFactoryVeiculo carro = new ConcrectFactoryCarro();
        carro.criarCarroceria();
        carro.criarPneu();
        carro.getAll();  
        
        AbstractFactoryVeiculo caminhao = new ConcrectFactoryCaminhao();
        caminhao.criarCarroceria();
        caminhao.criarPneu();
        caminhao.getAll();
    
    }
}
