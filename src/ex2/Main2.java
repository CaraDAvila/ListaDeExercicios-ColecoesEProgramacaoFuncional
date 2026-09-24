package ex2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    static void main() {
        List <Faixa> faixa = new ArrayList<>();

        faixa.stream()
                .sorted(Comparator.comparing(Faixa::getArtista).thenComparing(Faixa::getAno,
                Comparator.reverseOrder()))

        ;
    }
}
