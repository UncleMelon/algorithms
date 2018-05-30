package container;

/**
 * Created by Administrator on 2018/5/18.
 */
public class Card {
    private final String IdCard;

    public Card(String idCard) {
        IdCard = idCard;
    }

    public String getIdCard() {
        return IdCard;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((IdCard == null) ? 0: IdCard.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        //如果地址一样，则两个对象相同
        if (this == obj)
            return true;
        // 如果两个对象是同一类型，则比较其属性值是否都相同
        // 如果都相同， 则说明两个对象也相同;
        // 否则，说明这两个对象不相同
        if (obj instanceof Card) {
            Card card = (Card)obj;
            return card.getIdCard().equals(this.getIdCard());
        }
        return false;
    }

    @Override
    public String toString() {
        return "Card [IdCard=" + IdCard + "]";
    }
}

