import com.example.greenfuture.ScoreBoard;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestScoreBoard {


    @Test
    public void TestAddPoints(){
        //Arrange
        ScoreBoard test = new ScoreBoard(1,1);
        test.scoreboardPoints.add(new ScoreBoard(0,2));
        test.scoreboardPoints.add(new ScoreBoard(0,4));
        int expectedResult = 111;
        int expectedResult2 = 0;
        //Act
        test.AddPoints(111,2);
        int actualResult = test.scoreboardPoints.get(0).getPoints();
        int actualResult2 =test.scoreboardPoints.get(1).getPoints();
        //Assert
        assertEquals(expectedResult,actualResult,0.0001);
        assertEquals(expectedResult2,actualResult2, 0.0001);
    }
}
