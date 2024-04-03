package singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Thread threadPeter = new Thread(new RunPeter());
        Thread threadDavid = new Thread(new RunDavid());

        threadPeter.start();
        threadDavid.start();

    }

    static class RunPeter implements Runnable{

        @Override
        public void run() {
            Player player = Player.getPlayer("Peter");
            System.out.println("Running Peter: "+player);
        }
    }

    static class RunDavid implements Runnable{

        @Override
        public void run() {
            Player player = Player.getPlayer("David");
            System.out.println("Running David: "+player);
        }
    }
}
