package atv_01;

import javax.swing.JOptionPane;


public class Main {


    public static void main(String[]args){
    int mes = (int) Float.parseFloat(JOptionPane.showInputDialog("Digite um numero"));

        Mes v = new Mes(mes);

      v.imprimaDados();

    } 
    
    
}    

