import java.util.Scanner;

public class JavaStydy01 {

    public static void main(String[] args) {
        // N을 직접 지정 (사용자 입력 없이 실행)
        int N = 20; // 여기서 원하는 N 값으로 바꿀 수 있음

        System.out.println("1부터 " + N + "까지의 소수:");

        // 2부터 N까지 반복 (1은 소수가 아니므로 제외)
        for (int num = 2; num <= N; num++) {
            boolean isPrime = true; // 소수인지 여부를 나타내는 플래그

            // num의 제곱근까지만 나눠서 확인 (효율적)
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false; // 나누어 떨어지면 소수가 아님
                    break;
                }
            }

            // 소수이면 출력
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}