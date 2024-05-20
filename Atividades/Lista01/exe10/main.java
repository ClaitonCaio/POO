public class Main {
    public static void main(String[] args) {

        Notas notas = new Notas(6.2f, 4.0f, 9.0f, 8.0f, 2.5f, 10.0f);
        System.out.println("\nTrabalhos: ");
        System.out.println("Trabalho 1: " + notas.getprimeirotrabalho());
        System.out.println("Trabalho 2: " + notas.getsegundotrabalho());
        System.out.println("Trabalho 3: " + notas.getterceirotrabalho());
        System.out.println("Trabalho 4: " + notas.getquartotrabalho());
        System.out.println("\nProvas: ");
        System.out.println("Prova 1: " + notas.getProva1());
        System.out.println("Prova 2: " + notas.getProva2());

        float mediaFinal = notas.calcularMediaFinal();
        System.out.println("\nMédia Final: " + mediaFinal);

        if (notas.foiAprovado()) {
            System.out.println("Aluno está aprovado.");
        } else {
            System.out.println("Aluno não está aprovado.");
        }
    }
}
