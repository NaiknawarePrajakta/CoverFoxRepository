package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		Mother mother=new Mother();
		Daughter daughter= new Daughter();
		
		mother.recipe();
		mother.look();
		
		daughter.study();
		daughter.hobbies();
		daughter.recipe();//using sub class object,calling super class method
		daughter.look();//using sub class object, calling super class method
	}

}
