package edu.ntnu.stud.chaosgame.model;

/**
 * Class representing a complex number.
 */
public class Complex extends Vector2D{

  /**
   * Create a new complex number.
   */
  public Complex(double real, double imag) {
    super(real, imag);
  }

  /**
   * Get the square root of the complex number.
   *
   * @return The square root of the complex number.
   */
  public Complex sqrt() {
    double r = Math.sqrt(Math.sqrt(getX0() * getX0() + getX1() * getX1()));
    double theta = Math.atan2(getX1(), getX0()) / 2;
    return new Complex(r * Math.cos(theta), r * Math.sin(theta));
  }

}
