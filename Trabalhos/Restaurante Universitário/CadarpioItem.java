import java.io.Serializable;

public class CardapioItem implements Serializable {
    private String nome;
    private String bebida;

    public CardapioItem(String nome, String bebida) {
        this.nome = nome;
        this.bebida = bebida;
    }

    @Override
    public String toString() {
        return nome + " - " + bebida;
    }
}
