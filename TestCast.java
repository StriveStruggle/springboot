public class TestCast {
    public static void main(String[] args) {
        /*String math="123";
        Long id=Long.parseLong(math);
        System.out.println("id:"+id);*/
        String a=new String("1");
        change(a);
        System.out.println("a:"+a);
    }
    public static void change(String a){
        a=new String("2");
    }
}