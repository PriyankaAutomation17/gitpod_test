

public class CaseChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="PriyAnka";
		
		
        for (int i = 0; i < name.length(); i++) {
            char j = name.charAt(i);
           // System.out.println(j);
            if(j>=65&&j<=90) {
            	String a=String.valueOf(j);
            System.out.print(a.toLowerCase());
            	
            }

            else if(j>=97&&j<=122) {
            	String a=String.valueOf(j);
            System.out.print(a.toUpperCase());
            	
            }
	}
        

}
}
