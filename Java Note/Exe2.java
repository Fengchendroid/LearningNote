//java的参数传递方式只有按值传递
//这边a,b在swap和main方法开辟的栈区都存在
//main中传递进swap的a,b只是副本
public class Exe2{
	public static void swap(int a,int b){
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a+";b="+b);
	}
	public static void main (String [] args){
		int a=5;
		int b=10;
		swap(a,b);
		System.out.println("交换之后，a="+a+";b="+b);
	}
} 