package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.my.SimpleOperations;

class sumTest {

	@Test
	void test() {
		SimpleOperations oper = new SimpleOperations();
		
		//success
		int sum = oper.sumOf(10,20);
		assertEquals(30, sum);
		
		/*
		//failure
		int sum1 = oper.sumOf(10,20);
		assertEquals(50, sum1);
		*/
	}

}
