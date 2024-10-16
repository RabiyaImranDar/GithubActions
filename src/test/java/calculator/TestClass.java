package calculator;

import Calculator.MyClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test
    public void testAdd(){
        MyClass myClass = new MyClass();
        assertEquals(3, myClass.add(1,2));
        assertEquals(0, myClass.add(-1,1));
        assertEquals(0, myClass.add(0,0));
    }

}
