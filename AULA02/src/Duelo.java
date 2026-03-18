public class Duelo {

    void main(){

        Monstro dragao = new Monstro();
        dragao.nome = "Dragão Branco de Olhos Azuis";
        dragao.ataque = 3000;
        dragao.defesa = 2500;
        dragao.modo = false;

        Monstro mago = new Monstro();
        mago.nome = "Mago Negro";
        mago.ataque = 2500;
        mago.defesa = 2100;
        mago.modo = true;
        mago.fortalecer(300);

        mago.atacar(dragao);

    }//Fim do Main

}//Fim da Classe
