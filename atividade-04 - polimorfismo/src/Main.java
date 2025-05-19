public class Main {
    public static void main(String[] args) {
        /* Implemente uma aplicação para:
        2.1 Cadastrar um personagem e mostrar seus dados.*/
        System.out.println("---------- Criação de Personagem ---------------");

        Personagem personagem1 = new Personagem(10, "Gohan", 100);
        System.out.println(personagem1.toString());
        System.out.println(" ");

        // 2.2 Fazer o personagem receber um golpe físico. Mostrar os pontos do personagem.
        System.out.println("* recebeu dano físico");
        personagem1.recebeGolpe(10);
        System.out.println("Pontos de vida......: " + personagem1.getPonto());

        // 2.3 Fazer o personagem receber um golpe com arma manual. Mostrar os pontos do personagem.
        System.out.println(" ");
        System.out.println("* recebeu dano com arma manual");
        personagem1.recebeGolpe('m', 5);
        System.out.println("Pontos de vida......: " + personagem1.getPonto());

        // 2.4 Fazer o personagem receber um golpe com arma mecânica. Mostrar os pontos do personagem.
        System.out.println(" ");
        System.out.println("* recebeu dano com arma mecânica");
        personagem1.recebeGolpe('M', 3);
        System.out.println("Pontos de vida......: " + personagem1.getPonto());

        // 2.5 Fazer o personagem receber um golpe com arma eletrônica. Mostrar os pontos do personagem.
        System.out.println(" ");
        System.out.println("* recebeu dano com arma eletrônica");
        personagem1.recebeGolpe('E', 4);
        System.out.println("Pontos de vida......: " + personagem1.getPonto());


    }
}