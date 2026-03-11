public class FilmeService {

    public void listarTodosFilmes() {
        System.out.println("Listando todos os filmes do catálogo...");
    }

    public void listarFilmesDisponiveis() {
        System.out.println("Listando apenas filmes disponíveis para locação...");
    }

    public void marcarComoDisponivel(String titulo) {
        System.out.println("O filme \"" + titulo + "\" agora está disponível para locação.");
    }

    public void marcarComoIndisponivel(String titulo) {
        System.out.println("O filme \"" + titulo + "\" foi marcado como indisponível.");
    }

    public static void main(String[] args) {
        FilmeService service = new FilmeService();

        service.listarFilmesDisponiveis();
        service.listarTodosFilmes();

        service.marcarComoDisponivel("Inception");
        service.marcarComoIndisponivel("Matrix");
    }
}
