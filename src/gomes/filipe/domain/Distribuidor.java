package gomes.filipe.domain;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Distribuidor {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Locale localeBrazil = new Locale("pt", "BR");

        produtos.add(new Pereciveis("1 pé couve", 1.50, 4));
        produtos.add(new Pereciveis("1kg de Banana prata", 6.65, 10));
        produtos.add(new Pereciveis("1 duzia de ovos caipira", 12, 15));
        produtos.add(new Pereciveis("1kg de sardinha", 17.99, 7));
        produtos.add(new Pereciveis("1kg de filé de frango", 22, 11));

        produtos.add(new NaoPereciveis("1kg de feijão preto", 8.79, "vegetal"));
        produtos.add(new NaoPereciveis("Arroz", 11.98, "vegetal" ));
        produtos.add(new NaoPereciveis("500g de Macarrão espaguete",3.83, "massa" ));
        produtos.add(new NaoPereciveis("1kg de Fubá", 6.92, ""));
        produtos.add(new NaoPereciveis("200g de milho em conserva", 4.09, "enlatado"));

        for (Produto produto : produtos) {
            System.out.println(produto.toString());
            System.out.println(NumberFormat.getCurrencyInstance(localeBrazil).format(produto.calcular(5)));
        }
    }
}
