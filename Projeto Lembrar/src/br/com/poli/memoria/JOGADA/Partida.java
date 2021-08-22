package br.com.poli.memoria.JOGADA;

import br.com.poli.memoria.DIFICULDADE.Dificuldade;
import br.com.poli.memoria.JOGADOR.Jogador;

public class Partida {
    private final Jogador jogador1;
    private final Jogador jogador2;
    private final Tabuleiro tabuleiro;
    private boolean fim;
    private int indPlayer;
    private boolean resultadoJogada;

    public Partida(Jogador jogador1, Jogador jogador2, Dificuldade dificuldade) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.tabuleiro = new Tabuleiro(dificuldade);
        this.fim = false;
        indPlayer = 1;
    }
    public boolean getResultadoJogada(){
        return this.resultadoJogada;
    }
    public void setResultadoJogada(boolean b) {
        this.resultadoJogada = b;
    }

    public void setIndPlayer(int indPlayer) {
        this.indPlayer = indPlayer;
    }

    public int getIndPlayer() {
        return indPlayer;
    }

    public Tabuleiro getTabuleiro(){
        return tabuleiro;
    }

    public boolean isFim() {
        return fim;
    }
    public void setFim(boolean fim) {
        this.fim = fim;
    }

    public Jogador jogadorAtual(){
        if (getIndPlayer() == 1){
            return this.jogador1;
        } else
            return this.jogador2;

    }
    public void mudarJogador(){
        if (this.getIndPlayer() == 1)
            setIndPlayer(0);
        else
            setIndPlayer(1);
    }

    public void fazerJogada(int x, int y, int a, int b) {
        this.tabuleiro.fazerMovimento(jogadorAtual(), x, y, a, b);

        if (jogadorAtual().isVerificarJogada()){
            setResultadoJogada(true);
            if (tabuleiro.verificarFim())
                setFim(true);
        }
        else
            mudarJogador();

    }

    public void jogadaCPU(){

    }

}