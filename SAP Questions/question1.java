import java.util.Arrays;
public class question1 {
    public static void main(String[] args) {
        String dates[]={"3/4/5","1/2/3","2/3/4"};
        Arrays.sort(dates);
        for(int i=0;i<dates.length;i++)
        {
            System.out.println(dates[i]);
        }
    }
}
