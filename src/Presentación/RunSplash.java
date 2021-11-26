package Presentación;

import java.awt.BorderLayout;
import javax.swing.*;

public class RunSplash extends JWindow{ 
    
    splash p;           // clase para cargar la ventana del splash
         
    public RunSplash() throws InterruptedException{ // constructor 
        
        p = new splash();   
        
        this.add(p, BorderLayout.CENTER);          // se añade el panel en el centro 
        this.setSize(p.getWidth(), p.getHeight());  // se establece el tamaño del Splash 
        
        this.setLocationRelativeTo(null);         // se muestra el splash en el centro 
        
        p.setVisible(true);                         // OJO se visualiza el Splash Screen 
        
        p.velocidadDeCarga();                 //se invoca al metodo velocidadDeCarga de la clase Panel 
       
        
        this.dispose();                     // se cierra el Splash cuando termina el recorrido de la barra
        this.setVisible(false);
        
           
        frmMenúInicio ventana = new frmMenúInicio();  //creamos la ventana        
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
               
         
            
    } 
     
    public static void main(String args[]) throws InterruptedException { 
        new RunSplash(); // se invoca a la ventana RunSplash   
        
    } 
}  


