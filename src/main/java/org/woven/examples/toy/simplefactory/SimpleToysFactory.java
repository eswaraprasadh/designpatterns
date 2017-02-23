/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

package org.woven.examples.toy.simplefactory;

import org.woven.examples.toy.exception.ToyTypeNotFoundException;
import org.woven.examples.toy.model.Toy;
import org.woven.examples.toy.model.ToyType;

/**
 * Factory class for simple factory pattern
 */
public class SimpleToysFactory {
    
    public SimpleFactory simpleFactory;
    
    public SimpleToysFactory(SimpleFactory _simpleFactory) {
        this.simpleFactory = _simpleFactory;   
    }
    public Toy produceToy(ToyType toyType) throws ToyTypeNotFoundException {
        return simpleFactory.createToy(toyType);
    }

}
