package staticBlocks;


class Test1
{
    int a=100;
    static int b=200;
    static{
        Test1 obj=new Test1();
        System.out.println(obj.a);//possible
//        System.out.println(a);//not possible
//        System.out.println(this.a);//not possible
        System.out.println(b);// possible
    }
    public static void main(String[] args)
    {

    }
}
