package justforpractice;

public class ReverseAString {

	public static void main(String[] args) {
		String s="Bokachoda";
		char[]ch=s.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);

	}

}
