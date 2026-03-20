public class Controle {

    String marca;
    String modelo;
    int volume;
    int canal;
    boolean estado;

    void power(){
        if(estado){
            estado = false;
        }else{
            estado = true;
        }
    }//Fim do power

    void avancar(){
        if(estado){
            if(canal < 100) {
                canal++;
            }
        }
    }

    void voltar(){
        if(estado){
            if(canal > 1) {
                canal--;
            }
        }
    }

    void aumentar_volume(){
        if(estado){
            if(volume < 100)
                volume++;
        }
    }

    void diminuir_volume(){
        if(estado){
            if(volume > 0){
                volume--;
            }
        }
    }

    void exibir(){
        if(estado){
            System.out.println("MARCA: "+marca);
            System.out.println("MODELO: "+modelo);
            System.out.println("VOLUME: "+volume);
            System.out.println("CANAL: "+canal);
        }
    }

}
