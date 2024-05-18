public class Aluno extends Pessoa {

    private String curso;
    private Disciplina[] disciplinas;

    public Aluno(String nome, int idade, String cpf, String curso, Disciplina[] disciplinas) {
        super(nome, idade, cpf);
        this.curso = curso;
        this.disciplinas = disciplinas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Disciplina[] getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(Disciplina[] disciplinas) {this.disciplinas = disciplinas;
    }

    @Override

    public String toString() {
        StringBuilder disciplinasString = new StringBuilder();
        for (Disciplina disciplina : disciplinas) {
            disciplinasString.append(disciplina.getNome()).append(" , ");
        }
        return "\n Aluno {" + "Curso: " + curso + "\nDisciplinas [ " + disciplinasString.substring(0, disciplinasString.length() - 2) + " ]" + "\nCPF: " + getCpf() + "\nNome: " + getNome() + "\nIdade:" + getIdade() +
                '}';
    }
}
