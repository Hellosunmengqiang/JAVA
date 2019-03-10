import java.util.Scanner;

interface fruit
{
	public void eat();
}
class apple implements fruit
{
	public void eat()
	{
		System.out.println("**Æ»¹û**");
	}
}
class orange implements fruit
{
	public void eat()
	{
		System.out.println("**éÙ×Ó**");
	}
}
class factory
{
	public static fruit ge(String  classname)
	{
		if("apple".equals(classname))
			return new apple();
		else if("orange".equals(classname))
			return new orange();
		else
			return null;
	}
}
public class interface3 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		fruit aa=factory.ge(cin.nextLine());
		aa.eat();
	}
}
