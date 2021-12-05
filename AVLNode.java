/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto2_equipo12;

public class AVLNode {
    
    int valor, altura;
    AVLNode izq;
    AVLNode der;
    
    public AVLNode(int data){
        this.valor=data;
        altura=1;
    }

}