package interfaceStudy;

public interface Mother {
	
	void look();
	
	default void love()
	{
		System.out.println("Mothers love");
	}
	
	static void care()
	{
		System.out.println("Mothers care");
	}

}
