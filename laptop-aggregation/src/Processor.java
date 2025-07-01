public class Processor {
    int gen;
    int speed;

    Processor(int gen, int speed) {
        this.gen = gen;
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    public int getGen() {
        return gen;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "gen=" + gen +
                ", speed=" + speed +
                '}';
    }
}
