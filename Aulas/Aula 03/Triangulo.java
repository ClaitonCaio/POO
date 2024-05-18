//MAIN
package triangulo;

public class Principal {
    
    public static void main(String[] args) {
       Triangulo t1 = new Triangulo(5, 4);
       
        System.out.println("Area t1: " + t1.areaTriangulo());
       
       
    }
    
}


//Triangulo
package triangulo;

public class Triangulo {
    
    //atributos
    
    private int baseTriangulo;
    private int alturaTriangulo;
    
    //metodos - comportamentos
    
    //construtor vazio
     Triangulo(){
        
    }
    
    Triangulo(int baseTriangulo, int alturaTriangulo){
        this.alturaTriangulo = alturaTriangulo;
        this.baseTriangulo = baseTriangulo;
    }
    
    //obter valores
    public int getBaseTriangulo(){
        return baseTriangulo;
    }
    
    public int getAlturaTriangulo(){
    return alturaTriangulo;    
    }
    
    public void setBaseTriangulo(int baseTriangulo){
        this.baseTriangulo = baseTriangulo;
    }
    
     public void setAlturaTriangulo(int alturaTriangulo){
        this.alturaTriangulo = alturaTriangulo;
    
    public double areaTriangulo(){
        return (baseTriangulo * alturaTriangulo)/ 2;
    }
}
