class ItemCardapio {

    // atributos
    long id;
    String nome;
    String descricao;
    boolean emPromocao;
    double preco;
    double precoComDesconto;
    CategoriaCardapio categoria;
    double taxaImposto = 10.00;
    boolean isento;

    //construtor
    ItemCardapio(long id, String nome, String descricao, double preco, CategoriaCardapio categoria, boolean isento, double taxaImposto) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.isento = isento;
        this.taxaImposto = taxaImposto;
    }

    //metodos
    double calculaPorcentagemDesconto() {
        return (preco - precoComDesconto) / preco * 100;
    }

    CategoriaCardapio obtemNomeCategoria() {
        return categoria;
    }

    void definePromocao(double precoComDesconto) {
        emPromocao = true;
        this.precoComDesconto = precoComDesconto;
    }

}