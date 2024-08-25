package Estado_e_Comportamento;

public class Luminaria {

    private boolean ligada;
    private int intensidade;


    public Luminaria() {
        this.ligada = false;
        this.intensidade = 0;
    }

    // Método para ligar a luminária
    public void ligar() {
        this.ligada = true;
        System.out.println("Luminária ligada.");
    }

    // Método para desligar a luminária
    public void desligar() {
        this.ligada = false;
        System.out.println("Luminária desligada.");
    }

    // Método para ajustar a intensidade
    public void ajustarIntensidade(int novaIntensidade) {
        if (ligada) {
            if (novaIntensidade >= 0 && novaIntensidade <= 100) {
                this.intensidade = novaIntensidade;
                System.out.println("Intensidade ajustada para " + intensidade + "%.");
            } else {
                System.out.println("Intensidade deve estar entre 0 e 100.");
            }
        } else {
            System.out.println("A luminária desligada, não é possivel alterar a intensidade");
        }
    }

    // Estado
    public void exibirEstado() {
        String estado = ligada ? "ligada" : "desligada";
        System.out.println("Luminária está " + estado + " com intensidade " + intensidade + "%.");
    }
}



