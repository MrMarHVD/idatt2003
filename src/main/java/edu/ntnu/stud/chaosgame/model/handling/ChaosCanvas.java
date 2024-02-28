package edu.ntnu.stud.chaosgame.model.handling;

import edu.ntnu.stud.chaosgame.model.Matrix2x2;
import edu.ntnu.stud.chaosgame.model.Vector2D;
import edu.ntnu.stud.chaosgame.model.transformations.AffineTransform2D;


/**
 * Class representing the canvas for the display of the chaos game.
 */
public class ChaosCanvas {

  /**
   * Table representing the canvas.
   */
  private int[][] canvas;

  /**
   * Width of the canvas
   */
  private int width;

  /**
   * Height of the canvas
   */
  private int height;

  /**
   * The minimum coordinates of the canvas.
   */
  private Vector2D minCoords;

  /**
   * The maximum coordinates of the canvas.
   */
  private Vector2D maxCoords;

  /**
   * Affine transformation for converting coordinates to canvas indices.
   */
  private AffineTransform2D transformCoordsToIndices;

  /**
   * Parameterized constructor for the class.
   *
   * @param width width of the canvas
   * @param height height of the canvas
   * @param minCoords minimum coordinates of the canvas
   * @param maxCoords maximum coordinates of the canvas
   */
  public ChaosCanvas(int width, int height, Vector2D minCoords, Vector2D maxCoords) {
    this.width = width;
    this.height = height;
    this.minCoords = minCoords;
    this.maxCoords = maxCoords;

    this.canvas = new int[width][height];

    // Define the affine transformation that maps coordinates to indices in the canvas.
    this.transformCoordsToIndices = new AffineTransform2D(
        new Matrix2x2(0, height - 1, width - 1, 0),
        new Vector2D((((height - 1) * maxCoords.getX0()) / maxCoords.getX1()),
        ((width - 1) * minCoords.getX1()) / maxCoords.getX1())
    );
  }

  /**
   * Get a pixel located at a point.
   *
   * @param point point at which the pixel is located
   * @return the pixel
   */
  public int getPixel(Vector2D point) {
    return canvas[(int) transformCoordsToIndices.transform(point).getX0()]
        [(int) transformCoordsToIndices.transform(point).getX1()];
  }

  public void putPixel(Vector2D point) {
    canvas[(int) transformCoordsToIndices.transform(point).getX0()]
        [(int) transformCoordsToIndices.transform(point).getX1()] = 1;
  }

  /**
   * Get the canvas array.
   * @return the canvas array
   */
  public int[][] getCanvasArray() {
    return canvas;
  }

  /**
   * Clear the canvas of all content.
   */
  public void clearCanvas() {
    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        canvas[i][j] = 0;
      }
    }
  }

}
