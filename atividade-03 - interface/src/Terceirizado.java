public class Terceirizado extends Colaborador {
    private int diasSemana;
    private int horasDias;

    public Terceirizado(String nome, char tipo, int diasSemana, int horasDias){
        super(nome, tipo);
        this.diasSemana = diasSemana;
        this.horasDias = horasDias;
        this.valorContribuicao = calcularContribuicao();
    }

    @Override
    public double calcularContribuicao() {
        if(getTipo() == 'T'){
            return 0;
        }
        int horaSemanal = this.horasDias * this.diasSemana;
        double contribuicao;
        if (horaSemanal <= 16){
            contribuicao = 80;
        } else if (horaSemanal <= 24) {
            contribuicao = 150;
        } else {
            contribuicao = 250;
        }
        return contribuicao;
    }

    @Override
    public String toString() {
        return  "\n========== COLABORADOR TERCEIRIZADO ========" +
                super.toString() +
                "\nHoras Diárias........: " + getHorasDias() +
                "\nDias Semanais........: " + getDiasSemana() +
                "\nCarga Horária Semanal: " + (getDiasSemana() * getHorasDias()) + " horas" +
                "\n===========================================";
    }

    //getters e setters
    public int getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(int diasSemana) {
        this.diasSemana = diasSemana;
    }

    public int getHorasDias() {
        return horasDias;
    }

    public void setHorasDias(int horasDias) {
        this.horasDias = horasDias;
    }
}
