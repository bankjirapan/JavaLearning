//********************************************************************
//  StudentBody.java       Author: Lewis/Loftus
//
//  Demonstrates the use of an aggregate class.
//********************************************************************

public class StudentBody1 
{
   //-----------------------------------------------------------------
   //  Creates some Address and Student objects and prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Address school = new Address ("800 Lancaster Ave.", "Villanova",
                                    "PA", 19085);

      Address jHome = new Address ("21 Jump Street", "Lynchburg",
                                   "VA", 24551);
      Student1 john = new Student1 ("John", "Smith", jHome, school);


      Address mHome = new Address ("123 Main Street", "Euclid", "OH",
                                   44132);
      Student1 marsha = new Student1 ("Marsha", "Jones", mHome, school);

	  
      System.out.println (john);
      System.out.println ();
      System.out.println (marsha);
	  System.out.println();
	  
		  
	 
	  
	  
   }
}
