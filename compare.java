
public class compare {
public static void main(String[] args)
{
	String s1="abc";
	String s2="abc";
	String s3=new String("abc");
	String s4=s3.intern();
	if(s1==s2&&s2==s4)
		System.out.println("Equal");
	else
		System.out.println("Not Equal");
}
}
