
public class Explore {
	int i1 = 34;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Object[][] data = new Object[2][2];
			data[0][0] = "Hari";
			data[0][1] = 12;
	
			data[1][0] = i1;
			data[1][1] = i1*i1;
			//Object[0][1] = lp;
			System.out.println(data[0][0]); 
			System.out.println(data[0][1]); 
			System.out.println(data[1][0]); 
			System.out.println(data[1][1]);
			
		}
	}