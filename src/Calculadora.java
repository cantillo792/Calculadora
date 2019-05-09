/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Calculadora {
    
    public int sumar(int num1, int num2){
        int sol = 0;
        sol = num1 + num2;
        return sol;
    }
    public int retar(int num1, int num2){
        int sol = 0;
        sol = num1 - num2;
        return sol;
    }
    public int mult(int num1, int num2){
        int sol = 0;
        sol = num1 * num2;
        return sol;
    }
    public float dividir(int num1, int num2){
        int sol = 0;
        try{
            sol = num1/num2;
        }
        catch(Exeption e){
            System.out.println("Error al dividir por cero");
        }
        return sol;
    }
    
    
}
