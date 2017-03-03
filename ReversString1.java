import java.util.*;

class ReversString1 
{ 
	
	static int j=0;
	char ch1;
	String str="";
	
	char []ch;

	
	public  String Reverse()
		{

		System.out.println("enter the input string");
		
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();//.trim();
		char []ch=str.toCharArray();

		int ii=ch.length;

		System.out.println("ch====="+ii);
		StringBuffer sb=new StringBuffer();

		System.out.println("Revers String is");
		for(int i=ch.length-1;i>=0;i--)
			{
			ch1=ch[i];
			sb.append(ch1);
			}

			return sb.toString();

		}
	public static void main(String[] args) 
	{
		
		
		
		ReversString1 rs=new ReversString1();
		
		System.out.println(rs.Reverse());

	




		
		//String st=String.valueOf(ch);

	

		/*StringBuffer sb=new StringBuffer();
		sb.append(str);
		sb=sb.reverse();
		System.out.println("Revers String is");

	for(int i=0;i<sb.length();i++)
		{


			System.out.println(sb.charAt(i));

		}
		*/

		String str="amol padgalwar";
		System.out.println(str.length());
		str=str.replaceAll(""," ");
		System.out.println("String with Spaces=="+str);

		String s="test123 test124 test125";
		s=s.replaceAll("\\s+","");
		//s=s.replaceAll(" ","");
		System.out.println(s);


		
	}
}
