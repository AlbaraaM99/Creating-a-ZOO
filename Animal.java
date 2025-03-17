// Animal.java - Abstract class
public abstract class Animal implements Eat {
    private String nameOfAnimal;
    private int weight;
    private int height;
    private int age;

    // Constructor
    public Animal(String nameOfAnimal, int weight, int height, int age) {
        this.nameOfAnimal = nameOfAnimal;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    // Getters and Setters
    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Eat interface method - only partially implemented
    @Override
    public void eatingFood() {
        System.out.println(nameOfAnimal + " is eating...");
    }

    // Abstract method to be implemented by subclasses
    public abstract void eatingCompleted();
}
