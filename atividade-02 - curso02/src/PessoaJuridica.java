public class PessoaJuridica extends Pessoa {
    private int numFuncionario;

    public PessoaJuridica(String nome, Double rendaAnual, int numFuncionario){
        super(nome, rendaAnual);
        this.numFuncionario = numFuncionario;
    }

    public int getNumFuncionario() {
        return numFuncionario;
    }

    public void setNumFuncionario(int numFuncionario) {
        this.numFuncionario = numFuncionario;
    }

    @Override
    public Double imposto() {
        if (getNumFuncionario() > 10){
            return getRendaAnual() * 0.14;
        } else {
            return getRendaAnual() * 0.16;
        }
    }

}
