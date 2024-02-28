package edu.ntnu.stud.chaosgame.transformations;

import edu.ntnu.stud.chaosgame.model.Complex;
import edu.ntnu.stud.chaosgame.model.Vector2D;

public class JuliaTransform extends Transform2D {

    /**
     * The complex number represented through Complex {@link Complex} which
     * is added or subtracted in the Julia transformations.
     */
    private Complex c1;

    /**
     * The sign used to determine if the Julia transformations adds or subtracts {@link Complex} c1.
     */
    int sign;

    /**
     * Constructs a JuliaTransform object defined by the input.
     * @param point The complex number {@link Complex} which is added or subtracted in the transformation.
     * @param sign An integer which determines if c1 is added or subtracted in the transformation.
     */
    public JuliaTransform(Complex point,int sign) {
        this.c1 = point;
        this.sign = sign;
    }


    /**
     * Performs a Julia-transformation on a point defined by the vector point.
     * The transformation will add or subtract c1 relative to point.
     * This depends on the sign of the integer sign.
     * Then  the method performs the sqrt method from Complex {@link Complex}.
     * @param point The vector {@link Vector2D} which transformations are performed on.
     * @return The transformed point, represented by a vector {@link Vector2D}
     */
    public Vector2D transform(Vector2D point){
        Vector2D temp1 = new Vector2D();
        if (sign > 0){
        temp1 = point.add(c1);}
        else if (sign < 0){
            temp1 = point.subtract(c1);
        }
        return new Complex(temp1.getX0(), temp1.getX1()).sqrt();
    }

}
