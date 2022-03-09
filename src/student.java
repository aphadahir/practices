public class student{
 static void myStaticMothord(){
     System.out.println("this is my static methord and can acess with out object ");
 }
 public void myPublicMethod(){
     System.out.println("this is my public method and can only access with object");
 }

    public static void main(String[] orgs){
     student ob = new student();
     ob.myPublicMethod();
     myStaticMothord();
    }
}

