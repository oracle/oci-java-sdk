/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import com.oracle.bmc.helper.EnvironmentVariablesHelper;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class ClientRuntimeTest {

    // This test checks the values of all the parameters used to form the user agent.
    @Test
    public void checkUserAgentParameters() throws Exception {
        String userAgent = ClientRuntime.getRuntime().getUserAgent();
        assertTrue(userAgent.contains(ClientRuntime.getRuntime().getClientInfo()));
        assertTrue(userAgent.contains(System.getProperty("os.name")));
        assertTrue(userAgent.contains(System.getProperty("os.version")));
        assertTrue(userAgent.contains(System.getProperty("java.version")));
        assertTrue(userAgent.contains(System.getProperty("java.vm.name")));
        assertTrue(userAgent.contains(System.getProperty("java.vm.version")));
    }
}
