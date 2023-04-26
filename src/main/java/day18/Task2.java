package day18;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(recursiveDigits(79586787));
    }

    public static int recursiveDigits(int n){
      if (n == 0)
          return 0;

      if (n % 10 == 7)
          return 1 +  recursiveDigits(n / 10);

      else
          return recursiveDigits(n / 10);


    }
}
