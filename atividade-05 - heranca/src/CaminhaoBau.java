public class CaminhaoBau extends Caminhao {

    private double volume;
    private double comprimento;
    private double largura;
    private double altura;

    // construtor caminhao baú
    public CaminhaoBau(String modelo, int anoFabricacao, int capacidadeTotal, char unidade, double comprimento, double largura, double altura){
        super( modelo,  anoFabricacao,  capacidadeTotal,  unidade);
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
        calculaVolume();
    }

    // getters e setters
    public double getVolume() {
        return volume;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // métodos
    public void carregaBau(double qtdeQuilos){
        double qtdToneladas = qtdeQuilos/1000;
        cargaAtual += qtdToneladas;
    }

    public void descarregaBau(double qtdeQuilos){
        double qtdToneladas = qtdeQuilos/1000;
        cargaAtual -= qtdToneladas;
    }

    private void calculaVolume(){
        this.volume = (this.altura * this.largura * this.comprimento);
    }

    @Override
    public String toString() {
        return "\nNr Caminhao:" + getNrCaminhao() +
                " Modelo:" + getModelo() +
                " Ano Fabricação:" + getAnoFabricacao() +
                " Capacidade Total:" + getCapacidadeTotal() +
                " Unidade:" + getUnidade() +
                " Comprimento:" + getComprimento() +
                " Largura:" + getLargura() +
                " Altura:" + getAltura();
    }
}
