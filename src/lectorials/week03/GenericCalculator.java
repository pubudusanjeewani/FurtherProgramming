package lectorials.week03;

public class GenericCalculator <T extends Number> {
    private T[] array;

    public GenericCalculator(T[] array) {
        this.array = array;
    }

    public double computeAverage(){
        double sum=0;
        for(int i=0;i< array.length;i++){
            sum+=array[i].doubleValue();
        }
        return sum/ array.length;
    }



}
