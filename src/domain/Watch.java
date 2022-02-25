package domain;

import java.util.Date;

public abstract class Watch implements Entity{
    protected long serialNum;
    protected String caseMaterial;
    protected String braceletMaterial;
    protected int numOfHands;

    public Watch(long serialNum) {
        this.serialNum = serialNum;
    }

    public Watch(long serialNum, String caseMaterial, String braceletMaterial, int numOfHands) {
        this.serialNum = serialNum;
        this.caseMaterial = caseMaterial;
        this.braceletMaterial = braceletMaterial;
        this.numOfHands = numOfHands;
    }
    public abstract Date tellTime();
}
