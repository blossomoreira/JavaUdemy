package javaUdemy.OutrosTopicos;

public class funcoesString {

    public static void main(String[] args) {
        /*
         Formatar: toLowerCase(), toUpperCase(), trim()
         Recortar: substring(inicio), substring(inicio, fim)
         Substituir: Replace(char, char), Replace(string, string)
         Buscar: IndexOf, LastIndexOf
         str.Split("")         
         */
        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.trim(); /*Elimina espaços nos cantos da String */
        String s02 = original.substring(2,10); /*Monta uma nova string a partir do 2 caracter */
        String s03 = original.replace("a", "x");
        
    }
}
