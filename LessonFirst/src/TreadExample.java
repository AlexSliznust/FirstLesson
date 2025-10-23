public class TreadExample extends Thread{

    private final String greeting;
    private final int count;

    public TreadExample(String greeting, int count) {
        this.greeting = greeting;
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println(greeting);
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += i;
        }
        System.out.println("sum from " + greeting + " is " + sum);
    }
}
