package CalculadoraGeometrica;

public class PlanoTrianguloEquilatero {
    /**
     * Class created to save the formulas to calculate area and perimeter of a Equilateral Triangle
     * 
     * @param lado - Side of the Equilateral Triangle
     */
    static double calcularArea(double lado){
        return ( Math.pow(lado,2) * Math.pow(3,0.5) ) / 4;
    }

    static double calcularPerimetro(double lado){
        return lado*3;
    }
}
