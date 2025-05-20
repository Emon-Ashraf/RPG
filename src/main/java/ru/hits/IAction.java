package ru.hits;

public interface IAction {
    GameState handleAction(GameState gameState);
}
