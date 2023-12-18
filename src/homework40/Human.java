package homework40;

import java.util.Objects;

public class Human {

    private String name;
    private int age;
    private int height;
    private double weigth;


    public Human(String name, int age, int height, double weigth) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weigth = weigth;
    }

    public Human() {
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Human human;
        if (obj instanceof Human) {
            human = (Human) obj;
        } else {
            return false;
        }
        return this.name.equals(human.name)
                && this.age == human.age
                && this.height == human.height
                && this.weigth == human.weigth;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, weigth);
    }
}

