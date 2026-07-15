public class ItemCardapioIsento extends ItemCardapio {
    ItemCardapioIsento(long id, String nome, String descricao, double preco, CategoriaCardapio categoria) {
        super(id, nome, descricao, preco, categoria);
    }
    @Override // anotação que indica reescrita de metodo
    double calculaImposto() {
        return 0.00;
    }
}