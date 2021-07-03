package rbca_19205;

import git_lab2.Orange;

public class Orange {
	String color;
	Orange(String color)
	{
	this.color=color;
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Orange greenApple = new Orange("green");
	String color = greenApple.getColor();
	System.out.println("color of apple is " + color);

	}

}
