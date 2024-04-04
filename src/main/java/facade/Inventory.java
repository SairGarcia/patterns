package facade;

public interface Inventory {
    static boolean search(String name, boolean make){
        String action = make ? "make" : "improve";
        if (Math.random() > 0.5){
            System.out.println("you have necessary materials to " + action + " the " + name);
            return true;
        } else{
            System.out.println("you don´t have necessary materials to " + action + " the " + name);
            return false;
        }
    }

    static void remove(String name, boolean make){
        String action = make ? "make" : "improve";
        System.out.println("remove from your inventory the materials used to " + action + " the " + name);
    }
}
