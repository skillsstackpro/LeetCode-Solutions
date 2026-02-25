public class _04_mediantwosortedarray {
    public double mergesort(int num1[],int num2[]){
        int n = num1.length;
        int m=num2.length;

        int merged[]=new int[n+m];
        int i=0,j=0,k=0;
//      apply merge sort
        while(i<n && j<m){
            if(num1[i]<num2[j]){
                merged[k]=num1[i];
                i++;
            }
            else{
                merged[k]=num2[j];
                j++;
            }
            k++;
        }
        //shift remaining elements of num1
        while(i<n){
            merged[k]=num1[i];
            i++;
            k++;

        }
        //shift remaining elements of num2
        while(j<m){
            merged[k]=num2[j];
            j++;
            k++;
        }

        System.out.print("sorted array is ");
        for(int x=0;x<merged.length;x++){
            System.out.print(merged[x]);
            System.out.print(" ");
        }
        int p = merged.length;
        if(p%2==0){
            return ( merged[p/2-1]+merged[p/2])/2.0;
        }
        else{
            return (double)merged[p/2];
        }
    }

    public static void main(String[] args) {
        int num1[]={1,2};
        int num2[]={3,4};

        _04_mediantwosortedarray sol = new _04_mediantwosortedarray();

       double result= sol.mergesort(num1,num2);
        System.out.println("\nmedian is "+result);
        
    }
}
