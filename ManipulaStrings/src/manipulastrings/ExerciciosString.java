package manipulastrings;


class ExerciciosString {
    static String s, s1;
    static void leStrings(String texto){
         System.out.println(texto);
         s= ManipulaStrings.ler.next();
         s1= ManipulaStrings.ler.nextLine();
         s= s+s1;
    }

    static int contaChars() {
         leStrings("insira um texto");
         return s.length();
    }

    static void arvoreCharAt() {
        int x, y;
        leStrings("insira um texto");
        for(x=0; x<s.length(); x++){
            for(y=0; y<=x; y++){
                System.out.print(s.charAt(y));
            }
            System.out.println();
        }
        for(x=s.length()-1; x>=0; x--){
            for(y=0; y<x; y++){
                System.out.print(s.charAt(y));
            }
            System.out.println();
        }
    }

    static void capitalizaLetras() {
        leStrings("insira um texto");
        s = s.toUpperCase();
        System.out.println(s);
        s= s.toLowerCase();
        System.out.println(s+"\n");
    }
    
}
