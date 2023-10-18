public class Train {
    private final String name;
    private final int year;
    private final double speed;

    public Train(String name, int year, double speed){
        this.name = name;
        this.year = year;
        this.speed = speed;
    }

    public String getDriver(){
        return name;
    }

    public int getYear(){
        return year;
    }

    public double getSpeed(){
        return speed;
    }

    public boolean isFasterThan(Train otherTrain){
        if(this.speed < otherTrain.speed){
            return false;
        }
        else{
            return true;
        }
    }

    public String speedCategory(){
        if (this.speed < 80){
            return "slow";
        }
        else if(this.speed > 120){
            return "fast";
        }
        else{
            return "normal";
        }
    }

    @Override
    public String toString(){
        return String.format("Train(%s (%d), %.2f km/s)", this.name, this.year, this.speed);
    }
}


