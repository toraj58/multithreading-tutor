import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by toraj on 07/16/2017.
 */
public class Resource {

    private final Lock lock = new ReentrantLock();

    private String name;
    private int id;

    public Resource() {
    }

    public Resource(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public   void doTask1()
    {

        lock.lock();

        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName() + "::" +  "doTask1 :: " + i);

        }

        lock.unlock();
    }

    public   void doTask2()
    {
        lock.lock();

        synchronized(this) {

            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "::" + "doTask2 :: " + i);

            }
        }

        lock.unlock();
    }
}
