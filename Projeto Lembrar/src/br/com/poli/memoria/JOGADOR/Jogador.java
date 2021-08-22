package br.com.poli.memoria.JOGADOR;

public class Jogador extends Pessoa {

    private double pontuacao;
    private int identificacao;
    private boolean verificarJogada;

    public Jogador(String nome, int identificacao) {
        super(nome);
        this.identificacao = identificacao;
    }

    public int getIdentificacao() {
        return this.identificacao;
    }

    public boolean isVerificarJogada() {
        return verificarJogada;
    }

    public void setVerificarJogada(boolean verificarJogada) {
        this.verificarJogada = verificarJogada;
    }

    public double getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }


    @Override
    public String toString(){
        return "0" + this.getIdentificacao() + " - Jogador: " + this.getNome();
    }


}