public class Eagle extends Bird implements Fly {

    private final boolean flying;
    private final int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void ascend(int altitude) {

    }

    @Override
    public void glide() {

    }

    @Override
    public void descend(int altitude) {

    }

    @Override
    public void land() {

    }
}
