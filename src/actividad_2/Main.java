package actividad_2;

import javax.swing.JOptionPane;

public class Main {
   
    public static void main(String [] args){
        String frase;
        frase = JOptionPane.showInputDialog("Ingrese Una Frase");
       
        if(frase == null){
            Runtime.getRuntime().exit(0);
        }
        
        //Objeto Mensaje
        Mensaje mensaje = new Mensaje(frase);
        mensaje.darFormato();
        mensaje.ImprimirResultados();
    }
}
