import Card.CardDemo;
import Card.MyCard;
import java.util.List;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-03-13
 * Time: 8:20
 */
public class Test {
    public static void main(String[] args) {
        CardDemo cardDemo = new CardDemo();
        List<MyCard> cardList = cardDemo.buyMyCard();
        System.out.println("买的牌如下：");
        System.out.println(cardList);

        System.out.println("洗牌：");
        cardDemo.shuffle(cardList);
        System.out.println(cardList);

        System.out.println("揭牌：");
        cardDemo.getCard(cardList);
    }
}
