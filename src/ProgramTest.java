import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProgramTest {

	
	
	@Test
	void test() {
		String result =  "Rental Record for joe\n" +
				 		 "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n" +
				 		 "\t" + "Movie 1" + "\t" + "\t" + "10" + "\t" + "30.0" + "\n" +
				 		 "\t" + "Movie 2" + "\t" + "\t" + "5" + "\t" + "4.5" + "\n" +
				 		 "Amount owed is " + "34.5" + "\n" +
				 		 "You earned " + "3" + " frequent renter points";
		
        Customer c_1 = new Customer("joe");
        Movie m_1 = new Movie("Movie 1", 1);
        Movie m_2 = new Movie("Movie 2", 2);
        Rental r_1 = new Rental(m_1, 10);
        Rental r_2 = new Rental(m_2, 5);
        c_1.addRental(r_1);
        c_1.addRental(r_2);
        String test = c_1.statement();
        assertEquals(result, test);
	}

}
