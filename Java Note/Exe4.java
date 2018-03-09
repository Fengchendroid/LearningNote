//形参个数可变的方法，String [] 可用String...代替
//再次调用test方法，不需要用数组方式表示 可写成 test(2,"abc","def");
public class Exe4{
	public static void test(int a,String [] books){
		for (String temp : books ) {
			System.out.println(temp);
		}
		System.out.println(a);
	}
	public static void main (String [] args){
		test(2,new String []{"abc","def"});
	}
}