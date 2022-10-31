package chapter2.quiz2_1;

// 사과의 무게를 출력하는 동작을 구현한 클래스
public class AppleWeightString implements AppleString{
    @Override
    public String toAppleString(Apple apple) {
        return "This apple is " + apple.getWeight() + "Kg";
    }
}
