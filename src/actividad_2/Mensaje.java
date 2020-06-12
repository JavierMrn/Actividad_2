package actividad_2;

public class Mensaje extends Validacion {
    
    //Atributos
    private String frase;
    
    //Constructores
    public Mensaje(){
        this("");
    }
    
    public Mensaje(String palabra){
        this.frase = palabra;
    }
    
    //Metodo Para Eliminar Espacios
    public void darFormato(){
        frase = frase.replace(".", ""); //Metodo interno que hay en las clases tipo String para remplazar todo un caracter por otro.
        frase = frase.replaceAll("\\s+", ""); //Metodo interno que hay en las clases tipo String, hace lo mismo que arriba.
        frase = frase.toLowerCase(); //Metodo interno que hay en las clases tipo String para transformar todo a minusculas.
    }
    
    //Metodo que imprime el resultado
    public void ImprimirResultados(){
        System.out.println("La frase ingresada y corregida es: " + frase);
        
        //Llamada a la clase validacion para las verificaciones
        if(isPolindromo(frase))
            System.out.println("La frase es Polindroma");
        else
            System.out.println("La frase no es Polindroma");
        
        if(soloLetras(frase))
            System.out.println("La frase cuenta solo con letras");
        else
            System.out.println("La frase cuenta con números además de letras");
    } 
    
    //Metodos Geters and Seters
    
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    //Excepciones
    
    //Metodos Opcionales para hacer las conversiones.(Por suerte java cuenta con metodos que hacen todo esto automaticamente jeje)
    
    /*
    //Metodo que elimina los puntos, espacios en blanco y saltos de linea
    private String eliminarEspacios(){
        String newString = "";
        
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) != ' ' && frase.charAt(i) != '\n' && frase.charAt(i) != '.'){
                newString += frase.charAt(i);
            }
        }
        
        return newString;
    }
    */
    
    /*
    //Metodo para transformar todo a minusculas.(Rayos si que salio largo)
    private String transformarAMinusculas(){
        String newString = "";
        
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.charAt(i)){
                case 'A': newString += 'a'; break;  
                case 'B': newString += 'b'; break;
                case 'C': newString += 'c'; break; 
                case 'D': newString += 'd'; break; 
                case 'E': newString += 'e'; break; 
                case 'F': newString += 'f'; break; 
                case 'G': newString += 'g'; break; 
                case 'H': newString += 'h'; break; 
                case 'I': newString += 'i'; break;
                case 'J': newString += 'j'; break; 
                case 'K': newString += 'k'; break; 
                case 'L': newString += 'l'; break; 
                case 'M': newString += 'm'; break; 
                case 'N': newString += 'n'; break; 
                case 'O': newString += 'o'; break; 
                case 'P': newString += 'p'; break; 
                case 'Q': newString += 'q'; break; 
                case 'R': newString += 'r'; break; 
                case 'S': newString += 's'; break; 
                case 'T': newString += 't'; break; 
                case 'V': newString += 'v'; break; 
                case 'W': newString += 'w'; break; 
                case 'X': newString += 'x'; break;
                case 'Y': newString += 'y'; break; 
                case 'Z': newString += 'z'; break;
                default: newString += frase.charAt(i); break;
            }
        }
        
        return newString;
    }
    */
}
