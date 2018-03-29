package modelo;

public class Cubo extends Cuadrado{
    public Cubo() {}    
   
    public Cubo(float lado) {
        super(lado);
    }
    
    public double calcularVolumen(){
        return Math.pow(getLado(), 3);
    }
    
    
    public double calcularPerimetroCubo(){
        return getLado() * 12;
    }
    
    
}
