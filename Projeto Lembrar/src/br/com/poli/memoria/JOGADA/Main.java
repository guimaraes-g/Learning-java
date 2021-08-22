package br.com.poli.memoria.JOGADA;

import br.com.poli.memoria.DIFICULDADE.Dificuldade;
import br.com.poli.memoria.JOGADOR.Jogador;
import br.com.poli.memoria.TELAS.Tela1;

import javax.swing.*;
import java.util.Scanner;

//Gustavo Guimarães Garcez
//Projeto
public class Main extends JFrame {

    public static void main(String[] args) throws JogadaInválidaException, Exception {

        Tela1 tela1 = new Tela1();
        tela1.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Jogador jogador1 = Main.jogador1();
        Jogador jogador2 = Main.jogador2();
        Dificuldade dificuldade = Main.escolherDificuldade();
        Scanner sf = new Scanner(System.in);
        Partida jogo = new Partida (jogador1, jogador2, dificuldade);

        while (!jogo.isFim()){

            System.out.println(jogo.jogadorAtual().toString() + "\nRealize sua primeira jogada! \n");
            System.out.println(jogo.getTabuleiro().tabuleiroEmSi());

            System.out.println("Informe a posição da linha: ");
            int x = sf.nextInt();
            System.out.println("Informe a posição da coluna: ");
            int y = sf.nextInt();

            jogo.getTabuleiro().validarJogada(x, y);

            System.out.println(jogo.jogadorAtual().toString() + "\nRealize sua segunda jogada! \n");
            System.out.println(jogo.getTabuleiro().tabuleiroEmSi());

            System.out.println("Informe a posição da linha: ");
            int a = sf.nextInt();
            System.out.println("Informe a posição da coluna: ");
            int b = sf.nextInt();

            jogo.getTabuleiro().validarJogada(a, b);

            System.out.println(jogo.getTabuleiro().tabuleiroEmSi());
            jogo.fazerJogada(x, y, a, b);

            if (jogo.getResultadoJogada() == true) {
                if (jogo.isFim()) {
                    System.out.println("Fim de jogo! \nVitória de " + jogo.jogadorAtual().getNome()
                            + "\nPontuação final: " + jogo.jogadorAtual().getPontuacao());
                }
            }

        }
    }
    public static Jogador jogador1() {
        Scanner sa = new Scanner(System.in);
        System.out.println("Digite o nome do primeiro jogador :");
        String nome1 = sa.next();
        return new Jogador(nome1, 1);
    }
    public static Jogador jogador2() {
        Scanner sb = new Scanner(System.in);
        System.out.println("Digite o nome do segundo jogador :");
        String nome2 = sb.next();
        return new Jogador (nome2, 2);
    }
    public static Dificuldade escolherDificuldade() {
        System.out.println("\n\nEscolha agora a dificuldade pela qual deseja jogar. \nDigite a inicial \nF para Fácil\nM para Médio\nD para Difícil ");
        System.out.println("\nFácil: 4X4 \nMédio: 6X6 \nDifícil: 8X8 \n");
        System.out.println("Escreva agora a dificuldade que deseja jogar: ");
        Scanner sc = new Scanner(System.in);
        String modo = sc.next();
        Dificuldade dificuldade;

        switch (modo) {
            case "F":
            case "f":
                dificuldade = Dificuldade.FACIL;
                break;
            case "M":
            case "m":
                dificuldade = Dificuldade.MEDIO;
                break;
            case "D":
            case "d":
                dificuldade = Dificuldade.DIFICIL;
                break;
            default:
                System.out.println("Dificuldade inválida. Lhe auxiliaremos a escolher... nível fácil!");
                dificuldade = Dificuldade.FACIL;
                break;
        }
        return dificuldade;
    }

}
