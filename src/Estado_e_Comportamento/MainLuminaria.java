package Estado_e_Comportamento;


public class MainLuminaria {

    public static void main(String[] args) {

        Luminaria minhaLuminaria = new Luminaria();

        // Estado inicial
        minhaLuminaria.exibirEstado();

        // Tentando ajustar a intensidade com a luminária desligada
        minhaLuminaria.ajustarIntensidade(50);


        minhaLuminaria.ligar();


        minhaLuminaria.ajustarIntensidade(75);


        minhaLuminaria.exibirEstado();


        minhaLuminaria.desligar();


        minhaLuminaria.ajustarIntensidade(30);

        minhaLuminaria.exibirEstado();
    }

}


