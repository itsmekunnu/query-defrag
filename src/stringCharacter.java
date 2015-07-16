import java.util.Scanner;

public class stringCharacter {
	public static void main(String []p)
	{
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Please enter the query..");
		String inputQuery = scanner1.nextLine();
		scanner1.close();
		int ctr = 0;
		inputQuery = inputQuery.trim();
		boolean flag = false;
		boolean flag2 = false;
		if(inputQuery.length()%5 == 0)
			ctr++;
		if(inputQuery.length() < 5){
			System.out.println("the input query is less than 5..."+inputQuery);
			flag = true;
		}
		if(((inputQuery.length())%5) == 0 || flag2 == false)
		{	
			int a = 0, c = 1;
			String demoString = " ", remString = " ";
			for(int i=0; i<inputQuery.length()+1; i++){
				int var = (5*c);
				if(i == var){
					demoString = inputQuery.substring(a,i);
					c++;
					a = var;
					System.out.println("Slashed String is..."+demoString);
				}
				flag2 = true;
			}
			
			if(flag != true && flag2 == true && ctr == 0 ){
				int remLength = (inputQuery.length()-((inputQuery.length()%5)+1))+1;
				remString = inputQuery.substring(remLength , inputQuery.length() );
				System.out.println("remaining String is..."+remString);
			}
			
			
		}
	}

}
