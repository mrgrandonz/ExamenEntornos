import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebaCalculadora {

	@Test
	void test() {
	    Calculadora calculator = new Calculadora();
        int a = 1;
        int b = 5;
        int actual = calculator.add(a, b);
     
        int expected = 5;
     
        assertEquals(expected, actual);
    }
	}


