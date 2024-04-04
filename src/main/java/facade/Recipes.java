package facade;

public interface Recipes {
    static boolean getRecipes(String name, boolean make){
        String action = make ? "make" : "improve";
        if (Math.random() > 0.5){
            System.out.println("you have necessary skills to " + action + " the " + name);
            return true;
        } else{
            System.out.println("you don´t have necessary skills to " + action + " the " + name);
            return false;
        }
    }
}
