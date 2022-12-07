public class Estoque implements IEstoque {
  Livro[] livro = {
      new Livro("É assim que acaba", "Colleen Hoover", 30, 34),
      new Livro("É assim que começa", "Colleen Hoover", 30, 45),
  };

  public void aumentarEstoque(String titulo, String autor, int quantidade, String editora) {
    for (int i = 0; i < livro.length; i++) {
      if (livro[i].getTitulo() == titulo) {
        livro[i].setQuantidadeDisponivel(livro[i].getQuantidadeDisponivel() + quantidade);
        System.out.println(
            "O Titulo de " + titulo + " de " + autor + ", foi aumentado em " + quantidade + " unidades pela Editora "
                + editora);
      }
    }

  }

  public void reduzirEstoque(String titulo, String autor, int quantidade, String funcionario) {
    for (int i = 0; i < livro.length; i++) {
      if (livro[i].getTitulo() == titulo) {
        livro[i].setQuantidadeDisponivel(livro[i].getQuantidadeDisponivel() - quantidade);
        System.out.println(
            "O Titulo de " + titulo + " de " + autor + ", foi reduzido em " + quantidade + " unidades pelo funcionario "
                + funcionario);
      }
    }

  }
}
