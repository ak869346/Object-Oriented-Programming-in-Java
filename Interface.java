public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Beer b1 = new Beer();
        b1.eatVeg();
        b1.eatNonVeg();
    }
}

// Total Abstraction Implementation....

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up Down Left right digonal in all 4 direction");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up Down Left right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up Down Left right Digonal in all 4 direction by 1 Steps");
    }
}

// Multiple Inheritance Implementation.....

interface Hervibore {
    void eatVeg();
}

interface Carnivore {
    void eatNonVeg();
}

class Beer implements Hervibore,Carnivore {

    public void eatVeg() {
        System.out.println("Eat Veg");
    }

    public void eatNonVeg() {
        System.out.println("Eat Non Veg");
    }
}