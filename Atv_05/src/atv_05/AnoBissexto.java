package atv_05;

import java.util.Scanner;


public class AnoBissexto {
    
   public static void main(String[] args){
        
       Scanner ent = new Scanner(System.in);
        
        int ano;
        
        System.out.println("Digite um ano");
       
        ano = ent.nextInt();
        
        
        if(ano % 400 == 0){
          
            System.out.println(ano + " é bissexto.");
        
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
           
            System.out.println(ano + " é bissexto.");
       
        } else{
            System.out.println(ano + " não é bissexto");
        }
    }
}