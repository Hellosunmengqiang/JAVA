interface usb
{
	public void start();
	public void stop();
}
class computer
{
	public void pug(usb us)
	{
		us.start();
		us.stop();
	}
}
class A implements usb
{
	public void start()
	{
		System.out.println("A接口开始");
	}
	public void stop()
	{
		System.out.println("A接口结束");
	}
}
class B implements usb
{
	public void start()
	{
		System.out.println("B接口开始");
	}
	public void stop()
	{
		System.out.println("B接口结束");
	}
}
public class interface1 {
	
	public static void main(String[] args) {
		computer cc=new computer();
		cc.pug(new A());
		cc.pug(new B());
		
		A a=new A();
		a.start();
		a.stop();
		
		
	}

}
