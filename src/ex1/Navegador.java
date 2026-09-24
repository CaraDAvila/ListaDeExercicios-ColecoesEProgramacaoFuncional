package ex1;

import java.util.Deque;

public class Navegador {
    private String paginaAtual;
    private Deque<String> historicoVoltar;
    private Deque<String> historicoAvancar;

    public void visitar(String url) {
        return;
    }

    public boolean voltar() {
        return voltar();
    }

    public boolean avancar() {
        return avancar();
    }
}
