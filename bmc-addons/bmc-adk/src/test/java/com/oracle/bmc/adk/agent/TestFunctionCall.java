/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adk.agent;

import com.oracle.bmc.adk.tools.Param;
import com.oracle.bmc.adk.tools.Tool;
import com.oracle.bmc.adk.tools.Toolkit;

public class TestFunctionCall extends Toolkit {

    @Tool(name = "add", description = "Add two doubles")
    public static double add(
            @Param(description = "The left operand") double left,
            @Param(description = "The right operand") double right) {
        /**
         * Add two doubles
         *
         * @param left The left operand
         * @param right The right operand
         * @return The sum of the two operands
         */
        return left + right;
    }
}
