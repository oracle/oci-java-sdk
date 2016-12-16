/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.util.internal;

import java.lang.reflect.Method;

/**
 * Various utility functions to simplify reflection use cases.
 * <p>
 * This is primarily meant to be used with "safe" classes such that
 * there shouldn't be a need to use AccessController to do
 * priviledged actions.
 */
public class ReflectionUtils {
    private static final Class<?>[] NO_ARGS = new Class[0];

    /**
     * Invokes a 'getter' method of the given name on the given instance.
     * The method is assumed to be a basic getter with no parameters.
     * If no method exists, or there is an problem invoking the method, null
     * will be returned.
     *
     * @param instance The instance to invoke the method on.
     * @param methodName The method name, if it exists.
     * @return The return value of the method call, or null.
     */
    public static Object invokeGetter(Object instance, String methodName) {
        try {
            Method method = instance.getClass().getMethod(methodName, NO_ARGS);
            return method.invoke(instance, NO_ARGS);
        } catch (Exception e) {
            return null;
        }
    }
}
