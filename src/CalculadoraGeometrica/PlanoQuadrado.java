package CalculadoraGeometrica;

public class PlanoQuadrado {
    /**
     * CLass created to save the formulas to calculate area and perimeter of a Square
     * 
     * @param lado - side of the Square
     */
    static double calcularArea(double lado){
        return Math.pow(lado,2);
    }

    static double calcularPerimetro(int lado){
        return lado*4;
    }
}
