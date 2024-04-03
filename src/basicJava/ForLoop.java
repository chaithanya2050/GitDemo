package basicJava;

public class ForLoop {
	
	public void go()
	{
		System.out.println("first");
		
		System.out.println("last");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<10;i++)
		{
			if(i>=5 && i<=7)
				continue;
			
			
//			if(i==5)
//				break;
			System.out.println(i);
		}
		System.out.println("out side loop");
		
//		int i=0;
//		int count=0;
//		while(i<3)
//		{
//			for(int j=0;j<4;j++)
//			{
//				int k=0;
//				do
//				{
//					System.out.println("i--->"+i+"   j--->"+j+"  k--->"+k);
//					k++;
//					count++;
//					
//				}while(k<5);
//			}
//			i++;
//			
//		}
//		System.out.println("Total count is:"+count);

	
	}

}
