package ru.hits

data class GameState(
    val playerHp: Int,
    val playerMaxHp: Int,
    val playerLevel: Int,
    val playerExp: Int,
    val playerX: Int,
    val playerY: Int,
    val inventory: List<String>
)
