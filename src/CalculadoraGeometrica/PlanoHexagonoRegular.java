package CalculadoraGeometrica;

public class PlanoHexagonoRegular {
    /**
     * CLass created to save the formulas to calculate area and perimeter of a regular hexagon
     * 
     * @param lado - Side of the regular hexagon
     */
    static double calcularArea(double lado){
        return ( 3 * Math.pow(lado,2) * Math.pow(3,0.5) ) / 2;
    }

    static double calcularPerimetro(double lado){
        return lado*6;
    }
}
