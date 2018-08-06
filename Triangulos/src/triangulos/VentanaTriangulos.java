/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulos;

import javax.swing.JOptionPane;

/**
 *
 * @author ESFOT
 */
public class VentanaTriangulos extends javax.swing.JFrame {

    /**
     * Creates new form VentanaTriangulos
     */
    public VentanaTriangulos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboTriangulos = new javax.swing.JComboBox<>();
        lblLadoA = new javax.swing.JLabel();
        lblLadoB = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtLadoA = new javax.swing.JTextField();
        txtLadob = new javax.swing.JTextField();
        lblArea = new javax.swing.JLabel();
        lblPerimetro = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        lblLadoC = new javax.swing.JLabel();
        txtLadoC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Triángulos");

        jLabel2.setText("Tipo de triángulo");

        comboTriangulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rectangulo", "Isoceles", "Escaleno", "Equilatero" }));
        comboTriangulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTriangulosActionPerformed(evt);
            }
        });

        lblLadoA.setText("Lado a");

        lblLadoB.setText("Lado b");

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel6.setText("Resultados");

        jLabel7.setText("Area:");

        jLabel8.setText("Perimetro:");

        jLabel9.setText("Altura:");

        lblLadoC.setText("Lado c");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(308, 308, 308))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblLadoB)
                                        .addComponent(lblLadoA))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLadoC)
                                .addGap(47, 47, 47)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtLadob, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLadoA, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(comboTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(btnCalcular)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblLadoC)
                            .addComponent(txtLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLadoA)
                            .addComponent(txtLadoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLadoB)
                            .addComponent(txtLadob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTriangulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTriangulosActionPerformed
      
                
    }//GEN-LAST:event_comboTriangulosActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
            
             double ladoA ;
             double ladoB;
             double ladoC;
    
        
        ladoA = Double.parseDouble(txtLadoA.getText());
        ladoB = Double.parseDouble(txtLadob.getText());
        ladoC= Double.parseDouble(txtLadoC.getText());
       
            
            if(comboTriangulos.getSelectedIndex() ==0){ 
                 System.out.println("rec");
                double lado3;
                lblLadoC.setEnabled(false);
                txtLadoC.setEnabled(false);
                lado3= Math.sqrt(Math.pow(ladoA,2)+Math.pow(ladoB,2));
                InterfazT triR;
                triR = new Rectangulo(ladoA,ladoB,lado3);
                lblArea.setText(""+triR.calcularArea());
                lblPerimetro.setText(""+triR.calcularPerimetro());
                lblAltura.setText(""+triR.calcularAltura());
                       
            }else if(comboTriangulos.getSelectedIndex() ==1){
                
           
                System.out.println("Iscoceles");
               lblLadoC.setEnabled(false);
                txtLadoC.setEnabled(false);
                InterfazT triI;
                triI= new Isoceles(ladoA,ladoB);
                lblArea.setText(""+triI.calcularArea());
                lblPerimetro.setText(""+triI.calcularPerimetro());
                lblAltura.setText(""+triI.calcularAltura());
            }else if(comboTriangulos.getSelectedIndex() ==2){
                
           
                 System.out.println("Esca");
                InterfazT triE;
                triE= new Escaleno(ladoA,ladoB,ladoC);
                lblArea.setText(""+triE.calcularArea());
                lblPerimetro.setText(""+triE.calcularPerimetro());
                lblAltura.setText(""+triE.calcularAltura());
            }else if(comboTriangulos.getSelectedIndex() ==3){
                
          
                 System.out.println("EQUI");
                lblLadoC.setEnabled(false);
                txtLadoC.setEnabled(false);
                 InterfazT triEqui;
                triEqui= new Equilatero(ladoA,ladoB);
                lblArea.setText(""+triEqui.calcularArea());
                lblPerimetro.setText(""+triEqui.calcularPerimetro());
                lblAltura.setText(""+triEqui.calcularAltura());
                
    }//GEN-LAST:event_btnCalcularActionPerformed
    }
    /**
     * @param args the command line arguments
     */
    
    boolean validacion (double lado1,double lado2,double lado3){
    boolean existe = true;
    if(lado1+lado2 > lado3){ 
     return existe;
    }else { 
       
        existe = false;
        JOptionPane.showMessageDialog(rootPane,"No existe un triangulo con esos lados");
    return existe;}
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> comboTriangulos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblLadoA;
    private javax.swing.JLabel lblLadoB;
    private javax.swing.JLabel lblLadoC;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JTextField txtLadoA;
    private javax.swing.JTextField txtLadoC;
    private javax.swing.JTextField txtLadob;
    // End of variables declaration//GEN-END:variables
}
