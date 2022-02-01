
public class StopWatch {

    double startTime;
    double endTime;

    public void start(){
        startTime = System.currentTimeMillis();
    };

    public void stop(){
        endTime = System.currentTimeMillis();
    };

    public double getElapsedTime(){
        return endTime-startTime;
    };
}
