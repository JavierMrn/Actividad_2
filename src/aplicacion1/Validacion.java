package aplicacion1;

public class Validacion{
    
    //Metodos
    public boolean isPolindromo(String frase){
        boolean val = false;
                
        for (int i = frase.length() - 1; i >= 0; i--) {
            if(frase.charAt(i) == frase.charAt(frase.length() - (i+1))){
                val = true;
                
            }else {
                val = false;
                break;
            }
        }
        
        return val;
    }
    
    public boolean soloLetras(String frase){
       boolean val = true;
                
        for (int i = 0; i < frase.length(); i++) {
            switch(frase.charAt(i)){
                case '1': case '2': case '3':
                case '4': case '5': case '6':
                case '7': case '8': case '9':
                case '0': 
                    val = false;
                    break;
            }
        }
        
        return val;
    }
}
