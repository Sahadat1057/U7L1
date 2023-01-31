public class Dog {
    private String dogName;

    public Dog(String name) {
        this.dogName = name;
    }

    public void bark() {
        System.out.println("Woof!");
    }

    public String getDogName() {
        return dogName;
    }

    public String toString() {
        String name = "Cat: " + this.getDogName();
        return name;
    }

}
