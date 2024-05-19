public class Testes {
    public static void main(String[] args) {
        CadernodeEnderecos pessoa = new CadernodeEnderecos("Claiton", "62999803777", "claiton.souza@discente.ufj.edu.br","17/08/2024", "Vila Sofia");


        System.out.println("\n Informações da Pessoa: \n");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Email: " + pessoa.getEmail());
        System.out.println("Data de aniversário: " + pessoa.getData());
        System.out.println("Endereço: " + pessoa.getEndereco());

        }
    }
