
public class Main {

    public static void main(String[] args) {

        double harmonik = 0.0  ,sonuç;

     int [] list = {1,2,4 } ;

      for (int i=0 ; i< list.length ; i ++ ) {
          harmonik = harmonik + 1.0/list[i] ;
   }
        sonuç = list.length / harmonik ;

      System.out.println(sonuç);
      
    }
}