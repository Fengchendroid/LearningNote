/*1、用static修饰的变量叫做静态成员变量，是该类公有成员变量，对于所有对象来说，静态变量只有一份
2、用static修饰的静态方法，不能访问菲静态的成员
3、可以通过类名访问静态成员，不需要实例化。
 */
public class Cat{
	private static int sid =0;
	private String name;
	int id;
	Cat(String name){
		this.name=name;
		id=sid++;
	}
	public void info(){
		System.out.println("My name is "+name+"No."+id);
	}
	public static void main(String [] args){
		Cat.sid=100;
		Cat a=new Cat("a");
		Cat b=new Cat("b");
		a.info();
		b.info();
	}
}