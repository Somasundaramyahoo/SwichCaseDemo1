 package functions;

public class MaxMini {
	public int max(int b[]){
	int maxi=0;
	for(int i=0; i<b.length; i++){
		if(b[i]>=maxi){
			maxi=b[i];
		}
	}
	return maxi;
	}
	public void min(int a[]){
		int mini=a[1];
		for(int i=0; i<a.length; i++){
			if(a[i]<=mini){
				mini=a[i];
			}
		}
		System.out.println(mini);
	}

}
