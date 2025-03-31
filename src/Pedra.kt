class Pedra {

    fun luta(elemento: String): Int {
        if (elemento.equals("Papel")) {
            println("voce perdeu")
            return -1
        }
        if (elemento.equals("Tesoura")){
            println("voce ganhou")
            return 1
        }
        return 0
    }
}

