/*
Trolls estão atacando sua seção de comentários!
Uma maneira comum de lidar com essa situação é remover todas as vogais dos comentários dos trolls, neutralizando a ameaça.
Sua tarefa é escrever uma função que leve uma sequência e retornar uma nova sequência com todas as vogais removidas.
Por exemplo, a string "This website is for losers LOL!" se tornaria "Ths wbst s fr lsrs LL!".
Nota: para este kata não é considerado uma vogal: Y.
 */

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[AaEeIiOoUu]","");
    }
}