package com.binar.rps

class Controller(private val callback: Callback) : InterfaceController {
    override fun cek(player1: String, player2: String) {
        when {
            player1 == player2 -> { //&& ||
                callback.hasil("draw game")
            }
            player1 != "batu" && player1 != "kertas" && player1 != "gunting" -> {
                callback.hasil("Anda salah input")
            }
            player2 != "batu" && player2 != "kertas" && player2 != "gunting" -> {
                callback.hasil("Anda salah input")
            }
            player1 == "batu" && player2 == "gunting" || player1 == "kertas" && player2 == "batu" || player1 == "gunting" && player2 == "kertas" -> {
                callback.hasil("Selamat pemain 1 menang")
            }
            else -> {
                callback.hasil("Selamat pemain 2 menang")
            }
        }
    }
}


