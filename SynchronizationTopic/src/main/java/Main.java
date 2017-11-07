/**
 * Created by toraj on 07/16/2017.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("************* Synchronization Topic **************");

        Resource r = new Resource();
//        Resource r2 = new Resource();
        Worker w = new Worker(r);
//        Miner m = new Miner(r2);

        Miner m = new Miner(r);

        Thread t1 = new Thread(w, "T1");
        Thread t2 = new Thread(m, "T2");

        t1.start();
        t2.start();
    }
}
