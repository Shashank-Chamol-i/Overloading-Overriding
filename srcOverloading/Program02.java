/*Method Overloading by Changing the datatype */
public class Program02 {
    public int add(int a,int b)
    {
        return a+b;
    }
    public double add(double a,double b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        Program02 p = new Program02();
        System.out.println(p.add(10,50));
        System.out.println(p.add(50,100));
    }
}
