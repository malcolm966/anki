
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Jan0107{
    public static void main(String[] args) throws  Exception{
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> task =
        executorService.submit(()->
            {
                Thread.sleep(5000);
                return "Task Over";
            }
        );
        task.get();
        System.out.printf("Total:Casts:%s\n", System.currentTimeMillis() - start);


        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->"Hello");
        completableFuture.thenApply(x -> x + "You").thenAccept(x->System.out.println(x));
        
    }
}