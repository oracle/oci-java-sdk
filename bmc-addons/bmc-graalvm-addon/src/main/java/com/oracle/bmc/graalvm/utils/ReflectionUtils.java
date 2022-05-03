/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.graalvm.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Utility methods for reflection related tasks.
 */
public class ReflectionUtils {

    /**
     * @param aClass A class
     * @return All the interfaces
     */
    public static Set<Class> getAllInterfaces(Class<?> aClass) {
        Set<Class> interfaces = new HashSet<>();
        return populateInterfaces(aClass, interfaces);
    }

    /**
     * @param aClass     A class
     * @param interfaces The interfaces
     * @return A set with the interfaces
     */
    @SuppressWarnings("Duplicates")
    protected static Set<Class> populateInterfaces(Class<?> aClass, Set<Class> interfaces) {
        Class<?>[] theInterfaces = aClass.getInterfaces();
        interfaces.addAll(Arrays.asList(theInterfaces));
        for (Class<?> theInterface : theInterfaces) {
            populateInterfaces(theInterface, interfaces);
        }
        if (!aClass.isInterface()) {
            Class<?> superclass = aClass.getSuperclass();
            while (superclass != null) {
                populateInterfaces(superclass, interfaces);
                superclass = superclass.getSuperclass();
            }
        }
        return interfaces;
    }
}
