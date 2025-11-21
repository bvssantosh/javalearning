package assignment;

public class Demo6 {
		public String convertToFigures(long amt) {
			 String[] ones = {
					 "","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"	   			   
				   };
				  String[] tens = {
						   "","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"
				   };
				  long nunit[]= {10000000l,100000l,1000l,100l,1};
				  String sunit[]= {" crores "," lakhs "," thousand "," hundreds "," only "};
				  for(int i=0;i<nunit.length;i++) {
					  int x=(int)(amt/nunit[i]);
					  amt=amt%nunit[i];
					  
				  }
		}
		
}
