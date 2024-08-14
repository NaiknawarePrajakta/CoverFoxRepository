package inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		GrandMother grandMother = new GrandMother();
		grandMother.singing();
		GrandMother.stories();
		
		Mother mother = new Mother();
		mother.recipe();
		mother.look();
		mother.singing();// grandmothers non static method called using mothers object
		
		Mother.nature();
		Mother.stories();// grandmothers static method called using mothers ref 
		
		Daughter daughter = new Daughter();
		daughter.hobbies();
		daughter.study();
		daughter.recipe();
		daughter.look();
		daughter.singing();
		
		Daughter.nature();
		Daughter.stories();
			}

}
