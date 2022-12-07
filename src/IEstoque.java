public interface IEstoque {
  public void aumentarEstoque(String titulo, String autor, int quatidade, String editora);

  public void reduzirEstoque(String titulo, String autor, int quatidade, String funcionario);
}
