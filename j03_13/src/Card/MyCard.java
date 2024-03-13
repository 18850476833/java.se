package Card;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-03-13
 * Time: 8:21
 */
public class MyCard {
    private String suit;//花色
    private int rank;//数字

    public MyCard(String suit, int rank){
        this.rank = rank;
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return suit + ":" + rank +" ";
    }
}
