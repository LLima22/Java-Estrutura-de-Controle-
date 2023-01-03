package atv_04;

        import javax.swing.JOptionPane;

public class Main_04 {
    
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        atv_04 t = new atv_04(num1,num2,num3);
        t.imprimeDados();
    }
}
    

