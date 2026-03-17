public class Carro {

    String marca;
    int ano;
    String cor;
    double velocidade;
    boolean status;

    void acelerar(){
        velocidade += 1;
        status = true;
    }

    void frear(){
        if(velocidade == 0){
            System.out.println("Carro parado!");
            return;
        }
        velocidade -= 1;
        if(velocidade == 0){
            status = false;
        }
    }//Fim do frear

    void imprimir(){
        System.out.println("MARCA: "+marca);
        System.out.println("ANO: "+ano);
        System.out.println("COR: "+cor);
        System.out.println("VELOCIDADE: "+velocidade);
        System.out.println("STATUS: "+status);
        System.out.println("-------------------------");
    }

}//Fim da Classe
