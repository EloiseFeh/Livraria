public class Gerente extends Funcionario {
  public Gerente(String nome, String cpf, String localDeTrabalho) {
    super(nome, cpf, localDeTrabalho);
  }

  public void contactarFornecedor(String titulo, String autor, int quantidade, Fornecedor fornecedor) {
    Estoque estoque = new Estoque();

    estoque.aumentarEstoque(titulo, autor, quantidade, fornecedor.getEditora());
  }
}
