/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.tools;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.oracle.bmc.adk.client.mcp.McpClientBase;
import com.oracle.bmc.adk.error.AgentException;
import com.oracle.bmc.adk.error.UserException;
import com.oracle.bmc.adk.utils.Console;
import com.oracle.bmc.adk.utils.JsonUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Represents a tool that can be executed with a set of parameters. The tool can be created from a
 * method or a lambda expression.
 */
public class FunctionTool {
    private final String name;
    private final String description;
    private final Object instance;
    private final Method method;
    private Map<String, String> parameters = new HashMap<>();

    private static final org.slf4j.Logger log =
            org.slf4j.LoggerFactory.getLogger(FunctionTool.class);

    /**
     * Creates a new FunctionTool instance from a method.
     *
     * @param instance the instance on which the method will be invoked
     * @param method the method to be invoked
     */
    public FunctionTool(Object instance, Method method) {
        if (!method.isAnnotationPresent(Tool.class)) {
            throw new UserException("Method " + method.getName() + " is not marked as a tool");
        }

        this.name = method.getAnnotation(Tool.class).name();
        this.description = method.getAnnotation(Tool.class).description();
        this.parameters = buildParameterSchema(method, true);
        this.method = method;
        this.instance = instance;
    }

    /**
     * Creates a new FunctionTool instance with the specified properties.
     *
     * @param name the name of the tool
     * @param description the description of the tool
     * @param instance the instance on which the method will be invoked
     * @param parameters the parameters of the tool
     * @param method the method to be invoked
     */
    public FunctionTool(
            String name,
            String description,
            Object instance,
            Map<String, String> parameters,
            Method method) {
        this.name = name;
        this.description = description;
        this.instance = instance;
        this.parameters = parameters;
        this.method = method;
    }

    /**
     * Constructor to create a FunctionTool from a lambda.
     *
     * @param name the tool name
     * @param description the tool description
     * @param executor the lambda to execute the tool
     */
    public FunctionTool(String name, String description, ToolExecutor executor) {
        this.name = name;
        this.description = description;
        this.instance = executor;
        this.parameters = buildParameterSchema(executor, true);
        this.method = null; // Not using reflective method for this tool.
    }

    public static class Builder {
        private String name;
        private String description;
        private Object instance;
        private Map<String, String> parameters;
        private Method method;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder instance(Object instance) {
            this.instance = instance;
            return this;
        }

        public Builder parameters(Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder method(Method method) {
            this.method = method;
            return this;
        }

        public FunctionTool build() {
            return new FunctionTool(name, description, instance, parameters, method);
        }
    }

    /**
     * Returns a new instance of the {@link Builder} class to construct a {@link FunctionTool}.
     *
     * @return a new {@link Builder} instance
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Returns the name of this FunctionTool.
     *
     * @return the name of the FunctionTool
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the description of this FunctionTool.
     *
     * @return the description of the FunctionTool
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the instance associated with this FunctionTool. The instance is used to invoke the
     * method or execute the lambda expression that this tool represents.
     *
     * @return the instance associated with this FunctionTool
     */
    public Object getInstance() {
        return instance;
    }

    /**
     * Returns the parameters associated with this FunctionTool. The parameters are represented as a
     * map where the keys are the parameter names and the values are the corresponding parameter
     * descriptions or types.
     *
     * @return a map containing the parameters of the FunctionTool
     */
    public Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * Returns the Method associated with this FunctionTool, if it was created from a method. If the
     * FunctionTool was created from a lambda expression, this method returns null.
     *
     * @return the Method associated with this FunctionTool, or null if it was created from a lambda
     */
    public Method getMethod() {
        return method;
    }

    /**
     * Invokes the method associated with this FunctionTool with the given arguments. The arguments
     * are converted to the expected types of the method's parameters.
     *
     * @param args the arguments to be passed to the method
     * @return the result of the method invocation
     * @throws UserException if an argument cannot be converted to the expected type
     * @throws AgentException if there is an error accessing or invoking the method
     */
    public Object invoke(Object... args) {
        try {
            log.debug("invoking function: {}", method.getName());
            Class<?>[] parameterTypes = method.getParameterTypes();
            Object[] convertedArgs = new Object[args.length];

            for (int i = 0; i < args.length; i++) {
                try {
                    convertedArgs[i] = convertToType(args[i], parameterTypes[i]);
                } catch (Exception e) {
                    throw new UserException(
                            "Failed to convert argument at index "
                                    + i
                                    + " to expected type: "
                                    + parameterTypes[i].getSimpleName(),
                            e);
                }
            }
            return method.invoke(instance, convertedArgs);
        } catch (IllegalAccessException | IllegalArgumentException e) {
            throw new AgentException("Error accessing method: " + method.getName(), e);
        } catch (InvocationTargetException e) {
            throw new AgentException("Method invocation failed: " + method.getName(), e.getCause());
        }
    }

    /**
     * Creates a new FunctionTool instance from a given Method. The instance associated with this
     * FunctionTool will be null, as it is not provided. The Method must be annotated with the @Tool
     * annotation, otherwise a UserException will be thrown.
     *
     * @param method the Method to be used to create the FunctionTool
     * @return a new FunctionTool instance
     */
    public static FunctionTool fromMethod(Method method) {
        return new FunctionTool(null, method);
    }

    /**
     * Creates a new FunctionTool instance from a given method of a specified class. The method is
     * looked up using reflection based on the provided method name and parameter types. The
     * instance associated with this FunctionTool will be null.
     *
     * @param clazz the class that contains the method
     * @param methodName the name of the method to be used to create the FunctionTool
     * @param parameterTypes the parameter types of the method
     * @return a new FunctionTool instance
     * @throws JsonProcessingException if there is an error processing JSON (not directly thrown
     *     here, but declared for consistency)
     * @throws RuntimeException if the method is not found in the specified class
     */
    public static FunctionTool fromMethod(
            Class<?> clazz, String methodName, Class<?>... parameterTypes)
            throws JsonProcessingException {
        try {
            Method method = clazz.getMethod(methodName, parameterTypes);
            return new FunctionTool(null, method);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Method not found: " + methodName, e);
        }
    }

    /**
     * Builds a parameter schema for a given ToolExecutor. The schema is represented as a map
     * containing the type, properties, and required parameters of the executor.
     *
     * @param executor the ToolExecutor for which to build the parameter schema
     * @param strict a flag indicating whether to enforce strict validation of the executor's
     *     parameters
     * @return a map representing the parameter schema of the ToolExecutor
     */
    public Map<String, String> buildParameterSchema(ToolExecutor executor, boolean strict) {
        // You could define your schema logic manually for lambda executors
        Map<String, String> result = new HashMap<>();
        Map<String, String> details = new HashMap<>();
        details.put("description", "User message parameter");
        details.put("type", "String"); // Assuming String here; adapt as needed
        Map<String, Map<String, String>> properties = new HashMap<>();
        properties.put("input", details);

        List<String> required = new ArrayList<>();
        required.add("input");

        try {
            result.put("type", "object");
            result.put(
                    "properties",
                    JsonUtils.OBJECT_MAPPER
                            .writerWithDefaultPrettyPrinter()
                            .writeValueAsString(properties));
            result.put("required", JsonUtils.OBJECT_MAPPER.writeValueAsString(required));
        } catch (JsonProcessingException e) {
            throw new AgentException("Failed to serialize parameters", e);
        }
        return result;
    }

    /**
     * Builds a parameter schema for a given Method. The schema is represented as a map containing
     * the type, properties, and required parameters of the method. The method must be annotated
     * with the @Tool annotation, and its parameters must be annotated with the @Param annotation if
     * the strict flag is true.
     *
     * @param method the Method for which to build the parameter schema
     * @param strict a flag indicating whether to enforce strict validation of the method's
     *     parameters
     * @return a map representing the parameter schema of the Method
     */
    public Map<String, String> buildParameterSchema(Method method, boolean strict) {
        Map<String, String> result = new HashMap<>();
        Map<String, Map<String, String>> properties = new HashMap<>();
        List<String> required = new ArrayList<>();

        if (method.isAnnotationPresent(Tool.class)) {
            Parameter[] params = method.getParameters();
            for (Parameter param : params) {
                if (param.isAnnotationPresent(Param.class)) {
                    Param paramAnnotation = param.getAnnotation(Param.class);
                    String name = param.getName(); // relies on -parameters compiler flag
                    String type = param.getType().getSimpleName(); // or getTypeName() if needed

                    Map<String, String> details = new HashMap<>();
                    details.put("description", paramAnnotation.description());
                    details.put("type", type.toLowerCase()); // optional: lowercasing type for JSON
                    // compatibility

                    properties.put(name, details);
                    required.add(name);
                } else if (strict) {
                    throw new AgentException(
                            "Missing @Param annotation on parameter: " + param.getName());
                }
            }

            result.put("type", "object");

            try {
                result.put(
                        "properties",
                        JsonUtils.OBJECT_MAPPER
                                .writerWithDefaultPrettyPrinter()
                                .writeValueAsString(properties));
                result.put("required", JsonUtils.OBJECT_MAPPER.writeValueAsString(required));
            } catch (JsonProcessingException e) {
                throw new AgentException("Failed to serialize parameters", e);
            }
        }

        return result;
    }

    private Object convertToType(Object value, Class<?> targetType) {
        if (value == null) {
            return null;
        }

        // If it's already the correct type, return as is
        if (targetType.isInstance(value)) {
            return value;
        }

        if (value instanceof String) {
            String strValue = (String) value;

            if (targetType == int.class || targetType == Integer.class) {
                return Integer.parseInt(strValue);
            } else if (targetType == double.class || targetType == Double.class) {
                return Double.parseDouble(strValue);
            } else if (targetType == boolean.class || targetType == Boolean.class) {
                return Boolean.parseBoolean(strValue);
            } else if (targetType == long.class || targetType == Long.class) {
                return Long.parseLong(strValue);
            } else if (targetType == float.class || targetType == Float.class) {
                return Float.parseFloat(strValue);
            } else if (targetType == short.class || targetType == Short.class) {
                return Short.parseShort(strValue);
            } else if (targetType == byte.class || targetType == Byte.class) {
                return Byte.parseByte(strValue);
            } else if (targetType == char.class || targetType == Character.class) {
                if (strValue.length() == 1) {
                    return strValue.charAt(0);
                }
            }
        }
        return value;
    }

    @Override
    public String toString() {
        return "FunctionTool{name='" + name + "', description='" + description + "'}";
    }

    /** A functional interface that can be used to execute the tool. */
    @FunctionalInterface
    public interface ToolExecutor {
        Map<String, Object> execute(String input, Map<String, Object> params);
    }

    public Object execute(Map<String, Object> arguments) {
        if (this.instance instanceof ToolExecutor) {
            ToolExecutor executor = (ToolExecutor) this.instance;
            // Assume input is provided under key "input"
            String input = (String) arguments.get("input");
            if (input == null) {
                throw new IllegalArgumentException("Missing required argument: 'input'");
            }
            return executor.execute(input, arguments);
        }
        // Clean and filter arguments
        Map<String, Object> filteredArgs = prepareArguments(arguments);
        if (this.instance instanceof McpClientBase) {
            Console.debug(Console.Color.WHITE, String.format("Executing MCP tool '%s'", this.name));
            return invoke(name, filteredArgs);
        }
        List<Object> argsList = new ArrayList<>();

        for (Object value : filteredArgs.values()) {
            argsList.add(value);
        }
        Console.debug(Console.Color.WHITE, String.format("argsList:%s", argsList));

        // Convert list to array (varargs)
        Object[] args = argsList.toArray(new Object[0]);

        // Invoke the callable with the filtered arguments
        return invoke(args);
    }

    public Map<String, Object> prepareArguments(Map<String, Object> arguments) {
        // Clean up argument keys - remove any trailing colons and whitespace
        Map<String, Object> cleanedArgs =
                arguments.entrySet().stream()
                        .collect(
                                Collectors.toMap(
                                        entry ->
                                                entry.getKey()
                                                        .replaceAll(":+$", "")
                                                        .trim(), // Remove trailing colons and trim
                                        // spaces
                                        Map.Entry::getValue));

        log.debug("cleanedArgs: {}", cleanedArgs);

        String properties = null;
        if (this.parameters != null) {
            properties = this.parameters.get("properties");
        }

        JsonNode jsonNode = null;
        try {
            jsonNode = JsonUtils.OBJECT_MAPPER.readTree(properties);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("Error processing JSON from properties.", e);
        }

        log.debug("properties: {}", properties);

        Set<String> validParams = new HashSet<>();
        Iterator<String> fieldNames = jsonNode.fieldNames();

        log.debug("fieldNames: {}", fieldNames);

        while (fieldNames.hasNext()) {
            validParams.add(fieldNames.next());
        }

        log.debug("validParams: {}", validParams);

        // Filter out arguments that aren't in the function's valid parameters
        Map<String, Object> filteredArgs = new HashMap<>();
        for (Map.Entry<String, Object> entry : cleanedArgs.entrySet()) {
            if (validParams.contains(entry.getKey())) {
                filteredArgs.put(entry.getKey(), entry.getValue());
            }
        }
        log.debug("filteredArgs: {}", filteredArgs);
        return filteredArgs;
    }
}
