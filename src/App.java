public class App {
    public static void main(String[] args) throws Exception {
        Gerente gerente1 = new Gerente("Ben Solo", "567.364.899-32", "Saraiva RioMar");
        Funcionario funcionario1 = new Funcionario("Olivia Smith", "456.222.645-78", "Saraiva North Shopping");
        gerente1.baterPonto();
        funcionario1.baterPonto();

        Cliente cliente1 = new Cliente("Leia", "056.888.423-78", "Rua César Augusto, 72", 200);
        new Venda("É assim que acaba", "Colleen Hoover", 10, cliente1, funcionario1);
        new Venda("É assim que começa", "Colleen Hoover", 20, cliente1, funcionario1);

        Fornecedor fornecedor1 = new Fornecedor("Cézar Atacado");
        gerente1.contactarFornecedor("Star Wars: Estrelas Perdidas", "Claudia Gray", 10, fornecedor1);
        
    }
}
