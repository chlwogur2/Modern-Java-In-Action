package chapter2.quiz2_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 유연한 prettyPrintApple 메서드 구현하기
 * 사과 리스트를 인수로 받아, 다양한 방법으로 문자열을 생성하는 파라미터화된 prettyPrintApple 메서드 구현
 */
public class Quiz2_1 {

    // AppleString 을 통해 사과의 정보를 문자열로 출력하는 "동작 파라미터화" 실행
    public static void prettyPrintApple(List<Apple> inventory, AppleString appleString){
        for (Apple apple : inventory){
            String output = appleString.toAppleString(apple);
            System.out.println(output);
        }
    }

    public static void main(String[] args) {
        Apple apple = new Apple(11,"black");
        Apple apple1 = new Apple(3,"red");
        Apple apple2 = new Apple(2001,"green");

        List<Apple> inventory = new ArrayList<>();
        inventory.add(apple);
        inventory.add(apple1);
        inventory.add(apple2);
        
        // 동작을 파라미터로 전달
        prettyPrintApple(inventory, new AppleColorString());
        prettyPrintApple(inventory, new AppleWeightString());
    }
}
