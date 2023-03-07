// 猫是一种动物 -> 继承关系
// 可以把猫当成动物来看
public class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫喜欢抓老鼠");
    }
}