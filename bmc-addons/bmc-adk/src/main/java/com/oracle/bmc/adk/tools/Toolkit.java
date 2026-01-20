/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.tools;

import com.oracle.bmc.adk.error.AgentException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Represents a collection of tools that can be used to perform various tasks. A toolkit is
 * initialized with a descriptive name and can automatically register methods marked with the {@link
 * Tool} annotation.
 */
public class Toolkit {
    private static final Logger log = LoggerFactory.getLogger(Toolkit.class);

    /** The name of this toolkit. */
    private final String name;

    /** A map of functions in this toolkit, keyed by their names. */
    private final Map<String, FunctionTool> functions;

    /**
     * Initializes a new Toolkit with the given name.
     *
     * @param name a descriptive name for the toolkit
     */
    public Toolkit(String name) {
        this.name = name;
        this.functions = new HashMap<>();

        for (Method method : this.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(Tool.class)) {
                addFunctionTool(method);
            }
        }
    }

    /**
     * Initializes a new Toolkit with the given name and a predefined map of functions.
     *
     * @param name the descriptive name for the toolkit
     * @param functions a map of functions to be included in the toolkit, keyed by their names
     */
    public Toolkit(String name, Map<String, FunctionTool> functions) {
        this.name = name;
        this.functions = functions;
    }

    /** Initializes a new Toolkit with a default name. */
    public Toolkit() {
        this("toolkit");
    }

    /**
     * Returns a map of all functions in this toolkit.
     *
     * @return a map of functions, keyed by their names
     */
    public Map<String, FunctionTool> getFunctions() {
        return this.functions;
    }

    @Override
    public String toString() {
        return String.format("<Toolkit name=%s functions=%s>", name, functions.keySet());
    }

    /**
     * Adds a new tool to this toolkit based on the given method.
     *
     * @param method the method to be used to create the tool
     * @throws NullPointerException if the method is null
     */
    public void addFunctionTool(Method method) {
        if (method == null) {
            throw new AgentException("method must not be null");
        }
        FunctionTool functionTool = new FunctionTool(null, method);
        functions.put(functionTool.getName(), functionTool);
    }
}
