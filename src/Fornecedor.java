import java.util.UUID;

public class Fornecedor {
  private static UUID uuid = UUID.randomUUID();
    private String editora;
    
    public Fornecedor(String editora) {
        this.editora = editora;
    }
    
    public String getEditora() {
        return this.editora;
    }

    public static UUID getUuid() {
        return uuid;
    }    

}
