/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1u2;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ExamenU1U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        
        int pro1 = 30;
        int pro2 = 65;
        int pro3 = 15;
        
        System.out.println("¿Cual es el nombre del primer videojuego?");
        String juego1 = abc.nextLine();
        System.out.println("¿Cual es el costo?");
        double costo1 = abc.nextDouble();
        abc.nextLine();
        
        System.out.println("¿Cual es el nombre del segundo videojuego?");
        String juego2 = abc.nextLine();
        System.out.println("¿Cual es el costo?");
        double costo2 = abc.nextDouble();
        abc.nextLine();
        
        System.out.println("¿Cual es el nombre del tercer videojuego?");
        String juego3 = abc.nextLine();
        System.out.println("¿Cual es el costo");
        double costo3 = abc.nextDouble();
        abc.nextLine();
        
        double preciot1 = (pro1*costo1)/100;
        double preciot2 = (pro2*costo2)/100;
        double preciot3 = (pro3*costo3)/100;
        
        System.out.println("El precio final del videojuego1 es: "+preciot1);
        System.out.println("El precio final del videojuego2 es: "+preciot2);
        System.out.println("El precio final del videojuego3 es: "+preciot3);
        
        abc.close();
        
        // TODO code application logic here
    }
    
}
