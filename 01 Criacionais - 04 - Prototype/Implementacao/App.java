public class App {
    public static void main(String[] args) {
        Carro carroIcaro = new Carro();

        carroIcaro.setAno("2001");
        carroIcaro.setModelo("FIAT UNO");
        carroIcaro.setCor("Branco");
        carroIcaro.setDono("Icaro");

        carroIcaro.getAll();
        System.out.println("///////////////////");

        Carro carroClone = carroIcaro.clone();
        carroClone.setDono("Clone");
        carroClone.getAll();
        
    }
}
