package backend;

public class Pessoa{
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private double salario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String gerarRelatório(){
        String relatorio;
        relatorio = "Nome: " + nome +
                    "\n Idade: " + idade +
                    "\n Altura: " + altura +
                    "\n Peso: " + peso +
                    "\n IMC: " + (peso/(altura*altura)) +
                    "\n Salario:" + salario;
        return relatorio;
    }
}