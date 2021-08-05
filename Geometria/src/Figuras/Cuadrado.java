package Figuras;

import javax.swing.*;

public class Cuadrado {

    private float lado;

    public Cuadrado() {
       lado = 0;
    }


    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    public void Carea(){

        lado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del lado"));

        float areat = lado * lado;

        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + areat);

    }

    public void Cperi(){

        float lado = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del lado"));

        float per = lado + lado + lado + lado;

        JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: " + per);

    }
}
