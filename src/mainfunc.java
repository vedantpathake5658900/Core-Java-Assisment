import java.util.*;
import java.io.*;


public class mainfunc{
	public static void main(String args[])throws IOException{
			int i = 1;
			
			String current_d_path =  System.getProperty("user.dir");
			file_opearations fp = new file_opearations();
			
			while(i == 1){
			System.out.println("=====>>>>>>>> Wel Come to Lockers Pvt. Ltd. <<<<<<<<<<=====");
			
			System.out.println("=====>>>>>>>> Application Developed by Vedant Pathak <<<<<<<<<<=====");
			
			System.out.println("\n 1.Display file names in ascending order. \n 2.Bussiness-Level Operations. \n 3.Exit \n Kindly enter your choice ");
			
			Scanner sc = new Scanner(System.in);			
			int choice = sc.nextInt();
			
			
			switch(choice) {
			case 1:
						fp.show_files_assending(current_d_path);		
			break;
			
			case 2:
				int lp = 1;
				while(lp ==1) {
					System.out.println("\n 1.Add file into folder "
							+ "\n 2.Delete file from folder "
							+ "\n 3.Search File \n 4.Go to main menu"
							+ " \n Kindly enter your choice ");
					
					Scanner sc2 = new Scanner(System.in);			
					int choice2 = sc2.nextInt();
					
					switch(choice2) {
						case 1:
							fp.file_insert(current_d_path);
							break;
					
						case 2:
							fp.file_delete(current_d_path);
							break;
					
					
						case 3:
							fp.search_file(current_d_path);
							break;
					
						case 4:
							lp = 0;
							break;
					
						default:
							System.out.println("Please enter valid choice");
					
						
					}
				}
						
			
			break;
			
			case 3:
				
				System.out.println("Bye");
				i = 0;
				
			break;
			
			default:
				
				System.out.println("Please enter valid choice");
			
				}
			}
	}
}
