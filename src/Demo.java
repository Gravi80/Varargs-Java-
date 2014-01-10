
public class Demo {

    public int sum(Integer... args){
        int sum=0;
        for (Integer arg : args) {
            sum = sum + arg;
        }
        return  sum;
    }
}
