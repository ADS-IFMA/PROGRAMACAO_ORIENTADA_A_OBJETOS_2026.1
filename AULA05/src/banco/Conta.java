package banco;

public class Conta {

    private int numero;
    private String nome;
    private double saldo;

    public Conta(){
        System.out.println("Construtor Vazio");
    }

    public Conta(String nome){
        this.nome = nome;
        System.out.println("Construtor só com o nome");
    }

    public Conta(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0;
        System.out.println("Construtor com numero e nome");
    }

    public void depositar(double dinheiro){
        saldo += dinheiro;
    }

    public void sacar(double dinheiro){
        if(dinheiro > saldo){
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= dinheiro;
    }

    public void extrato(){
        System.out.println("---- EXTRATO ---- ");
        System.out.println("NOME: "+nome);
        System.out.println("CONTA: "+numero);
        System.out.printf("SALDO: R$ %.2f\n", saldo);
        System.out.println("------------------");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}//Fim da Classe
