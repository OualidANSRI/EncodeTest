
import java.lang.StringBuilder;
public class Encode {

	
	static String encode(String str)
	{
		StringBuilder sb = new StringBuilder();
        
		int j,i = 0;
		
		
		while(i<str.length())
		{ 	j=1;
			while( (i<str.length()-1) && str.charAt(i)==str.charAt(i+1)) {
				j++;        
				i++;
			}			
			sb.append(j).append(str.charAt(i));
			i++;	   
		}
           
        return sb.toString();					
	}
	
	public static void main(String[] args) {

		System.out.println(Encode.encode("aaat"));
	}

}
