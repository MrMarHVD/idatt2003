package edu.ntnu.stud.chaosgame.model.transformations;

import edu.ntnu.stud.chaosgame.model.Matrix2x2;
import edu.ntnu.stud.chaosgame.model.Vector2D;

/**
 * Represents affine transformations in a 2D-plane by extending the abstract
 * class Transform2D {@link Transform2D}.
 */
public class AffineTransform2D extends Transform2D {


    /**
     * The matrix{@link Matrix2x2} which performs the matrix-multiplication part of the affine transformation.
     */
    Matrix2x2 matrix;

    /**
     * The vector{@link Vector2D} which is added as part of the affine transformation.
     */
    Vector2D vector;

    /**
     * Create a type of affine transformation.
     * @param inputMatrix A matrix {@link Matrix2x2} which defines the matrix-multiplication part of the affine transformation.
     * @param inputVector A vector {@link Vector2D} which defines the vector-addition part of the affine transformation.
     */
    public AffineTransform2D(Matrix2x2 inputMatrix, Vector2D inputVector){
        this.matrix = inputMatrix;
        this.vector = inputVector;
    }

    /**
     * Multiplies the matrix {@link Matrix2x2} matrix by the vector {@link Vector2D} vector and adds the vector {@link Vector2D} point.
     * @param point The vector {@link Vector2D} which transformations are performed on.
     * @return A new vector {@link Vector2D} which represents a point on a plane. The point represents a new step in the creation of fractal.
     */
    public Vector2D transform(Vector2D point){

        return matrix.multiply(point).add(vector);
    }
}
