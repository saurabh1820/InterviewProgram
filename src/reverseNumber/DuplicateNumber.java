package reverseNumber;

import java.util.HashSet;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		String[] str= {"A","B","D","A","C","B"};
		
		//FIRST WAY
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j])
				{
					System.out.println("Duplicate Element : "+str[i]);
				}
			}
		}
		
		//SECOND WAY
		HashSet<String> has=new HashSet<>();
		for(String l:str) {
			if(has.add(l)==false) {
				System.out.println("Duplicate Element : "+l);
			}
		}
		
	}
}
