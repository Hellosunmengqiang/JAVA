abstract class human{
	
	public abstract void make();
}

class person {
	public void get(human h) {
		h.make();
	}
}

public class 匿名抽象类 {
	public static void main(String[] args) {
	   person ha=new person();
		ha.get(new human(){

			@Override
			public void make() {
				// TODO 自动生成的方法存根
				System.out.println("你好啊！");
			}
			
		});
		ha.get(new human() {

			@Override
			public void make() {
				// TODO 自动生成的方法存根
				System.out.println("我很好！");
			}
		});
	}

}
