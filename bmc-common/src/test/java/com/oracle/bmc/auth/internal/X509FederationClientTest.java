/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.client.Serializer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Thread.class, X509FederationClient.class})
public class X509FederationClientTest {

    @Mock private List<ClientConfigurator> mockAddlConfigurators;
    private X509FederationClient clientUnderTest;

    /* TODO
    @Before
    public void setUp() {
        final Set<X509CertificateSupplier> intermediateCertificateSuppliers =
                Collections.emptySet();
        clientUnderTest =
                new X509FederationClient(
                        "federationEndpoint",
                        "tenantId",
                        mock(X509CertificateSupplier.class),
                        mock(SessionKeySupplier.class),
                        intermediateCertificateSuppliers,
                        mock(ClientConfigurator.class),
                        mockAddlConfigurators,
                        mock(CircuitBreakerConfiguration.class));

        // Speed up the tests to mock out the sleep call between retries
        mockStatic(Thread.class);
    }
    */

    /* TODO
    @Test
    public void makeCall_shouldReuseWrappedInvocationBuilderReference_whenBmcExceptionIsThrown()
            throws Exception {
        // Set up WrappedInvocationBuilder used to verify
        URI requestURI = PowerMockito.mock(URI.class);
        final WrappedInvocationBuilder expectedWIb = mock(WrappedInvocationBuilder.class);
        final Invocation.Builder ib = mock(Invocation.Builder.class);
        whenNew(WrappedInvocationBuilder.class)
                .withArguments(ib, requestURI)
                .thenReturn(expectedWIb);
        final Response expectedResponse = mock(Response.class);

        // Stub exceptions thrown by the client 3 consecutive times then a successful
        when(
                        mockFederationClient.post(
                                Mockito.<WrappedInvocationBuilder>any(),
                                Mockito.<X509FederationClient.X509FederationRequest>any(),
                                Mockito.<BmcRequest>any()))
                .thenThrow(new BmcException(409, "ServiceCode", "Exception 1", "RequestId"))
                .thenThrow(new BmcException(409, "ServiceCode", "Exception 2", "RequestId"))
                .thenThrow(new BmcException(409, "ServiceCode", "Exception 3", "RequestId"))
                .thenReturn(expectedResponse);

        // Method under test.
        final Response actualResponse =
                clientUnderTest.makeCall(
                        ib, requestURI, mock(X509FederationClient.X509FederationRequest.class));

        assertEquals("Response should be equal", expectedResponse, actualResponse);
        verify(mockFederationClient, times(4))
                .post(
                        wrappedIbCaptor.capture(),
                        isA(X509FederationClient.X509FederationRequest.class),
                        isA(BmcRequest.class));
        final List<WrappedInvocationBuilder> wrappedIbsFromInvocation =
                wrappedIbCaptor.getAllValues();
        assertFalse(
                "Captured list of WrappedInvocationBuilder should not be empty",
                wrappedIbsFromInvocation.isEmpty());
        assertEquals(
                "Captured list of WrappedInvocationBuilder size should be 4",
                4 /* expected number of captures * /,
                wrappedIbsFromInvocation.size());
        for (WrappedInvocationBuilder actualWib : wrappedIbsFromInvocation) {
            assertEquals("Captured WIB should be the same", expectedWIb, actualWib);
        }
    }
    */

    @Test
    public void jacksonCanDeserializeSecurityToken() throws IOException {
        final String strToken = "{\"token\" : \"abcdef\"}";
        // this line will fail on original code if Jackson is not at exactly the right version
        Serializer.getDefault().readValue(strToken, X509FederationClient.SecurityToken.class);
    }

    @Test
    public void jacksonCanRoundTripSecurityToken() throws IOException {
        final X509FederationClient.SecurityToken secToken =
                new X509FederationClient.SecurityToken("abcdef");
        final Serializer mapper = Serializer.getDefault();
        assertEquals(
                secToken.getToken(),
                mapper.readValue(mapper.writeValueAsString(secToken), secToken.getClass())
                        .getToken());
    }
}
