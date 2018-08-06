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
public class Equilatero extends TriangulosH implements InterfazT {
    
    public Equilatero(double ladoA, double ladoB) {
        super(ladoA, ladoB);
    }

    @Override
    public double calcularPerimetro() {
       return 3*ladoA; 
    }

    @Override
    public double calcularArea() {
        return ((Math.sqrt(3)*ladoA)/2)*Math.pow(ladoA,2);
    }

    @Override
    public double calcularAltura() {
        return (Math.sqrt(3)*ladoA)/2 ;
    }
    
}
