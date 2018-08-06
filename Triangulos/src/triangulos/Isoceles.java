/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulos;

/**
 *
 * @author ESFOT
 */
public class Isoceles extends TriangulosH implements InterfazT {
    
    public Isoceles(double ladoA, double ladoB) {
        super(ladoA, ladoB);
    }

    @Override
    public double calcularPerimetro() {
        return 2*ladoA+ladoB;
    }

    @Override
    public double calcularArea() {
        return (ladoB*(Math.sqrt((Math.pow(ladoA,2)-(Math.pow(ladoB,2))/4))))/2;
    }

    @Override
    public double calcularAltura() {
        return Math.sqrt(Math.pow(ladoA,2)-(Math.pow(ladoB,2))/4) ;
    }
    
}
