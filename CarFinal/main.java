package CarFinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;  
public class main {
	
	public static void showData() {
		Scanner sc = null;
	      LinkList list = new LinkList();
			int count=0;
			String consoleMaker = "", consoleBodyType = "", consoleName = "", consoleModelYear = "", consoleColor = "", consoleRegistrationNumber = "";
			try {
				sc = new Scanner(new File("cars.csv"));
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("File Not Found");
			} 
			
			sc.useDelimiter(",");   //sets the delimiter pattern  
			while (sc.hasNext())  //returns a boolean value  
			{  
				count++;
				if(count == 1) {
					consoleMaker = sc.next();
				}
				else if(count == 2) {
					consoleBodyType = sc.next();
				}
				else if(count == 3) {
					consoleName = sc.next();
				}
				else if(count == 4) {
					consoleModelYear = sc.next();
				}
				else if(count == 5) {
					consoleColor = sc.next();
				}
				else {
					consoleRegistrationNumber = sc.next();
					list = list.insert(list, consoleMaker, consoleBodyType, consoleName, consoleModelYear, consoleColor, consoleRegistrationNumber);
					count = 0;
					
				}
			}
			// Print the LinkedList 
	        list.printList(list); 
			sc.close();  //closes the scanner 
	}
	
	public static void inputData() {
		
		Scanner sc= new Scanner(System.in);
		String value = "";
		
		try {

            FileWriter sb = new FileWriter("cars.csv", true);
            System.out.println("Input Car Maker");
		      value = sc.nextLine();
		      
		      sb.append(value);
		      sb.append(',');
		      
		      System.out.println("Input Car Body Type");
		      value = sc.nextLine();
		      
		      sb.append(value);
		      sb.append(',');
		      
		      System.out.println("Input Car Name");
		      value = sc.nextLine();
		      
		      sb.append(value);
		      sb.append(',');
		      
		      System.out.println("Input Car Model Year");
		      value = sc.nextLine();
		      
		      sb.append(value);
		      sb.append(',');
		      
		      System.out.println("Input Car Color");
		      value = sc.nextLine();
		      
		      sb.append(value);
		      sb.append(',');
		      
		      System.out.println("Input Car Registration Number");
		      value = sc.nextLine();
		      
		      sb.append(value);
		      sb.append(',');
		      sb.append('\n');
            sb.close();
            System.out.println("CSV file created succesfully.");
        } catch (Exception e) {
            System.out.println("exception :" + e.getMessage());
        }
		
//		try (PrintWriter writer = new PrintWriter(new File("cars.csv"))) {
//
//		      StringBuilder sb = new StringBuilder();
//
//		      System.out.println("Input Car Maker");
//		      value = sc.nextLine();
//		      
//		      sb.append(value);
//		      sb.append(',');
//		      
//		      System.out.println("Input Car Body Type");
//		      value = sc.nextLine();
//		      
//		      sb.append(value);
//		      sb.append(',');
//		      
//		      System.out.println("Input Car Name");
//		      value = sc.nextLine();
//		      
//		      sb.append(value);
//		      sb.append(',');
//		      
//		      System.out.println("Input Car Model Year");
//		      value = sc.nextLine();
//		      
//		      sb.append(value);
//		      sb.append(',');
//		      
//		      System.out.println("Input Car Color");
//		      value = sc.nextLine();
//		      
//		      sb.append(value);
//		      sb.append(',');
//		      
//		      System.out.println("Input Car Registration Number");
//		      value = sc.nextLine();
//		      
//		      sb.append(value);
//		      sb.append(',');
//		      sb.append('\n');
//
//		      writer.write(sb.toString());
//
//		      System.out.println("done!");
//
//		    } catch (FileNotFoundException e) {
//		      System.out.println(e.getMessage());
//		    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int choice = 1;
		
		while(choice == 1 || choice == 2) {
			System.out.println("Choose an Option");
			System.out.println("View File Data (1)");
			System.out.println("Insert new Car Record (2)");
			System.out.println("Anything else to exit");
			choice= sc.nextInt(); 
			if(choice == 1) {
				System.out.println("==========================");
				showData();
				System.out.println("==========================");
			}
			else if(choice == 2) {
				inputData();
			}
		}
		
		

	}

}