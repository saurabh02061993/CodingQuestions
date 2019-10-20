package Array;

public class Sample {

	static String reverse(String a) {
		String s = "";
		System.out.println(a.length());
		for (int i =(a.length()-1); i>=0; i--) {

			s = s+a.charAt(i);

		}

		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "i am good";
		String str1 = "my name is";

		String a = reverse("mom");
		

	}
}
