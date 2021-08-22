package br.com.poli.memoria.JOGADOR;
public class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return "O nome do jogador é " + getNome();
    }

}
