package lectorials.week03;

public class MultipleGen <K,V>{
    private K key;
    private V value;

    public MultipleGen(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void display(){
        System.out.println(this.key + " -> " + value);
    }







}
