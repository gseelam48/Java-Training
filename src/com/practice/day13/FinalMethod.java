package com.practice.day13;

public class FinalMethod {
    public static void main(String[] args) {
        Sanju sanju = new Sanju();
        sanju.play();
        sanju.study();
    }
}

class Gopi {
   void study() {      //final
        System.out.println("gopi is studying");
    }
}

class Sanju extends Gopi {
    void play() {
        System.out.println("sanju  play cricket");
    }
@Override
    void study() {
        System.out.println("gopi is studying");
    }
}


