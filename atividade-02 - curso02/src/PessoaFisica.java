public class PessoaFisica extends Pessoa {
    private Double gastoSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude){
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public Double imposto() {
        double rendaAnual = getRendaAnual();
        if (rendaAnual < 20000.00){
            rendaAnual *= 0.15;
        } else {
            rendaAnual *= 0.25;
        }
        double gastoSaude = getGastoSaude();
        if (gastoSaude > 0){
            gastoSaude *= 0.50;
        }

        return rendaAnual - gastoSaude;
    }

}
