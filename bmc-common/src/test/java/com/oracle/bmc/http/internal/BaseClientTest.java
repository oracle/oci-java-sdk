/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ResourcePrincipalAuthenticationDetailsProvider;
import com.oracle.bmc.common.InternalBuilderAccess;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpProvider;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.HttpResponse;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.RequestSignerFactory;
import com.oracle.bmc.http.signing.SigningStrategy;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.util.CircuitBreakerUtils;
import com.oracle.bmc.util.internal.Validate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;

import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({HttpProvider.class, InternalBuilderAccess.class})
public class BaseClientTest {
    @Test
    public void testCloseWithoutEndpoint() {
        HttpProvider mockHttpProvider = mock(HttpProvider.class);

        PowerMockito.mockStatic(HttpProvider.class);
        PowerMockito.when(HttpProvider.getDefault()).thenReturn(mockHttpProvider);

        BasicAuthenticationDetailsProvider mockAuthProvider =
                mock(BasicAuthenticationDetailsProvider.class);

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

        TestBaseClient client = TestBaseClient.builder().build(mockAuthProvider);
        client.close();
    }

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
                com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                        authenticationDetailsProvider,
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
                extends com.oracle.bmc.common.RegionalClientBuilder<Builder, TestBaseClient> {
            private java.util.concurrent.ExecutorService executorService;

            private Builder(com.oracle.bmc.Service service) {
                super(service);
                requestSignerFactory =
                        new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                                com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
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
            public TestBaseClient build(
                    @jakarta.annotation.Nonnull
                            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                    authenticationDetailsProvider) {
                return new TestBaseClient(this, authenticationDetailsProvider, executorService);
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
}
