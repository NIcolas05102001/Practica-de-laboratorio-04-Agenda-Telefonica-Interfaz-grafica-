/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.ventana;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

/**
 *
 * @author nicol
 */
public class Ventanas {

    public void ventana1() {
        Ventana v = new Ventana("Usuario", 600, 400);
        Panel p = new Panel();
        
        GridLayout m = new GridLayout(4, 3);

        Button[] botones = new Button[2];
        Label[] labels = new Label[10];

        labels[0] = new Label("Bienvenido");

        for (int i = 1; i < 10; i++) {
            labels[i] = new Label("");
        }

        botones[0] = new Button("Registrarse");
        botones[1] = new Button("Iniciar sesion");

        for (int i = 0; i < 4; i++) {
            p.add(labels[i]);
        }
        p.add(botones[0]);
        for (int i = 6; i < 8; i++) {
            p.add(labels[i]);
        }
        p.add(botones[1]);

        for (int i = 8; i < 10; i++) {
            p.add(labels[i]);
        }

        p.setLayout(m);

        v.add(p);
    }

    public void ventana2() {
        Ventana v = new Ventana("Registro", 600, 400);
        
        Panel p = new Panel();
        
        Label l = new Label("Nombre");
        Label l1 = new Label("Apellido");
        Label l2 = new Label("Correo");
        Label l3 = new Label("Contraseña");
        Label l4 = new Label("Cedula");
        
        TextField t = new TextField(10);
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(30);
        TextField t3 = new TextField(10);
        TextField t4 = new TextField(10);
        
        Panel pp = new Panel();
        Panel pi = new Panel();
        Panel pd = new Panel();
        
        pi.add(l);
        pd.add(t);
        
        pp.add(pi);
        pp.add(pd);
        
        Panel pp1 = new Panel();
        Panel pi1 = new Panel();
        Panel pd1 = new Panel();
        
        pi1.add(l1);
        pd1.add(t1);
        
        pp1.add(pi1);
        pp1.add(pd1);
        
        Panel pp2 = new Panel();
        Panel pi2 = new Panel();
        Panel pd2 = new Panel();
        
        pi2.add(l2);
        pd2.add(t2);
        
        pp2.add(pi2);
        pp2.add(pd2);
        
        Panel pp3 = new Panel();
        Panel pi3 = new Panel();
        Panel pd3 = new Panel();
        
        pi3.add(l3);
        pd3.add(t3);
        
        pp3.add(pi3);
        pp3.add(pd3);
        
        Panel pp4 = new Panel();
        Panel pi4 = new Panel();
        Panel pd4 = new Panel();
        
        pi4.add(l4);
        pd4.add(t4);
        
        pp4.add(pi4);
        pp4.add(pd4);
        
        GridLayout m = new GridLayout(6,1);
        
        Panel[] panels = new Panel[5];
        Button[] buttons = new Button[1];
        
        panels[0] = pp;
        panels[1] = pp1;
        panels[2] = pp2;
        panels[3] = pp3;
        panels[4] = pp4;

        buttons[0] = new Button("Registrarse");
        
        for(int i = 0; i < 5; i++){
            p.add(panels[i]);
        }
        
        p.add(buttons[0]);
        
        p.setLayout(m);
        
        v.add(p);
    }

    public void ventana3() {
        
        Ventana v = new Ventana("Inicio de sesion", 600, 400);
        
        Panel p = new Panel();
        
        Label l = new Label("Correo");
        Label l1 = new Label("Contraseña");
        
        TextField t = new TextField(30);
        TextField t1 = new TextField(10);
        
        Panel pp = new Panel();
        Panel pi = new Panel();
        Panel pd = new Panel();
        
        pi.add(l);
        pd.add(t);
        
        pp.add(pi);
        pp.add(pd);
        
        Panel pp1 = new Panel();
        Panel pi1 = new Panel();
        Panel pd1 = new Panel();
        
        pi1.add(l1);
        pd1.add(t1);
        
        pp1.add(pi1);
        pp1.add(pd1);
        
        GridLayout m = new GridLayout(3,1);
        
        Panel[] panels = new Panel[2];
        Button[] buttons = new Button[1];
        
        panels[0] = pp;
        panels[1] = pp1;
       
        buttons[0] = new Button("Iniciar sesion");
        
        for(int i = 0; i < 2; i++){
            p.add(panels[i]);
        }
        
        p.add(buttons[0]);
        
        p.setLayout(m);
        
        v.add(p);
        
    }

    public void ventana4() {
        
        Ventana v = new Ventana("Telefono", 600, 400);
        
        Panel p = new Panel();
        Panel PanelNorte = new Panel();
        Panel PanelSur = new Panel();
        Panel PanelCentro = new Panel();
        
        BorderLayout borderLayout = new BorderLayout();
        
        GridLayout m = new GridLayout(2, 2);
        
        TextField t = new TextField(3);
        
        Button b = new Button("Opciones");
        Button b1 = new Button("Buscar");
        
        Label[] labels = new Label[2];
        
        labels[0] = new Label("");
        labels[1] = new Label("Codigo Telefono");
        
        PanelNorte.add(labels[0]);
        PanelNorte.add(b);
        PanelNorte.add(labels[1]);
        PanelNorte.add(t);
        
        PanelNorte.setLayout(m);
        
        PanelCentro.add(b1);
        
        GridLayout m1 = new GridLayout(4, 2);
        
        Label[] labels1 = new Label[8];
        
        labels1[0] = new Label("Codigo: ");
        labels1[1] = new Label("1");
        labels1[2] = new Label("Numero: ");
        labels1[3] = new Label("0994572136");
        labels1[4] = new Label("Tipo: ");
        labels1[5] = new Label("Movil");
        labels1[6] = new Label("Operadora: ");
        labels1[7] = new Label("Claro");
        
        for (int i = 0; i < 8; i++) {
            PanelSur.add(labels1[i]);
        }
        
        PanelSur.setLayout(m1);
        
        p.setLayout(borderLayout);
        
        v.add(p);
        
        p.add(PanelNorte, BorderLayout.NORTH);
        p.add(PanelCentro, BorderLayout.CENTER);
        p.add(PanelSur, BorderLayout.SOUTH);

    }

    public void ventana5() {

    }

    public void ventana6() {

    }

    public void ventana7() {

    }
}
