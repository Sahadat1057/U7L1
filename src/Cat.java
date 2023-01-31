public class Cat {
    private String catName;

    public Cat(String name) {
        this.catName = name;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String name) {
        catName = name;
    }

    public String toString() {
        String name = "Cat: " + this.getCatName();
        return name;
    }

}
