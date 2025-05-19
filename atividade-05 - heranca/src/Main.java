import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<CaminhaoBau> caminhoesBaus = new ArrayList<CaminhaoBau>();
        ArrayList<CaminhaoTanque> caminhoesTanques = new ArrayList<CaminhaoTanque>();

        // instanciando caminhoes bau e adicionando à lista caminhoesBaus
        CaminhaoBau caminhaoBau1 = new CaminhaoBau("Volvo 123", 2020, 2000, 'T',
                10, 2.20, 3.50);
        CaminhaoBau caminhaoBau2 = new CaminhaoBau("WV Turbo", 2021, 1800, 'T',
                12, 2.20, 3.50);
        CaminhaoBau caminhaoBau3 = new CaminhaoBau("WV T1000", 2022, 2200,'T',
                14, 2.20, 3.8);
        caminhoesBaus.add(caminhaoBau1);
        caminhoesBaus.add(caminhaoBau2);
        caminhoesBaus.add(caminhaoBau3);

        // instanciando caminhoes bau e adicionando à lista caminhoesBaus
        CaminhaoTanque caminhaoTanque1 = new CaminhaoTanque("Iveco Day", 2019, 3000,
                'L', "Água");
        CaminhaoTanque caminhaoTanque2 = new CaminhaoTanque("MB 2000", 2021, 2500,
                'L', "Combustível");
        caminhoesTanques.add(caminhaoTanque1);
        caminhoesTanques.add(caminhaoTanque2);

        System.out.println("------------------ LISTA CAMINHÕES BAÚ ------------------");
        System.out.println(caminhoesBaus.toString());

        System.out.println("\n--------------- LISTA CAMINHÕES TANQUE ------------------");
        System.out.println(caminhoesTanques.toString());
    }
}