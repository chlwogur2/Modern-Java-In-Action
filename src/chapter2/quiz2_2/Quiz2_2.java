package chapter2.quiz2_2;

// 고전 자바 문제
public class Quiz2_2 {

    public final int value = 4;

    public void doIt() {
        int value = 6;
        Runnable r = new Runnable() {
            public final int value = 5;

            @Override
            public void run() {
                int value = 10;
                System.out.println(this.value);
            }
        };
        r.run();
    }

    public static void main(String[] args) {
        Quiz2_2 q = new Quiz2_2();
        q.doIt(); // 실행한 결과는?
    }
}
