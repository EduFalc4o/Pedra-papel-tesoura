fun main() {

    do {
        println("1-JOGAR")
        println("2-PLACAR")
        println("3-SAIR")

        val opcao = readln()//usuario digita a opção

        when(opcao.toInt()){
            1 -> jogar()
            2 -> print("placar")
            3 -> print("saindo...")
        }
    }while (opcao != "0")
}


fun jogar(){
    val nickname = readln() //o usuario digita seu nick

    println("que os jogos começem")
    var rodadas = 1
    do{

        println("oque voce quer jogar? ")
        println("Pedra, Pàpel ou Tesoura?!")
        var jogada = readln(). uppercase()

        //instancias dos elementos do jogo
        var pedra = Pedra()
        var papel = Papel()
        var tesoura = Tesoura()

        var movimentoPC = computador()
        when(jogada){
            "Pedra" -> {
                pon = pedra.luta(movimentoPC)
            }
        }

        rodadas++ // no final da rodada incrementa
    }while (rodadas <= 3)
}

fun computador(): String {
    val movimento = (1..3).random()
    when (movimento){
        1 -> return "Tesoura"
        2 -> return "Pedra"
        3 -> return "Papel"
        else -> return ""
    }
}
