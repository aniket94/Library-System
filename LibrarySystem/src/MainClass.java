

public class MainClass 
{

	public static void main(String[] args)
	{
/*		
		  int a = 0;
		  String s = null;
		  int e = 0;
		  int ISBN;
		  String title;
		  String author;
		  String edition = null;
	      Scanner in = new Scanner(System.in);
	      
	      System.out.println("To Add a Book Press 0");
	       int k ;
	       k= in.nextInt();
	       
	       switch(k){
	       
	       case 0 :
	       System.out.println("enter title of book:");
	 	   s = in.next();
	 	   
	 	  System.out.println("Enter ISBN:");
	      a = in.nextInt(); 
	      
	      System.out.println("Enter edition no: [1 for 1st Edition, 2 for 2nd Ecdition, and so on]");
	      e= in.nextInt();
	      
	      System.out.println("Author:");
	      edition = in.next(); //accept the value and save it to the Author variable
	      break ; //remove this but also remove the switch statement
	      
	      default : // get rid of this
	    	  System.out.println("Wrong Input");
	  
	       } 
    
	      
	 
	      System.out.println("To Know the book added press 0");
	      int j;
	      j = in.nextInt();
	      
	      switch(j){
	      
	      case 0:
	   System.out.println("Title of book " + s);	   
	   System.out.println("ISBN is "+a);
	   System.out.println("Edition of book is" + e);
	   System.out.println("Author of book is" + edition);
	   break;
	   
	      default:
	    	  System.out.println("Wront Input");  
	      
	      }	            
*/	     
		
	Book b1 = new Book("79456", "JAVA", "John Grisham", 2);
	b1.displayInfo();
	
/*	Book b2 = new Book("123456", "Oracle", "ED Burns", 3);
	b2.displayInfo();*/
	}

}