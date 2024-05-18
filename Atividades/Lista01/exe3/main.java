
public class Main {

    public static void main(String[] args) {



        Disciplina disciplina1 = new Disciplina("ED1");
        Disciplina disciplina2 = new Disciplina("POO");

        Aluno aluno = new Aluno("Claiton", 19, "333.333.333-33", "Ciencia da Computacao", new Disciplina[]{disciplina1, disciplina2});

        System.out.println(aluno);

        }
}
