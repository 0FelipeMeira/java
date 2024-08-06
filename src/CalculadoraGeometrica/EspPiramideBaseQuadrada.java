package CalculadoraGeometrica;

public class EspPiramideBaseQuadrada {
    /**
     * CLass created to save the formulas to calculate area and perimeter of a Square Pyramid
     * 
     * @param lado - side of the base of the Square Pyramid
     * @param altura - height of the Square Pyramid
     */

    static double calcularVolume(int lado, int altura){
        return (PlanoQuadrado.calcularArea(lado) * altura) / 3.0;
    }

    static double calcularAreaSuperficial(double lado, double altura){
        double faceTriangular = (altura * lado)/2;
        double base = PlanoQuadrado.calcularArea(lado);
        return faceTriangular * 4 + base;
    }
}
