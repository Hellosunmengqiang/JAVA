abstract class action{
	public static final int Eat=1;
	public static final int Sleep=5;
	public static final int Work=7;
	public  void ff(int eat2)	{
		switch(eat2)
		{
		case(Eat):
			this.eat();
		break;
		case(Sleep):
		this.sleep();
		break;
		case(Work):
			this.work();
		break;
		}
	}
	public abstract void eat();
	public abstract void sleep();
	public abstract void work();
}
class people extends action
{
	public void eat()
	{
		System.out.println("人类正在吃饭");
	}
	public void sleep()
	{
		System.out.println("人类正在睡觉");
	}
	public void work()
	{
		System.out.println("人类正在工作");
	}
}
class robot extends action
{
	public void eat()
	{
	}
	public void sleep()
	{
	}
	public void work()
	{
		System.out.println("机器人正在工作");
	}
}
class pig extends action
{
	public void eat()
	{
		System.out.println("猪正在吃饭");
	}
	public void sleep()
	{
		System.out.println("猪正在睡觉");
	}
	public void work()
	{
	}
}
public class abstract1 {
	public static void main(String[] args) {
		fff(new people());
		fff(new robot());
		fff(new pig());
	}
	public static void fff(action s)
	{
		s.ff(action.Eat);
		s.ff(action.Sleep);
		s.ff(action.Work);
		
	}
}
