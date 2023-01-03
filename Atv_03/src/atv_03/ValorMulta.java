package atv_03;

import javax.swing.JOptionPane;


public class ValorMulta {
    public static void main(String[]args){
    
        float rua = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade da rua "));
    
        float velo = Float.parseFloat(JOptionPane.showInputDialog("Digite a velocidade do veiculo"));

        Multa v = new Multa(rua,velo);

      v.imprimirDados();

    }       
}