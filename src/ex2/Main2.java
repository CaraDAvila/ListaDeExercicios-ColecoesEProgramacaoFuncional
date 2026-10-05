package ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    static void main() {
        int quantas, removidas,
                segundosTot,
                horas, min,seg;

        List <Faixa> lista = new ArrayList<>();
        lista.add(new Faixa("Longevity","Assemblage 23",397,2001,19));
        lista.add(new Faixa("Simple Girl","IAMX",282,2004,18));
        lista.add(new Faixa("Knives Out","Radiohead",254,2001,17));
        lista.add(new Faixa("All Mixed Up","311",181,1995,2));
        lista.add(new Faixa("Dream Attack","New Order",308,1989,2));

        System.out.println("PLAYLIST");
        lista.stream()
                .sorted(Comparator.comparing(Faixa::getArtista)
                        .thenComparing(Faixa::getAno, Comparator.reverseOrder()))

                .forEach(System.out::println);

        System.out.println("MAIS TOCADAS");
        lista.stream()
                .sorted(Comparator.comparing(Faixa::getReproducoes).reversed())
                        .limit(5)

                .forEach(faixa -> System.out.println(faixa.getTitulo()+" ["+faixa.getReproducoes()+"]"));

        quantas=lista.size();
        lista.removeIf(faixa-> faixa.getReproducoes()<3);

        removidas=quantas-lista.size();
        System.out.println("[ REMOVIDAS: " +removidas+" ]");

        segundosTot = lista.stream().mapToInt(Faixa::getDuracaoSegundos).sum();
        horas=segundosTot/3600;
        min=segundosTot%3600/60;
        seg=segundosTot%3600%60;
        System.out.println("[ DURACAO TOTAL " +horas+":"+min+":"+seg+" ]");

    }
}
