import java.io.*;
import java.nio.file.*;
import java.util.*;

public class file_opearations {
	public Scanner sc = new Scanner(System.in);
	public void show_files_assending(String current_d_path){
	 
		try {
			File folder = new File(current_d_path);
			File[] files = folder.listFiles();
			ArrayList<String> a1 = new ArrayList<String>();
			for(File file : files) {
				
				    String str = file.toString();
				    StringBuffer sbr = new StringBuffer(str);
			        // To reverse the string
			        sbr.reverse();
				    String str2 = sbr.toString();
				   
				    
				    String[] arrOfStr = str2.split("/");
					String ar2 = arrOfStr[0];
					StringBuffer sbr2 = new StringBuffer(ar2);
			        // To reverse the string
			        sbr2.reverse();
			        String a3 = sbr2.toString(); 
				    a1.add(a3);
				
			
			}
			
					Collections.sort(a1);
			
					for(int x=0;x<a1.size();x++) {
						System.out.println(a1.get(x));
					}
			
		}catch (Exception e){
				e.getStackTrace();
				}


	}
	
	public void file_insert(String current_d_path)throws IOException {
		
		int choice2;
		System.out.println("Please Enter the choice");
		System.out.println("1.Kindly insert path of file which you want to Insert 2.Take default file path '/home/vedantpathakfis/demofiles/Abstract' for testing");
		choice2 = sc.nextInt();
		String s1 = "/home/vedantpathakfis/demofiles/Abstract";
		
		if(choice2 == 1) {
			System.out.println("Enter the full path of file (including file name) you want to insert");
			String f_name = sc.nextLine();
			s1 = sc.nextLine();
		}
		
		
		BufferedReader br = new BufferedReader(new FileReader(s1));
		ArrayList<String> result = new ArrayList<>();
		while(br.ready()) {
			result.add(br.readLine());
		}
		
		String comp_path = current_d_path+"/inserted";
		
		FileWriter writer = new FileWriter(comp_path); 
		for(String str: result) {
		  writer.write(str + System.lineSeparator());
		}
		writer.close();
		br.close();

	}
	
	public void file_delete(String current_d_path) {
		
		System.out.println("Kindly enter the name of file which you wanto to delete");
		Scanner sp =new Scanner(System.in);
		String d_file_name = sp.nextLine();
		String s = current_d_path+d_file_name;
		
		try 
		{
			Files.deleteIfExists(Paths.get(s));
		}
		catch(NoSuchFileException e){
			System.out.println("No such file or directory");
		}
		catch(DirectoryNotEmptyException e){
			System.out.println("Directory is not empty");
		}
		catch(IOException e){
			System.out.println("Invalid Permissions");
		}
		System.out.println("Process completed");
		
		
	}
	
	public void search_file(String current_d_path) {
		
		System.out.println("Kindly enter the file name which you want to search");
		Scanner sc3 = new Scanner(System.in);
		String search_file = sc3.nextLine();
		
		File folder = new File(current_d_path);
		File[] files = folder.listFiles();
		ArrayList<String> a2 = new ArrayList<String>();
		for(File file : files) {
			
			    String str = file.toString();
			    StringBuffer sbr = new StringBuffer(str);
		        // To reverse the string
		        sbr.reverse();
			    String str2 = sbr.toString();
			   
			    
			    String[] arrOfStr = str2.split("/");
				String ar2 = arrOfStr[0];
				StringBuffer sbr2 = new StringBuffer(ar2);
		        // To reverse the string
		        sbr2.reverse();
		        String a3 = sbr2.toString(); 
			    a2.add(a3);
			
		}
		
		int temp = 0;
		
		for(int x=0;x<a2.size();x++) {
			//System.out.println(a2.get(x));
			//System.out.println(search_file);
			String cm = a2.get(x);
			if(cm.equals(search_file) == true) {	
				temp = 1;
			}
		}
		
		if(temp == 0) {
			System.out.println("File not found");
		}
		else if(temp == 1) {
			System.out.println("File is pressent in directory");
		}
		
	}
	
}
