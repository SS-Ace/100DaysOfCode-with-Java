public class Q74{
	
	public static float res(float arr[]) {
			
			float sum = 0;
			
			for(int i = 0; i < arr.length; i++) {
				
				sum = sum +(float)(1 / arr[i]);
			}
			
			float res = (float)(arr.length / sum);
			return res;
		}
	
	public static void main(String[] args) {
		
		float arr[] = new float[] {1.0f, 1.1f, 2.0f, 2.1f};
		
		System.out.println(res(arr));
		
	}
}
