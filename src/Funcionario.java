public class Funcionario implements IPessoa{
    private String nome;
    private String cpf;
    private float dinheiroRecebido;
    private String localDeTrabalho;
    private boolean presenca = false;
    
    public Funcionario(String nome, String cpf, String localDeTrabalho){
        this.nome = nome;
        this.cpf = cpf;
        this.localDeTrabalho = localDeTrabalho;
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

    public String getLocalDeTrabalho(){
        return localDeTrabalho;
    }

    public void setLocalDeTrabalho(String localDeTrabalho){
        this.localDeTrabalho = localDeTrabalho;
    }

    public float dinheiroRecebido(){
        return dinheiroRecebido;
    }

    public void setDinheiroRecebido(float dinheiroRecebido){
        this.dinheiroRecebido = dinheiroRecebido;
    }

    public boolean isPresente(){
        return presenca;
    }

    public void setPresente(boolean presente){
        this.presenca = presente;
    }

    public void baterPonto() {
        setPresente(true);
    }

    
}
