package mock;

import java.util.Arrays;

public class practice {

	public static void main(String [] args){

		int a[]={25,12,3,56,22,45};
//		Arrays.sort(a);
//		for(int i=0;i<=a.length-1;i++){
//		System.out.print(a[i]+" ");
//		}
//System.out.println();
//
//		for(int i=a.length-1;i>=0;i--){
//		System.out.print(a[i]+" ");
//		}
		
//		for(int i=a.length-1;i>=0;i--){
//		System.out.print(a[2]+" ");
//		}
		
//		String s="mock";
//		String rev=" ";
//		for(int i=s.length()-1;i>=0;i--){
//		rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
		
		for(int i=0;i<=a.length-1;i++){
		System.out.print(a[i]+" ");
		}
		System.out.println();
		int z;
		for(int i=0;i<a.length/2;i++) {
			z=a[i];
			a[i]=a[(a.length-1)-i];
			a[(a.length-1)-i]=z;
		}
		for(int i=0;i<=a.length-1;i++){
		System.out.print(a[i]+" ");
		}
}
}
