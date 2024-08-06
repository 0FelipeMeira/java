package CalculadoraGeometrica;

public class EspParalelepipedo {
    /**
     * CLass created to save the formulas to calculate area and perimeter of a Parallelepiped
     *
     * @param comprimento - width of the Parallelepiped
     * @param largura - depth of the Parallelepiped
     * @param altura - height of the Parallelepiped
     */
    static double calcularVolume(int comprimento, int largura, int altura) {
        return PlanoRetangulo.calcularArea(comprimento, largura) * altura;
    }

    static double calcularAreaSuperficial(int comprimento, int largura, int altura) {
        return PlanoRetangulo.calcularArea(comprimento, altura)*2 +
                PlanoRetangulo.calcularArea(comprimento, largura)*2 +
                PlanoRetangulo.calcularArea(largura,altura)*2;
    }
}
