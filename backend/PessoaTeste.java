package backend;

public class PessoaTeste {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alex Ribeiro da Silva Andrade");
        pessoa.getNome();
        pessoa.setIdade(32);
        pessoa.getIdade();
        pessoa.setAltura(1.85);
        pessoa.getAltura();
        pessoa.setPeso(87);
        pessoa.getPeso();
        pessoa.setSalario(8957.89);
        pessoa.getSalario();
        pessoa.bonusSalarial();
        pessoa.gerarRelatório();
    }
}