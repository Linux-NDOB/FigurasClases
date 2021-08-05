package Figuras;


import javax.swing.*;

// area = b*h/2


public class Triangulo {

    private float base;

    private float altura;


    public Triangulo() {
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

    public void area(){

        float base = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la base"));

        float altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la altura"));

        float ar = ((base*altura)/2);

        JOptionPane.showMessageDialog(null, "El area del triangulo es: " + ar);


    }

    public void Tperi(){

        float base = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la base"));


        float per = base+base+base;

        JOptionPane.showMessageDialog(null, "El perimetro del triangulo es: " + per);



    }


}
