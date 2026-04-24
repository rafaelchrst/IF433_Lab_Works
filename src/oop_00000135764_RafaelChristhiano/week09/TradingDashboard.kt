package oop_00000135764_RafaelChristhiano.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, -10.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 25, 8.3, "CLOSED"),
        TradeLog("XRPUSDT", "LONG", 5, 0.0, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 30, 20.0, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")

    println("\n--- TOP PERFORMERS ---")
    topPerformersString.forEach {
        println(it)
    }

    println("\n--- WORST PERFORMERS ---")
    worstPerformersString.forEach {
        println(it)
    }

    println("\n--- UNIQUE PAIRS ---")
    println(uniquePairs) //..
}