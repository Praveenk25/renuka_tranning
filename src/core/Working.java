
public class Working {


	public static void main(String args[])
	{ byte[] b= {71, 101, 101, 107, 115};
	String s=new String(b);
	System.out.println(s);
	String t="Renuka";
	System.out.println(t.length());
	System.out.println(t.charAt(4));
	String p=" Shekhawat";
	System.out.println(t.concat(p));
	System.out.println(t.equals(p));
	String s1="abc";
	String s2="abc";
	String s3=new String("abc");
	String s4=new String("abc");
	System.out.println(s1==s2);
	System.out.println(s3==s4);
	System.out.println(s1.equals(s2));
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.equals(s4));
	String a="cat";
	System.out.println(a.hashCode());
	 a="dog";
	System.out.println(a.hashCode());
	String s5=s3.intern();
	System.out.println(s1==s5);
	System.out.println(s1.subSequence(0,2));
	System.out.println(s1.compareTo("abc"));
	String r1="beautiful";
	System.out.println(r1);
	StringBuilder r2=new StringBuilder("beautiful");
	concat2(r2);
	System.out.println(r2);
	StringBuffer r3=new StringBuffer("beautiful");
	concat3(r3);
	System.out.println(r3);
	
	}
		public static void concat1(String r1)
		{ r1=r1+"flower";
	}
		public static void concat2(StringBuilder r2)
		{ r2.append("flower");
}
		public static void concat3(StringBuffer r3)
		{  r3.append("flower");
}
}



