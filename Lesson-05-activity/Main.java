class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/
   
    int x1=2;
    int x2=3;
    double sum1 = x1 + x2;
    System.out.println(sum1);                     
    

/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/

    int g1 = 67;
    int g2 = 33;
    int g3 = 76;
    double sum2= g1 + g2 + g3;
    System.out.println(sum2);

/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/
    
    double avg = sum2/3;
    System.out.println(avg);


/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/

    double a = 10;
    double x = 5;
    double y = a/(x + 1.0);
    System.out.println(y);


/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/
 
    double y1 = ((2*x)*(x+1)*(-x/2))/a;
    System.out.println(y1);
 

/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
 
    double b = 10;
    double h = 20;
    double area  = (1/2.0)*b*h;
    System.out.println(area);

/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}