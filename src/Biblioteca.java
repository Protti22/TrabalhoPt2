public class Biblioteca {
    public static void main(String[] args) {
        ListaDuplamenteLigada biblioteca = new ListaDuplamenteLigada();

        biblioteca.adicionarInicio(101, "Thiago", "José Emanoel");
        biblioteca.adicionarFim(102, "2004", "Juliano");
        biblioteca.adicionarInicio(103, "Mestre", "Ramon");

        biblioteca.imprimirOrdemOriginal();
        biblioteca.imprimirOrdemReversa();

        biblioteca.buscarPorID(102);
        biblioteca.buscarPorID(999);

        biblioteca.removerInicio();
        biblioteca.removerFim();

        biblioteca.imprimirOrdemOriginal();
    }
}
