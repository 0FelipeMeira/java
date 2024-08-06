package CalculadoraGeometrica;

public class EspCone {
    /**
     * CLass created to save the formulas to calculate area and perimeter of a Cone
     *
     * @param raio - Radius of the Cone
     * @param altura - Height of the Cone
     */
    double calcularVolume(double raio, double altura){
        return EspCilindro.calcularVolume(raio, altura) / 3.0;
    }

    double calcularAreaSuperficial(double raio, double altura){        
        double base = PlanoCirculo.calcularArea(raio);
        double geratriz = Math.pow( Math.pow(raio, 2) + Math.pow(altura, 2), 0.5 );
        return  base + (Math.PI * raio * geratriz);
    }
}
