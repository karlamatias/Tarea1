
package decodificadoradn;

import java.util.Scanner;


public class Decodificadoradn {

  
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in); 
       
        String adn1, adn2;
        String bases = ""; 
        
        System.out.println("Bienvenido al Decodificador de ADN.");
        System.out.println("");
        
        System.out.println("Ingresa la primera secuencia de ADN a analizar: ");
        adn1 = entrada.nextLine();
        System.out.println("");
        
       System.out.println("Ingresa la segunda secuencia de ADN a analizar: ");
       adn2 = entrada.nextLine();
       
       
        for (int i = adn1.length(); i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                
                /*ahora verificamos dos condiciones:
                 1. que la porción de la cadena extraida de la variable adn1 
                se encuentra en la variable adn2
                2. que la longitud de la ultima coincidencia encontrada
                sea menor a la longitud de la nueva coincidencia encontrada
                */
                
                if (adn2.contains(adn1.substring(j, i)) && 
                        
                    bases.length() < adn1.substring(j, i).length()) {
                  
                  //si se cumplen ambas condiciones almacenamos el nuevo valor  
                  bases = adn1.substring(j, i);
                  
                }
                
            }
            
        }
        
        System.out.println("El resultado final es: " + bases + ". Porque es el conjunto ordenado de bases"
               + " adyacentes de mayor tamaño que se encuentra en ambas formas de vida.");
   
   }
    }
    

