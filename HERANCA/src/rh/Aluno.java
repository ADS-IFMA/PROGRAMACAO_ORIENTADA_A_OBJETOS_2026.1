package rh;

public class Aluno extends Pessoa{

    public Aluno(String nome, int idade){
        super(nome, idade);
    }

    public void estudar(){
        System.out.println(super.getNome() + " Estudando...");
    }

}//Fim do Aluno
