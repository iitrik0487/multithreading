public class UsingSleepMethod {

    //sleep methods throws InterruptedException/Throwable so that needs to be handled by the method inside which we are using sleep method
    public static void main(String[] args) throws Throwable {
        Thread thread = new Thread(()-> System.out.println("Executing thread "+ Thread.currentThread().getName()));

        thread.setName("New Worker Thread");
        System.out.println("Before startig the the new thread we are in : "+ Thread.currentThread().getName());
        thread.start();
        System.out.println("After startig the the new thread we are in : "+ Thread.currentThread().getName());
        //sleep doent span in backgroung for the millisecond mentioned but it just instructs the JVM to not to schedule the thread for the provided number of milli seconds
        thread.sleep(10000);
    }
}
