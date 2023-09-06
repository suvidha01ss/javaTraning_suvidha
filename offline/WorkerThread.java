class WorkerThread extends Thread{
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            int count=0;
            while (true){
                try {
                    count++;
                    System.out.println("In while loop"+count);
                    Thread.sleep(1000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    System.out.println("In Finally"+count);
                }

            }

        });
        t1.setDaemon(true);
        t1.start();
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Exit");
    }
}