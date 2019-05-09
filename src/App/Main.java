
package App;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operaciones calculadora = new Operaciones ();
        Scanner entrada = new Scanner(System.in);
        int num1, num2, resultado, opcion;
        boolean op = true;
        while(op){
            System.out.println("CALCULADORA");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICACION");
            System.out.println("4. DIVICION");
            System.out.println("0. SALIR");
            opcion = entrada.nextInt();
            
            if(opcion == 0){
                System.out.println("Salir...");
                break;
            }else {
                switch(opcion){
                    case 1:
                        System.out.println("Ingrese el primer numero a sumar");
                        num1 = entrada.nextInt();
                        System.out.println("Ingrese el segundo numero a sumar");
                        num2 = entrada.nextInt();
                        resultado = calculadora.suma(num1, num2);
                        System.out.println("La suma de los dos numeros es: " + resultado);
                        break;
                    case 2:
                        System.out.println("Ingrese el primer numero a restar");
                        num1 = entrada.nextInt();
                        System.out.println("Ingrese el segundo numero a restar");
                        num2 = entrada.nextInt();
                        resultado = calculadora.resta(num1, num2);
                        System.out.println("La resta de los dos numeros es: " + resultado);
                        break;
                    case 3:
                        System.out.println("Ingrese el primer numero a Multiplicar");
                        num1 = entrada.nextInt();
                        System.out.println("Ingrese el segundo numero a Multiplicar");
                        num2 = entrada.nextInt();
                        resultado = calculadora.multiplicacion(num1, num2);
                        System.out.println("El producto de los dos numeros ingresados es: " + resultado);
                        break;
                    case 4:
                        System.out.println("Ingrese el dividendo");
                        num1 = entrada.nextInt();
                        System.out.println("Ingrese divisor");
                        num2 = entrada.nextInt();
                        resultado = calculadora.divicion(num1, num2);
                        
                        break;
                }
            }
        }
    }
