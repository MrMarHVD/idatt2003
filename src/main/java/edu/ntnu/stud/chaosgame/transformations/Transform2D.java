package edu.ntnu.stud.chaosgame.transformations;

import edu.ntnu.stud.chaosgame.model.Vector2D;

/**
 * Abstract class representing transformations in a 2D-plane.
 */
public abstract class Transform2D {
    /**
     * Abstract method defining transformation in a 2D-plane.
     * @param point The vector {@link Vector2D} which transformations are performed on.
     * @return
     */
    public abstract Vector2D transform(Vector2D point);
}
