package edu.ntnu.stud.model;

/**
 * Class representing a 2x2 matrix.
 */
public class Matrix2x2 {

  /**
   * The a00 component of the matrix.
   */
  private double a00;

  /**
   * The a01 component of the matrix.
   */
  private double a01;

  /**
   * The a10 component of the matrix.
   */
  private double a10;

  /**
   * The a11 component of the matrix.
   */
  private double a11;

  /**
   * Create a new 2x2 matrix.
   *
   * @param a00 The a00 component of the matrix.
   * @param a01 The a01 component of the matrix.
   * @param a10 The a10 component of the matrix.
   * @param a11 The a11 component of the matrix.
   */
  public Matrix2x2(double a00, double a01, double a10, double a11) {
    this.a00 = a00;
    this.a01 = a01;
    this.a10 = a10;
    this.a11 = a11;
  }

  /**
   * Multiply the matrix by a vector., i.e. compute the product of the matrix and the vector.
   *
   * @return The a00 component of the matrix.
   */
  public Vector2D multiply(Vector2D v) {
    return new Vector2D(a00 * v.getX0() + a01 * v.getX1(), a10 * v.getX0() + a11 * v.getX1());
  }

}
