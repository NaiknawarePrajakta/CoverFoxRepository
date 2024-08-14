package LogicalPrograms;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		System.out.println("Before Swap a is "+a+" b is "+b);
		
		int c=a;//10
		 a=b;//20
         b=c;//10
        
        System.out.println("After Swap a is "+a+" b is "+b);
        
        System.out.println("=================================");
       // Swap  Without 3rd variable
         int x=100;
        	int y=	90;
        	System.out.println("Before Swap x is "+x+" y is "+y);
        	
        	x=x+y;//100+90-->190
        	y=x-y;//190-90-->100
        	x=x-y;//190-100--->90
        	System.out.println("After Swap x is "+x+" y is "+y);
        
	}

}
