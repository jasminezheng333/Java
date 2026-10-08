
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
  
    System.out.println("Enter a value");
    double x= Input.readInt();
    y = Math.pow(x,7);
    System.out.println(y);


/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
  
    System.out.println("Enter a value");
    double z= Input.readInt();
    q = Math.pow(z,3) + 5;
    System.out.println(q);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/

    System.out.println("Enter a value for t");
    double t= Input.readInt();
    System.out.println("Enter another value for r");
    double r= Input.readInt();
    s = Math.pow(t,5)*Math.pow(r+2,4);
    System.out.println(s);


/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/

    System.out.println("Enter a value for a");
    double a= Input.readInt();
    System.out.println("Enter another value for b");
    double b= Input.readInt();
    c = Math.sqrt(a+b);
    System.out.println(c);

/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/

    

/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/





/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/




/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}