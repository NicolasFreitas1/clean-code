class Estatisticas {
    int posseBola;
    int chutes;
    int faltas;
    int cartoesAmarelos;
    int cartoesVermelhos;

    public Estatisticas(int posseBola, int chutes, int faltas, int cartoesAmarelos, int cartoesVermelhos) {
        this.posseBola = posseBola;
        this.chutes = chutes;
        this.faltas = faltas;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartoesVermelhos = cartoesVermelhos;
    }
}

class TimePartida {
    String nome;
    int gols;
    Estatisticas estatisticas;

    public TimePartida(String nome, int gols, Estatisticas estatisticas) {
        this.nome = nome;
        this.gols = gols;
        this.estatisticas = estatisticas;
    }
}

public class GerenciadorPartida {

    public void registrarPartida(TimePartida casa, TimePartida visitante) {
        System.out.println("Partida Registrada:");
        System.out.println(casa.nome + " " + casa.gols + " x " + visitante.gols + " " + visitante.nome);
        System.out.println("Posse de Bola: " + casa.estatisticas.posseBola + "% - " + visitante.estatisticas.posseBola + "%");
        System.out.println("Chutes: " + casa.estatisticas.chutes + " - " + visitante.estatisticas.chutes);
    }

    public void gerarRelatorio(TimePartida casa, TimePartida visitante) {
        String vencedor = casa.gols > visitante.gols ? casa.nome :
                         (casa.gols < visitante.gols ? visitante.nome : "Empate");

        System.out.println("=== Relatório da Partida ===");
        System.out.println("Vencedor: " + vencedor);
        System.out.println("Total de Chutes: " + (casa.estatisticas.chutes + visitante.estatisticas.chutes));
        System.out.println("Total de Faltas: " + (casa.estatisticas.faltas + visitante.estatisticas.faltas));
    }

    public static void main(String[] args) {
        Estatisticas estatCasa = new Estatisticas(55, 10, 15, 3, 1);
        Estatisticas estatVisit = new Estatisticas(45, 8, 12, 2, 0);

        TimePartida casa = new TimePartida("Time A", 2, estatCasa);
        TimePartida visitante = new TimePartida("Time B", 1, estatVisit);

        GerenciadorPartida gerenciador = new GerenciadorPartida();
        gerenciador.registrarPartida(casa, visitante);
        gerenciador.gerarRelatorio(casa, visitante);
    }
}
