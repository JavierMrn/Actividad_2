package actividad_2;

public class Validacion{

    //Metodos
    public boolean isPalindromo(Mensaje frase){
        String newString = "";
        String pricipalFrase = frase.getFrase();
        
        for (int i = pricipalFrase.length() - 1; i >= 0; i--) {
            newString += pricipalFrase.charAt(i);
        }
        return pricipalFrase.equals(newString);
    }
    
    public boolean soloLetras(Mensaje frase){
       char[] pricipalFrase = new char[frase.getFrase().length()];
       pricipalFrase = frase.getFrase().toCharArray();
       
       for(char c: pricipalFrase){
           if(Character.isDigit(c)){
               return false;
           }
       }
       return true;
    }
    
    /*
    public boolean soloLetras(Mensaje frase){
       String pricipalFrase = frase.getFrase();
       
        for (int i = 0; i < pricipalFrase.length(); i++) {
            switch(pricipalFrase.charAt(i)){
                case '1': case '2': case '3':
                case '4': case '5': case '6':
                case '7': case '8': case '9':
                case '0': 
                    return false;
            }
        }
        return true;
    }*/
}
