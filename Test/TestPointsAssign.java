import com.example.greenfuture.PointsAssign;
import com.example.greenfuture.Trip;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPointsAssign {


    @Test
    public void TestCalcPoints(){
        //Arrange
        int expectedResult = 21; // 3 * 7 = 21
        int expectedResult2 = 36; // 2 * 18 = 36
        int expectedResult3 = 80; // 4 * 20 = 72
        int expectedResult4 = 60; // 5 * 12 = 72
        int expectedResult5 = 9; // 3 * 3 = 9
        int expectedResult6 = 0; // 3 * 0 = 0
        PointsAssign test = new PointsAssign();
        //Act
        int actualResult = test.calcPoints(new Trip("Bus",3,"henk"));
        int actualresult2 = test.calcPoints(new Trip("Benzine auto", 2 ,"Bert"));
        int actualresult3 = test.calcPoints(new Trip("Diesel auto", 4 ,"Bert2"));
        int actualresult4 = test.calcPoints(new Trip("Hybride auto", 5 ,"Bert3"));
        int actualresult5 = test.calcPoints(new Trip("Elektrische auto", 3 ,"Bert4"));
        int actualresult6 = test.calcPoints(new Trip("Fiets", 3 ,"Bert5"));
        //Assert
        assertEquals(expectedResult,actualResult);
        assertEquals(expectedResult2,actualresult2);
        assertEquals(expectedResult3,actualresult3);
        assertEquals(expectedResult4,actualresult4);
        assertEquals(expectedResult5,actualresult5);
        assertEquals(expectedResult6,actualresult6);
    }
}
