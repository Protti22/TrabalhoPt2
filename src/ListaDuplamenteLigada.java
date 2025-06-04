public class ListaDuplamenteLigada {
    private Livro inicio;
    private Livro fim;

    public ListaDuplamenteLigada() {
        this.inicio = null;
        this.fim = null;
    }


    public void adicionarInicio(int id, String titulo, String autor) {
        Livro novo = new Livro(id, titulo, autor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        System.out.println("Livro adicionado no início: " + titulo);
    }


    public void adicionarFim(int id, String titulo, String autor) {
        Livro novo = new Livro(id, titulo, autor);
        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        System.out.println("Livro adicionado no fim: " + titulo);
    }


    public void removerInicio() {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        System.out.println("Livro removido do início: " + inicio.titulo);
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
    }


    public void removerFim() {
        if (fim == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        System.out.println("Livro removido do fim: " + fim.titulo);
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
    }


    public void buscarPorID(int id) {
        Livro atual = inicio;
        while (atual != null) {
            if (atual.id == id) {
                System.out.println("Livro encontrado: " + atual.titulo + " - " + atual.autor);
                return;
            }
            atual = atual.proximo;
        }
        System.out.println("Livro com ID " + id + " não encontrado.");
    }

    public void imprimirOrdemOriginal() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }
        System.out.println("Livros na ordem original:");
        Livro atual = inicio;
        while (atual != null) {
            System.out.println("ID: " + atual.id + ", Título: " + atual.titulo + ", Autor: " + atual.autor);
            atual = atual.proximo;
        }
    }

    public void imprimirOrdemReversa() {
        if (fim == null) {
            System.out.println("Lista vazia.");
            return;
        }
        System.out.println("Livros na ordem reversa:");
        Livro atual = fim;
        while (atual != null) {
            System.out.println("ID: " + atual.id + ", Título: " + atual.titulo + ", Autor: " + atual.autor);
            atual = atual.anterior;
        }
    }
}
