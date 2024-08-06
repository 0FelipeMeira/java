package CalculadoraGeometrica;

public class EspCubo {
    /**
     * CLass created to save the formulas to calculate area and perimeter of a Cube
     * 
     * @param lado - Side of the Cube
     */
    static double calcularVolume(double lado){
        return PlanoQuadrado.calcularArea(lado) * lado;
    }

    static double calcularAreaSuperficial(double lado){
        return PlanoQuadrado.calcularArea(lado) * 6;
    }
}
