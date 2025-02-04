package de.dhbw.dontgetangry.netty;

public enum GameProtocolKeywords {
    StartConnection("StartConnection"),
    StartGame("StartGame"),
    PlayerJoined("PlayerJoined"),
    PlayerMove("PlayerMove"),
    DiceRolled("DiceRolled"),
    TurnEnded("TurnEnded"),
    EndGame("EndGame"),
    PlayerLeft("PlayerLeft");

    private final String keyword;

    GameProtocolKeywords(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }
}
