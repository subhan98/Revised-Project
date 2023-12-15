

package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class Test{
    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage()
    {
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }
}







//import java.util.Random;
//
//public class Test {
//
//    public void setAge() {
//        int age = 33;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    // Random random = new Random();
////      int age = random.nextInt()  = {15...60};
//    int age;
//
//    public void ageTest() {
//        for (int age = 15; age <= 6; age++)
//            if (age < 15 || age > 15) {
//                System.out.println("Not Applicable");
//            } else if (age == 15 || age == 60) {
//                System.out.println("Still Applicable");
//            } else if (age == 15 || age == 60) {
//                System.out.println("Still Applicable");
//            } else {
//                System.out.println("Good Bye");
//            }
//    }
//}
//
