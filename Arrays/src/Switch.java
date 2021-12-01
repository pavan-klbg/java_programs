
public class Switch {
	public static void main(String[] args) {
		int ar1[]={34,23,45,21};
		int ar2[]={34,20,12,21};
		int temp[]=new int[5];
		
		
		System.out.println("begins");
		
		for(int i=0;i<ar1.length;i++){
			for(int j=i;j<ar2.length;j++){
				if(ar1[i]==ar2[j]){
					 temp[i]=ar2[j];
				}
			}
			
			}
		}

		
}