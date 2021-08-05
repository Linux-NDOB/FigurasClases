package Figuras;

import javax.swing.*;

public class Probador {

    public static void main (String[] args) {


            try{


                Cuadrado c = new Cuadrado();

                Triangulo t = new Triangulo();

                Recta r = new Recta();

                int Option,Exit;


                do {

                    Option=Integer.parseInt(JOptionPane.showInputDialog(

                            "    ----------------Menu Principal----------------\n"+"\n"+

                                    "1. Cuadrado" + "\n"+


                                    "2. Triangulo"+"\n" +


                                    "3. Rectangulo"+"\n"+


                                    "4. Salir.\n"+"\n"+

                                    " Ingrese una opción : "));


                    switch(Option){

                        case 1:

                            try{



                                String seleccion;

                                Object tFi[] = new Object[]{"Area","Perimetro"};

                                Object xDia = JOptionPane.showInputDialog(null,"Elija una opcion",
                                        "Seleccion de Figura",
                                        JOptionPane.QUESTION_MESSAGE,null,tFi ,tFi[0]);

                                seleccion = xDia.toString();

                                if(seleccion.equals("Area")){

                                    c.Carea();

                                }
                                if(seleccion.equals("Perimetro")){

                                    c.Cperi();


                                }

                            }catch(NullPointerException a){

                                a.printStackTrace();

                            }

                            break;

                        case 2:

                            try{

                            String s;

                            Object tFi[] = new Object[]{"Area","Perimetro"};

                            Object xDia = JOptionPane.showInputDialog(null,"Elija una opcion",
                                    "Seleccion de Figura",
                                    JOptionPane.QUESTION_MESSAGE,null,tFi ,tFi[0]);

                            s = xDia.toString();

                            if(s.equals("Area")){

                                t.area();

                            }
                            if(s.equals("Perimetro")){

                                t.Tperi();


                            }

                    }catch(NullPointerException b){

                        b.printStackTrace();

                    }
                            break;

                        case 3:


                            try{
                                String seleccion;

                                Object tFi[] = new Object[]{"Area","Perimetro"};

                                Object xDia = JOptionPane.showInputDialog(null,"Elija una opcion",
                                        "Seleccion de Figura",
                                        JOptionPane.QUESTION_MESSAGE,null,tFi ,tFi[0]);

                                seleccion = xDia.toString();

                                seleccion = xDia.toString();

                                if(seleccion.equals("Area")){

                                    r.Rarea();

                                }
                                if(seleccion.equals("Perimetro")){

                                    r.Rperi();


                                }

                            }catch(NullPointerException a){

                                a.printStackTrace();

                            }

                            break;

                        case 4:

                            Exit=JOptionPane.showConfirmDialog(null, "¿Quiere salir?");

                            if (Exit==0) {

                                JOptionPane.showMessageDialog(null,"Vuelva pronto");


                                break;
                            }

                        default:

                            JOptionPane.showMessageDialog(null, "Porfavor use una opcion valida ");

                            break;


                    }

                }while (Option != 4);

                System.exit(0);

            } catch(NumberFormatException a){

                JOptionPane.showMessageDialog(null, "En este espacio solo van numeros");

            }
        }

}
