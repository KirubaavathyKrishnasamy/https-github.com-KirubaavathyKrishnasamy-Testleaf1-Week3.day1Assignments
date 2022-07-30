package org.system;

public class Desktop extends Computer {
public void desktopSize()
{
	System.out.println("Mysize is 11inch");
}
public static void main (String[] args) {
	Desktop mydesktop = new Desktop();
	mydesktop.computerModel();
	mydesktop.desktopSize();
}
}
