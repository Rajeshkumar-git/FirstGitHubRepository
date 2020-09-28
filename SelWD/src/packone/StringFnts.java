package packone;

public class StringFnts {

	public static void main(String[] args) {
		
		String a = "ABCD";
		String b = "abcd";
		String c = "    skdjd lsdkfl qwr  ";
		String[] d= c.split(" ");
		int i;
		
		//System.out.println(a.equals(b));
		//System.out.println(a.equalsIgnoreCase(b));
		//System.out.println(a.length());
		//System.out.println(b.length());
		//System.out.println(a.contains("ab"));
		//System.out.println(b.contains("ab"));
		System.out.println(b.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(c.replace(" ", ""));
		for (i=0;i<d.length;i++ )
			System.out.println(d[i]);

				
				
	}

}
