package atv_04;

import static java.time.Clock.system;

import javax.swing.JOptionPane;


public class atv_04 {
    
    int num1,num2,num3;

    public atv_04(int num1, int num2, int num3) {
        
        this.num1 = num1;
        
        this.num2 = num2;
        
        this.num3 = num3;
    }

    public int getNum1() {
        
        return num1;
    }

    public int getNum2() {
        
        return num2;
    }

    public int getNum3() {
        
        return num3;
    }

    public void setNum1(int num1) {
        
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        
        this.num3 = num3;
    }

    public int verifica(){
        
        if(this.num1<this.num2 && this.num2<this.num3){
            JOptionPane.showMessageDialog(null,num3+"\n"+""+num2+"\n"+"\n"+num1);
        
            return 0;
        
        }else{
         
            if(this.num1<this.num3 && this.num3<this.num2){
             JOptionPane.showMessageDialog(null,num2+"\n"+num3+"\n"+num1);
         
             return 0;
         
         }else{
             
             if(this.num2<this.num1 && this.num1<this.num3){
                 JOptionPane.showMessageDialog(null,num3+"\n"+num1+"\n"+num2);
             
                 return 0;
             
             }else{
             
                 if(this.num2<this.num3 && this.num3<this.num1){
                     JOptionPane.showMessageDialog(null,num1+"\n"+num3+"\n"+num2);
                     return 0;
                 }else{
                 
                  if(this.num3<this.num1 && this.num1<this.num2){
                     JOptionPane.showMessageDialog(null,num2+"\n"+num1+"\n"+num3);
                         return 0;
                     }

                 }
             }
         } 
         JOptionPane.showMessageDialog(null,num1+"\n"+num2+"\n"+num3);
        }

        return 0;
    }

    public void imprimeDados(){
        int r = verifica();
        String mensagem = "numeros em ordem";
        JOptionPane.showMessageDialog(null, mensagem);
    }
}