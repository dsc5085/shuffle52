package main

fun main(args : Array<String>) {
    val deck = Deck()
    deck.shuffle()
    for (i in 0 until 52) {
        println(deck.dealOneCard())
    }
}