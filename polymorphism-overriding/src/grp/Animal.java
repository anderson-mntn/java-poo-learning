package grp;

public abstract class Animal {
    protected float weight;
    protected int age;
    protected int members;
    protected String name;
    
    public abstract void move();
    public abstract void eat();
    public abstract void makeNoise();
    
    public Animal(float weight, int age, int members, String name) {
        this.weight = weight;
        this.age = age;
        this.members = members;
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getMembers() {
        return members;
    }
    public void setMembers(int members) {
        this.members = members;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Animal [weight=" + weight + ", age=" + age + ", members=" + members + "]";
    }
    

}
