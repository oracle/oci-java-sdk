/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.internal;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

import com.oracle.bmc.Realm;
import com.oracle.bmc.Region;
import com.oracle.bmc.Service;
import com.oracle.bmc.Services;

public class EndpointBuilderTest {

    @Test
    public void createEndpoint_useDefaultTemplate() {
        Service testService =
                Services.serviceBuilder()
                        .serviceEndpointPrefix("foobar")
                        .serviceName("EndpointBuilderTest1")
                        .build();
        assertEquals(
                "https://foobar.us-phoenix-1.oraclecloud.com",
                EndpointBuilder.createEndpoint(testService, Region.US_PHOENIX_1));
    }

    @Test
    public void createEndpoint_useCustomTemplate() {
        Service testService =
                Services.serviceBuilder()
                        .serviceEndpointPrefix("foobar")
                        .serviceName("EndpointBuilderTest2")
                        .serviceEndpointTemplate("https://foobar2.{region}.oracle.com")
                        .build();
        assertEquals(
                "https://foobar2.us-phoenix-1.oracle.com",
                EndpointBuilder.createEndpoint(testService, Region.US_PHOENIX_1));
    }

    @Test
    public void createEndpoint_useCustomTemplate_allTemplatesUsed() {
        Service testService =
                Services.serviceBuilder()
                        .serviceEndpointPrefix("foobar")
                        .serviceName("EndpointBuilderTest3")
                        .serviceEndpointTemplate(
                                "http://{serviceEndpointPrefix}.{region}.{secondLevelDomain}")
                        .build();
        assertEquals(
                "http://foobar.us-phoenix-1.oraclecloud.com",
                EndpointBuilder.createEndpoint(testService, Region.US_PHOENIX_1));
    }

    @Test
    public void createEndpoint_withOverrideRegionId() {
        Region fakeRegion = Region.register("createEndpoint-withOverrideRegionId", Realm.OC1);
        Service testServiceWithCustomTemplate =
                Services.serviceBuilder()
                        .serviceEndpointPrefix("foobar")
                        .serviceName("EndpointBuilderTest4.1")
                        .serviceEndpointTemplate(
                                "http://{serviceEndpointPrefix}.{region}.{secondLevelDomain}")
                        .build();
        Service testServiceWithDefaultTemplate =
                Services.serviceBuilder()
                        .serviceEndpointPrefix("foobar")
                        .serviceName("EndpointBuilderTest4.2")
                        .build();

        assertEquals(
                "http://foobar.createendpoint-withoverrideregionid.oraclecloud.com",
                EndpointBuilder.createEndpoint(testServiceWithCustomTemplate, fakeRegion));
        assertEquals(
                "https://foobar.createendpoint-withoverrideregionid.oraclecloud.com",
                EndpointBuilder.createEndpoint(testServiceWithDefaultTemplate, fakeRegion));

        EndpointBuilder.overrideRegionId(fakeRegion.getRegionId(), "fake");

        assertEquals(
                "http://foobar.fake.oraclecloud.com",
                EndpointBuilder.createEndpoint(testServiceWithCustomTemplate, fakeRegion));
        assertEquals(
                "https://foobar.fake.oraclecloud.com",
                EndpointBuilder.createEndpoint(testServiceWithDefaultTemplate, fakeRegion));
    }
}
