public class Funcionario extends Colaborador {
    private double salario;
    private int anoAdmissao;
    private int mesAdmissao;

    public Funcionario(String nome, char tipo, double salario, int mesAdmissao, int anoAdmissao){
        super(nome, tipo);
        this.salario = salario;
        this.mesAdmissao = mesAdmissao;
        this.anoAdmissao = anoAdmissao;
        this.valorContribuicao = calcularContribuicao();
    }

    @Override
    public double calcularContribuicao() {
        double contribuicao;
        if(getTipo() == 'D'){
            contribuicao = this.salario * 0.10;
        } else if (getTipo() == 'G') {
            contribuicao = this.salario * 0.08;
        } else {
            contribuicao = this.salario * 0.05;
        }
        if (anoAdmissao == 2024){
            int mesesContribuir = 12 - mesAdmissao + 1;
            contribuicao = contribuicao/12 * mesesContribuir;
        }
        return contribuicao;
    }

    @Override
    public String toString() {
        return "\n========== COLABORADOR FUNCIONÁRIO ==========" +
                super.toString() +
               "\nSalário..............: " + getSalario() +
               "\nMês de Admissão......: " + getMesAdmissao() +
               "\nAno de Admissão......: " + getAnoAdmissao() +
                "\n============================================" +
                "\n";
    }

    // getters e setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnoAdmissao() {
        return anoAdmissao;
    }

    public void setAnoAdmissao(int anoAdmissao) {
        this.anoAdmissao = anoAdmissao;
    }

    public int getMesAdmissao() {
        return mesAdmissao;
    }

    public void setMesAdmissao(int mesAdmissao) {
        this.mesAdmissao = mesAdmissao;
    }
}
