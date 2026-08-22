package lectorials.week03;

public class GenericPrinter <T> {
    private T[] array;

    public GenericPrinter(T[] array) {
        this.array = array;
    }


    public void print(){
        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }


}
