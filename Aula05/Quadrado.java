package poligono;


public class Quadrado {

    Quadrado(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setLado(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getLado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    //Quadrado é uma especifidade de Retangulo
    //Reusabilidade da classe Retangulo
public class Quadrado extends Retangulo {



//Construtor herdando os paramentros da Classe Mãe
            //set herdando o set da Classe Mãe
    public void setLado(int lado) {
        super.setAlturaRetangulo(lado);
        super.setBaseRetangulo(lado);
    }

    //get herdando o get da Classe Mãe
    public int getLado() {
        return super.getAlturaRetangulo();
    }

    @Override
    public String toString() {
        return super.toString() + " Tipo: Quadrado";
    }  
    }
}
