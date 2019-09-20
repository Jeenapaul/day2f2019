import com.lambton.Student;

public class collegeExample {
    public static void main(String[] args)
    {
        Arithemetic A1=new Arithemetic();
        System.out.println("sum:" +A1.add(10,20));
        System.out.println("sub:" +A1.sub(45,3));
        System.out.println("mul:" +A1.mul(4,8));
        System.out.println("div:" +A1.div(7,2));
        System.out.println("mod:" +A1.mod(20,5));
        Student s1 =new Student();
        s1.setFirstName("jeena");
        s1.setLastName("paul");
        s1.setMarks1(30);
        s1.setMarks2(56);
        s1.setMarks3(79);
        s1.setMarks4(45);
        s1.setMarks5(50);
        s1.calculatetotal();
        s1.calculatePercentage();
        System.out.println(s1.getMarks1());
        System.out.println(s1.getMarks2());
        System.out.println(s1.getMarks3());
        System.out.println(s1.getMarks4());
        System.out.println(s1.getMarks5());
        System.out.println(s1.getTotal());
        System.out.println(s1.getPercentage());
        s1.generateResult();
        System.out.println(s1.getResult());






    }


}
