public abstract class Colaborador implements IColaborador {
    private static int gerarMatricula = 0;
    private int matricula;
    private String nome;
    private char tipo;
    protected double valorContribuicao;

    // construtor
    public Colaborador(String nome, char tipo){
        this.matricula = ++gerarMatricula;
        this.nome = nome;
        this.tipo = Character.toUpperCase(tipo);
        calcularContribuicao();
    }

    @Override
    public String toString() {
        String tipoExtenso = "";
        if (tipo == 'D')
            tipoExtenso = "Diretor";
        else if (tipo == 'G')
            tipoExtenso = "Gerente";
        else if (tipo == 'O')
            tipoExtenso = "Operacional";
        else if (tipo == 'T')
            tipoExtenso = "Temporário";
        else if (tipo == 'P')
            tipoExtenso = "Permanente";

        return  " " +
                "\nMatrícula............: " + matricula +
                "\nNome.................: " + nome +
                "\nTipo.................: " + tipoExtenso +
                "\nValor da contribuição: R$ " + String.format("R$ %.2f", valorContribuicao);
    }

    // getters e setters
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getValorContribuicao() {
        return valorContribuicao;
    }
}
