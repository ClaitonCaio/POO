//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veiculo.Motocicletas motocicletas = new Veiculo.Motocicletas("Vermelho", 160, 2018, 20000, 160);
        Veiculo.Carro carro = new Veiculo.Carro("Vermelho", 160, 2019, 45000, 4);
        Veiculo.Caminhao caminhao = new Veiculo.Caminhao("Preto", 500, 2020, 80000, 16000);


        System.out.println("\nInformações da Motocicleta: \n");
        System.out.println("Cor:"+ motocicletas.getCor());
        System.out.println("Potência:"+ motocicletas.getPotencia());
        System.out.println("Ano:"+ motocicletas.getAno());
        System.out.println("Valor:"+ motocicletas.getValor());
        System.out.println("Cilindrada:"+ motocicletas.getCilidrada());


        System.out.println("\nInformações do Carro: \n");
        System.out.println("Cor:"+ carro.getCor());
        System.out.println("Potencia:"+ carro.getPotencia());
        System.out.println("Ano:"+ carro.getAno());
        System.out.println("Valor:"+ carro.getValor());
        System.out.println("Número de Portas:"+ carro.getNumPortas());


        System.out.println("\nInformações do Caminhão");
        System.out.println("Cor:"+ caminhao.getCor());
        System.out.println("Potencia:"+ caminhao.getPotencia());
        System.out.println("Ano:"+ caminhao.getAno());
        System.out.println("Valor:"+ caminhao.getValor());
        System.out.println("Capacidade de Cargas:"+ caminhao.getCapCargas());



    }

}
