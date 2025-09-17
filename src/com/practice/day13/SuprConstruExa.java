package com.practice.day13;

public class SuprConstruExa {
    public static void main(String[] args) {
        BedSheet bedSheet = new BedSheet();
        BedSheet bedSheet1 = new BedSheet(12);

    }
}

class Bed {
    int age;

    public Bed() {
        System.out.println(" parent bed");
    }

    public Bed(int age) {
        this.age = age;
    }
}

class BedSheet extends Bed {
    public BedSheet() {
        super();
        System.out.println("child bedsheet");
    }

    public BedSheet(int age) {
        super(age);

        System.out.println(" child bed sheet" + age);

    }

}