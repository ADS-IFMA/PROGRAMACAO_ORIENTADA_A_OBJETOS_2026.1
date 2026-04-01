public class Livro {

    private String titulo;
    private String autor;
    private int paginas;
    private int estoque;

    public Livro(String titulo, String autor, int paginas, int estoque){
        this.titulo = titulo;
        this.autor = autor;
        this.setPaginas(paginas);
        this.setEstoque(estoque);
    }

    public void emprestar(int qtd){
        if(this.estoque >= qtd){
            this.estoque -= qtd;
            return;
        }
        System.out.println("Estoque insuficiente!");
    }

    public void devolver(){
        this.estoque++;
    }

    public void exibir(){
        System.out.println("-----------------------------");
        System.out.println("TITULO: "+titulo);
        System.out.println("AUTOR: "+autor);
        System.out.println("PAGINAS: "+paginas);
        System.out.println("ESTOQUE: "+estoque);
        System.out.println("-----------------------------");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if(paginas <= 0){
            System.out.println("Não pode ter paginas negativa!");
            return;
        }
        this.paginas = paginas;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        if(estoque < 0){
            System.out.println("Não é permitido estoque negativo!");
            return;
        }
        this.estoque = estoque;
    }
}//Fim da Classe
