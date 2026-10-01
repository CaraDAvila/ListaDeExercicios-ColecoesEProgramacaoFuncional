package ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    static void main() {
        List <Faixa> lista = new ArrayList<>();
        lista.add(new Faixa("Longevity","Assemblage 23",397,2001,19));
        lista.add(new Faixa("Simple Girl","IAMX",282,2004,18));
        lista.add(new Faixa("Knives Out","Radiohead",254,2001,17));
        lista.add(new Faixa("All Mixed Up","311",181,1995,2));
        lista.add(new Faixa("Dream Attack","New Order",308,1989,2));

        lista.sort(Comparator.comparing(Faixa::getArtista).thenComparing(Faixa::getAno,
                Comparator.reverseOrder())
                .thenComparingInt(Faixa::getReproducoes)
        );

        List <Faixa> lista2 = new ArrayList<>();

        lista.forEach(faixa ->{
        System.out.println(faixa);
        });
    }
}
