import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Colaborador> colaboradores = new ArrayList<Colaborador>();

        // criar funcionário e adicionar à lista
        Funcionario funcionario1 = new Funcionario("Robson Nunes", 'D', 3500, 8, 2023);
        colaboradores.add(funcionario1);
        // criar terceirizado e adicionar à lista
        Terceirizado terceirizado1 = new Terceirizado("Joelma Pacheco", 'P', 5, 4);
        colaboradores.add(terceirizado1);

        // mostrar os objetos armazenados na lista
        System.out.println(colaboradores);

        // 2.5Totalizar e mostrar o valor total das contribuições dos colaboradores armazenados na lista.
        System.out.println(" ");
        System.out.println("-- SOMA TOTAL DAS CONTRIBUIÇÕES --");
        double valorContribuicao = funcionario1.getValorContribuicao() + terceirizado1.getValorContribuicao();
        System.out.println("Valor................: R$" + valorContribuicao);

    }
}