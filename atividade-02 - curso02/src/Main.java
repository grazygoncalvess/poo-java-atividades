import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Número de contribuintes: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Dados do " + (i+1) +  "º Contribuinte:");
            System.out.print("Pessoa Jurídica ou Física [J/F]? ");
            char tipo = input.next().charAt(0);
            System.out.print("Nome: ");
            String nome = input.next();
            System.out.print("Renda anual: ");
            Double rendaAnual = input.nextDouble();
            if ( tipo == 'J'){
                System.out.print("Número de funcionários: ");
                int numFuncionarios = input.nextInt();
                Pessoa pessoaJuridica = new PessoaJuridica(nome, rendaAnual, numFuncionarios);
                pessoas.add(pessoaJuridica);
            } else {
                System.out.print("Gastos de Saúde: ");
                Double gastoSaude = input.nextDouble();
                Pessoa pessoaFisica = new PessoaFisica(nome, rendaAnual, gastoSaude);
                pessoas.add(pessoaFisica);
            }
        }

        System.out.println();
        System.out.println("IMPOSTOS PAGOS: ");
        for (Pessoa p : pessoas){
            System.out.println(p.toString());
        }

        System.out.println();
        System.out.println("TOTAL IMPOSTOS: ");
        Double impostoTotal = 0.0;
        for (Pessoa p : pessoas){
            impostoTotal += p.imposto();
        }
        System.out.println(impostoTotal);
    }
}