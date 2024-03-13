package Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-03-13
 * Time: 8:21
 */
public class CardDemo {
    private final String[ ] suits = {"♣","♥","♦","♠"};
    public List<MyCard> buyMyCard(){
        List<MyCard> cardList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                MyCard myCard = new MyCard(suits[i], j);
                cardList.add(myCard);
            }
        }
        return cardList;
    }
    public void shuffle(List<MyCard> cardList){
        Random random = new Random();//生成随机数
        for (int i = cardList.size() -1 ; i > 0 ; i--) {
            int index = random.nextInt(i);
            swap(cardList,i,index);
        }
    }
    private void swap(List<MyCard> cardList, int a, int b){
        MyCard tmp = cardList.get(a);
        cardList.set(a,cardList.get(b));
        cardList.set(b,tmp);
        //类比于   tmp = a;  a = b  ;b = tmp
        //在cardList.set(a, cardList.get(b))中，
        // get和set是用于访问和修改列表（或数组）中元素的方法。

        //get(b)：这个方法用于获取列表中索引为b的元素的值。
        // 它返回列表中指定索引位置的元素。

        //set(a, value)：这个方法用于将指定索引位置a的元素的值设置为value。
        // 它可以修改列表中指定索引位置的元素。

        //所以，cardList.set(a, cardList.get(b))的作用是
        // 将列表中索引为b的元素的值赋给索引为a的元素。
    }

    public void getCard(List<MyCard> cardList){
        List<MyCard> hand1 = new ArrayList<>();
        List<MyCard> hand2 =new ArrayList<>();
        List<MyCard> hand3 = new ArrayList<>();

        List<List<MyCard>> hands = new ArrayList<>();
        hands.add(hand1);
        hands.add(hand2);
        hands.add(hand3);

        //三个人轮流发五张牌
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 3; j++) {
                MyCard myCard = cardList.remove(0);
                hands.get(j).add(myCard);

            }
        }
        System.out.println(hand1);

        System.out.println(hand2);

        System.out.println(hand3);

        System.out.println(cardList);//剩余的牌
    }
}
