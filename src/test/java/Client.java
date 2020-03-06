import Assignment.Controller.SearchController;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class Client {
    public static void main(String[] args) {
        int linearSearchLocation, binarySearchLocation;
        long linearSearchTime, binarySearchTime;

        //컨테이너 구동
        AbstractApplicationContext container =
                new GenericXmlApplicationContext("applicationContext.xml");

        //컨테이너에 SearchController 객체 요청하기
        SearchController searchController = (SearchController)container.getBean("searchController");
        StopWatch stopWatch = new StopWatch();

        //순차탐색 시간 측정
        stopWatch.start();
        linearSearchLocation = searchController.linearSearch("Korea Republic");
        stopWatch.stop();
        linearSearchTime = stopWatch.getTotalTimeNanos();

        //이진탐색 시간 측정
        stopWatch.start();
        linearSearchLocation = searchController.binarySearch("Korea Republic");
        stopWatch.stop();
        binarySearchTime = stopWatch.getLastTaskTimeNanos();

        //탐색 시간 출력
        System.out.println("순차탐색하는데 걸린 시간: " + linearSearchTime);
        System.out.println("이진탐색하는데 걸린 시간: " + binarySearchTime);
    }
}
