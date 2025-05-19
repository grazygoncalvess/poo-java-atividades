public abstract class Caminhao {

    static private int geradorNrCaminhao = 10;
    private int nrCaminhao;
    private String modelo;
    private int anoFabricacao;
    private int capacidadeTotal;
    protected double cargaAtual;
    private char unidade;

    // construtor
    public Caminhao(String modelo, int anoFabricacao, int capacidadeTotal, char unidade){
        this.nrCaminhao = ++geradorNrCaminhao;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.capacidadeTotal = capacidadeTotal;
        this.unidade = unidade;
    }

    // getters e setters
    public int getNrCaminhao() {
        return nrCaminhao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal){
        this.capacidadeTotal = capacidadeTotal;
    }

    public double getCargaAtual() {
        return cargaAtual;
    }

    public char getUnidade() {
        return unidade;
    }
}
