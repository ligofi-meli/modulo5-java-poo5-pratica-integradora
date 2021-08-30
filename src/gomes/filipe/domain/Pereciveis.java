package gomes.filipe.domain;

public class Pereciveis extends Produto {
    private int validadeEmDias;

    public Pereciveis(String nome, double preco, int validadeEmDias) {
        super(nome, preco);
        this.validadeEmDias = validadeEmDias;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "validadeEmDias=" + validadeEmDias +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public double calcular(int quantidadeDeProdutos) {
        switch (validadeEmDias) {
            case 1:
                return (preco * quantidadeDeProdutos) / 4;
            case 2:
                return (preco * quantidadeDeProdutos) / 3;
            default:
                return (preco * quantidadeDeProdutos) / 2;
        }
    }
}
