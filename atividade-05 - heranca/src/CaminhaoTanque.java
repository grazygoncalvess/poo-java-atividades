public class CaminhaoTanque extends Caminhao {
    private String tipo;

    public CaminhaoTanque(String modelo, int anoFabricacao, int capacidadeTotal, char unidade, String tipo){
        super(modelo, anoFabricacao, capacidadeTotal, unidade);
        this.tipo = tipo;
    }

    // getter e setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // métodos
    public void encheTanque(){
        this.cargaAtual += this.getCapacidadeTotal();
    }

    public void esvaziaTanque(){
        this.cargaAtual = 0;
    }

    public void abasteceTanque(int qtdeLitros){
        this.cargaAtual += qtdeLitros;
    }

    public void descarregaTanque(int qtdeLitros){
        this.cargaAtual -= qtdeLitros;
    }

    @Override
    public String toString() {
        return "\nNr Caminhao: " + getNrCaminhao() +
                "Modelo: " + getModelo() +
                " Ano Fabricação:" + getAnoFabricacao() +
                " Capacidade Total:" + getCapacidadeTotal() +
                " Unidade:" + getUnidade() +
                " Tipo:" + getTipo();
    }
}
