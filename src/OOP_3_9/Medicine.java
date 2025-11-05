package OOP_3_9;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Medicine extends Thread {

    private String name;
    private int frequency;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
    private int oneMinute = 60000;

    public Medicine(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        long end = start + oneMinute;

        while (System.currentTimeMillis() < end && !Thread.interrupted()) {
            try {
                Thread.sleep(oneMinute / frequency);
                System.out.println(name + " (" + LocalTime.now().format(formatter) + ")");
            } catch (InterruptedException e) {
                System.out.println("IE");
                break;
            }
        }
    }
}