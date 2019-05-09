
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class App {

 
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        Scanner entrada = new Scanner(System.in);
        int n1, n2, sol, opcion;
        boolean op = true;
        while(op){
            System.out.println("**************** ");
            System.out.println("Menu ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = entrada.nextInt();
            if (opcion == 5){
                System.out.println("Finalizo  ");
                break;
            }else{
                switch(opcion){
                    case 1:
                        System.out.print("Ingrese num 1: ");
                        n1 = entrada.nextInt();
                        System.out.print("Ingrese num 2: ");
                        n2 = entrada.nextInt();
                        sol = cal.sumar(n1, n2);
                        System.out.println("La suma es: " + sol);
                        break;
                        case 2:
                        System.out.print("Ingrese num 1: ");
                        n1 = entrada.nextInt();
                        System.out.print("Ingrese num 2: ");
                        n2 = entrada.nextInt();
                        sol = cal.retar(n1, n2);
                        System.out.println("La Resta es: " + sol);
                        break;
                        case 3:
                        System.out.print("Ingrese num 1: ");
                        n1 = entrada.nextInt();
                        System.out.print("Ingrese num 2: ");
                        n2 = entrada.nextInt();
                        sol = cal.mult(n1, n2);
                        System.out.println("La Multiplicacion es: " + sol);
                        break;
                        case 4:
                        System.out.print("Ingrese num 1: ");
                        n1 = entrada.nextInt();
                        System.out.print("Ingrese num 2: ");
                        n2 = entrada.nextInt();
                        sol = cal.dividir(n1, n2);
                        System.out.println("La division es: " + sol);
                        break;
                        
                        default:
                            System.out.println("Opcion no Valida");
                }
            }
            
        }
    }
    
}
