package com.binar.rps

import kotlin.jvm.JvmStatic

object Main : Callback {
    @JvmStatic
    fun main(args: Array<String>) {
        do {
            println("=====================")
            println("=====GAME==SUIT======")
            println("=====================")
            println("GUNTING, KERTAS, BATU")
            println("1. play")
            println("2. out")
            print("choose : ")
            val pilih = readLine()!!.toInt()
            if (pilih == 1) {
                play()
            } else
                println("BYEEE")

        } while (pilih == 1)
    }

    private fun play() {
        println("===========================")
        println("Masukan BATU GUNTING KERTAS")
        println("===========================")
        print("Pemain 1 : ")
        val input1 = readLine()!!.lowercase()
        print("pemain 2 : ")
        val input2 = readLine()!!.lowercase()

        val controller = Controller(this)
        controller.cek(input1,input2)

    }

  override fun hasil(hasil: String) {
        println(hasil)
    }
}


