package ru.itpark;

public class Human {
    private int age;
    private String name;
    private double height;
    private double weight;
    private char sex;
    private boolean isReligion;
    private String color;
    private String dressSize;

    private Human(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.height = builder.height;
        this.weight = builder.weight;
        this.sex = builder.sex;
        this.isReligion = builder.isReligion;
        this.color = builder.color;
        this.dressSize = builder.dressSize;
    }

    public static class Builder {
        private int age;
        private String name;
        private double height;
        private double weight;
        private char sex;
        private boolean isReligion;
        private String color;
        private String dressSize;

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder height(double height) {
            this.height = height;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder sex(char sex) {
            this.sex = sex;
            return this;
        }

        public Builder isReligion(boolean isReligion) {
            this.isReligion = isReligion;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder dressSize(String dressSize) {
            this.dressSize = dressSize;
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isReligion() {
        return isReligion;
    }

    public void setReligion(boolean religion) {
        isReligion = religion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDressSize() {
        return dressSize;
    }

    public void setDressSize(String dressSize) {
        this.dressSize = dressSize;
    }
}
