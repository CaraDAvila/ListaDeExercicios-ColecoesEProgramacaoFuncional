package ex4;

@FunctionalInterface
public interface Regra {
    String validar(Cadastro c); // devolve null quando válido ou a mensagem de erro
}
