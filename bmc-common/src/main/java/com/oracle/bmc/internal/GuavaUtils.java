/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.internal;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Utilities helpful for eventually removing Guava.
 */
public class GuavaUtils {
    public static <P, R> Function<P, R> adaptFromGuava(
            com.google.common /*Guava will be removed soon*/.base.Function<P, R> guavaFunction) {
        return p -> guavaFunction.apply(p);
    }

    public static <P, R>
            com.google.common /*Guava will be removed soon*/.base.Function<P, R> adaptToGuava(
                    Function<P, R> javaFunction) {
        return p -> javaFunction.apply(p);
    }

    public static <R> Supplier<R> adaptFromGuava(
            com.google.common /*Guava will be removed soon*/.base.Supplier<R> guavaSupplier) {
        return () -> guavaSupplier.get();
    }

    public static <R>
            com.google.common /*Guava will be removed soon*/.base.Supplier<R> adaptToGuava(
                    Supplier<R> javaSupplier) {
        return () -> javaSupplier.get();
    }

    public static <P> Predicate<P> adaptFromGuava(
            com.google.common /*Guava will be removed soon*/.base.Predicate<P> guavaPredicate) {
        return p -> guavaPredicate.apply(p);
    }

    public static <P>
            com.google.common /*Guava will be removed soon*/.base.Predicate<P> adaptToGuava(
                    Predicate<P> javaPredicate) {
        return p -> javaPredicate.test(p);
    }

    public static <P> Optional<P> adaptFromGuava(
            com.google.common /*Guava will be removed soon*/.base.Optional<P> guavaOptional) {
        return guavaOptional.toJavaUtil();
    }

    public static <P>
            com.google.common /*Guava will be removed soon*/.base.Optional<P> adaptToGuava(
                    Optional<P> javaOptional) {
        return com.google.common /*Guava will be removed soon*/.base.Optional.fromJavaUtil(
                javaOptional);
    }
}
