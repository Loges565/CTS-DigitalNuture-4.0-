import java.util.*;

interface Plays {
    void play();
}

class Guitar implements Plays {
    public void play() {
        System.out.println("Playing the guitar.");
    }
}

class Piano implements Plays {
    public void play() {
        System.out.println("Playing the piano.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Plays g = new Guitar();
        Plays p = new Piano();

        g.plays();
        p.plays();
    }
}
