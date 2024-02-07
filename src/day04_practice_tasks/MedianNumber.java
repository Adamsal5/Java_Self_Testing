package day04_practice_tasks;

public class MedianNumber {

    public static void main(String[] args) {


        int a = 10,
                b = 15,
                c = 20;
        String result = "";
        if((b<a && a<c) || (c<a && a<b)){  // b<a<c or c<a<b
            result = "a: " + a + " is the median number";
        }else if((a<b && b<c) || (c<b && b<a)){  // a<b<c or c<b<a
            result = "b: " + b + " is the median number";
        }else{  // a<c<b or b<c<a
            result = "c: " + c + " is the median number";
        }
        System.out.println(result);

    }
}
