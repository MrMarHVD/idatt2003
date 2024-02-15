package edu.ntnu.stud.chaosgame.model;

/**
 * Class representing an affine transformation in 2D.

 */
public class AffineTransform2D {

  /**
   * Matrix component of the affine transformation.
   */
  private Matrix2x2 matrix;

  /**
   * Vector component of the affine transformation.
   */
  private Vector2D vector;

  /**
   * Parameterized constructor for the affine transformation.
   * @param matrix matrix
   * @param vector vector
   */
  public AffineTransform2D(Matrix2x2 matrix, Vector2D vector) {
    this.matrix = matrix;
    this.vector = vector;
  }

  /**
   * Getter for the matrix belonging to the affine transformation.
   *
   * @return the matrix
   */
  public Matrix2x2 getMatrix() {
    return matrix;
  }

  /**
   * Setter for the matrix belonging to the affine transformation.
   *
   * @param matrix the matrix to set
   */
  public void setMatrix(Matrix2x2 matrix) {
    this.matrix = matrix;
  }

  /**
   * Getter for the vector belonging to the affine transformation.
   *
   * @return the vector
   */
  public Vector2D getVector() {
    return vector;
  }

  /**
   * Setter for the vector belonging to the affine transformation.
   *
   * @param vector the vector to set
   */
  public void setVector(Vector2D vector) {
    this.vector = vector;
  }
}