/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.ventana.Ventana;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

/**
 *
 * @author nicol
 */
public class Test {

    public static void main(String[] args) {

        Ventana v = new Ventana("Usuario", 600, 400, 250, 0);
        //Ventana v1 = new Ventana("sakdj", 600, 400, 850, 0);

        Panel pv = new Panel();

        GridLayout Matriz = new GridLayout(4, 3);
        Button[] botones = new Button[2];
        Label [] labels = new Label[10];
        labels[0] = new Label("Bienvenido");
        for(int i = 1; i < 10; i++){
            labels[i] = new Label("");
        }
        botones[0] = new Button("Registrarse");
        botones[1] = new Button("Iniciar sesion");
        
        
        pv.setLayout(Matriz);
        for(int i = 0; i < 4; i++){
            pv.add(labels[i]);
        }
        
        
            pv.add(botones[0]);
        
        
        
        for(int i = 6; i < 8; i++){
            pv.add(labels[i]);
        }
        
        pv.add(botones[1]);
        
        for(int i = 8; i < 10; i++){
            pv.add(labels[i]);
        }

        v.add(pv);
    }
}
