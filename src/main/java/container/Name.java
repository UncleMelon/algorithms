package container;

/**
 * Created by Matthew on 5/15/2018.
 */
public class Name {
    private String firstName, lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Name) {
            Name  name =  (Name)obj;
            return (firstName.equals(name.firstName)) && (lastName.equals(name.lastName));
        }
        return super.equals(obj);
    }

    //什么时候使用hashcode方法，当这个类的某个对象被当做键值来使用时，当做索引的值
    @Override
    public int hashCode() {
        //相同字符串具有相同的hashcode值
        return firstName.hashCode();
    }

    public static void main(String[] args) {
        Name name1 = new Name("f1", "l1");
        Name name2 = new Name("f2", "l2");
        Name name3 = new Name("f3", "l3");
        System.out.println(name3);
    }
}
