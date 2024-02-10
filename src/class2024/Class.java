package class2024;

public class Class {
private int ID;//these are the attributes to a class
private String Name;

public Class(int ID, String Name) { // this is the constructor I created for initilisaing objects
	this.ID = ID;
	this.Name = Name;
}
public void displayinfo() {//This is the method I created which displays the information about a person
	System.out.println("The Student ID is " + ID +" and the name of the student is " + Name);
}
}
