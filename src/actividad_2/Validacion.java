package actividad_2;

public class Validacion{
    
    //Metodos
    public boolean isPolindromo(String frase){
        boolean val = true;
                
        for (int i = frase.length() - 1; i >= 0; i--) {
            val = frase.charAt(i) == frase.charAt(frase.length() - (i+1));
            if(!val) break; //Detener el bucle una vez que encuentra un caracter que no concuerda con el otro.
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
            if(!val) break; //Detener el bucle una vez que a encontrado un número
        }
        return val;
    }
}
