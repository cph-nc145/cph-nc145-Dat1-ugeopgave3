public void printfPalindrome(String s){
	String sRev = "";
	s = s.toLowerCase();
	for (int i = s.length() - 1; i >= 0; i--){
		sRev = sRev + s.charAr(i);
	}
	
	if (s == sRev){
		System.out.print(s);
	}
	else{
		System.out.print("it is not a palindrome");
	}
}
