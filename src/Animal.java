import static java.lang.System.*;

class Animal {
    private int age;
    private int weight;
    public void running (){
        out.println("Animal is running");
    };
    public void eating (){
        out.println("Animal is eating");
    };

    public Animal(int age, int weight){
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}
