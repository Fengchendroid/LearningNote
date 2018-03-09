public class OverloadVarargs{
	public void test(String msg){
		System.out.println("只有一个形参的方法");
	}
	public void test(String [] msg){
		System.out.println("形参个数可变的方法");
	}
	public static void main (String [] args){
		OverloadVarargs oVarargs=new OverloadVarargs();
		//下面调用执行方法1
		oVarargs.test("a")；
		//下面调用执行方法2
		oVarargs.test();
		oVarargs.test("a","b");
		oVarargs.test(new String []{"a"});
	}
}