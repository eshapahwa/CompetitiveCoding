package LeetCode;

public class MountainArray {
	public boolean validMountainArray(int[] arr) {
		if(arr.length<3)
            return false;
        boolean k1 = false;
        boolean k2 = false;
        for(int i=0;i<arr.length;i++){
            if(arr[0]<arr[1] && i!=arr.length-1)
            {
                k1 = true;
            
             if(arr[i]<arr[i+1] && i!=arr.length-1){
                 continue;
             }  
            if(arr[i]==arr[i+1] && i!=arr.length-1) {
         		k2 = false;
         		break;
         	}
            
            if(arr[i]>arr[i+1]){
                int h = i;
                for(int j = h;j<arr.length-1;j++){
                    if(arr[j]>arr[j+1]){
                        k2 = true;
                        continue;
                    }
                    else if(arr[j]<=arr[j+1]){
                        k2 = false;
                        break;
                    }
                }
                break;
            }
        }
            else
                return false;
            
        }
        if(k2==true && k1==true)
            return true;
        else
            return false;
    }
	
	public static void main(String[] args) {
		MountainArray ob = new MountainArray();
		int arr[] = {6,7,7,8,6};
		boolean f = ob.validMountainArray(arr);
		System.out.println(f);

	}
}
