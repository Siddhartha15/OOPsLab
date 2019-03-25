public interface Turning {
    void turn();
}

class Leaf implements Turning {
    public void turn(){
        System.out.println("Changing colors\n");
    }
}

class Page implements Turning {
    public void turn(){
        System.out.println("Going to the next page\n");
    }
}

class Pancake implements Turning {
    public void turn(){
        System.out.println("Flipping\n");
    }
}

class Computer implements Turning {
    public void turn(){
        System.out.println("Computing\n");
    }
}

class Animal implements Turning {
    public void turn(){
        System.out.println("Hunting\n");
    }
}

class Turners {
    public static void main(String [] args){
        Leaf l = new Leaf();
        Page p = new Page();
        Pancake q = new Pancake();

        l.turn();
        p.turn();
        q.turn();

        Computer c = new Computer();
        Animal a = new Animal();

        c.turn();
        a.turn();
    }
}