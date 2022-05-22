import com.example.greenfuture.PointsAssign;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPointsAssign {


    @Test
    public void TestCalcPoints(){
        //Arrange
        double expectedResult = 34.5; // 5*9.9 = 34.5
        PointsAssign test = new PointsAssign("Auto(elektrish)", 6.9);
        //Act
        double actualResult = test.calcPoints(test, 5);
        //Assert
        assertEquals(expectedResult,actualResult);

    }
}
