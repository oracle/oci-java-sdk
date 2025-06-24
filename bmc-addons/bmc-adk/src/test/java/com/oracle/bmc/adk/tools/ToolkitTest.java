/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.tools;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class ToolkitTest {

    @Test
    public void testGetRegisteredTools() throws NoSuchMethodException {
        Toolkit toolkit = new Toolkit();
        Map<String, FunctionTool> registeredTools = toolkit.getFunctions();
        assertNotNull(registeredTools);
        assertTrue(registeredTools.isEmpty());

        // Add a tool and verify it's included in the registered tools
        toolkit.addFunctionTool(getClass().getMethod("testMethod", String.class, String.class));
        registeredTools = toolkit.getFunctions();
        assertFalse(registeredTools.isEmpty());
    }

    @Test
    public void testAddFunctionTool() throws NoSuchMethodException {
        Toolkit toolkit = new Toolkit();
        Method method = getClass().getMethod("testMethod", String.class, String.class);
        toolkit.addFunctionTool(method);
        Map<String, FunctionTool> registeredTools = toolkit.getFunctions();

        assertFalse(registeredTools.isEmpty());
        assertTrue(registeredTools.containsKey("testTool"));
    }

    @Test
    public void testToString() throws NoSuchMethodException {
        Toolkit toolkit = new Toolkit("MyToolkit");
        String toString = toolkit.toString();
        assertTrue(toString.startsWith("<Toolkit name=MyToolkit functions="));
        assertTrue(toString.endsWith(">"));

        // Add a tool and verify its inclusion in the toString output
        toolkit.addFunctionTool(getClass().getMethod("testMethod", String.class, String.class));
        toString = toolkit.toString();
        assertTrue(toString.contains("testTool"));
    }

    @Test
    public void testAutoRegistrationOfAnnotatedMethods() throws NoSuchMethodException {
        Toolkit toolkit = new AnnotatedToolkit();
        Map<String, FunctionTool> registeredTools = toolkit.getFunctions();
        assertFalse(registeredTools.isEmpty());
        assertTrue(registeredTools.containsKey("annotatedMethod"));
    }

    @Tool(name = "testTool", description = "A test tool")
    public String testMethod(
            @Param(description = "The first parameter") String param1,
            @Param(description = "The second parameter") String param2) {
        return param1 + " World! " + param2;
    }

    public static class AnnotatedToolkit extends Toolkit {
        @Tool(name = "annotatedMethod", description = "This is my tool")
        public String annotatedMethod(
                @Param(description = "The first parameter") String param1,
                @Param(description = "The second parameter") int param2) {
            return param1 + " World! " + param2;
        }
    }
}
