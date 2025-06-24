/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.tools;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class FunctionToolTest {

    @Test
    void testConstructorWithMethod() throws Exception {
        // Create an instance with a method
        Method method =
                FunctionToolTest.class.getDeclaredMethod("myMethod", String.class, int.class);

        // Create a FunctionTool instance
        FunctionTool functionTool = new FunctionTool(this, method);

        // Verify the tool's name and description
        assertEquals("My Tool", functionTool.getName());
        assertEquals("This is my tool", functionTool.getDescription());

        // Verify the tool's parameters
        Map<String, String> parameters = functionTool.getParameters();
        assertNotNull(parameters);
        assertTrue(parameters.containsKey("type"));
        assertTrue(parameters.containsKey("properties"));
        assertTrue(parameters.containsKey("required"));

        // Verify the tool's execution
        Object result = functionTool.invoke("Hello", 42);
        assertEquals("Hello World! 42", result);
    }

    @Test
    void testConstructorWithLambda() throws Exception {
        // Create a FunctionTool instance with a lambda expression
        FunctionTool functionTool =
                new FunctionTool(
                        "My Lambda Tool",
                        "This is my lambda tool",
                        (input, params) -> {
                            Map<String, Object> result = new HashMap<>();
                            result.put("output", "Hello World!");
                            return result;
                        });

        // Verify the tool's name and description
        assertEquals("My Lambda Tool", functionTool.getName());
        assertEquals("This is my lambda tool", functionTool.getDescription());

        // Verify the tool's parameters
        Map<String, String> parameters = functionTool.getParameters();
        assertNotNull(parameters);
        assertTrue(parameters.containsKey("type"));
        assertTrue(parameters.containsKey("properties"));
        assertTrue(parameters.containsKey("required"));

        Map<String, Object> input = new HashMap<>();
        input.put("input", "anything"); // or the expected value
        Object result = functionTool.execute(input);
        assertEquals("{output=Hello World!}", result.toString());
    }

    @Test
    void testInvokeWithInvalidArguments() throws Exception {
        // Create an instance with a method
        Method method =
                FunctionToolTest.class.getDeclaredMethod("myMethod", String.class, int.class);

        // Create a FunctionTool instance
        FunctionTool functionTool = new FunctionTool(this, method);

        // Try invoking the tool with invalid arguments
        assertThrows(Exception.class, () -> functionTool.invoke("Hello", "World"));
    }

    @Test
    void testPrepareArguments() throws Exception {
        // Create an instance with a method
        Method method =
                FunctionToolTest.class.getDeclaredMethod("myMethod", String.class, int.class);

        // Create a FunctionTool instance
        FunctionTool functionTool = new FunctionTool(this, method);

        // Prepare some arguments
        Map<String, Object> arguments = new HashMap<>();
        arguments.put("param1:", "Hello");
        arguments.put("param2 ", 42);

        // Prepare the arguments using the FunctionTool
        Map<String, Object> preparedArguments = functionTool.prepareArguments(arguments);

        // Verify the prepared arguments
        assertEquals("Hello", preparedArguments.get("param1"));
        assertEquals(42, preparedArguments.get("param2"));
    }

    @Test
    void testBuildParameterSchema() throws Exception {
        // Create an instance with a method
        Method method =
                FunctionToolTest.class.getDeclaredMethod("myMethod", String.class, int.class);

        // Create a FunctionTool instance
        FunctionTool functionTool = new FunctionTool(this, method);

        // Build the parameter schema
        Map<String, String> parameterSchema = functionTool.buildParameterSchema(method, true);

        // Verify the parameter schema
        assertNotNull(parameterSchema);
        assertTrue(parameterSchema.containsKey("type"));
        assertTrue(parameterSchema.containsKey("properties"));
        assertTrue(parameterSchema.containsKey("required"));
    }

    @Tool(name = "My Tool", description = "This is my tool")
    public String myMethod(
            @Param(description = "The first parameter") String param1,
            @Param(description = "The second parameter") int param2) {
        return param1 + " World! " + param2;
    }
}
