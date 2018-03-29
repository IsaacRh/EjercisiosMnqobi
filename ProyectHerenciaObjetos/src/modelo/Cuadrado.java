package modelo;

public class Cuadrado {
    
    private float lado;

    public Cuadrado(){}
    
    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    
    public double calcularArea(){
        return Math.pow(getLado(),2);
    }
    
    public double calcularPerimetro(){
        return getLado() * 4;
    }
    
}
