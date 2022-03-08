public class student
{
    public void tesla(){
        System.out.println("my car is going as fast as it can ");
    }
    public void speed(int max_speed){
        System.out.println("the speed limit is "+max_speed);

    }
    public static void main(String[] orgs){
        student car = new student();
        car.tesla();
        car.speed(200);
    }
}

