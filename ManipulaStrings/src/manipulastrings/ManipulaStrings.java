
package manipulastrings;

import java.util.Scanner;


public class ManipulaStrings {

    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        do{
            System.out.println("---MENU---");
            System.out.println("1- tamanho string");
            System.out.println("2- árvore de letras");
            System.out.println("3- capitalização de letras");
            System.out.println("4- árvore substring");
            
            System.out.println("0- sair");
            System.out.println("insira a opção pretendida");
            op= ler.nextInt();
            switch(op){
                case 0: 
                    break;
                case 1:
                    System.out.println("a string inserida tem: "+
                    ExerciciosString.contaChars()+" caracteres\n");
                    break;
                case 2:
                    ExerciciosString.arvoreCharAt();
                    break;
                case 3:
                    ExerciciosString.capitalizaLetras();
                default:
                    System.out.println("insira uma opção válida");
            }
        }while(op!=0);
    }
    
}
