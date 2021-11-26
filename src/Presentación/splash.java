package Presentación;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class splash extends javax.swing.JPanel {
  
   ImageIcon imagen; // imagen para mostrar 
     
    public splash() {
   
        initComponents();
        
        estados.setForeground(Color.white);   // CAMBIA COLOR A MENSAJE      
        
        imagen = new ImageIcon(getClass().getResource("splash.png")); // se obtiene la imagen 
        
        this.setSize(imagen.getIconWidth(), imagen.getIconHeight()); // se establece el tamaño del panel segùn el tamaño de la imagen
    }
    
    @Override
    public void paintComponent(Graphics g){ // metodo paintComponent para dibujar/colocar la imagen 
        
        super.paintComponent(g); // para que el panel se despligue sin errores 
        
        g.drawImage(imagen.getImage(), 0, 0, imagen.getIconWidth(), imagen.getIconHeight(), this); // se dibuja la imagen 
        
        this.setOpaque(false); // se establece el panel transparente para que se pueda ver la imagen 
    } 
    
    public void velocidadDeCarga() throws InterruptedException{  
      
        for(int i = 0; i<=100; i++){       // recorrido de la barra de progreso 
            
          //  Thread.sleep(10);            // efecto de carga (mas lento es 100)
            
            progreso.setForeground(Color.BLUE); // color de la barra de progreso 
            progreso.setValue(i);       // se obtiene el valor de recorrido de la barra 
            
                               
            if (i == 30) {
               estados.setText("Cargando Componentes..");
               progreso.setStringPainted(true); // Mostrar valor numérico del progreso de la barra
                             
                            }
            else 
                if (i == 50) {
                    estados.setText("......................"); 
                    progreso.setStringPainted(true); // Mostrar valor numérico del progreso de la barra
                                      
                }
                else
                    if (i == 90) {
                        estados.setText("Iniciando Aplicación..");
                        progreso.setStringPainted(true); // Mostrar valor numérico del progreso de la barra
                                               
                    }
            
              
            try{
            Thread.sleep(10);
        }
        catch(InterruptedException ex){
           
        }

        }
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progreso = new javax.swing.JProgressBar();
        estados = new javax.swing.JLabel();

        estados.setText("Cargando modulos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progreso, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estados)
                .addContainerGap(356, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 294, Short.MAX_VALUE)
                .addComponent(estados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estados;
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables
}


