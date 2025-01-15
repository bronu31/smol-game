package org.game.player;

public class Player {

    protected Byte level;
    protected Integer XP;
    protected String playersName;
    protected Integer atk;
    protected Integer def;


    public Player(String playersName) {
        this.level=1;
        this.XP=0;
        this.atk=5;
        this.def=2;
        this.playersName = playersName;
    }



    public void setLevel(Byte level) {
        this.level = level;
    }

    public void setXP(Integer XP) {
        this.XP = XP;
    }

    public void setPlayersName(String playersName) {
        this.playersName = playersName;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    public Byte getLevel() {
        return level;
    }

    public Integer getXP() {
        return XP;
    }

    public String getPlayersName() {
        return playersName;
    }

    public Integer getAtk() {
        return atk;
    }

    public Integer getDef() {
        return def;
    }
}
