package actividad_2;

import javax.swing.JOptionPane;

public class Main {
   
    public static void main(String [] args){
        String frase;
        frase = JOptionPane.showInputDialog("Ingrese Una Frase");
       
        if(frase == null) Runtime.getRuntime().exit(0); //Evita errores en caso de que el usuario cierre la ventana de dialogo o no ingrese la frase
        else if(frase.equals("")) {
            System.out.println("Ingrese una frase por favor :)");
            Runtime.getRuntime().exit(0);
        }
        
        //Objeto Mensaje
        Mensaje mensaje = new Mensaje();
        mensaje.setFrase(frase);
        mensaje.darFormato();
        
        //Objeto Validacion
        Validacion validacion = new Validacion();
        
        /////Imprimir los resultados/////
        System.out.println("La frase ingresada fue: " + mensaje.getAntFrase());
        System.out.println("La frase con el nuevo formato es: " + mensaje.getFrase());
        
        //LLamada al método que busca si la frase es pilindroma 
        System.out.println("La frase es Polindroma: " + validacion.isPalindromo(mensaje.getFrase()));
        
        //LLamada al método que busca si la frase tiene números 
        System.out.println("La frase cuenta solo con letras: " + validacion.soloLetras(mensaje.getFrase()));
        
    }
}
