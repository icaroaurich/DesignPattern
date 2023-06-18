public class Carro implements IPrototype{
    private String ano;
    private String modelo;
    private String cor;
    private String dono;

    public Carro clone(){
        Carro carro = new Carro();
        carro.ano = this.ano;
        carro.modelo = this.modelo;
        carro.cor = this.cor;
        carro.dono = this.dono;

        return carro;
    }

    public void getAll(){
        System.out.println(ano);
        System.out.println(modelo);
        System.out.println(cor);
        System.out.println(dono);
    }

    public void setAno(String ano){
        this.ano = ano;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
}
