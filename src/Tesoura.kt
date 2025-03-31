class Tesoura {

    fun luta(elemento: String): Int {
        if (elemento.equals("Pedra")) {
            println("voce perdeu")
            return -1
        }
        if (elemento.equals("Papel")){
            println("voce ganhou")
            return 1
        }
        return 0
    }

}

