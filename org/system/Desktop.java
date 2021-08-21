package org.system;

public class Desktop extends Computer {

	public void desktopSize()
	
	{
		System.out.println("Desktop Size ");
	}
	
	public static void main(String[] args) {
		Desktop object1 = new Desktop();
		System.out.println("Calling from Desktop class");
		object1.computerModel();
		object1.desktopSize();
			
	}
}

