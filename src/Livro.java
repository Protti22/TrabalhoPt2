class Livro {
    int id;
    String titulo;
    String autor;
    Livro anterior;
    Livro proximo;

    public Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anterior = null;
        this.proximo = null;
    }
}