/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.internal;

import static junit.framework.TestCase.assertEquals;

import com.oracle.bmc.helper.EnvironmentVariablesHelper;
import org.junit.Test;

import com.oracle.bmc.Realm;
import com.oracle.bmc.Region;
import com.oracle.bmc.Service;
import com.oracle.bmc.Services;

import java.util.HashMap;
import java.util.Map;

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

    @Test
    public void createEndpoint_useRealmSpecificEndpointTemplateIfPresentAndIfEnvVarIsTrue()
            throws Exception {
        Map<String, String> newEnvMap = new HashMap<>();
        newEnvMap.put("OCI_REALM_SPECIFIC_SERVICE_ENDPOINT_TEMPLATE_ENABLED", "TRUE");
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
        Service testService =
                Services.serviceBuilder()
                        .serviceEndpointPrefix("foobar")
                        .serviceName("EndpointBuilderTest5")
                        .serviceEndpointTemplate(
                                "http://{serviceEndpointPrefix}.{region}.{secondLevelDomain}")
                        .addServiceEndpointTemplateForRealm(
                                "oc1",
                                "http://{fooParameter+Dot}{serviceEndpointPrefix}.{region}.{secondLevelDomain}")
                        .addServiceEndpointTemplateForRealm(
                                "oc3",
                                "http://{barParameter+Dot}{serviceEndpointPrefix}.{region}.{secondLevelDomain}")
                        .build();
        assertEquals(
                "http://{fooParameter+Dot}foobar.us-phoenix-1.oraclecloud.com",
                EndpointBuilder.createEndpoint(testService, Region.US_PHOENIX_1));
    }

    @Test
    public void
            createEndpoint_useCustomTemplateIfEnvVarIsTrueButRealmSpecificEndpointTemplateNotDefined()
                    throws Exception {
        Map<String, String> newEnvMap = new HashMap<>();
        newEnvMap.put("OCI_REALM_SPECIFIC_SERVICE_ENDPOINT_TEMPLATE_ENABLED", "True");
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
        Service testService =
                Services.serviceBuilder()
                        .serviceEndpointPrefix("foobar")
                        .serviceName("EndpointBuilderTest6")
                        .serviceEndpointTemplate(
                                "http://{serviceEndpointPrefix}.{region}.{secondLevelDomain}")
                        .build();
        assertEquals(
                "http://foobar.us-phoenix-1.oraclecloud.com",
                EndpointBuilder.createEndpoint(testService, Region.US_PHOENIX_1));
    }

    @Test
    public void createEndpoint_useCustomTemplateIfEnvVarIsFalse() throws Exception {
        Map<String, String> newEnvMap = new HashMap<>();
        newEnvMap.put("OCI_REALM_SPECIFIC_SERVICE_ENDPOINT_TEMPLATE_ENABLED", "FalSe");
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
        Service testService =
                Services.serviceBuilder()
                        .serviceEndpointPrefix("foobar")
                        .serviceName("EndpointBuilderTest7")
                        .serviceEndpointTemplate(
                                "http://{serviceEndpointPrefix}.{region}.{secondLevelDomain}")
                        .addServiceEndpointTemplateForRealm(
                                "oc1",
                                "http://{serviceParameter+Dot}{serviceEndpointPrefix}.{region}.{secondLevelDomain}")
                        .build();
        assertEquals(
                "http://foobar.us-phoenix-1.oraclecloud.com",
                EndpointBuilder.createEndpoint(testService, Region.US_PHOENIX_1));
    }

    @Test
    public void testEndpointWithPopulatedServiceParamsWithNoRequiredParams() {
        Service testService =
                Services.serviceBuilder()
                        .serviceEndpointPrefix("foobar")
                        .serviceName("EndpointBuilderTest8")
                        .serviceEndpointTemplate(
                                "http://{serviceEndpointPrefix}.{region}.{secondLevelDomain}")
                        .addServiceEndpointTemplateForRealm(
                                "oc1",
                                "http://testservice.{serviceParameter+Dot}us-phoenix-1.oraclecloud.com")
                        .build();
        Map<String, Object> requiredParametersMap = new HashMap<>();

        assertEquals(
                "http://testservice.us-phoenix-1.oraclecloud.com",
                EndpointBuilder.getEndpointWithPopulatedServiceParams(
                        testService.getServiceEndpointTemplateForRealmMap().get("oc1"),
                        requiredParametersMap));
    }

    @Test
    public void testEndpointWithPopulatedServiceParamsWithRequiredParams() {
        Service testService =
                Services.serviceBuilder()
                        .serviceEndpointPrefix("foobar")
                        .serviceName("EndpointBuilderTest9")
                        .serviceEndpointTemplate(
                                "http://{serviceEndpointPrefix}.{region}.{secondLevelDomain}")
                        .addServiceEndpointTemplateForRealm(
                                "oc1",
                                "http://testservice.{serviceParameter1}{serviceParameter2+Dot}us-phoenix-1.{serviceParameter3}oraclecloud.com")
                        .build();
        Map<String, Object> requiredParametersMap = new HashMap<>();
        requiredParametersMap.put("serviceParameter1", "sp1");
        requiredParametersMap.put("serviceParameter2", "sp2");

        assertEquals(
                "http://testservice.sp1sp2.us-phoenix-1.oraclecloud.com",
                EndpointBuilder.getEndpointWithPopulatedServiceParams(
                        testService.getServiceEndpointTemplateForRealmMap().get("oc1"),
                        requiredParametersMap));
    }
}
