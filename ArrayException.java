public class ArrayException {

	public static void main(String[] args) {
		
		int[] a = new int[]{1,2,3,4,5};

		try{
			for(int i = a.length; i >=0; i--){
							
				System.out.println("Number at " + i + " position is " + a[i]);
			}
		}
		catch(Exception e){
				
				System.out.println(e);
				
		}
			
		
	}

}
