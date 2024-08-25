package Modelo_de_Classes.Biblioteca;

public class Main_Modelo_de_classes {

    public static void main(String[] args) {
        Bibliotecario bibliotecario = new Bibliotecario();
        bibliotecario.gerenciarLivros();


        Leitor leitor = new Leitor();
        leitor.pegarEmprestado();
        leitor.devolverlivros();
    }
}
