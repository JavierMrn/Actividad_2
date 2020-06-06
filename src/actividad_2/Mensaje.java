package actividad_2;

public class Mensaje extends Validacion{
    
    //Atributos
    private String palabra;
    
    //Constructor
    public Mensaje(String palabra){
        this.palabra = palabra;
    }
    
    //Metodo Para Eliminar Espacios
    void darFormato(){
        palabra = palabra.replace(".", "");
        palabra = palabra.replaceAll("\\s+", "");
        palabra = palabra.toLowerCase();
    }
    
    void ImprimirResultados(){
        System.out.println("La frase ingresada y corregida es: " + palabra);
        
        if(isPolindromo(palabra))
            System.out.println("La frase es Polindroma");
        else
            System.out.println("La frase no es Polindroma");
        
        if(soloLetras(palabra))
            System.out.println("La frase cuenta solo con letras");
        else
            System.out.println("La frase cuenta con números además de letras");
    } 
    
    /*
    private String eliminarEspacios(){
        String newString = "";
        
        for (int i = 0; i < palabra.length(); i++) {
            if(palabra.charAt(i) != ' ' && palabra.charAt(i) != '\n' && palabra.charAt(i) != '.'){
                newString += palabra.charAt(i);
            }
        }
        
        return newString;
    }
    */
}
