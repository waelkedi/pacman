/******************************************************************************
 * This work is applicable to the conditions of the MIT License,              *
 * which can be found in the LICENSE file, or at                              *
 * https://github.com/philippwinter/pacman/blob/master/LICENSE                *
 *                                                                            *
 * Copyright (c) 2013 Philipp Winter, Jonas Heidecke & Niklas Kaddatz         *
 ******************************************************************************/

package model;

/**
 * @author Philipp Winter
 * @author Jonas Heidecke
 * @author Niklas Kaddatz
 */
public class Position {

    private int x;

    private int y;

    private MapObjectContainer onPosition;

    public Position(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public int getX() {
        return x;
    }

    private void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    private void setY(int y) {
        this.y = y;
    }

    public MapObjectContainer getOnPosition() {
        return onPosition;
    }

    public void setOnPosition(MapObjectContainer onPosition) {
        this.onPosition = onPosition;
    }

    public double calcDistance(Position pos) {
        // A little bit of math, using Pythagoras' Theorem
        return Math.sqrt(
                Math.pow(this.getX() - pos.getX(), 2) +
                Math.pow(this.getY() - pos.getY(), 2)
        );
    }
}