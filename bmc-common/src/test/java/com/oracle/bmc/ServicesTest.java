/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

import org.junit.BeforeClass;
import org.junit.Test;

public class ServicesTest {

    @BeforeClass
    public static void setup() {
        final Service fooService =
                Services.serviceBuilder().serviceName("FOO").serviceEndpointPrefix("foo").build();
    }

    @Test
    public void addNewService() {
        final Service newService =
                Services.serviceBuilder().serviceName("NEW").serviceEndpointPrefix("new").build();
    }

    @Test
    public void addExistingService() {
        final Service fooService =
                Services.serviceBuilder().serviceName("FOO").serviceEndpointPrefix("foo").build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void addExistingService_ConflictingEndpointPrefix() {
        final Service fooService =
                Services.serviceBuilder().serviceName("FOO").serviceEndpointPrefix("bar").build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void addExistingService_ConflictingEndpointTemplate() {
        final Service fooService =
                Services.serviceBuilder()
                        .serviceName("FOO")
                        .serviceEndpointPrefix("foo")
                        .serviceEndpointTemplate("{region}.foo.oci.oraclecloud.com")
                        .build();
    }

    @Test(expected = NullPointerException.class)
    public void addService_NoName() {
        final Service noNameService = Services.serviceBuilder().build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void addService_BlankName() {
        final Service blankNameService = Services.serviceBuilder().serviceName("").build();
    }
}
