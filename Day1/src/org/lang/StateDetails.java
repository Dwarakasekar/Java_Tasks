package org.lang;

public class StateDetails {
	
	private void southIndia() {

		System.out.println("South India");
	}
	
	private void northIndia() {
		System.out.println("North India");
	}
	

	public static void main(String[] args) {
		
		StateDetails st=new StateDetails();
		st.southIndia();
		st.northIndia();
		
		LanguageDetails lg=new LanguageDetails();
		lg.tamilLang();
		lg.englishLang();
		lg.hindiLang();
		
		
	}

}
