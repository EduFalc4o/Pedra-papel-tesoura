class Papel {

    fun luta(elemento: String): Int {
        if (elemento.equals("Tesoura")) {
            println("voce perdeu")
            return -1
        }
        if (elemento.equals("Pedra")){
            println("voce ganhou")
            return 1
        }
        return 0
    }
}