package TH_tuan_2.bai_tap_3;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ']';
    }
}
