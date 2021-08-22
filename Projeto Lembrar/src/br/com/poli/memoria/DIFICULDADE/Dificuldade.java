package br.com.poli.memoria.DIFICULDADE;
public enum Dificuldade {
    FACIL(4), MEDIO(6), DIFICIL(8);

    private int nivel;

    Dificuldade(int nivel){
        this.nivel = nivel;
    }

    public int getNivel() {
        return this.nivel;
    }

}
