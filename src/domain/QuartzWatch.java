package domain;

import java.util.Date;

public class QuartzWatch extends Watch{
    private long mechanismSerialNum;
    private String battery;
    private long precision;

    public QuartzWatch(long serialNum) {
        super(serialNum);
    }

    @Override
    public Date tellTime() {
        return new Date();
    }

    public QuartzWatch(long serialNum, String caseMaterial, String braceletMaterial, int numOfHands, long mechanismSerialNum, String battery, long precision) {
        super(serialNum, caseMaterial, braceletMaterial, numOfHands);
        this.mechanismSerialNum = mechanismSerialNum;
        this.battery = battery;
        this.precision = precision;
    }

    @Override
    public String sayHello() {
        return "Tik Tok, Tik Tok";
    }
}
