
package decodificadoradn;

import javax.swing.JOptionPane;


public class DecodificadoradnGrafico {
 
   String adn1;
   String adn2;
   String bases = "";
   
   public void ingresarsecuencia(){
       adn1 = JOptionPane.showInputDialog("Ingresa la primera secuencia de ADN a analizar: ");
       adn2 = JOptionPane.showInputDialog("Ingresa la segunda secuencia de ADN a analizar: ");
   
   
   }
   
   public void decodificar(){
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
       
       
     JOptionPane.showMessageDialog(null, "El resultado final es: " + bases + ". Porque es el conjunto ordenado de bases"
               + " adyacentes de mayor tamaño que se encuentra en ambas formas de vida.");
   
   }
   
   
     public static void main(String args[]) {
         DecodificadoradnGrafico is = new DecodificadoradnGrafico();
         is.ingresarsecuencia();
         is.decodificar();
     }
}
