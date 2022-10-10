package ru.netology.statictiks;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

 class StatictiksServiceTest {
     @Test
     void findMax() {
         StatictiksService service = new StatictiksService();

         long[] incomesInBillions = {5, 12, 8, 4, 5, 3, 8, 6, 11, 11, 12};
         long expected = 12;

         long actual = service.findMax(incomesInBillions);

         assertEquals(expected, actual);
     }
 }
class StatictiksServiceTest{
    @Test
    void findMax() {
        StatictiksService service = new StatictiksService();
     
        long[] incomesInBillions = {-5, -12, -8, -4, -5, -3, -8, -6, -11, -11, -12};
        long expected = -12;
     
        long actual = service.findMax(incomeInBillions);
     
        assertEquals(expected, actual);
    }
}

class StatictiksServiceTest{
     @Test
     void findMax() {
      StaticticksService service = new StatictiksService();
      
      long[] incomesInBillions = {0}
      long expected = 0;
      
      long actual = service.findMax(incomeInBillions);
      
      assertEquals(expected, actual);
     }
}
