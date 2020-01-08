/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.util.internal;

/**
 * Similar to Java8 Consumer.
 *
 * @param <T>
 *            The type of object to consume.
 */
public interface Consumer<T> {

    /**
     * Performs this operation on the given argument.
     *
     * @param t
     *            the input argument
     */
    void accept(T t);
}
