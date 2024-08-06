package CalculadoraGeometrica;

public class EspEsfera {
    /**
     * CLass created to save the formulas to calculate area and perimeter of a Sphere
     * 
     * @param raio - Radius of the Sphere
     */
    static double calcularVolume(double raio){
        return ( 4.0 * Math.PI * Math.pow(raio, 3) ) / 3.0;
    }

    static double calcularAreaSuperficial(double raio){
        return 4 * Math.PI * Math.pow(raio, 2);
    }
}
