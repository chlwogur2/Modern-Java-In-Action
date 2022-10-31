package chapter2.quiz2_1;

// 사과의 색을 보고 감탄하는 메서드를 구현한 클래스
public class AppleColorString implements AppleString{

    @Override
    public String toAppleString(Apple apple) {
        return "WoW, this apple is " + apple.getColor() + "!!!";
    }
}
