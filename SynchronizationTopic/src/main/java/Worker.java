/**
 * Created by toraj on 07/16/2017.
 */
public class Worker implements Runnable {


    private Resource r;

    public Worker(Resource r) {
        this.r = r;
    }

    public void run() {

        r.doTask1();

    }
}
