import java.sql.SQLOutput;

public class Asal {
    public static void main(String[] args) {

        int asal; int count;

        for(int i=2; i<=100; i++){

            count = 0;
            for(int j=2;j<i ;j++){

                if(i%j==0){
                   count +=1;
                }
            }
            if (count==0){
                asal= i;
                System.out.print(asal + " ");}
        }


    }
}
