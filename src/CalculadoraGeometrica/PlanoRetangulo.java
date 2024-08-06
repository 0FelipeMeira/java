package CalculadoraGeometrica;

public class PlanoRetangulo {
    /**
     * CLass created to save the formulas to calculate area and perimeter of a Rectangle
     * 
     * @param lado1 - width of the rectangle
     * @param lado2 - height of the rectangle
     */
    static double calcularArea(double lado1, double lado2){

        return lado1*lado2;
    }

    static double calcularPerimetro(double lado1, double lado2){
        return (lado1*2)+(lado2*2);
    }

}
