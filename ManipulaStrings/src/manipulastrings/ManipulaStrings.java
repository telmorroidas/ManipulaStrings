
package manipulastrings;

import java.util.Scanner;


public class ManipulaStrings {

    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        do{
            System.out.println("---MENU---");
            System.out.println("1- tamanho string");
            
            System.out.println("0- sair");
            System.out.println("insira a opção pretendida");
            op= ler.nextInt();
            switch(op){
                case 0: 
                    break;
                case 1: 
                    ExerciciosString.contaChars();
                    break;
                default:
                    System.out.println("insira uma opção válida");
            }
        }while(op!=0);
    }
    
}
