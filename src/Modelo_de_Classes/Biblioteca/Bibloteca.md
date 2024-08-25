classDiagrama
         class Funcionario {
              +gerenciarLivros()
}

    class Leitor {
        +pegarEmprestado()
        +devolverLivros()
    }

    class Bibliotecario {
    }

    Funcionario <|-- Bibliotecario
    Leitor <-- Bibliotecario
