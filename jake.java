public class Jake {

	public static void main(String[] args) {
		System.out.println("Let's see what we can do....");
		int[] nums = {1,4,6,8,12};
	Max(nums);
	}
  ///////////////
		private static  void Max(int[] pin){
			int max=1;
			for(int i=0; i<=pin.length-1; i++){
				if(pin[i]>max){
					max=pin[i];
					}
				}System.out.println("max: "+max);
			
			int max2=1;
			for(int j=0; j<=pin.length-1; j++){
				if(pin[j]>max2){
					if(pin[j]!=max){
					max2=pin[j];
					}
				}
			}System.out.println("max2: "+max2);
		}
}
	
