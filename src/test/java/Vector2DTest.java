import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static com.google.common.truth.Truth.assertThat;

@RunWith(JUnit4.class)
public class Vector2DTest {
    @Test
    public void addtest1(){
        Vector2D V2D = new Vector2D(0,0);
        Vector2D vector1 = new Vector2D(1,2);
        Vector2D vector2 = new Vector2D(3,4);
        Vector2D vector_result = V2D.add(vector1,vector2);
        Vector2D answer = new Vector2D(4,6);

        assertThat(vector_result.x).isEqualTo(answer.x);
        assertThat(vector_result.y).isEqualTo(answer.y);
    }
    @Test
    public void addtest2(){
        Vector2D V2D = new Vector2D(0,0);
        Vector2D vector1 = new Vector2D(1,2);
        Vector2D vector2 = new Vector2D(0,0);
        Vector2D vector_result = V2D.add(vector1,vector2);
        Vector2D answer = new Vector2D(1,2);

        assertThat(vector_result.x).isEqualTo(answer.x);
        assertThat(vector_result.y).isEqualTo(answer.y);
    }
    @Test
    public void addtest3(){
        Vector2D V2D = new Vector2D(0,0);
        Vector2D vector1 = new Vector2D(1,2);
        Vector2D vector2 = new Vector2D(-3,-3);
        Vector2D vector_result = V2D.add(vector1,vector2);
        Vector2D answer = new Vector2D(-2,-1);

        assertThat(vector_result.x).isEqualTo(answer.x);
        assertThat(vector_result.y).isEqualTo(answer.y);
    }
    @Test
    public void scalartest1() {
        Vector2D V2D = new Vector2D(0, 0);
        Vector2D vector1 = new Vector2D(1, 2);
        Vector2D vector2 = new Vector2D(3, 4);
        float result = V2D.dot(vector1, vector2);

        assertThat(result).isEqualTo(11);
    }
    @Test
    public void scalartest2() {
        Vector2D V2D = new Vector2D(0, 0);
        Vector2D vector1 = new Vector2D(1, 2);
        Vector2D vector2 = new Vector2D(0, 0);
        float result = V2D.dot(vector1, vector2);

        assertThat(result).isEqualTo(0);
    }
    @Test
    public void scalartest3() {
        Vector2D V2D = new Vector2D(0, 0);
        Vector2D vector1 = new Vector2D(1, 2);
        Vector2D vector2 = new Vector2D(3, -4);
        float result = V2D.dot(vector1, vector2);

        assertThat(result).isEqualTo(-5);
    }
    @Test
    public void magnitudetest1(){
        Vector2D V2D = new Vector2D(0, 0);
        Vector2D vector1 = new Vector2D(3, 4);
        float result = V2D.magnitude(vector1);
        assertThat(result).isEqualTo(5);

    }
    @Test
    public void magnitudetest2(){
        Vector2D V2D = new Vector2D(0, 0);
        Vector2D vector1 = new Vector2D(3, 0);
        float result = V2D.magnitude(vector1);
        assertThat(result).isEqualTo(3);
    }
    @Test
    public void magnitudetest3(){
        Vector2D V2D = new Vector2D(0, 0);
        Vector2D vector1 = new Vector2D(3, -4);
        float result = V2D.magnitude(vector1);
        assertThat(result).isEqualTo(5);
    }
    @Test
    public void normliasetest1(){
        Vector2D V2D = new Vector2D(0, 0);
        Vector2D vector1 = new Vector2D(3, 4);
        Vector2D vector_result = V2D.normalise(vector1);
        assertThat(vector_result.x).isEqualTo(0.6f);
        assertThat(vector_result.y).isEqualTo(0.8f);
    }
    @Test
    public void normliasetest2(){
        Vector2D V2D = new Vector2D(0, 0);
        Vector2D vector1 = new Vector2D(9, -12);
        Vector2D vector_result = V2D.normalise(vector1);
        assertThat(vector_result.x).isWithin(1E-7f).of((float)((double)9/(double)15));
        assertThat(vector_result.y).isWithin(1E-7f).of((float)((double)(-12)/(double)15));
    }
    @Test
    public void normliasetest3(){
        Vector2D V2D = new Vector2D(0, 0);
        Vector2D vector1 = new Vector2D(3, 0);
        Vector2D vector_result = V2D.normalise(vector1);
        assertThat(vector_result.x).isEqualTo(1f);
        assertThat(vector_result.y).isEqualTo(0f);
    }




}
