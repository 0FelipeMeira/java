package CalculadoraGeometrica;

public class PlanoCirculo {
    /**
     * CLass created to save the formulas to calculate area and perimeter of a circle
     *
     *  @param raio - radius of the circle
     */
    static double calcularArea(double raio){
        return Math.PI * Math.pow(raio,2);
    }

    static double calcularPerimetro(double raio){
        return 2 * Math.PI * raio;
    }
}
