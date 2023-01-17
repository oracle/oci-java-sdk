/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.retrier.*;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
import com.oracle.bmc.waiter.TerminationStrategy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import javax.ws.rs.client.Invocation;
import java.net.URI;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class RetryUtilsTest {
    private final String OPC_CLIENT_RETRIES_HEADER = "opc-client-retries";
    private final TerminationStrategy CUSTOM_TERMINATION_STRATEGY =
            new MaxAttemptsTerminationStrategy(42);
    private final RetryOptions CUSTOM_RETRY_OPTION = new RetryOptions(42);
    private RetryConfiguration requestRetryConfiguration;
    private ClientConfiguration clientConfiguration;
    private BmcGenericRetrier retrier;
    private BmcGenericRetrier retrier2;
    private BmcGenericRetrier retrier3;
    private URI requestURI = PowerMockito.mock(URI.class);
    @Mock private Invocation.Builder ib;

    @Test
    public void testRetryUtils_setOpcClientRetriesHeaderNoRetries() {
        requestRetryConfiguration = RetryConfiguration.builder().build();
        clientConfiguration = ClientConfiguration.builder().build();
        retrier =
                Retriers.createPreferredRetrier(
                        requestRetryConfiguration, clientConfiguration.getRetryConfiguration());
        retrier2 = Retriers.createPreferredRetrier(null, null);

        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib, requestURI);
        WrappedInvocationBuilder wib2 = new WrappedInvocationBuilder(ib, requestURI);

        RetryUtils.setClientRetriesHeader(wib, retrier);
        RetryUtils.setClientRetriesHeader(wib2, retrier2);

        String headers = wib.getHeaders().get(OPC_CLIENT_RETRIES_HEADER).get(0).toString();
        String headers2 = wib2.getHeaders().get(OPC_CLIENT_RETRIES_HEADER).get(0).toString();

        assertEquals("false", headers);
        assertEquals("false", headers2);
    }

    @Test
    public void testRetryUtils_setOpcClientRetriesHeaderCustomRequestRetries() {
        requestRetryConfiguration =
                RetryConfiguration.builder()
                        .terminationStrategy(CUSTOM_TERMINATION_STRATEGY)
                        .build();
        retrier = Retriers.createPreferredRetrier(requestRetryConfiguration, null);

        requestRetryConfiguration =
                RetryConfiguration.builder().retryOptions(CUSTOM_RETRY_OPTION).build();
        retrier2 = Retriers.createPreferredRetrier(requestRetryConfiguration, null);

        requestRetryConfiguration =
                RetryConfiguration.builder()
                        .retryOptions(CUSTOM_RETRY_OPTION)
                        .terminationStrategy(CUSTOM_TERMINATION_STRATEGY)
                        .build();
        retrier3 = Retriers.createPreferredRetrier(requestRetryConfiguration, null);

        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib, requestURI);
        WrappedInvocationBuilder wib2 = new WrappedInvocationBuilder(ib, requestURI);
        WrappedInvocationBuilder wib3 = new WrappedInvocationBuilder(ib, requestURI);

        RetryUtils.setClientRetriesHeader(wib, retrier);
        RetryUtils.setClientRetriesHeader(wib2, retrier2);
        RetryUtils.setClientRetriesHeader(wib3, retrier3);

        String headers = wib.getHeaders().get(OPC_CLIENT_RETRIES_HEADER).get(0).toString();
        String headers2 = wib2.getHeaders().get(OPC_CLIENT_RETRIES_HEADER).get(0).toString();
        String headers3 = wib3.getHeaders().get(OPC_CLIENT_RETRIES_HEADER).get(0).toString();

        assertEquals("true", headers);
        assertEquals("false", headers2);
        assertEquals("true", headers3);
    }

    @Test
    public void testRetryUtils_setOpcClientRetriesHeaderCustomClientRetries() {
        clientConfiguration =
                ClientConfiguration.builder()
                        .retryConfiguration(
                                RetryConfiguration.builder()
                                        .terminationStrategy(CUSTOM_TERMINATION_STRATEGY)
                                        .build())
                        .build();
        retrier =
                Retriers.createPreferredRetrier(null, clientConfiguration.getRetryConfiguration());

        clientConfiguration =
                ClientConfiguration.builder()
                        .retryConfiguration(
                                RetryConfiguration.builder()
                                        .retryOptions(CUSTOM_RETRY_OPTION)
                                        .build())
                        .build();
        retrier2 =
                Retriers.createPreferredRetrier(null, clientConfiguration.getRetryConfiguration());

        clientConfiguration =
                ClientConfiguration.builder()
                        .retryConfiguration(
                                RetryConfiguration.builder()
                                        .retryOptions(CUSTOM_RETRY_OPTION)
                                        .terminationStrategy(CUSTOM_TERMINATION_STRATEGY)
                                        .build())
                        .build();
        retrier3 =
                Retriers.createPreferredRetrier(null, clientConfiguration.getRetryConfiguration());

        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib, requestURI);
        WrappedInvocationBuilder wib2 = new WrappedInvocationBuilder(ib, requestURI);
        WrappedInvocationBuilder wib3 = new WrappedInvocationBuilder(ib, requestURI);

        RetryUtils.setClientRetriesHeader(wib, retrier);
        RetryUtils.setClientRetriesHeader(wib2, retrier2);
        RetryUtils.setClientRetriesHeader(wib3, retrier3);

        String headers = wib.getHeaders().get(OPC_CLIENT_RETRIES_HEADER).get(0).toString();
        String headers2 = wib2.getHeaders().get(OPC_CLIENT_RETRIES_HEADER).get(0).toString();
        String headers3 = wib3.getHeaders().get(OPC_CLIENT_RETRIES_HEADER).get(0).toString();

        assertEquals("true", headers);
        assertEquals("false", headers2);
        assertEquals("true", headers3);
    }

    @Test
    public void testRetryUtils_setOpcClientRetriesHeaderDefaultRequestRetryCustomClientRetries() {
        requestRetryConfiguration = RetryConfiguration.builder().build();
        clientConfiguration =
                ClientConfiguration.builder()
                        .retryConfiguration(
                                RetryConfiguration.builder()
                                        .terminationStrategy(CUSTOM_TERMINATION_STRATEGY)
                                        .build())
                        .build();

        retrier =
                Retriers.createPreferredRetrier(
                        requestRetryConfiguration, clientConfiguration.getRetryConfiguration());

        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib, requestURI);

        RetryUtils.setClientRetriesHeader(wib, retrier);

        String headers = wib.getHeaders().get(OPC_CLIENT_RETRIES_HEADER).get(0).toString();

        assertEquals("false", headers);
    }

    @Test
    public void testRetryUtils_setOpcClientRetriesHeaderCustomRequestRetryDefaultClientRetries() {
        requestRetryConfiguration =
                RetryConfiguration.builder()
                        .terminationStrategy(CUSTOM_TERMINATION_STRATEGY)
                        .build();
        clientConfiguration = ClientConfiguration.builder().build();
        retrier =
                Retriers.createPreferredRetrier(
                        requestRetryConfiguration, clientConfiguration.getRetryConfiguration());

        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib, requestURI);

        RetryUtils.setClientRetriesHeader(wib, retrier);

        String headers = wib.getHeaders().get(OPC_CLIENT_RETRIES_HEADER).get(0).toString();

        assertEquals("true", headers);
    }

    @Test
    public void testRetryUtils_setOpcClientRetriesHeaderCustomGlobalRetries() {
        final RetryConfiguration retryConfiguration =
                RetryConfiguration.builder()
                        .terminationStrategy(CUSTOM_TERMINATION_STRATEGY)
                        .build();
        Retriers.setDefaultRetryConfiguration(retryConfiguration);
        retrier = Retriers.createPreferredRetrier(null, null);

        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib, requestURI);

        RetryUtils.setClientRetriesHeader(wib, retrier);

        String headers = wib.getHeaders().get(OPC_CLIENT_RETRIES_HEADER).get(0).toString();

        assertEquals("true", headers);
    }

    @Test
    public void testRetryUtils_setOpcClientRetriesHeaderNoOpGlobalRetries() {
        final RetryConfiguration retryConfiguration =
                RetryConfiguration.builder().retryOptions(CUSTOM_RETRY_OPTION).build();
        Retriers.setDefaultRetryConfiguration(retryConfiguration);
        retrier = Retriers.createPreferredRetrier(null, null);

        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib, requestURI);

        RetryUtils.setClientRetriesHeader(wib, retrier);

        String headers = wib.getHeaders().get(OPC_CLIENT_RETRIES_HEADER).get(0).toString();

        assertEquals("false", headers);
    }

    /**
     * In order for this test case to be "true", set the environment variable for default retries
     * export OCI_SDK_DEFAULT_RETRY_ENABLED=true
     * Note: Doing this will cause other tests to fail.
     * */
    @Test
    public void testRetryUtils_setOpcClientRetriesHeaderDefaultSDKRetries() {
        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib, requestURI);

        RetryUtils.setClientRetriesHeader(
                wib, new BmcGenericRetrier(RetryConfiguration.NO_RETRY_CONFIGURATION));

        String headers = wib.getHeaders().get(OPC_CLIENT_RETRIES_HEADER).get(0).toString();

        assertEquals("false", headers);
        // assertEquals("true", headers);
    }

    @Test
    public void testRetryUtils_opcClientRetriesHeaderAlreadySet() {
        requestRetryConfiguration =
                RetryConfiguration.builder()
                        .terminationStrategy(CUSTOM_TERMINATION_STRATEGY)
                        .build();

        retrier = Retriers.createPreferredRetrier(null, null);
        retrier2 = Retriers.createPreferredRetrier(requestRetryConfiguration, null);

        WrappedInvocationBuilder wib = new WrappedInvocationBuilder(ib, requestURI);

        wib.header(OPC_CLIENT_RETRIES_HEADER, "This header has already been set");

        RetryUtils.setClientRetriesHeader(wib, retrier);
        String headers = wib.getHeaders().get(OPC_CLIENT_RETRIES_HEADER).get(0).toString();
        assertEquals("This header has already been set", headers);

        RetryUtils.setClientRetriesHeader(wib, retrier2);
        String headers2 = wib.getHeaders().get(OPC_CLIENT_RETRIES_HEADER).get(0).toString();
        assertEquals("This header has already been set", headers2);
    }
}
