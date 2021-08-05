package Figuras;

import javax.swing.*;

public class Recta {

    public float base;

    public float altura;


    public Recta() {
        base = 0;
        altura = 0;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void Rarea(){

        float base = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la base"));

        float altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la altura "));

        float areat = base * altura;

        JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + areat);


    }

    public void Rperi(){

        float base = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la base"));

        float altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la altura "));

        float per = ((2*base)+(2*altura));

        //int a = Integer.parseInt(JOptionPane.showInputDialog("2"));

        JOptionPane.showMessageDialog(null, "El perimetro del rectangulo es: " + per);



    }

}
