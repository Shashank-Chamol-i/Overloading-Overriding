public class Program03 {
    public void add(int a,float b)
    {
        System.out.println(a+b);
    }
    public void ad(byte a,int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args)
    {
        Program03 p = new Program03();
        p.add(10,23.5f);
        p.ad((byte) 32,600);
    }
}
