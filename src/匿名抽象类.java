abstract class human{
	
	public abstract void make();
}

class person {
	public void get(human h) {
		h.make();
	}
}

public class ���������� {
	public static void main(String[] args) {
	   person ha=new person();
		ha.get(new human(){

			@Override
			public void make() {
				// TODO �Զ����ɵķ������
				System.out.println("��ð���");
			}
			
		});
		ha.get(new human() {

			@Override
			public void make() {
				// TODO �Զ����ɵķ������
				System.out.println("�Һܺã�");
			}
		});
	}

}
