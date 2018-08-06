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

public class Rectangulo extends TriangulosH implements InterfazT {
    public double ladoC;
    public Rectangulo(double ladoA, double ladoB,double ladoC) {
        super(ladoA, ladoB);
        this.ladoC = ladoC;
    } 

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
    

    @Override
    public double calcularPerimetro() {
        return (ladoA*ladoB);
    }

    @Override
    public double calcularArea() {
        return ladoA+ladoB+ladoC;
    }

    @Override
    public double calcularAltura() {
        return (ladoA*ladoB)/ladoC;
    }

   
    
 
   
}
