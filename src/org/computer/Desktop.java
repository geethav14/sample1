package org.computer;

public class Desktop extends Computer {
public void desSize() {
	System.out.println("Desktop Size - 35.56cm (14 inch)");
}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.comModel();
	d.desSize();
}
}