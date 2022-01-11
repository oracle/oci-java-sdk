/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
