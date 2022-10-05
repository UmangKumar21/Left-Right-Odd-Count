import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int t=0,f=0;
		for(int i=0; i<n; i++){
		    arr[i]=sc.nextInt();
		    if(arr[i]%2!=0) t++;
		}
		for(int i=0; i<n; i++){
		    if(arr[i]%2!=0) t--;
		    if(f==t) System.out.print(arr[i]+" ");
		    else System.out.print("-1 ");
		    if(arr[i]%2!=0) f++;
		}

	}
}