/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

package org.learningpath.designpatterns.factory.model.shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.learningpath.designpatterns.factory.model.color.ShapeType;

import java.awt.*;

/**
 * Created by EswaraP on 23-02-2017.
 */
public class Circle extends Shape {
    private static final Logger LOG = LoggerFactory.getLogger(Circle.class);

    @Override
    public ShapeType getShapeType() {
        return this.shapeType;
    }

    public Circle(ShapeType _shapeType) {
        this.shapeType = _shapeType;
    }

    public void draw(Graphics g) {
        LOG.info("i am a "+ this.getShapeType());
        g.drawOval(40,40,60,60);
    }
}
