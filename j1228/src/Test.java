import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-12-28
 * Time: 12:47

 **/
class IllegalScoreException extends Exception{
    public IllegalScoreException(){

    }
    public IllegalScoreException(String s) {
        super(s);
    }
}

    public IllegalNameException(String s) {
        super(s);
    }
}
class Student{
    private String name;
    private int score;

    public String getName() {
        return name;
    }
    public void setName(String name) throws IllegalNameException {
        if(name.charAt(0)>='0'&&name.charAt(0)<='9') {
            throw new IllegalNameException("the first char of name must not be digit, name="+name);
        }
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", score=" + score + "]";
    }

    public int addScore(int score) throws IllegalScoreException {
        if(this.score+score<0||this.score+score>100) {
            throw new IllegalScoreException("score out of range, score="+score);
        }
        this.score+=score;
        return this.score;
    }

}

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String order = in.next();

        while(!order.equals("other")) {
            String name = in.next();
            int score=0;

            try {
                Student aStudent = new Student();
                score = in.nextInt();
                aStudent.setName(name);
                aStudent.addScore(score);
                System.out.println(aStudent);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                if(e instanceof IllegalScoreException||e instanceof IllegalNameException) {
                    System.out.println(e);
                }
                else {
                    System.out.println("java.util.NoSuchElementException");
                }
            }
            order = in.next();
        }
        in.close();
        System.out.println("scanner closed");
    }
}
