package LogicalPrograms;

public class Duplicates_Elements_In_String_Array {

	public static void main(String[] args) {
		
		String ar[]= {"java","testing","java","python","sql","sql","testing","api"};
		int count=0;
		System.out.println("Duplicates elements are: ");
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i].equals(ar[j]))
				{
					System.out.print(ar[i]+" ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("Number of duplicates elements are "+count);
	}

}
