interface s1
{
	public void make();
	
}
class s2 implements s1
{
	public void make()
	{
		System.out.println("����");
	}
}
class s3 implements s1
{
	private s1 a;
	public s3(s1 a)
	{
		this.a=a;
	}
	public void pr()
	{
		System.out.println("׼������");
	}
	public void make()
	{
		this.pr();
		this.a.make();
		this.de();
	}
	public void de()
	{
		System.out.println("��������");
	}
}
public class interface2 {
	public static void main(String[] args) {
		s1 ss=new s3(new s2());
		ss.make();
	}
}
