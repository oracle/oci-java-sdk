/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import org.junit.BeforeClass;
import org.junit.Test;

public class ServicesTest {

    @BeforeClass
    public static void setup() {
        Services.serviceBuilder().serviceName("FOO").serviceEndpointPrefix("foo").build();
    }

    @Test
    public void addNewService() {
        Services.serviceBuilder().serviceName("NEW").serviceEndpointPrefix("new").build();
    }

    @Test
    public void addExistingService_sameDefinition() {
        Services.serviceBuilder().serviceName("FOO").serviceEndpointPrefix("foo").build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void addExistingService_conflictingEndpointPrefix() {
        Services.serviceBuilder().serviceName("FOO").serviceEndpointPrefix("bar").build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void addExistingService_conflictingEndpointTemplate() {
        Services.serviceBuilder()
                .serviceName("FOO")
                .serviceEndpointPrefix("foo")
                .serviceEndpointTemplate("{region}.foo.oci.oraclecloud.com")
                .build();
    }

    @Test(expected = NullPointerException.class)
    public void addService_noName() {
        Services.serviceBuilder().build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void addService_blankServiceName() {
        Services.serviceBuilder().serviceName("").build();
    }
}
