public class Jogo {
    private int vidaJogador;
    private int vidaInimigo;

    public Jogo(int vidaJogador, int vidaInimigo) {
        this.vidaJogador = vidaJogador;
        this.vidaInimigo = vidaInimigo;
    }

    private int aplicarDano(int vida, int dano, String personagem) {
        vida -= dano;

        if (vida <= 0) {
            System.out.println(personagem + " perdeu!");
        } else {
            System.out.println("Vida do " + personagem + ": " + vida);
        }

        return vida;
    }

    public void atacarJogador(int dano) {
        vidaJogador = aplicarDano(vidaJogador, dano, "Jogador");
    }

    public void atacarInimigo(int dano) {
        vidaInimigo = aplicarDano(vidaInimigo, dano, "Inimigo");
    }

    public int getVidaJogador() {
        return vidaJogador;
    }

    public int getVidaInimigo() {
        return vidaInimigo;
    }
}
