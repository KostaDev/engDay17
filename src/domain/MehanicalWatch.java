package domain;

import java.util.Date;

public class MehanicalWatch extends Watch {
    private long mechanismSerialNum;
    private long calibre;
    private long bph;

    public MehanicalWatch(long serialNum) {
        super(serialNum);
    }

    public MehanicalWatch(long serialNum, String caseMaterial, String braceletMaterial, int numOfHands, long mechanismSerialNum, long calibre, long bph) {
        super(serialNum, caseMaterial, braceletMaterial, numOfHands);
        this.mechanismSerialNum = mechanismSerialNum;
        this.calibre = calibre;
        this.bph = bph;
    }

    @Override
    public Date tellTime() {
        return new Date();
    }

    @Override
    public String sayHello() {
        return "Tktktktktktktktktktktktkttktkk";
    }
}
