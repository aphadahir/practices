public class student
    {
        int x =5;
         static void myMothod(){
            System.out.println("this is my world");
        }
        public void mymothod2() {
            System.out.print("this is your world");
        }
        public static void main(String[] args){
            student objs = new student();
            student objs1 = new student();
            student objs2 = new student();
            objs2.x = 6;
            System.out.println("this is calling object"+" "+objs.x);
        System.out.println("Hello hargaisa");
        System.out.println("this is second object "+""+objs1.x);
        System.out.println("this is changing value of variable"+" "+objs2.x);
        myMothod();
         objs.mymothod2();}
    }

