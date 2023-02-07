
public class ForExamen {
	
	public String fra1;

	public ForExamen(String fra1) {
		this.fra1 = fra1;
	}	
	
	
		public String primeraMayuscula() {
			
			return(String)fra1.substring(0, 1).toUpperCase() + fra1.substring(1);
		}
		public String invertirCadena() {
			StringBuilder sb = new StringBuilder(fra1);
		    sb.reverse();
		    return sb.toString();
			}
		public String vocalesMayuscula() {
			String fra2 = fra1.replace('o', 'O');
			String fra3 = fra2.replace('a', 'A');
			String fra4 = fra3.replace('e', 'E');
			String fra5 = fra4.replace('i', 'I');
			String fra6 = fra5.replace('u', 'U');
			return (String)fra6;
		}
		
		public void fizzBuzz() {
			int n;
			String m;
			for(n=0; n<=100; n++)
			{
				if (n%3==0&& n%5==0)
				{
					System.out.println("FizzBuzz");
					continue;
					}
				if(n%3==0)
				{
					System.out.println("Fizz");
					continue;
					
				}
				if(n%5==0)
				{
					System.out.println("Buzz");
				continue;
				}
				else
				{
					System.out.println(n);
					continue;	
				}
			}
		}
		public Boolean palindromo() {
			boolean n=false;
			 StringBuilder reve = new StringBuilder();
			  for (int i = fra1.length() - 1; i >= 0; i--) {
			    reve.append(fra1.charAt(i));
			    
			    if(fra1.equals(reve.toString()))
			    {
			    	n = true;
			    }
			    else {
			    	n= false;
			    }	    
		}
			return n;

	}
}


	

