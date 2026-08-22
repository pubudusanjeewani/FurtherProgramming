package lectorials.week03;

public class GenericDemo <T>{
    private T attribute;

    public T getAttribute(){
        return this.attribute;
    }
    public void setAttribute(T newValue){
        this.attribute = newValue;
    }

    /*
    public void addAttribute(T amount){
        this.attribute += amount;
    }
    */

    public void display(){
        System.out.println(attribute + " : " + this.attribute.getClass().getName());
    }

}
