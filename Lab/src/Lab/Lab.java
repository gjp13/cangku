package Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {
		String S="01234567890abcdefghijklmnopqrstuvwxyz";
		String data;
		char[] c;
		int i=0;
		int d;
		int[] num = new int[36];
		char x;
		ArrayList b = new ArrayList() ;
		
		for(int k=0;k<=35;k++){
			num[k]=0;
		}
		
		Scanner s=new Scanner(System.in);
		data=s.next();
		
		
		
		c=data.toCharArray();
		
		
		for(int l=0;l<c.length;l++){
			
			b.add(c[l]);
		}
		for(int l=0;l<c.length;l++){
			
			if(S.indexOf(c[l])<0){
				System.out.print("ÊäÈë×Ö·û´®·Ç·¨");
				System.exit(0);
			}
		}
		
		
		for(int j=0;j<=35;j++){
			x=S.charAt(j);
			while(b.indexOf(x)>=0){
				  d=b.indexOf(x);
				  num[j]++;
				  b.remove(d);
			}
			
		}
		
		
		
		while (true){
			
			for (int m=0;m<=35;m++){
				if(num[m]!=0){
					System.out.print(S.charAt(m));
					num[m]--;
					}
				else i++;
			}
			if(i==36){
				break;
			}
			
		}
		
	}

}
