package ex2;

public class Faixa {
    private String titulo;
    private String artista;
    private int duracaoSegundos;
    private int ano;
    private int reproducoes;

    @Override
    public String toString() {
        return
                "\n"+"titulo:" + titulo + "\n" +
                "artista:" + artista + "\n" +
                "duracao:" + duracaoSegundos + "\n" +
                "ano:" + ano + "\n" +
                "reproducoes:" + reproducoes+"\n";
    }

    public Faixa(String titulo, String artista, int duracaoSegundos, int ano, int reproducoes) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
        this.ano = ano;
        this.reproducoes = reproducoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public void setReproducoes(int reproducoes) {
        this.reproducoes = reproducoes;
    }
}
