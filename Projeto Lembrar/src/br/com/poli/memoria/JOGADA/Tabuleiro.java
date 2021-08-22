package br.com.poli.memoria.JOGADA;
import br.com.poli.memoria.DIFICULDADE.Dificuldade;
import br.com.poli.memoria.JOGADA.JogadaInválidaException;
import br.com.poli.memoria.JOGADOR.Jogador;

import java.util.ArrayList;
import java.util.Collections;

public class Tabuleiro {

    private Dificuldade dificuldade;
    private ArrayList<String> tabuleiro;
    private ArrayList<String> tabuleiroEmBranco;

    public ArrayList<String> getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(ArrayList<String> tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public ArrayList<String> getTabuleiroEmBranco() {
        return tabuleiroEmBranco;
    }

    public void setTabuleiroEmBranco(ArrayList<String> tabuleiroEmBranco) {
        this.tabuleiroEmBranco = tabuleiroEmBranco;
    }

    public Tabuleiro(Dificuldade dificuldade) {
        this.tabuleiro = new ArrayList<>();
        this.tabuleiroEmBranco = new ArrayList<>();
        this.dificuldade = dificuldade;
        inicializarTabuleiroEmBranco();
        preencherTabuleiro();
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public void inicializarTabuleiroEmBranco(){
        String vazio = " ";
        for (int i = 0; i < dificuldade.getNivel()* dificuldade.getNivel(); i++){
            this.tabuleiroEmBranco.add(vazio);
        }
    }
    public String tabuleiroEmSi (){

        if (dificuldade == dificuldade.FACIL){

            String linha1 = "      (0)   (1)   (2)   (3) ";
            String linhap = "    |-----.-----.-----.-----.";
            String linha2 = String.format(" (0)|  %s  .  %s  .  %s  .  %s  .", tabuleiroEmBranco.get(0), tabuleiroEmBranco.get(1),
                    tabuleiroEmBranco.get(2), tabuleiroEmBranco.get(3));
            String linha3 = String.format(" (1)|  %s  .  %s  .  %s  .  %s  .", tabuleiroEmBranco.get(4), tabuleiroEmBranco.get(5),
                    tabuleiroEmBranco.get(6), tabuleiroEmBranco.get(7));
            String linha4 = String.format(" (2)|  %s  .  %s  .  %s  .  %s  .", tabuleiroEmBranco.get(8), tabuleiroEmBranco.get(9),
                    tabuleiroEmBranco.get(10), tabuleiroEmBranco.get(11));
            String linha5 = String.format(" (3)|  %s  .  %s  .  %s  .  %s  .", tabuleiroEmBranco.get(12), tabuleiroEmBranco.get(13),
                    tabuleiroEmBranco.get(14), tabuleiroEmBranco.get(15));

            return linha1 + "\n" + linhap + "\n" + linha2 + "\n" + linhap
                    + "\n" + linha3 + "\n" + linhap + "\n" + linha4
                    + "\n" + linhap + "\n" + linha5 + "\n" + linhap
                    + "\n";
        }

        if (dificuldade == dificuldade.MEDIO){

            String linha1 = "      (0)   (1)   (2)   (3)   (4)   (5) ";
            String linhap = "    |-----.-----.-----.-----.-----.-----.";
            String linha2 = String.format(" (0)|  %s  .  %s  .  %s  .  %s  .  %s  .  %s  ." , tabuleiroEmBranco.get(0), tabuleiroEmBranco.get(1),
                    tabuleiroEmBranco.get(2), tabuleiroEmBranco.get(3), tabuleiroEmBranco.get(4), tabuleiroEmBranco.get(5));
            String linha3 = String.format(" (1)|  %s  .  %s  .  %s  .  %s  .  %s  .  %s  ." , tabuleiroEmBranco.get(6), tabuleiroEmBranco.get(7),
                    tabuleiroEmBranco.get(8), tabuleiroEmBranco.get(9), tabuleiroEmBranco.get(10), tabuleiroEmBranco.get(11));
            String linha4 = String.format(" (2)|  %s  .  %s  .  %s  .  %s  .  %s  .  %s  ." , tabuleiroEmBranco.get(12), tabuleiroEmBranco.get(13),
                    tabuleiroEmBranco.get(14), tabuleiroEmBranco.get(15), tabuleiroEmBranco.get(16), tabuleiroEmBranco.get(17));
            String linha5 = String.format(" (3)|  %s  .  %s  .  %s  .  %s  .  %s  .  %s  ." , tabuleiroEmBranco.get(18), tabuleiroEmBranco.get(19),
                    tabuleiroEmBranco.get(20), tabuleiroEmBranco.get(21), tabuleiroEmBranco.get(22), tabuleiroEmBranco.get(23));
            String linha6 = String.format(" (4)|  %s  .  %s  .  %s  .  %s  .  %s  .  %s  ." , tabuleiroEmBranco.get(24), tabuleiroEmBranco.get(25),
                    tabuleiroEmBranco.get(26), tabuleiroEmBranco.get(27), tabuleiroEmBranco.get(28), tabuleiroEmBranco.get(29));
            String linha7 = String.format(" (5)|  %s  .  %s  .  %s  .  %s  .  %s  .  %s  ." , tabuleiroEmBranco.get(30), tabuleiroEmBranco.get(31),
                    tabuleiroEmBranco.get(32), tabuleiroEmBranco.get(33), tabuleiroEmBranco.get(34), tabuleiroEmBranco.get(35));

            return linha1 + "\n" + linhap + "\n" + linha2 + "\n" + linhap
                    + "\n" + linha3 + "\n" + linhap + "\n" + linha4
                    + "\n" + linhap + "\n" + linha5 + "\n" + linhap
                    + "\n" + linha6 + "\n" + linhap + "\n" + linha7 + "\n"
                    + linhap + "\n";
        }

        else {

            String linha1 = "      (0)   (1)   (2)   (3)   (4)   (5)   (6)   (7) ";
            String linhap = "    |-----.-----.-----.-----.-----.-----.-----.-----.";
            String linha2 = String.format(" (0)|  %s  .  %s  .  %s  .  %s  .  %s  .  %s  .  %s  .  %s  ." , tabuleiroEmBranco.get(0), tabuleiroEmBranco.get(1),
                    tabuleiroEmBranco.get(2), tabuleiroEmBranco.get(3), tabuleiroEmBranco.get(4), tabuleiroEmBranco.get(5), tabuleiroEmBranco.get(6), tabuleiroEmBranco.get(7));
            String linha3 = String.format(" (1)|  %s  .  %s  .  %s  .  %s  .  %s  .  %s  .  %s  .  %s  ." , tabuleiroEmBranco.get(8), tabuleiroEmBranco.get(9),
                    tabuleiroEmBranco.get(10), tabuleiroEmBranco.get(11), tabuleiroEmBranco.get(12), tabuleiroEmBranco.get(13), tabuleiroEmBranco.get(14), tabuleiroEmBranco.get(15));
            String linha4 = String.format(" (2)|  %s  .  %s  .  %s  .  %s  .  %s  .  %s  .  %s  .  %s  ." , tabuleiroEmBranco.get(16), tabuleiroEmBranco.get(17),
                    tabuleiroEmBranco.get(18), tabuleiroEmBranco.get(19), tabuleiroEmBranco.get(20), tabuleiroEmBranco.get(21), tabuleiroEmBranco.get(22), tabuleiroEmBranco.get(23));
            String linha5 = String.format(" (3)|  %s  .  %s  .  %s  .  %s  .  %s  .  %s  .  %s  .  %s  ." , tabuleiroEmBranco.get(24), tabuleiroEmBranco.get(25),
                    tabuleiroEmBranco.get(26), tabuleiroEmBranco.get(27), tabuleiroEmBranco.get(28), tabuleiroEmBranco.get(29), tabuleiroEmBranco.get(30), tabuleiroEmBranco.get(31));
            String linha6 = String.format(" (4)|  %s  .  %s  .  %s  .  %s  .  %s  .  %s  .  %s  .  %s  ." , tabuleiroEmBranco.get(32), tabuleiroEmBranco.get(33),
                    tabuleiroEmBranco.get(34), tabuleiroEmBranco.get(35), tabuleiroEmBranco.get(36), tabuleiroEmBranco.get(37), tabuleiroEmBranco.get(38), tabuleiroEmBranco.get(39));
            String linha7 = String.format(" (5)|  %s  .  %s  .  %s  .  %s  .  %s  .  %s  .  %s  .  %s  ." , tabuleiroEmBranco.get(40), tabuleiroEmBranco.get(41),
                    tabuleiroEmBranco.get(42), tabuleiroEmBranco.get(43), tabuleiroEmBranco.get(44), tabuleiroEmBranco.get(45), tabuleiroEmBranco.get(46), tabuleiroEmBranco.get(47));
            String linha8 = String.format(" (6)|  %s  .  %s  .  %s  .  %s  .  %s  .  %s  .  %s  .  %s  ." , tabuleiroEmBranco.get(48), tabuleiroEmBranco.get(49),
                    tabuleiroEmBranco.get(50), tabuleiroEmBranco.get(51), tabuleiroEmBranco.get(52), tabuleiroEmBranco.get(53), tabuleiroEmBranco.get(54), tabuleiroEmBranco.get(55));
            String linha9 = String.format(" (7)|  %s  .  %s  .  %s  .  %s  .  %s  .  %s  .  %s  .  %s  ." , tabuleiroEmBranco.get(56), tabuleiroEmBranco.get(57),
                    tabuleiroEmBranco.get(58), tabuleiroEmBranco.get(59), tabuleiroEmBranco.get(60), tabuleiroEmBranco.get(61), tabuleiroEmBranco.get(62), tabuleiroEmBranco.get(63));

            return linha1 + "\n" + linhap + "\n" + linha2 + "\n" + linhap
                    + "\n" + linha3 + "\n" + linhap + "\n" + linha4
                    + "\n" + linhap + "\n" + linha5 + "\n" + linhap
                    + "\n" + linha6 + "\n" + linhap + "\n" + linha7 + "\n"
                    + linhap + "\n" + linha8 + "\n" + linhap + "\n" + linha9
                    + "\n" + linhap;
        }

    }
    public void preencherTabuleiro(){

        String letra1 = "A";
        String letra2 = "B";
        String letra3 = "C";
        String letra4 = "D";
        String letra5 = "E";
        String letra6 = "F";
        String letra7 = "G";
        String letra8 = "H";
        String letra9 = "I";
        String letra10 = "J";
        String letra11 = "L";
        String letra12 = "M";
        String letra13 = "N";
        String letra14 = "O";
        String letra15 = "P";
        String letra16 = "Q";
        String letra17 = "R";
        String letra18 = "S";
        String letra19 = "T";
        String letra20 = "U";
        String letra21 = "V";
        String letra22 = "X";
        String letra23 = "Z";
        String letra24 = "@";
        String letra25 = "#";
        String letra26 = "%";
        String letra27 = "&";
        String letra28 = "*";
        String letra29 = "/";
        String letra30 = "!";
        String letra31 = "?";
        String letra32 = "+";

        if (dificuldade.getNivel() == 8) {
            for (int j = 0; j < 2; j++) {
                tabuleiro.add(letra1);
                tabuleiro.add(letra2);
                tabuleiro.add(letra3);
                tabuleiro.add(letra4);
                tabuleiro.add(letra5);
                tabuleiro.add(letra6);
                tabuleiro.add(letra7);
                tabuleiro.add(letra8);
                tabuleiro.add(letra9);
                tabuleiro.add(letra10);
                tabuleiro.add(letra11);
                tabuleiro.add(letra12);
                tabuleiro.add(letra13);
                tabuleiro.add(letra14);
                tabuleiro.add(letra15);
                tabuleiro.add(letra16);
                tabuleiro.add(letra17);
                tabuleiro.add(letra18);
                tabuleiro.add(letra19);
                tabuleiro.add(letra20);
                tabuleiro.add(letra21);
                tabuleiro.add(letra22);
                tabuleiro.add(letra23);
                tabuleiro.add(letra24);
                tabuleiro.add(letra25);
                tabuleiro.add(letra26);
                tabuleiro.add(letra27);
                tabuleiro.add(letra28);
                tabuleiro.add(letra29);
                tabuleiro.add(letra30);
                tabuleiro.add(letra31);
                tabuleiro.add(letra32);
            }
        }
        if (dificuldade.getNivel() == 6) {
            for (int j = 0; j < 2; j++) {
                tabuleiro.add(letra1);
                tabuleiro.add(letra2);
                tabuleiro.add(letra3);
                tabuleiro.add(letra4);
                tabuleiro.add(letra5);
                tabuleiro.add(letra6);
                tabuleiro.add(letra7);
                tabuleiro.add(letra8);
                tabuleiro.add(letra9);
                tabuleiro.add(letra10);
                tabuleiro.add(letra11);
                tabuleiro.add(letra12);
                tabuleiro.add(letra13);
                tabuleiro.add(letra14);
                tabuleiro.add(letra15);
                tabuleiro.add(letra16);
            }
        }
        else if (dificuldade.getNivel() == 4) {
            for (int j = 0; j < 2; j++) {
                tabuleiro.add(letra1);
                tabuleiro.add(letra2);
                tabuleiro.add(letra3);
                tabuleiro.add(letra4);
                tabuleiro.add(letra5);
                tabuleiro.add(letra6);
                tabuleiro.add(letra7);
                tabuleiro.add(letra8);
            }
        }

        Collections.shuffle(tabuleiro);


    }

    public int coordenadasEmPosicao(int x, int y){
        if (x == 0)
            return y;
        else
            return y + (dificuldade.getNivel() * x);
    }

    public void validarJogada(int x, int y) throws JogadaInválidaException {
        if (this.dificuldade == Dificuldade.FACIL & x >= 0 && x <= 3 && y >= 0 && y <= 3) {
            this.tabuleiroEmBranco.set(coordenadasEmPosicao(x, y), this.tabuleiro.get(coordenadasEmPosicao(x, y)));
        } else
        if (dificuldade == Dificuldade.MEDIO & x >= 0 && x <= 5 && y >= 0 && y <= 5) {
            this.tabuleiroEmBranco.set(coordenadasEmPosicao(x, y), this.tabuleiro.get(coordenadasEmPosicao(x, y)));
        } else
        if (dificuldade == Dificuldade.DIFICIL & x >= 0 && x <= 7 && y >= 0 && y <= 7) {
            this.tabuleiroEmBranco.set(coordenadasEmPosicao(x, y), this.tabuleiro.get(coordenadasEmPosicao(x, y)));
        } else {
            JogadaInválidaException e = new JogadaInválidaException();
            throw e;
        }

    }

    public  boolean verificarFim() {
        if (tabuleiroEmBranco.containsAll(tabuleiro))
            return true;
        else
            return false;
    }
    public void fazerMovimento(Jogador jogador, int x, int y, int a, int b){

        if (tabuleiroEmBranco.get(coordenadasEmPosicao(x,y)).equals(tabuleiroEmBranco.get(coordenadasEmPosicao(a,b)))){
            jogador.setPontuacao(jogador.getPontuacao() + 1);
            jogador.setVerificarJogada(true);
        }

        else {
            tabuleiroEmBranco.set(coordenadasEmPosicao(x, y), " ");
            tabuleiroEmBranco.set(coordenadasEmPosicao(a, b), " ");
            jogador.setVerificarJogada(false);
        }

    }


}