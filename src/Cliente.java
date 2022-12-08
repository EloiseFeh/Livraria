public class Cliente  implements IPessoa{
    private String nome;
    private String cpf;
    private String endereco;
    protected float carteira;

    public Cliente(String nome, String cpf, String endereco, float carteira){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;   
        this.carteira = carteira;   
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public float getCarteira(){
        return carteira;
    }

    public void setCarteira(float carteira){
        this.carteira = carteira;
    }
}
