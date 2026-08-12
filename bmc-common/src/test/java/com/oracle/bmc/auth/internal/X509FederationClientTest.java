/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.auth.X509CertificateSupplier;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.RestClient;
import com.oracle.bmc.http.internal.WrappedInvocationBuilder;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.requests.BmcRequest;
import java.lang.reflect.Field;
import java.security.KeyPairGenerator;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.security.auth.RefreshFailedException;
import javax.security.auth.Refreshable;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.Response;

import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.whenNew;

@RunWith(PowerMockRunner.class)
@PrepareForTest({
    AuthUtils.class,
    RestClientUtils.class,
    Thread.class,
    X509FederationClient.class,
    WrappedInvocationBuilder.class
})
public class X509FederationClientTest {
    // Fake token with real format
    private static final String VALID_TOKEN =
            "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJ0ZXN0IiwiZXhwIjo5OTk5OTk5OTk5fQ.signature";

    @Mock private RestClient mockFederationClient;
    @Mock private List<ClientConfigurator> mockAddlConfigurators;
    @Captor private ArgumentCaptor<WrappedInvocationBuilder> wrappedIbCaptor;
    private X509FederationClient clientUnderTest;

    @Before
    public void setUp() {
        mockStatic(RestClientUtils.class);
        when(
                        RestClientUtils.createRestClient(
                                anyString(),
                                Mockito.<ClientConfigurator>any(),
                                Mockito.<List<ClientConfigurator>>any(),
                                Mockito.<X509FederationClient>any(),
                                Mockito.any()))
                .thenReturn(mockFederationClient);

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

    @Test
    public void constructorPassesAdditionalClientConfiguratorsToRestClientUtils() {
        PowerMockito.verifyStatic(Mockito.atLeastOnce());
        RestClientUtils.createRestClient(
                Mockito.eq("federationEndpoint"),
                Mockito.<ClientConfigurator>any(),
                Mockito.same(mockAddlConfigurators),
                Mockito.<X509FederationClient>any(),
                Mockito.<CircuitBreakerConfiguration>any());
    }

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

        // Stub exceptions thrown by the client 2 consecutive times then a successful
        when(
                        mockFederationClient.post(
                                Mockito.<WrappedInvocationBuilder>any(),
                                Mockito.<X509FederationClient.X509FederationRequest>any(),
                                Mockito.<BmcRequest>any()))
                .thenThrow(new BmcException(501, "ServiceCode", "Exception 1", "RequestId"))
                .thenThrow(new BmcException(502, "ServiceCode", "Exception 2", "RequestId"))
                .thenReturn(expectedResponse);

        // Method under test.
        final Response actualResponse =
                clientUnderTest.makeCall(
                        ib, requestURI, mock(X509FederationClient.X509FederationRequest.class));

        assertEquals("Response should be equal", expectedResponse, actualResponse);
        verify(mockFederationClient, times(3))
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
                "Captured list of WrappedInvocationBuilder size should be 3",
                3 /* expected number of captures */,
                wrappedIbsFromInvocation.size());
        for (WrappedInvocationBuilder actualWib : wrappedIbsFromInvocation) {
            assertEquals("Captured WIB should be the same", expectedWIb, actualWib);
        }
    }

    @Test()
    public void makeCall_should_fail_when_4xx_BmcExceptionIsThrown() throws Exception {
        // Set up WrappedInvocationBuilder used to verify
        URI requestURI = PowerMockito.mock(URI.class);
        final WrappedInvocationBuilder expectedWIb = mock(WrappedInvocationBuilder.class);
        final Invocation.Builder ib = mock(Invocation.Builder.class);
        whenNew(WrappedInvocationBuilder.class)
                .withArguments(ib, requestURI)
                .thenReturn(expectedWIb);

        // Stub exceptions thrown by the client is 401
        when(
                        mockFederationClient.post(
                                Mockito.<WrappedInvocationBuilder>any(),
                                Mockito.<X509FederationClient.X509FederationRequest>any(),
                                Mockito.<BmcRequest>any()))
                .thenThrow(new BmcException(401, "ServiceCode", "Exception 1", "RequestId"));

        // Method under test
        try {
            clientUnderTest.makeCall(
                    ib, requestURI, mock(X509FederationClient.X509FederationRequest.class));
        } catch (BmcException e) {
            assertEquals(401, e.getStatusCode());
        }
    }

    @Test
    public void jacksonCanDeserializeSecurityToken() throws IOException {
        final String strToken = "{\"token\" : \"abcdef\"}";
        // this line will fail on original code if Jackson is not at exactly the right version
        com.oracle.bmc.http.Serialization.getObjectMapper()
                .readValue(strToken, X509FederationClient.SecurityToken.class);
    }

    @Test
    public void jacksonCanRoundTripSecurityToken() throws IOException {
        final X509FederationClient.SecurityToken secToken =
                new X509FederationClient.SecurityToken("abcdef");
        final ObjectMapper mapper = com.oracle.bmc.http.Serialization.getObjectMapper();
        assertEquals(
                secToken.getToken(),
                mapper.readValue(mapper.writeValueAsString(secToken), secToken.getClass())
                        .getToken());
    }

    /**
     * Verifies the single-flight pattern: concurrent getSecurityToken() calls coalesce into
     * one server call, and followers wait on the future (not the lock), avoiding lock convoy.
     */
    @Test
    public void
            getSecurityToken_usingSingleFlightPattern_coalescesConcurrentRequestsWithoutLockConvoy()
                    throws Exception {
        SessionKeySupplier mockSessionKeySupplier = mock(SessionKeySupplier.class);
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);
        when(mockSessionKeySupplier.getKeyPair()).thenReturn(keyGen.generateKeyPair());

        X509FederationClient client =
                PowerMockito.spy(
                        new X509FederationClient(
                                "https://auth.example.com",
                                "testTenantId",
                                mock(X509CertificateSupplier.class),
                                mockSessionKeySupplier,
                                Collections.emptySet(),
                                mock(ClientConfigurator.class),
                                Collections.emptyList(),
                                mock(CircuitBreakerConfiguration.class)));

        AtomicInteger serverCallCount = new AtomicInteger(0);
        CountDownLatch serverCallEntered = new CountDownLatch(1);
        CountDownLatch releaseServerCall = new CountDownLatch(1);
        PowerMockito.doAnswer(
                        invocation -> {
                            serverCallCount.incrementAndGet();
                            serverCallEntered.countDown();
                            releaseServerCall.await();
                            return new SecurityTokenAdapter(VALID_TOKEN, mockSessionKeySupplier);
                        })
                .when(client, "getSecurityTokenFromServer");

        // Start leader: first to call getSecurityToken() triggers the server call
        int numFollowers = 5;
        CountDownLatch done =
                new CountDownLatch(1 + numFollowers); // we're adding 1 here to account for leader
        AtomicInteger errorCount = new AtomicInteger(0);
        new Thread(
                        () -> {
                            try {
                                client.getSecurityToken();
                            } catch (Throwable ex) {
                                errorCount.incrementAndGet();
                            } finally {
                                done.countDown();
                            }
                        })
                .start();
        serverCallEntered.await();

        // Start followers while leader is blocked in server call
        List<Thread> followers = new ArrayList<>();
        for (int i = 0; i < numFollowers; i++) {
            Thread t =
                    new Thread(
                            () -> {
                                try {
                                    client.getSecurityToken();
                                } catch (Throwable ex) {
                                    errorCount.incrementAndGet();
                                } finally {
                                    done.countDown();
                                }
                            },
                            "follower-" + i);
            followers.add(t);
            t.start();
        }

        // Poll until all followers are WAITING on the future, not BLOCKED on the lock.
        // This verifies no lock convoy AND ensures all threads have arrived before
        // we release the server call (eliminating timing-based flakiness).
        // Using Object.wait() for delay since Thread.class is mocked in @Before.
        final Object waitObj = new Object();
        int waitingCount = 0;
        int blockedCount = 0;
        long deadline = System.currentTimeMillis() + 5_000;
        while (System.currentTimeMillis() < deadline) {
            waitingCount = 0;
            blockedCount = 0;
            for (Thread f : followers) {
                Thread.State s = f.getState();
                if (s == Thread.State.WAITING || s == Thread.State.TIMED_WAITING) {
                    waitingCount++;
                } else if (s == Thread.State.BLOCKED) {
                    blockedCount++;
                }
            }
            if (waitingCount == numFollowers) {
                break;
            }
            synchronized (waitObj) {
                waitObj.wait(50);
            }
        }

        // Lock convoy check: followers should be waiting on future.get(), not on the lock
        assertEquals("Followers should wait on future, not lock", numFollowers, waitingCount);
        assertEquals("No followers should be blocked on lock", 0, blockedCount);

        // Single-flight check: release server call, verify only one was made
        releaseServerCall.countDown();
        done.await();
        assertEquals("No errors expected", 0, errorCount.get());
        assertEquals(
                "Concurrent requests should coalesce into one server call",
                1,
                serverCallCount.get());
    }

    @Test
    public void leafCertificateRuntimeFailureReleasesWaitingCallersAndAllowsNextRefresh()
            throws Exception {
        assertFailureReleasesWaitingCallersAndAllowsNextRefresh(
                new IllegalArgumentException("Simulated IMDS certificate failure"));
    }

    @Test
    public void
            leafCertificateRefreshFailureReturnsErrorToRefreshingAndWaitingCallersAndAllowsNextRefresh()
                    throws Exception {
        RefreshFailedException failure =
                new RefreshFailedException("IMDS GET cert.pem returned HTTP 404");
        CountDownLatch refreshEntered = new CountDownLatch(1);
        CountDownLatch releaseFailure = new CountDownLatch(1);
        AtomicInteger refreshAttempts = new AtomicInteger();
        TestRefreshableCertificateSupplier leafCertificateSupplier =
                new TestRefreshableCertificateSupplier() {
                    @Override
                    public void refresh() throws RefreshFailedException {
                        if (refreshAttempts.getAndIncrement() != 0) {
                            return;
                        }
                        refreshEntered.countDown();
                        try {
                            if (!releaseFailure.await(5, TimeUnit.SECONDS)) {
                                throw new RefreshFailedException(
                                        "Timed out waiting to simulate cert.pem failure");
                            }
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new RefreshFailedException(
                                    "Interrupted while simulating cert.pem failure");
                        }
                        throw failure;
                    }
                };
        SessionKeySupplier sessionKeySupplier = mock(SessionKeySupplier.class);
        X509FederationClient client =
                createClient(
                        leafCertificateSupplier,
                        sessionKeySupplier,
                        Collections.emptySet(),
                        "TEST");
        stubSuccessfulTokenRequest(client, sessionKeySupplier);

        FutureTask<Throwable> leader =
                new FutureTask<>(() -> captureGetSecurityTokenFailure(client));
        FutureTask<Throwable> follower =
                new FutureTask<>(() -> captureGetSecurityTokenFailure(client));
        Thread leaderThread = new Thread(leader, "x509-refresh-leader");
        Thread followerThread = new Thread(follower, "x509-refresh-follower");
        try {
            leaderThread.start();
            assertTrue(
                    "Leader did not enter certificate refresh",
                    refreshEntered.await(5, TimeUnit.SECONDS));

            followerThread.start();
            final Object waitObject = new Object();
            long deadline = System.currentTimeMillis() + 5_000;
            while (followerThread.getState() != Thread.State.TIMED_WAITING
                    && System.currentTimeMillis() < deadline) {
                synchronized (waitObject) {
                    waitObject.wait(10);
                }
            }
            assertEquals(Thread.State.TIMED_WAITING, followerThread.getState());

            releaseFailure.countDown();
            Throwable leaderFailure = leader.get(5, TimeUnit.SECONDS);
            Throwable followerFailure = follower.get(2, TimeUnit.SECONDS);

            assertTrue(leaderFailure instanceof BmcException);
            assertSame(failure, leaderFailure.getCause());
            assertSame(leaderFailure, followerFailure);
            assertNull(getInFlightRefresh(client));
            assertEquals(VALID_TOKEN, client.refreshAndGetSecurityToken());
        } finally {
            releaseFailure.countDown();
            leaderThread.interrupt();
            followerThread.interrupt();
            leaderThread.join(5_000);
            followerThread.join(5_000);
        }
    }

    @Test
    public void seriousJavaErrorReleasesWaitingCallersAndAllowsNextRefresh() throws Exception {
        assertFailureReleasesWaitingCallersAndAllowsNextRefresh(
                new AssertionError("Simulated serious JVM failure"));
    }

    @Test
    public void sessionKeyFailureDoesNotBlockNextTokenRefresh() throws Exception {
        IllegalStateException failure = new IllegalStateException("Session key refresh failed");
        SessionKeySupplier sessionKeySupplier = mock(SessionKeySupplier.class);
        AtomicInteger refreshAttempts = new AtomicInteger();
        Mockito.doAnswer(
                        invocation -> {
                            if (refreshAttempts.getAndIncrement() == 0) {
                                throw failure;
                            }
                            return null;
                        })
                .when(sessionKeySupplier)
                .refreshKeys();

        X509FederationClient client =
                createClient(
                        mock(X509CertificateSupplier.class),
                        sessionKeySupplier,
                        Collections.emptySet(),
                        "TEST");
        stubSuccessfulTokenRequest(client, sessionKeySupplier);

        assertSame(failure, captureRefreshFailure(client));
        assertNull(getInFlightRefresh(client));
        assertEquals(VALID_TOKEN, client.refreshAndGetSecurityToken());
    }

    @Test
    public void certificateTenancyValidationFailureDoesNotBlockNextTokenRefresh() throws Exception {
        IllegalArgumentException failure =
                new IllegalArgumentException("Certificate tenancy validation failed");
        X509Certificate certificate = mock(X509Certificate.class);
        X509CertificateSupplier.CertificateAndPrivateKeyPair certificateAndPrivateKeyPair =
                new X509CertificateSupplier.CertificateAndPrivateKeyPair(certificate, null);
        TestRefreshableCertificateSupplier leafCertificateSupplier =
                new TestRefreshableCertificateSupplier() {
                    @Override
                    public void refresh() {}

                    @Override
                    public CertificateAndPrivateKeyPair getCertificateAndKeyPair() {
                        return certificateAndPrivateKeyPair;
                    }
                };
        SessionKeySupplier sessionKeySupplier = mock(SessionKeySupplier.class);
        SecurityTokenAdapter successfulToken =
                new SecurityTokenAdapter(VALID_TOKEN, sessionKeySupplier);
        mockStatic(AuthUtils.class);
        PowerMockito.when(AuthUtils.getTenantIdFromCertificate(certificate))
                .thenThrow(failure)
                .thenReturn("tenantId");
        X509FederationClient client =
                createClient(
                        leafCertificateSupplier,
                        sessionKeySupplier,
                        Collections.emptySet(),
                        "DEFAULT");
        PowerMockito.doReturn(successfulToken).when(client, "getSecurityTokenFromServer");

        assertSame(failure, captureRefreshFailure(client));
        assertNull(getInFlightRefresh(client));
        assertEquals(VALID_TOKEN, client.refreshAndGetSecurityToken());
    }

    @Test
    public void intermediateCertificateFailureDoesNotBlockNextTokenRefresh() throws Exception {
        RefreshFailedException failure =
                new RefreshFailedException("Intermediate certificate refresh failed");
        AtomicInteger refreshAttempts = new AtomicInteger();
        TestRefreshableCertificateSupplier intermediateCertificateSupplier =
                new TestRefreshableCertificateSupplier() {
                    @Override
                    public void refresh() throws RefreshFailedException {
                        if (refreshAttempts.getAndIncrement() == 0) {
                            throw failure;
                        }
                    }
                };
        SessionKeySupplier sessionKeySupplier = mock(SessionKeySupplier.class);
        X509FederationClient client =
                createClient(
                        mock(X509CertificateSupplier.class),
                        sessionKeySupplier,
                        Collections.singleton(intermediateCertificateSupplier),
                        "TEST");
        stubSuccessfulTokenRequest(client, sessionKeySupplier);

        Throwable actualFailure = captureRefreshFailure(client);
        assertTrue(actualFailure instanceof BmcException);
        assertSame(failure, actualFailure.getCause());
        assertNull(getInFlightRefresh(client));
        assertEquals(VALID_TOKEN, client.refreshAndGetSecurityToken());
    }

    @Test
    public void federationServerFailurePreservesErrorAndDoesNotBlockNextTokenRefresh()
            throws Exception {
        BmcException serverFailure =
                new BmcException(500, "InternalError", "Federation server failed", "requestId");
        SessionKeySupplier sessionKeySupplier = mock(SessionKeySupplier.class);
        X509FederationClient client =
                createClient(
                        mock(X509CertificateSupplier.class),
                        sessionKeySupplier,
                        Collections.emptySet(),
                        "TEST");
        AtomicInteger serverAttempts = new AtomicInteger();
        PowerMockito.doAnswer(
                        invocation -> {
                            if (serverAttempts.getAndIncrement() == 0) {
                                throw serverFailure;
                            }
                            return new SecurityTokenAdapter(VALID_TOKEN, sessionKeySupplier);
                        })
                .when(client, "getSecurityTokenFromServer");

        Throwable actualFailure = captureRefreshFailure(client);
        assertTrue(actualFailure instanceof BmcException);
        assertTrue(actualFailure.getMessage().contains("Error refreshing security token."));
        assertSame(serverFailure, actualFailure.getCause());
        assertNull(getInFlightRefresh(client));
        assertEquals(VALID_TOKEN, client.refreshAndGetSecurityToken());
    }

    private void assertFailureReleasesWaitingCallersAndAllowsNextRefresh(Throwable failure)
            throws Exception {
        CountDownLatch refreshEntered = new CountDownLatch(1);
        CountDownLatch releaseFailure = new CountDownLatch(1);
        AtomicInteger refreshAttempts = new AtomicInteger();
        TestRefreshableCertificateSupplier leafCertificateSupplier =
                new TestRefreshableCertificateSupplier() {
                    @Override
                    public void refresh() {
                        if (refreshAttempts.getAndIncrement() != 0) {
                            return;
                        }
                        refreshEntered.countDown();
                        try {
                            if (!releaseFailure.await(5, TimeUnit.SECONDS)) {
                                throw new AssertionError(
                                        "Timed out waiting to release refresh failure");
                            }
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new AssertionError(
                                    "Interrupted while simulating refresh failure", e);
                        }
                        if (failure instanceof Error) {
                            throw (Error) failure;
                        }
                        throw (RuntimeException) failure;
                    }
                };
        SessionKeySupplier sessionKeySupplier = mock(SessionKeySupplier.class);
        X509FederationClient client =
                createClient(
                        leafCertificateSupplier,
                        sessionKeySupplier,
                        Collections.emptySet(),
                        "TEST");
        stubSuccessfulTokenRequest(client, sessionKeySupplier);

        FutureTask<String> leader = new FutureTask<>(client::refreshAndGetSecurityToken);
        Thread leaderThread = new Thread(leader, "x509-refresh-leader");
        leaderThread.start();
        assertTrue(
                "Leader did not enter certificate refresh",
                refreshEntered.await(5, TimeUnit.SECONDS));
        CompletableFuture<String> sharedFuture = getInFlightRefresh(client);
        assertNotNull(sharedFuture);

        releaseFailure.countDown();
        try {
            leader.get(5, TimeUnit.SECONDS);
            fail("Leader should propagate the refresh failure");
        } catch (ExecutionException e) {
            assertSame(failure, e.getCause());
        } finally {
            releaseFailure.countDown();
        }

        assertTrue(sharedFuture.isCompletedExceptionally());
        try {
            sharedFuture.get(1, TimeUnit.SECONDS);
            fail("Follower should receive the leader failure");
        } catch (ExecutionException e) {
            assertSame(failure, e.getCause());
        }
        assertNull(getInFlightRefresh(client));
        assertEquals(VALID_TOKEN, client.refreshAndGetSecurityToken());
    }

    private X509FederationClient createClient(
            X509CertificateSupplier leafCertificateSupplier,
            SessionKeySupplier sessionKeySupplier,
            Set<X509CertificateSupplier> intermediateCertificateSuppliers,
            String purpose) {
        return PowerMockito.spy(
                new X509FederationClient(
                        "https://auth.example.com",
                        "tenantId",
                        leafCertificateSupplier,
                        sessionKeySupplier,
                        intermediateCertificateSuppliers,
                        mock(ClientConfigurator.class),
                        Collections.emptyList(),
                        mock(CircuitBreakerConfiguration.class),
                        purpose));
    }

    private void stubSuccessfulTokenRequest(
            X509FederationClient client, SessionKeySupplier sessionKeySupplier) throws Exception {
        PowerMockito.doReturn(new SecurityTokenAdapter(VALID_TOKEN, sessionKeySupplier))
                .when(client, "getSecurityTokenFromServer");
    }

    private Throwable captureRefreshFailure(X509FederationClient client) {
        try {
            client.refreshAndGetSecurityToken();
        } catch (RuntimeException failure) {
            return failure;
        }
        fail("Token refresh should fail");
        return null;
    }

    private Throwable captureGetSecurityTokenFailure(X509FederationClient client) {
        try {
            client.getSecurityToken();
        } catch (BmcException failure) {
            return failure;
        }
        fail("Token refresh should fail");
        return null;
    }

    @SuppressWarnings("unchecked")
    private CompletableFuture<String> getInFlightRefresh(X509FederationClient client)
            throws Exception {
        Field field = X509FederationClient.class.getDeclaredField("inFlightRefresh");
        field.setAccessible(true);
        return (CompletableFuture<String>) field.get(client);
    }

    private abstract static class TestRefreshableCertificateSupplier
            implements X509CertificateSupplier, Refreshable {
        @Override
        public boolean isCurrent() {
            return false;
        }

        @Override
        @Deprecated
        public X509Certificate getCertificate() {
            return null;
        }

        @Override
        @Deprecated
        public RSAPrivateKey getPrivateKey() {
            return null;
        }

        @Override
        public CertificateAndPrivateKeyPair getCertificateAndKeyPair() {
            return null;
        }
    }
}
