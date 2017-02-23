/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

package org.woven.example.shape;

/**
 * Created by EswaraP on 24-02-2017.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.woven.examples.color.Color;
import org.woven.examples.color.ColorType;
import org.woven.examples.color.ShapeType;
import org.woven.examples.shape.factory.BlueSquareFactory;
import org.woven.examples.shape.factory.GreenRectangleFactory;
import org.woven.examples.shape.factory.RedCircleFactory;
import org.woven.examples.shape.model.Shape;

/**
 * Unit test for Shape and Color Factory App.
 */
@RunWith(JUnit4.class)
public class ShapeFactoryTest {

    @Test
    public void testShapeAndColor() {
        RedCircleFactory  redCircleFactory = new RedCircleFactory();
        Color targetColor = redCircleFactory.getColor();
        Shape targetShape = redCircleFactory.getShape();
        Assert.assertEquals(targetColor.getColorType(), ColorType.RED);
        Assert.assertEquals(targetShape.getShapeType(), ShapeType.CIRCLE);

        GreenRectangleFactory greenRectangleFactory = new GreenRectangleFactory();
        targetColor = greenRectangleFactory.getColor();
        targetShape = greenRectangleFactory.getShape();
        Assert.assertEquals(targetColor.getColorType(), ColorType.GREEN);
        Assert.assertEquals(targetShape.getShapeType(), ShapeType.RECTANGLE);

        BlueSquareFactory blueSquareFactory = new BlueSquareFactory();
        targetColor = blueSquareFactory.getColor();
        targetShape = blueSquareFactory.getShape();
        Assert.assertEquals(targetColor.getColorType(), ColorType.BLUE);
        Assert.assertEquals(targetShape.getShapeType(), ShapeType.SQUARE);

    }
}