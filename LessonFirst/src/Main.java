import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class MyTask implements Runnable {

    private boolean isActive;

    void disable(){ isActive=false; }

    MyTask(){ isActive = true; }

    public void run(){

        String taskName = Thread.currentThread().getName();

        System.out.printf("%s started... \n", taskName);

        int counter=1; // счетчик циклов
        while(isActive){
            System.out.println("Loop " + counter++);
            try{
                Thread.sleep(400);
            }
            catch(InterruptedException _){

                System.out.printf("%s interrupted... \n", taskName);
            }
        }
        System.out.printf("%s finished... \n", taskName);
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread started...");

        // создаем и запускаем поток
        var myTask = new MyTask();
        new Thread(myTask,"MyTask").start();

        try{
            Thread.sleep(1100);

            myTask.disable();  // завершаем поток

            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted...");
        }
        System.out.println("Main thread finished...");
    }

}