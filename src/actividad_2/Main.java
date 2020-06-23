package actividad_2;

import javax.swing.JOptionPane;

public class Main {
   
    public static void main(String [] args){
        String frase;
        frase = JOptionPane.showInputDialog("Ingrese Una Frase");
       
        if(frase == null) Runtime.getRuntime().exit(0); //Evita errores en caso de que el usuario cierre la ventana de dialogo 
        
        //Objeto Mensaje
        Mensaje mensaje = new Mensaje();
        mensaje.setFrase(frase);
        mensaje.darFormato();
        
        //Objeto Validacion
        Validacion validacion = new Validacion();
        
        //Imprimir el resultados
        System.out.println("La frase ingresada y corregida es: " + mensaje.getFrase());
        
        if(validacion.isPalindromo(mensaje.getFrase()))
            System.out.println("La frase es Polindroma");
        else
            System.out.println("La frase no es Polindroma");
        
        if(validacion.soloLetras(mensaje.getFrase()))
            System.out.println("La frase cuenta solo con letras");
        else
            System.out.println("La frase cuenta con números además de letras");
    }
}
