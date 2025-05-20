package ru.hits;

public class CheckStatusAction  implements IAction {
    @Override
    public GameState handleAction(GameState state) {
        System.out.println("HP: " + state.getPlayerHp() + "/" + state.getPlayerMaxHp()  + ", Level: " + state.getPlayerLevel() + ", EXP: " + state.getPlayerExp() );
        System.out.println("Inventory: " + state.getInventory());
        return null;
    }
}
