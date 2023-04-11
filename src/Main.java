import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k;
        Scanner input= new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        k= input.nextInt();
        int sum =0;
        int count =0;
        if (0<k){
            for ( int i =1; i<=k; i++){

                if(i% 3 ==0 & i%4==0){
                    sum +=i;
                    count++;
                }

            }
            System.out.println(sum/count);
        }else{
            System.out.println("Hatalı Sayı Girdiniz.");
        }

    }
}