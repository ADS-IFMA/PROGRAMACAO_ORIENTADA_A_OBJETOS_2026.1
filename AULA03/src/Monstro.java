public class Monstro {

    String nome;
    int ataque;
    int defesa;
    boolean modo;

    void fortalecer(int bonus){
        ataque += bonus;
    }

    void atacar(Monstro inimigo){
        if(modo == false){
            System.out.println("Em modo de defesa!");
            return;
        }
        int luta = 0;
        if(inimigo.modo == true){
            luta = ataque - inimigo.ataque;
        }else{
            luta = ataque - inimigo.defesa;
        }
        if(luta > 0){
            System.out.println(nome + " VENCEU");
        }else if(luta < 0){
            System.out.println(inimigo.nome + " VENCEU");
        }else{
            System.out.println("DEU EMPATE!");
        }
    }//Fim do atacar

}//Fim da Classe
