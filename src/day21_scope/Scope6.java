package day21_scope;

public class Scope6 {
    public int num1;
    public String name = "Ali";
    public static void main(String args){

        add();
        //product (5); // statik olamayan bir method static method icerisnden cagrilamaz
    }
    public static void add(){
        //num1 ++; // static olmayan num1-instance, static bir method icinden kullanilamaz

        int num2 = 6;
        char letter;
        System.out.println("Do addition ");
    }
    public void product(int num3){
        name = "Veli";
        //num2++;  num2 ustteki methodda olusturulmus local bir var dir.
        System.out.println(num3 * num3);
    }

   public Scope6(){

   }

}



