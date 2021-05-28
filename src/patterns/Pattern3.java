package patterns;

public class Pattern3 {

	public static void main(String[] args) {
		char ch ;
		 for(int i=1;i<=5;i++){
			 ch = 'A';
	            for(int j=1;j<=5;j++){
	                if(j<=i)
	                    System.out.print(ch+" ");
	                ch++;
	                
	            }
	            System.out.println();
	        }
	}

}
