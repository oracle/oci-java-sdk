/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.AlloyConfigTest;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.common.InternalBuilderAccess;
import com.oracle.bmc.helper.EnvironmentVariablesHelper;
import com.oracle.bmc.http.client.HttpProvider;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.RequestSignerFactory;
import com.oracle.bmc.http.signing.SigningStrategy;
import com.oracle.bmc.util.CircuitBreakerUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest({HttpProvider.class, InternalBuilderAccess.class})
public class AlloyClientTest extends AlloyConfigTest {

    private static class TestBaseClient extends BaseClient {
        /** Service instance for ObjectStorage. */
        public static final com.oracle.bmc.Service SERVICE =
                com.oracle.bmc.Services.serviceBuilder()
                        .serviceName("TEST")
                        .serviceEndpointPrefix("test")
                        .serviceEndpointTemplate("https://test.{region}.{secondLevelDomain}")
                        .endpointServiceName("test")
                        .build();

        private TestBaseClient(
                com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
                AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
                java.util.concurrent.ExecutorService executorService) {
            super(
                    builder,
                    authenticationDetailsProvider,
                    CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);
        }

        public static Builder builder() {
            return new Builder(SERVICE);
        }

        public static class Builder
                extends com.oracle.bmc.common.RegionalClientBuilder<
                        Builder, AlloyClientTest.TestBaseClient> {
            private java.util.concurrent.ExecutorService executorService;

            private Builder(com.oracle.bmc.Service service) {
                super(service);
                final String packageName = "testservice";
                com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(
                        packageName);
                requestSignerFactory =
                        new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                                SigningStrategy.STANDARD);
            }

            /**
             * Set the ExecutorService for the client to be created.
             *
             * @param executorService executorService
             * @return this builder
             */
            public Builder executorService(java.util.concurrent.ExecutorService executorService) {
                this.executorService = executorService;
                return this;
            }

            /**
             * Build the client.
             *
             * @param authenticationDetailsProvider authentication details provider
             * @return the client
             */
            public AlloyClientTest.TestBaseClient build(
                    @jakarta.annotation.Nonnull
                            AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
                return new AlloyClientTest.TestBaseClient(
                        this, authenticationDetailsProvider, executorService);
            }
        }

        @Override
        public void setRegion(com.oracle.bmc.Region region) {
            super.setRegion(region);
        }

        @Override
        public void setRegion(String regionId) {
            super.setRegion(regionId);
        }
    }

    BasicAuthenticationDetailsProvider mockAuthProvider;

    @Before
    public void setup() {

        mockAuthProvider = mock(BasicAuthenticationDetailsProvider.class);

        RequestSigner mockRequestSigner = mock(RequestSigner.class);

        RequestSignerFactory mockRequestSignerFactory = mock(RequestSignerFactory.class);
        when(mockRequestSignerFactory.createRequestSigner(any(), any()))
                .thenReturn(mockRequestSigner);

        PowerMockito.mockStatic(InternalBuilderAccess.class);
        PowerMockito.when(InternalBuilderAccess.getRequestSignerFactory(any()))
                .thenReturn(mockRequestSignerFactory);
        Map<SigningStrategy, RequestSignerFactory> factories = new HashMap<>();
        for (SigningStrategy s : SigningStrategy.values()) {
            factories.put(s, mockRequestSignerFactory);
        }
        PowerMockito.when(InternalBuilderAccess.getSigningStrategyRequestSignerFactories(any()))
                .thenReturn(factories);

        super.setup();
    }

    @Test
    public void testAlloyConfigClientCall_disabledService() {
        try {
            TestBaseClient client = TestBaseClient.builder().build(mockAuthProvider);
        } catch (Exception e) {
            assertEquals("IllegalArgumentException", e.getClass().getSimpleName());
            assertEquals(
                    "The Alloy configuration disabled service 'testservice'. This behavior is controlled by OCI_SDK_ENABLED_SERVICES_SET variable. Please check if your local alloy-config.json file configured the service you're targeting or contact the cloud provider on the availability of this service",
                    e.getMessage());
        }
    }

    @Test
    public void testAlloyConfigClientCall_enabledService() throws Exception {
        Map<String, String> newEnvMap = new HashMap<>();
        String alloyFile = "src/test/resources/alloy-config.json";
        newEnvMap.put("OCI_ALLOY_CONFIG_FILE_PATH", alloyFile);
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
        TestBaseClient client = TestBaseClient.builder().build(mockAuthProvider);
        assertTrue(Region.isServiceEnabled("testservice"));
    }

    @Test
    public void testAlloyConfigClientCall_unknownRegion() {
        try {
            Map<String, String> newEnvMap = new HashMap<>();
            String alloyFile = "src/test/resources/alloy-config.json";
            newEnvMap.put("OCI_ALLOY_CONFIG_FILE_PATH", alloyFile);
            EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
            TestBaseClient client =
                    TestBaseClient.builder().region("unknown").build(mockAuthProvider);
        } catch (Exception e) {
            assertEquals("IllegalArgumentException", e.getClass().getSimpleName());
            assertEquals(
                    "Unknown regionId unknown, region information not defined in Alloy configuration.",
                    e.getMessage());
        }
    }

    @Test
    public void testAlloyConfigClientCall_knownRegion() throws Exception {
        Map<String, String> newEnvMap = new HashMap<>();
        String alloyFile = "src/test/resources/alloy-config.json";
        newEnvMap.put("OCI_ALLOY_CONFIG_FILE_PATH", alloyFile);
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
        TestBaseClient client = TestBaseClient.builder().region("us-phx-1").build(mockAuthProvider);
        assertTrue(Region.isServiceEnabled("testservice"));
        assertTrue(
                Arrays.stream(Region.values())
                        .anyMatch(region -> region.getRegionId().equals("us-phx-1")));
    }

    @Test
    public void testAlloyConfigClientCall_unknownOC1Region() {
        try {
            Map<String, String> newEnvMap = new HashMap<>();
            String alloyFile = "src/test/resources/alloy-config.json";
            newEnvMap.put("OCI_ALLOY_CONFIG_FILE_PATH", alloyFile);
            EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
            TestBaseClient client =
                    TestBaseClient.builder().region(Region.US_PHOENIX_1).build(mockAuthProvider);
        } catch (Exception e) {
            assertEquals("IllegalArgumentException", e.getClass().getSimpleName());
            assertEquals(
                    "Unknown regionId us-phoenix-1, region information not defined in Alloy configuration.",
                    e.getMessage());
        }
    }

    @Test
    public void testAlloyConfigClientCall_knownOC1Region() throws Exception {
        Map<String, String> newEnvMap = new HashMap<>();
        String alloyFile = "src/test/resources/alloy-config.json";
        newEnvMap.put("OCI_ALLOY_CONFIG_FILE_PATH", alloyFile);
        EnvironmentVariablesHelper.setEnvironmentVariable(newEnvMap);
        TestBaseClient client =
                TestBaseClient.builder().region(Region.US_ASHBURN_1).build(mockAuthProvider);
        assertTrue(
                Arrays.stream(Region.values())
                        .anyMatch(region -> region.equals(Region.US_ASHBURN_1)));
    }
}
