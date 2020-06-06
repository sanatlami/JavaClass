package HomeWork531;

public class Q1Q8 {
    int i;
    int j;
    Q1Q8( int i, int j){
        this.i=i;
        this.j=j;
         }
         public void Method(){
             for(int listofrange=i; listofrange<=j;listofrange++){
                 System.out.println(listofrange);
             }
         }
// Creating main class to pass value
    public static void main (String[] args){
        Q1Q8 day1HW= new Q1Q8(20,30);
        day1HW.Method();

    }}