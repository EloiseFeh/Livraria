import java.util.UUID;

public class Livro {
  private static UUID uuid = UUID.randomUUID();
  private String titulo;
  private String autor;
  private int quantidadeDisponivel;
  private float preco;

  public Livro(String titulo, String autor, int quantidadeDisponivel, float preco) {
    this.titulo = titulo;
    this.autor = autor;
    this.quantidadeDisponivel = quantidadeDisponivel;
    this.preco = preco;
  }

  

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getQuantidadeDisponivel() {
    return quantidadeDisponivel;
  }

  public void setQuantidadeDisponivel(int quantidadeDisponivel) {
    this.quantidadeDisponivel = quantidadeDisponivel;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }

  public static UUID getUuid() {
    return uuid;
  }

}
