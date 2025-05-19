public class Personagem {
    private int id;
    private String nome;
    private int ponto;

    public Personagem(int id, String nome, int ponto){
        this.id = id;
        this.nome = nome;
        this.ponto = ponto;
    }

    // métodos

    // -- recebe golpe físico
    public void recebeGolpe(int aceleracao){
        this.ponto -= 1 * aceleracao;
    }
    // -- recebe golpe armado
    public void recebeGolpe(char tipoArma, int aceleracao){
        final double armaManual = 2 * aceleracao;
        final double armaMecanica = armaManual * 1.40;
        final double armaEletronica = armaMecanica * 1.40;
        if (tipoArma == 'm'){
            this.ponto -= Math.ceil(armaManual);
        } else if (tipoArma == 'M') {
            this.ponto -= Math.ceil(armaMecanica);
        } else {
            this.ponto -= Math.ceil(armaEletronica);
        }
    }

    public String toString(){
        return "ID do Personagem....: " + getId() +
               "\nNome do Personagem..: " + getNome() +
               "\nPontos de vida......: " + getPonto();
    }



    // getters e setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPonto() {
        return ponto;
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }
}
