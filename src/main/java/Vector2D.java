
public class Vector2D {
    public final float x;
    public final float y;
    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;

    }
    public Vector2D add(Vector2D vector1, Vector2D vector2) {
        return new Vector2D(vector1.x + vector2.x,vector1.y+ vector2.y);
    }
    public float dot(Vector2D vector1, Vector2D vector2){
        return (vector1.x*vector2.x + vector1.y * vector2.y);
    }
    public Vector2D scale(Vector2D vector, float multiple){
        return new Vector2D((vector.x * multiple), (vector.y*multiple));
    }
    public float magnitude(Vector2D vector){
        return (float) Math.sqrt(dot(vector,vector));
    }
    public Vector2D normalise(Vector2D vector){
        return scale(vector,(1/magnitude(vector)));
    }


}