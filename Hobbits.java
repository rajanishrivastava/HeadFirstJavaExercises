class Hobbits {
	String name;
}
public class HobbitsTestDrive {
	public static void main(String [] args) {
	Hobbits [] h = new Hobbits[3];
	h [0] = new Hobbits();
	h [1] = new Hobbits();
	h [2] = new Hobbits();
	int z = 0;
	
	while (z < 2) {
		z = z + 1;
        h[z] = new Hobbits();
		if (z == 0) {
        h[z].name = "bilbo";
	
		}
        if (z == 1) {
			h[z].name = "frodo";
			
		}
		if (z == 2){
			h[z].name = "sam";

			
		}
		System.out.print(h[z].name + " is a ");
        System.out.println("good Hobbit name");

		
	}
	
   }

}

