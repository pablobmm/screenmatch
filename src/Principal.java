import br.com.alura.screenmatch.modelos.Filme;
public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("O poderoso chefão");
        filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoEmMinutos(180);
        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(4);
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes() );
        System.out.println(filme1.obterMedia());

    }
}