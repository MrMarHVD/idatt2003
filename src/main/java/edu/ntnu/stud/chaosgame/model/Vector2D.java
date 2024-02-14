package edu.ntnu.stud.chaosgame.model;

/**
 * Class representing a 2D vector.
 */
public class Vector2D {

  /**
   * The x0 component of the vector.
   */
  private double x0;

  /**
   * The x1 component of the vector.
   */
  private double x1;

  /**
   * Create a new 2D vector; default constructor.
   */
  public Vector2D() {}

  /**
   * Create a new 2D vector; parameterized.
   *
   * @param x0 The x0 component of the vector.
   * @param x1 The x1 component of the vector.
   */
  public Vector2D(double x0, double x1) {
    this.x0 = x0;
    this.x1 = x1;
  }

  /**
   * Get the x0 component of the vector.
   *
   * @return The x0 component of the vector.
   */
  public double getX0() {
    return x0;
  }

  /**
   * Get the x1 component of the vector.
   *
   * @return The x1 component of the vector.
   */
  public double getX1() {
    return x1;
  }

  /**
   * Add another vector to this vector.
   *
   * @param other The other vector to add.
   * @return A new vector that is the sum of this vector and the other vector.
   */
  public Vector2D add(Vector2D other) {
    return new Vector2D(x0 + other.x0, x1 + other.x1);
  }

  /**
   * Subtract another vector from this vector.
   *
   * @param other The other vector to subtract.
   * @return A new vector that is the difference between this vector and the other vector.
   */
  public Vector2D subtract(Vector2D other) {
    return new Vector2D(x0 - other.x0, x1 - other.x1);
  }

}
