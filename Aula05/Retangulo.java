package poligono;


public class Retangulo {
     
//atributos - caracteristicas
    int baseRetangulo;
    int alturaRetangulo;

    //Construtor vazio
    public Retangulo() {
        
    }
    
    //Contrutor para instancias
    public Retangulo(int alturaRetangulo, int baseRetangulo) {
        this.alturaRetangulo = alturaRetangulo;
        this.baseRetangulo = baseRetangulo;
    }
    
    //Acessar os metodos
    //alterar dados do objetos
    public void setBaseRetangulo(int baseRetangulo){
        this.baseRetangulo = baseRetangulo;
    }
    
    public void setAlturaRetangulo(int alturaRetangulo){
        this.alturaRetangulo = alturaRetangulo;
    }
    
    //obter dados do objetos
    public int getBaseRetangulo(){
        return this.baseRetangulo;
    }
    
    public int getAlturaRetangulo(){
        return this.alturaRetangulo;
    }

    @Override
    public String toString() {
        return "Retangulo{" + "baseRetangulo = " + baseRetangulo + ", alturaRetangulo = " + alturaRetangulo + '}';
    }
    //método - comportamento: Cálculo da area

}
