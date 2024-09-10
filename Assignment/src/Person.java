public class Person {
    private String name;
    private int  age;
    private double weight;
    private double height;
    private double BMI;

    public Person(String name, int age, double weight, double height,double BMI) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.BMI = BMI;
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\nAge:" + age + "\nWeight=" + weight + "\nHeight=" + height + 
                "\nBMI="+ BMI;
    }
    
}
