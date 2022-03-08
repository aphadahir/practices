public class student
{
int modelyear;
String model_name;
public student(int year,String name){
    modelyear = year;
    model_name =name;
}
public static void main (String[] orgs){
    student oj = new student(1964,"Mustang");
    System.out.println("my car is "+oj.model_name+" "+oj.modelyear);
}


}

