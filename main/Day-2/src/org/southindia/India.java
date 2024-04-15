package org.southindia;

public class India {
	public void india() {
		System.out.println("World biggest population");
	}
}
	
class TamilNadu extends India {
	public void tamilLanguage() {
		System.out.println("tamil language");

	}
}
class Kerala extends TamilNadu{
	public void malayalam() {
		System.out.println("kerala malaylam");
	}
}

class AndhraPradesh extends Kerala{
	public void telugu() {
		System.out.println("Telugu language");
	}

	public static void main(String[] args) {
		AndhraPradesh in=new AndhraPradesh();
		in.india();
		in.tamilLanguage();
		in.malayalam();
		in.telugu();
		

	}

}
