public class Main {

    public void main(){

        Carro polo = new Carro();
        polo.cor = "Vermelho";
        polo.marca = "volksvagem";
        polo.ano = 2026;
        polo.velocidade = 0;
        polo.status = false;

        polo.imprimir();
        polo.acelerar();
        polo.acelerar();
        polo.imprimir();
        polo.frear();
        polo.frear();
        polo.frear();
        polo.imprimir();

    }

}
