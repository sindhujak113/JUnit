package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.my.SimpleOperations;

class countLengthTest {

	@Test
	void test() {
		SimpleOperations oper = new SimpleOperations();
		
		//success
		int len = oper.countLength("MyNameIsSindhuja");
		assertEquals(16, len);
		
		/*
		//failure
		int len1 = oper1.countLength("MyNameIsSindhuja");
		assertEquals(22, len1);*/
		
	}

}
