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
public class Escaleno extends TriangulosH implements InterfazT {
    public double ladoC;
    public double S;
    public double A;
    public Escaleno(double ladoA, double ladoB,double ladoC ) {
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
        return ladoA+ladoB+ladoC;
    }

    @Override
    public double calcularArea() {
         S = (ladoA+ladoB+ladoC)/2; 
         A = Math.sqrt(S*(S-ladoA)*(S-ladoB)*(S-ladoC));
        return A;
    }

    @Override
    public double calcularAltura() {
        double Ha = ((2/ladoA)*A);
        return 0;
    }
    
    
}
