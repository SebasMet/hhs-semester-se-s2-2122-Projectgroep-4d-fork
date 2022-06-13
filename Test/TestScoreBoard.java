import com.example.greenfuture.ScoreBoard;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestScoreBoard {

    @Test
    public void TestCheckUserID(){
        //Arrange
        ScoreBoard Check = new ScoreBoard(1,"1");
        Check.scoreboardPoints.add(new ScoreBoard(123,"1"));
        int expectedResult = 0;
        int expectedResult2 = -1;
        //Act
        int actualResult = Check.CheckForUserID("1");
        int actualResult2 = Check.CheckForUserID("21");
        //Assert
        assertEquals(expectedResult, actualResult);
        assertEquals(expectedResult2,actualResult2);
    }


    @Test
    public void TestAddPoints(){
        //Arrange
        ScoreBoard test = new ScoreBoard(1,"1");
        test.scoreboardPoints.add(new ScoreBoard(22,"2"));
        double expectedResult = 133;
        double expectedResult2 = 123;
        //Act
        test.AddPoints(111,"2");
        test.AddPoints(123, "5");
        double actualResult = test.scoreboardPoints.get(test.CheckForUserID("2")).getPoints();
        double actualResult2 =test.scoreboardPoints.get(test.CheckForUserID("5")).getPoints();
        //Assert
        assertEquals(expectedResult,actualResult,0.0001);
        assertEquals(expectedResult2,actualResult2, 0.0001);
    }
}
