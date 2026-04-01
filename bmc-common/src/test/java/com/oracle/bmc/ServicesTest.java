/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import com.oracle.bmc.util.RealmSpecificEndpointTemplateUtils;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void testAddServiceEndpointTemplateForRealm() {
        Service testService1 =
                Services.serviceBuilder()
                        .serviceName("SERVICE")
                        .serviceEndpointPrefix("service")
                        .serviceEndpointTemplate("{region}.service.oci.oraclecloud.com")
                        .addServiceEndpointTemplateForRealm(
                                "oc1", "{region}.service.oci.oracle-cloud.com")
                        .build();

        assertEquals(
                "{region}.service.oci.oracle-cloud.com",
                testService1.getServiceEndpointTemplateForRealmMap().get("oc1"));
        assertEquals(null, testService1.getServiceEndpointTemplateForRealmMap().get("oc3"));

        Service testService2 =
                Services.serviceBuilder()
                        .serviceName("TEST")
                        .serviceEndpointPrefix("test")
                        .serviceEndpointTemplate("{region}.test.oci.oraclecloud.com")
                        .addServiceEndpointTemplateForRealm(
                                "oc3", "{region}.test.oci.oracle-cloud.com")
                        .addServiceEndpointTemplateForRealm(
                                "oc6", "{region}.test.oci.oracle-cloud.com")
                        .build();

        assertEquals(null, testService2.getServiceEndpointTemplateForRealmMap().get("oc1"));
        assertEquals(
                "{region}.test.oci.oracle-cloud.com",
                testService2.getServiceEndpointTemplateForRealmMap().get("oc3"));
        assertEquals(
                "{region}.test.oci.oracle-cloud.com",
                testService2.getServiceEndpointTemplateForRealmMap().get("oc6"));

        Service testService3 =
                Services.serviceBuilder()
                        .serviceName("SERVICETEST")
                        .serviceEndpointPrefix("test")
                        .serviceEndpointTemplate("{region}.servicetest.oci.oraclecloud.com")
                        .build();
        assertEquals(null, testService3.getServiceEndpointTemplateForRealmMap().get("oc1"));
        assertEquals(null, testService3.getServiceEndpointTemplateForRealmMap().get("oc3"));
        assertEquals(null, testService3.getServiceEndpointTemplateForRealmMap().get("oc6"));
    }

    @Test
    public void multipleServicesWithRealmSpecificEndpoints() {
        Boolean useOfRealmSpecificEndpointTemplateEnabledProgrammatically =
                RealmSpecificEndpointTemplateUtils
                        .getUseOfRealmSpecificEndpointTemplateEnabledProgrammatically();
        try {
            RealmSpecificEndpointTemplateUtils
                    .setUseOfRealmSpecificEndpointTemplateEnabledProgrammatically(true);

            Service s1 =
                    Services.serviceBuilder()
                            .serviceName("REALM_SPECIFIC1")
                            .serviceEndpointPrefix("realm-specific1")
                            .serviceEndpointTemplate("{region}.realm-specific1.oci.oraclecloud.com")
                            .addServiceEndpointTemplateForRealm(
                                    "oc1", "realm-specific1.{region}.oci.customer-oci.com")
                            .build();

            com.google.common /*Guava will be removed soon*/.base.Optional<String> endpoint1 =
                    Region.US_PHOENIX_1.getEndpoint(s1);
            assertEquals("realm-specific1.us-phoenix-1.oci.customer-oci.com", endpoint1.get());

            Service s2 =
                    Services.serviceBuilder()
                            .serviceName("REALM_SPECIFIC2")
                            .serviceEndpointPrefix("realm-specific2")
                            .serviceEndpointTemplate("{region}.realm-specific2.oci.oraclecloud.com")
                            .addServiceEndpointTemplateForRealm(
                                    "oc1", "realm-specific2.{region}.oci.customer-oci.com")
                            .build();

            com.google.common /*Guava will be removed soon*/.base.Optional<String> endpoint2 =
                    Region.US_PHOENIX_1.getEndpoint(s2);
            assertEquals("realm-specific2.us-phoenix-1.oci.customer-oci.com", endpoint2.get());

            com.google.common /*Guava will be removed soon*/.base.Optional<String> endpoint3 =
                    Region.US_ASHBURN_1.getEndpoint(s1);
            assertEquals("realm-specific1.us-ashburn-1.oci.customer-oci.com", endpoint3.get());
        } finally {
            RealmSpecificEndpointTemplateUtils
                    .setUseOfRealmSpecificEndpointTemplateEnabledProgrammatically(
                            useOfRealmSpecificEndpointTemplateEnabledProgrammatically);
        }
    }
}
