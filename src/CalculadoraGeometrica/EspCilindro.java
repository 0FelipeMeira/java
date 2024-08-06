package CalculadoraGeometrica;

public class EspCilindro {
    /**
     * CLass created to save the formulas to calculate area and perimeter of a Cylinder
     * 
     * @param raio - Radius of the Cylinder
     * @param altura - Height of the Cylinder
     * 
     */
    static double calcularVolume(double raio, double altura){
        return PlanoCirculo.calcularArea(raio)*altura;
    }

    static double calcularAreaSuperficial(double raio,double altura){
        return PlanoCirculo.calcularArea(raio) * 2.0 + PlanoCirculo.calcularPerimetro(raio)*altura;
    }
}
