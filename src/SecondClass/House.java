package SecondClass;

public class House {
int houseNumber=2110;
String houseName;
int zipCode;
public String getHouseName() {
//If I want to return value should not I use --void-- keyword 
	return houseName;
}
public void numberOfBedRoom() {
	System.out.println("There are two bedroom in my class");
}
public int  getHouseNumber() {
	return houseNumber;
}
void numberOfBathRoom() {
	System.out.println("One Bathroom");
}
int getZipCode() {  //Question: why we using  public data type when method is return type.
	return zipCode;
}

}
