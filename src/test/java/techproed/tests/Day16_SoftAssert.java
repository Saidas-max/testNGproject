package techproed.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day16_SoftAssert {

   @Test
    public void softAssertTest(){
       SoftAssert softAssert = new SoftAssert();

       System.out.println("l1 Code");
       softAssert.assertEquals(3,5);//FAILS
       System.out.println("Line 13 Code ");
       softAssert.assertEquals("apple","orange");// FAILS
      System.out.println("Line 15 code ");
       softAssert.assertTrue(false);//FALSE
      System.out.println("Line 17 Code ");
    softAssert.assertAll();
   }


}
