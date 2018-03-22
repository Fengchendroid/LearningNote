//charAt()方法运用
//String类常用的方法，split(),indexOf(),valuneOf(),charAt(),substring(),
public class TestString{
	public static void main(String [] args){
		String s="asdqwdaDweedDrEefEFef3333####3";
	int count1,count2,count3;
	for (int i=0;i<s.length();i++){
	char c=s.charAt(i);
	if (c>='a'&&c<='z') {
		count1++;
	}else if (c>'A'&&c<'Z') {
		count2++;
	}else{
		count3++;
	}
	}
	System.out.println(count1+" "+count2+" "+count3);
}