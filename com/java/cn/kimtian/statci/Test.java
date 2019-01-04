package cn.kimtian.statci;

/**
 * 这是一个测试类
 *
 * @author kimtian
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal.play();
        animal.eat();
        Test test = new Test();
        test.chongzai(animal);

    }

    public void chongzai(Animal animal) {
        System.out.println("爸爸重载");
    }

    public void chongzai(Dog dog) {
        System.out.println("儿子重载");
    }
}
