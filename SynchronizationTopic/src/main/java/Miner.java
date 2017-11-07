/**
 * Created by toraj on 07/16/2017.
 */
public class Miner implements Runnable {

    private Resource r;

    public Miner(Resource r) {
        this.r = r;
    }


    public void run() {

        r.doTask2();

    }
}
