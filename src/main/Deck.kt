package main

import java.util.Random

class Deck {
    private var cards = mutableListOf<Card>()

    init {
        for (suit in Suit.values()) {
            for (rank in Rank.values()) {
                cards.add(Card(suit, rank))
            }
        }
    }

    fun shuffle() {
        val random = Random()
        val newCards = mutableListOf<Card>();
        while (cards.isNotEmpty()) {
            val shuffledCard = cards.removeAt(random.nextInt(cards.size));
            newCards.add(shuffledCard)
        }
        cards = newCards;
    }

    fun dealOneCard(): Card? {
        if (cards.isEmpty()) {
            return null
        } else {
            return cards.removeAt(0)
        }
    }
}