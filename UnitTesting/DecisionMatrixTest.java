package UnitTesting;

import src.DecisionMatrix;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//coded by Randy Lee
public class DecisionMatrixTest {
    DecisionMatrix test = new DecisionMatrix();
    String file = "0-0.txt", user = "yes";
    String[] files_part2 = {"0","0","txt"}, answers = {"1) yes", "2) no"};
    public static void main(String args[]){

    }

    @Test
    void testLetsSplit() {
        assertArrayEquals(test.letsSplit(file),files_part2);
    }
    @Test
    void testAnythingElseYes(){
        assertTrue("loop.txt".equalsIgnoreCase(test.anythingElse(user)));
    }
    @Test
    void testAnythingElseNo(){
        assertTrue("end.txt".equalsIgnoreCase(test.anythingElse("no")));
    }
    @Test
    void testThreeOrTwoYes(){
        assertTrue("00-0.txt".equals(test.threeOrTwo(2,user,answers,files_part2,file)));
    }
    @Test
    void testThreeOrTwoNo(){
        assertTrue("01-0.txt".equals(test.threeOrTwo(2,"no",answers,files_part2,file)));
    }
    @Test
    void testDoesOrDid(){
        assertTrue("anythingElse-0.txt".equals(test.doesOrDid("Did", user, answers)));
    }
}
