package SecondClass;

public class TestHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      House hs = new House();// What is <--new--> ? Answer: --new-- is a Keyword?
      hs.numberOfBedRoom();
      String houseName = hs.getHouseName();
      houseName="Integer";
      System.out.println(houseName);
      int houseNumber=hs.getHouseNumber();
      int add=houseNumber+2;
      System.out.println(add);
      hs.numberOfBathRoom();
      int zipCode=hs.getZipCode();// I Did not use public return data type.
      zipCode = 11372;
      int finalzipcode = zipCode+3;
      System.out.println(finalzipcode);
	}
}
