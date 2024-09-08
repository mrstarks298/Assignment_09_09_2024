package assignment;

public class Revrse_string {
	public static String revserStr(String str) {
		int Len=str.length();
		String str1="";
		for(int i=Len-1;i>=0;i--) {
				str1=str1+str.charAt(i);
			
					}
		return str1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(revserStr("Saurabh Agrahari"));
		

	}

}

