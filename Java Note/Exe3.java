//这边虽然也开辟了两处栈区保存num变量，单a,b本体在堆区唯一的内存块上
class Num{
	int a;
	int b;
}
public class Exe3{
	public static void swap(Num num){
		int temp=num.a;
		num.a=num.b;
		num.b=temp;
	}
public static void main(String [] args){
	Num num=new Num();
	num.a=5;
	num.b=10;
	swap(num);
	System.out.println("num.a="+num.a+";num.b="+num.b);
}
}