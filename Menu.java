/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto2_equipo12;

import java.util.Scanner;

/**
 *
 * @author tania
 */
public class Menu {
    
    public static void ArAVL () {
        
        ArbolAVL arbol = new ArbolAVL();
        Scanner teclado = new Scanner(System.in);
        boolean end = false;
        int opcion; 

        while (!end) {
            System.out.println("\n\n");
            System.out.println("\t\t\t     __  __  __     __ __             ");
            System.out.println("\t\t\t /\\ |__)|__)/  \\|  |_ (_    /\\\\  /|  .");
            System.out.println("\t\t\t/--\\| \\ |__)\\__/|__|____)  /--\\\\/ |__.");    

            System.out.println("\n\t\t-------------------------------------------------");
            System.out.println("\t\t\t¿Que tipo de operación desea ejecutar?");
            System.out.println("\t\t-------------------------------------------------");
            System.out.println("\t\t|\t\t1. Agregar clave  \t\t|");
            System.out.println("\t\t|\t\t2. Buscar un valor  \t\t|");
            System.out.println("\t\t|\t\t3. Eliminar clave  \t\t|");
            System.out.println("\t\t|\t\t4. Imprimir arbol  \t\t|");
            System.out.println("\t\t|\t\t5. Salir  \t\t\t|");
            System.out.println("\t\t-------------------------------------------------");
            
            System.out.println("\nElige una opcion: ");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("\n ----[Agregar clave]-----");
                    System.out.println("\n\n ¿Cuantos nodos desea agregar al árbol?");
                    int nodos = teclado.nextInt();
                    System.out.println("Ingrese los elementos:");
                    for (int i = 0; i < nodos; i++) {
                        int num1 = teclado.nextInt();
                        arbol.agregar(num1);
                    }
                    arbol.visit(arbol.raiz());
                    break;
                case 2:
                    System.out.println("\n ----[Buscar dato]-----");
                    System.out.println("\n ¿Que elemento busca?");
                    int bus = teclado.nextInt();
                    arbol.buscar(bus);
                    break;
                case 3:
                    System.out.println("\n ----[Eliminar clave]-----");
                    System.out.println("\n ¿Que elemento desea eliminar?");
                    int elem = teclado.nextInt();
                    arbol.eliminar(elem);
                    break;
                case 4:
                    System.out.println("\n ----[Imprimir árbol]-----");
                    arbol.breadthFrist();
                    System.out.println("El árbol se imprimirá en preOrden");
                    arbol.preOrden(arbol.raiz());
                    break;
                case 5:
                    System.out.println("REGRESANDO A MENU PRINCIPAL\n\n");
                    end = true;
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }
    }
    
    public static void heap() {
        
        Scanner teclado = new Scanner(System.in);
        boolean end = false;
        int opcion;

        while (!end) {
            System.out.println("\n\n");
            System.out.println("\t\t\t\t     __     __ ");
            System.out.println("\t\t\t\t|__||_  /\\ |__).");
            System.out.println("\t\t\t\t|  ||__/--\\|   .");    

            System.out.println("\n\t\t-------------------------------------------------");
            System.out.println("\t\t\t¿Que tipo de operación desea ejecutar?");
            System.out.println("\t\t-------------------------------------------------");
            System.out.println("\t\t|\t\t1. Agregar clave  \t\t|");
            System.out.println("\t\t|\t\t2. Eliminar raiz  \t\t|");
            System.out.println("\t\t|\t\t3. Imprimir arbol  \t\t|");
            System.out.println("\t\t|\t\t4. Salir  \t\t\t|");
            System.out.println("\t\t-------------------------------------------------");
            
            System.out.println("\nElige una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                   System.out.println("\n\n ----[Agregar clave]-----");

                    break;
                case 2:
                    System.out.println("\n\n ----[Eliminar raíz]-----");
                    break;
                case 3:
                    System.out.println("\n\n ----[Imprimir raíz]-----");
                    break;
                case 4:
                    System.out.println("REGRESANDO A MENU PRINCIPAL\n\n");
                    end = true;
                    break;
                default:
                    System.out.println("Opción no valida");
            }


        }
    }
    
     public static void ArExpAri () {
         
        Scanner teclado = new Scanner(System.in);
        boolean end = false;
        int opcion;

        while (!end) {
            System.out.println("\n\n");
            System.out.println("     __  __  __     __ __   __  __   __    __  __  __ __  __            __  ___     _____  __     ");
            System.out.println(" /\\ |__)|__)/  \\|  |_ (_   |  \\|_   |_ \\_/|__)|__)|_ (_ |/  \\|\\ |   /\\ |__)| | |\\/||_  | |/   /\\ .");
            System.out.println("/--\\| \\ |__)\\__/|__|____)  |__/|__  |__/ \\|   | \\ |____)|\\__/| \\|  /--\\| \\ | | |  ||__ | |\\__/--\\."); 

            System.out.println("\n\t\t-------------------------------------------------");
            System.out.println("\t\t\t¿Que tipo de operación desea ejecutar?");
            System.out.println("\t\t-------------------------------------------------");
            System.out.println("\t\t|\t\t1. Ingresar expresión  \t\t|");
            System.out.println("\t\t|\t\t2. Mostrar Arbol  \t\t|");
            System.out.println("\t\t|\t\t3. Resolver  \t\t\t|");
            System.out.println("\t\t|\t\t4. Salir  \t\t\t|");
            System.out.println("\t\t-------------------------------------------------");
            
            System.out.println("\nElige una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n\n ----[Ingresar expresión]-----");
                   
                    break;
                case 2:
                    System.out.println("\n\n ----[Mostrar Árbol]-----");
                    break;
                case 3:
                    System.out.println("\n\n ----[Resolver]-----");
                    break;
                case 4:
                    System.out.println("REGRESANDO A MENU PRINCIPAL\n\n");
                    end = true;
                    break;
                default:
                    System.out.println("Opción no valida");
            }


        }
    }
}
    

