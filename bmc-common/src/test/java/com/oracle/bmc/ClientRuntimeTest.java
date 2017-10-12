/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ClientRuntimeTest {
    @Test
    public void setClientUserAgent() {
        String clientUserAgent = "foobar";
        ClientRuntime.setClientUserAgent(clientUserAgent);
        String userAgent = ClientRuntime.getRuntime().getUserAgent();
        assertTrue(userAgent.contains(clientUserAgent));
    }
}
