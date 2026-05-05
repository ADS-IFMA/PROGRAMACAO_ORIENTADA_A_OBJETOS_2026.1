package rh;

public class Professor extends Pessoa{

    private String disciplina;

    public Professor(String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public void darAula(){
        System.out.println("Ministrando Aula...");
    }

    @Override
    public void apresentar(){
        super.apresentar();
        System.out.println("Disciplina: "+this.disciplina);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}//Fim de Professor
