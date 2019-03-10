interface s1
{
	public void make();
	
}
class s2 implements s1
{
	public void make()
	{
		System.out.println("主题");
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
		System.out.println("准备工作");
	}
	public void make()
	{
		this.pr();
		this.a.make();
		this.de();
	}
	public void de()
	{
		System.out.println("结束工作");
	}
}
public class interface2 {
	public static void main(String[] args) {
		s1 ss=new s3(new s2());
		ss.make();
	}
}
