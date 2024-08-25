package Criacao_de_Classe;
import Definicao_de_Classe.Carro;


public class Main_carro {

    public static void main(String[] args) {

        //Instanciando 1º Carro
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, "Preto");

        //Instanciando 2º Carro
        Carro carro2 = new Carro("Honda", "Civic", 2022, "Prata");

        // informações do primeiro carro
        System.out.println("Informações do Carro 1:");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Cor: " + carro1.getCor());

        // informações do segundo carro
        System.out.println("\nInformações do Carro 2:");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Ano: " + carro2.getAno());
        System.out.println("Cor: " + carro2.getCor());
    }
}


