package interfaceStudy;

public class Son implements Mother,Father {

	public static void main(String[] args) {
		Son son= new Son();
		son.look();
		son.nature();
		son.love();
		System.out.println("=================");
		//calling using interface reference
		
		Mother.care();
		Father.care();
	}

	@Override
	public void love() {
		
		Father.super.love();
		Mother.super.love();
	}

	@Override
	public void nature() {
		
		System.out.println("Fathers nature");
	}

	@Override
	public void look() {
		System.out.println("Mothers look");
		
	}
	
	//java version before 8
	//java 8 version  onwards -->interface --> change
	// Interface we will support few methods with body --> complete method
	// default method along with body, static method along with body

}
