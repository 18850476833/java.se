/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-12-07
 * Time: 14:20
 */
public class Date {
    public int year;
    public int month;
    public int day;
    public void setDate(Date this, int y,int m,int d){
        this.year = y;
        this.month = m;
        this.day = d;
    }
    public static void main(String[] args) {
        Date date = new Date();
        date.setDate(1999,1,1);

        Date date1 = new Date();
        date1.setDate(1899,1,1);
    }

}
