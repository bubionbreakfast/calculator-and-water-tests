public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume = volume;
    }

    public int drink(){
        return this.volume - 10;
    }

    public int empty(){
        return this.volume - this.volume;
    }

    public int fill(){
        if (this.volume < 100) {
            return 100;
        } else {
            return 100;
        }
    }
}
