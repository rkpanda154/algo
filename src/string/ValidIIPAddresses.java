package string;

import java.util.ArrayList;

public class ValidIIPAddresses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi RAJESH" + restoreIpAddresses("001234"));
		System.out.println("Hi RAJESH" + restoreIpAddresses("25525511135"));
		
	}
	
	public static ArrayList<String> restoreIpAddresses(String A) {
		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> temp = new ArrayList<>();
		
		getALlIPAddresses(result, A, 0, temp);
		
		return result;
    }
	
	public static void getALlIPAddresses(ArrayList<String> result, String A, int start, ArrayList<String> temp){
		if(temp.size()==4 && start==A.length()) {
			result.add(temp.get(0)+"."+temp.get(1)+"."+temp.get(2)+"."+temp.get(3));
			return;
		}
		if(temp.size()+(A.length()-start+1) < 4) return;
		if(temp.size()==4 && start!=A.length()) return;
		
		for(int i=1; i<=3; i++) {
			if(start+i > A.length()) break;
			String  sub = A.substring(start, start+i);
			if(i>1 && sub.charAt(0)== '0') break;
			if(Integer.valueOf(sub)>255) break;
			temp.add(sub);
			getALlIPAddresses(result,A,start+i,temp);
			temp.remove(temp.size()-1);
		}
	} 
}
