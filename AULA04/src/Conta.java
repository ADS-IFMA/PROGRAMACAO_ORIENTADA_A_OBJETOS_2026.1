public class Conta {

    int numero;
    String nome;
    double saldo;

    void depositar(double dinheiro){
        saldo += dinheiro;
    }

    void sacar(double dinheiro){
        if(dinheiro > saldo){
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= dinheiro;
    }

    void extrato(){
        System.out.println("---- EXTRATO ---- ");
        System.out.println("NOME: "+nome);
        System.out.println("CONTA: "+numero);
        System.out.printf("SALDO: R$ %.2f\n", saldo);
        System.out.println("------------------");
    }

}
