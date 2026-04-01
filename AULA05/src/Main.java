import banco.Conta;

import javax.swing.*;

public class Main {

    void main(){
        Conta conta = new Conta(120, "Bruno");
        Conta conta2 = new Conta();
        Conta conta3 = new Conta("Bruno");
        conta3.setSaldo(100);
    }

}
