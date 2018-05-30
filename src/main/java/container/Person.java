package container;

/**
 * Created by Administrator on 2018/5/18.
 */
public class Person {
    Card card;
    String name;


    public Person(Card card, String name) {
        this.card = card;
        this.name = name;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
}
