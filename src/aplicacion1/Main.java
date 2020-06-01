package aplicacion1;

import javax.swing.JOptionPane;

public class Main {
   
    public static void main(String [] args){
        String frase;
        frase = JOptionPane.showInputDialog("Ingrese Una Frase");
        
        //Objeto Mensaje
        Mensaje mensaje = new Mensaje(frase);
        mensaje.darFormato();
        mensaje.ImprimirResultados();
    }
}
