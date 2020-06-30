package FrasesPalindromas;

import java.util.Scanner;

public class Main {
   
    public static void main(String [] args){
        Scanner dato = new Scanner(System.in);
        
        //Ingreo de datos por teclado
        System.out.print("Ingrese Una Frase: ");
        String frase = dato.nextLine();

        //Objeto Mensaje
        Mensaje mensaje = new Mensaje();
        mensaje.setFrase(frase);
        mensaje.darFormato();
        
        //Objeto Validacion
        Validacion validacion = new Validacion();
        
        /////Imprimir los resultados/////
        System.out.println("La frase con el nuevo formato es: " + mensaje.getFrase());
        System.out.println("La frase es Polindroma: " + validacion.isPalindromo(mensaje)); //LLamada al método que busca si la frase es pilindroma 
        System.out.println("La frase cuenta solo con letras: " + validacion.soloLetras(mensaje)); //LLamada al método que busca si la frase tiene números 
    }
}
