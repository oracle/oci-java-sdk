/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.tools.prebuilt;

import com.oracle.bmc.adk.tools.Param;
import com.oracle.bmc.adk.tools.Tool;
import com.oracle.bmc.adk.tools.Toolkit;

public class CalculatorToolkit extends Toolkit {
    /** A toolkit for performing calculations */
    public CalculatorToolkit() {}

    @Tool(name = "add", description = "Add two doubles")
    public static double add(
            @Param(description = "The left operand") double left,
            @Param(description = "The right operand") double right) {
        return left + right;
    }

    @Tool(name = "subtract", description = "Subtract two doubles")
    public static double subtract(
            @Param(description = "The left operand") double left,
            @Param(description = "The right operand") double right) {
        return left - right;
    }

    /**
     * Multiply two doubles
     *
     * @param left The left operand
     * @param right The right operand
     * @return The product of the two operands
     * @throws ArithmeticException if the result overflows (is infinite or NaN)
     */
    @Tool(name = "multiply", description = "Multiply two doubles")
    public static double multiply(
            @Param(description = "The left operand") double left,
            @Param(description = "The right operand") double right) {

        double result = left * right;
        if (!Double.isFinite(result)) {
            throw new ArithmeticException("Double overflow occurred during multiplication");
        }
        return result;
    }

    @Tool(name = "divide", description = "Divide two doubles")
    public static double divide(
            @Param(description = "The left operand") double left,
            @Param(description = "The right operand") double right) {
        if (right == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return left / right;
    }

    /**
     * Raise base to the power of exponent
     *
     * @param base The base
     * @param exponent The exponent
     * @return The result of raising the base to the power of the exponent
     * @throws ArithmeticException if the result overflows or is invalid (NaN)
     */
    @Tool(name = "power", description = "Raise base to the power of exponent")
    public static double power(
            @Param(description = "The base") double base,
            @Param(description = "The exponent") double exponent) {
        double result = Math.pow(base, exponent);
        if (!Double.isFinite(result)) {
            throw new ArithmeticException("Double overflow occurred during exponentiation");
        }
        if (Double.isNaN(result)) {
            throw new ArithmeticException("Invalid operation: result is NaN");
        }
        return result;
    }

    @Tool(name = "sqrt", description = "Square root of a number")
    public static double sqrt(@Param(description = "The number to square root") double number) {
        if (number < 0) {
            throw new ArithmeticException("Cannot calculate the square root of a negative number");
        }
        return Math.sqrt(number);
    }
}
