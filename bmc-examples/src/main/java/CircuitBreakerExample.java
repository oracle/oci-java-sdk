/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.CircuitBreakerFactory;
import com.oracle.bmc.circuitbreaker.OciCircuitBreaker;
import com.oracle.bmc.circuitbreaker.internal.resilience4j.OciCircuitBreakerImpl;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.requests.ListVnicAttachmentsRequest;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.requests.ListRegionsRequest;
import com.oracle.bmc.identity.responses.ListRegionsResponse;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.model.BucketSummary;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;
import com.oracle.bmc.objectstorage.requests.ListBucketsRequest;
import com.oracle.bmc.objectstorage.responses.GetNamespaceResponse;
import com.oracle.bmc.objectstorage.responses.ListBucketsResponse;
import com.oracle.bmc.retrier.RetryConfiguration;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;

import javax.ws.rs.core.Response;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/** A sample to demonstrate how to configure a client using circuit breaker configuration. */
public class CircuitBreakerExample {

    public static void main(String[] args) throws Exception {

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        // Circuit breaker setup with custom values
        setupCircuitBreakerWithCustomValues(provider);

        // Share same circuit breaker with multiple clients
        shareCircuitBreakerAmongMultipleClients(provider);

        // CircuitBreaker throws exception when open with details
        circuitBreakerOpensWithErrorMessageExample(provider);

        // CircuitBreaker throws exception with transition logs
        circuitBreakerOpensWithTransitionMessages(provider);
    }

    private static void setupCircuitBreakerWithCustomValues(
            AuthenticationDetailsProvider provider) {

        // Setup CircuitBreakerConfiguration with custom values
        ClientConfiguration configuration =
                ClientConfiguration.builder()
                        .retryConfiguration(RetryConfiguration.builder().build())
                        .circuitBreakerConfiguration(
                                CircuitBreakerConfiguration.builder()
                                        .failureRateThreshold(50)
                                        .slowCallRateThreshold(90)
                                        .slowCallDurationThreshold(Duration.ofSeconds(6))
                                        .permittedNumberOfCallsInHalfOpenState(2)
                                        .slidingWindowSize(10)
                                        .minimumNumberOfCalls(4)
                                        .waitDurationInOpenState(Duration.ofSeconds(2))
                                        .recordHttpStatuses(
                                                Collections.unmodifiableSet(
                                                        new HashSet<>(
                                                                Arrays.asList(
                                                                        CircuitBreakerConfiguration
                                                                                .TOO_MANY_REQUESTS,
                                                                        CircuitBreakerConfiguration
                                                                                .SERVICE_UNAVAILABLE))))
                                        .build())
                        .build();

        // Create Client using above ClientConfiguration
        IdentityClient identityClient =
                IdentityClient.builder()
                        .region(Region.US_PHOENIX_1)
                        .configuration(configuration)
                        .build(provider);
        System.out.println("Querying for list of regions");
        final ListRegionsResponse response =
                identityClient.listRegions(ListRegionsRequest.builder().build());
        System.out.println("List of regions: " + response.getItems());
        identityClient.close();
    }

    private static void shareCircuitBreakerAmongMultipleClients(
            AuthenticationDetailsProvider provider) throws Exception {

        CircuitBreakerConfiguration circuitBreakerConfiguration =
                CircuitBreakerConfiguration.builder()
                        .failureRateThreshold(50)
                        .slowCallRateThreshold(90)
                        .slowCallDurationThreshold(Duration.ofSeconds(6))
                        .permittedNumberOfCallsInHalfOpenState(2)
                        .slidingWindowSize(10)
                        .minimumNumberOfCalls(4)
                        .waitDurationInOpenState(Duration.ofSeconds(2))
                        .recordHttpStatuses(
                                Collections.unmodifiableSet(
                                        new HashSet<>(
                                                Arrays.asList(
                                                        CircuitBreakerConfiguration
                                                                .TOO_MANY_REQUESTS,
                                                        CircuitBreakerConfiguration
                                                                .SERVICE_UNAVAILABLE))))
                        .build();

        OciCircuitBreaker cb = CircuitBreakerFactory.build(circuitBreakerConfiguration, null);
        ClientConfiguration clientConfiguration =
                ClientConfiguration.builder()
                        .retryConfiguration(RetryConfiguration.builder().build())
                        .circuitBreaker(cb)
                        .build();

        // Create Clients using above ClientConfiguration
        IdentityClient identityClient =
                IdentityClient.builder()
                        .region(Region.US_PHOENIX_1)
                        .configuration(clientConfiguration)
                        .build(provider);
        ObjectStorage client =
                ObjectStorageClient.builder()
                        .region(Region.US_PHOENIX_1)
                        .configuration(clientConfiguration)
                        .build(provider);

        final ListRegionsResponse response =
                identityClient.listRegions(ListRegionsRequest.builder().build());
        System.out.println("List of regions: " + response.getItems());

        GetNamespaceResponse namespaceResponse =
                client.getNamespace(GetNamespaceRequest.builder().build());
        String namespaceName = namespaceResponse.getValue();
        System.out.println("Using namespace: " + namespaceName);

        ListBucketsRequest.Builder listBucketsBuilder =
                ListBucketsRequest.builder()
                        .namespaceName(namespaceName)
                        .compartmentId(provider.getTenantId());

        String nextToken = null;
        do {
            listBucketsBuilder.page(nextToken);
            ListBucketsResponse listBucketsResponse =
                    client.listBuckets(listBucketsBuilder.build());
            for (BucketSummary bucket : listBucketsResponse.getItems()) {
                System.out.println("Found bucket: " + bucket.getName());
            }
            nextToken = listBucketsResponse.getOpcNextPage();
        } while (nextToken != null);

        identityClient.close();
        client.close();
    }

    private static void circuitBreakerOpensWithErrorMessageExample(
            AuthenticationDetailsProvider provider) throws Exception {

        // Just for this example add one more status code SERVICE_NOTFOUND - 404(compare with
        // default circuit breaker setting) as the failure request in circuit breaker.
        int SERVICE_NOTFOUND = Response.Status.NOT_FOUND.getStatusCode();
        int INVALID_PARAMETER = Response.Status.BAD_REQUEST.getStatusCode();
        int MIN_NUM_CALLS = 5;
        CircuitBreakerConfiguration circuitBreakerConfiguration =
                CircuitBreakerConfiguration.builder()
                        .failureRateThreshold(50)
                        .slowCallRateThreshold(90)
                        .slowCallDurationThreshold(Duration.ofSeconds(6))
                        .permittedNumberOfCallsInHalfOpenState(2)
                        .slidingWindowSize(10)
                        .minimumNumberOfCalls(MIN_NUM_CALLS)
                        .waitDurationInOpenState(Duration.ofSeconds(2))
                        .numberOfRecordedHistoryResponses(5)
                        .recordHttpStatuses(
                                Collections.unmodifiableSet(
                                        new HashSet<>(
                                                Arrays.asList(
                                                        CircuitBreakerConfiguration
                                                                .TOO_MANY_REQUESTS,
                                                        CircuitBreakerConfiguration
                                                                .SERVICE_UNAVAILABLE,
                                                        SERVICE_NOTFOUND,
                                                        INVALID_PARAMETER))))
                        .build();

        OciCircuitBreaker cb = CircuitBreakerFactory.build(circuitBreakerConfiguration, null);
        ClientConfiguration clientConfiguration =
                ClientConfiguration.builder()
                        .retryConfiguration(RetryConfiguration.builder().build())
                        .circuitBreaker(cb)
                        .build();

        // Create Clients using above ClientConfiguration
        ObjectStorage objectStorageClient =
                ObjectStorageClient.builder()
                        .region(Region.US_PHOENIX_1)
                        .configuration(clientConfiguration)
                        .build(provider);

        ComputeClient computeClient =
                ComputeClient.builder()
                        .region(Region.US_PHOENIX_1)
                        .configuration(clientConfiguration)
                        .build(provider);

        GetNamespaceResponse namespaceResponse =
                objectStorageClient.getNamespace(GetNamespaceRequest.builder().build());
        String namespaceName = namespaceResponse.getValue();

        // Make the tenancy OCID incorrect to invoke errors
        String invalidTenantId = "invalid_tenantId";
        ListBucketsRequest.Builder listBucketsBuilder =
                ListBucketsRequest.builder()
                        .namespaceName(namespaceName)
                        .compartmentId(invalidTenantId);

        ListVnicAttachmentsRequest.Builder listVnicAttachmentsRequest =
                ListVnicAttachmentsRequest.builder().compartmentId(invalidTenantId);

        boolean circuitBreakerOpen = false;

        try {
            for (int i = 0; i < MIN_NUM_CALLS; i++) {
                System.out.println("Circuit Breaker Status - " + cb.getState());
                try {
                    // Alternate client requests to check shared circuitbreaker in action
                    if (i % 2 == 0) {
                        computeClient.listVnicAttachments(listVnicAttachmentsRequest.build());
                    } else {
                        objectStorageClient.listBuckets(listBucketsBuilder.build());
                    }

                } catch (BmcException e) {
                    if (circuitBreakerOpen) throw e;
                }
                if (cb.getState().toString().equals(CircuitBreaker.State.OPEN.toString()))
                    circuitBreakerOpen = true;
            }
        } catch (BmcException e) {
            e.printStackTrace();
        }

        objectStorageClient.close();
        computeClient.close();
    }

    private static void circuitBreakerOpensWithTransitionMessages(
            AuthenticationDetailsProvider provider) throws Exception {

        // Just for this example add one more status code SERVICE_NOTFOUND - 404(compare with
        // default circuit breaker setting) as the failure request in circuit breaker.
        int SERVICE_NOTFOUND = Response.Status.NOT_FOUND.getStatusCode();
        int INVALID_PARAMETER = Response.Status.BAD_REQUEST.getStatusCode();
        int MIN_NUM_CALLS = 5;
        CircuitBreakerConfiguration circuitBreakerConfiguration =
                CircuitBreakerConfiguration.builder()
                        .failureRateThreshold(50)
                        .slowCallRateThreshold(90)
                        .slowCallDurationThreshold(Duration.ofSeconds(6))
                        .permittedNumberOfCallsInHalfOpenState(2)
                        .slidingWindowSize(10)
                        .minimumNumberOfCalls(MIN_NUM_CALLS)
                        .waitDurationInOpenState(Duration.ofSeconds(2))
                        .numberOfRecordedHistoryResponses(5)
                        .recordHttpStatuses(
                                Collections.unmodifiableSet(
                                        new HashSet<>(
                                                Arrays.asList(
                                                        CircuitBreakerConfiguration
                                                                .TOO_MANY_REQUESTS,
                                                        CircuitBreakerConfiguration
                                                                .SERVICE_UNAVAILABLE,
                                                        SERVICE_NOTFOUND,
                                                        INVALID_PARAMETER))))
                        .build();

        CircuitBreaker r4jCircuitBreaker =
                CircuitBreaker.of(
                        null,
                        CircuitBreakerConfig.custom()
                                .enableAutomaticTransitionFromOpenToHalfOpen()
                                .slidingWindowType(
                                        CircuitBreakerConfig.SlidingWindowType.TIME_BASED)
                                .failureRateThreshold(
                                        circuitBreakerConfiguration.getFailureRateThreshold())
                                .slowCallRateThreshold(
                                        circuitBreakerConfiguration.getSlowCallRateThreshold())
                                .slowCallDurationThreshold(
                                        circuitBreakerConfiguration.getSlowCallDurationThreshold())
                                .permittedNumberOfCallsInHalfOpenState(
                                        circuitBreakerConfiguration
                                                .getPermittedNumberOfCallsInHalfOpenState())
                                .slidingWindowSize(
                                        circuitBreakerConfiguration.getSlidingWindowSize())
                                .minimumNumberOfCalls(
                                        circuitBreakerConfiguration.getMinimumNumberOfCalls())
                                .writableStackTraceEnabled(
                                        circuitBreakerConfiguration.isWritableStackTraceEnabled())
                                .waitDurationInOpenState(
                                        circuitBreakerConfiguration.getWaitDurationInOpenState())
                                .recordExceptions(
                                        circuitBreakerConfiguration
                                                .getRecordExceptions()
                                                .toArray(new Class[0]))
                                .build());

        OciCircuitBreaker cb =
                new OciCircuitBreakerImpl(
                        r4jCircuitBreaker,
                        circuitBreakerConfiguration.getNumberOfRecordedHistoryResponses());

        ClientConfiguration clientConfiguration =
                ClientConfiguration.builder()
                        .retryConfiguration(RetryConfiguration.builder().build())
                        .circuitBreaker(cb)
                        .build();

        // Create Clients using above ClientConfiguration
        ObjectStorage objectStorageClient =
                ObjectStorageClient.builder()
                        .region(Region.US_PHOENIX_1)
                        .configuration(clientConfiguration)
                        .build(provider);

        ComputeClient computeClient =
                ComputeClient.builder()
                        .region(Region.US_PHOENIX_1)
                        .configuration(clientConfiguration)
                        .build(provider);

        GetNamespaceResponse namespaceResponse =
                objectStorageClient.getNamespace(GetNamespaceRequest.builder().build());
        String namespaceName = namespaceResponse.getValue();

        // Make the tenancy OCID incorrect to invoke errors
        String invalidTenantId = "invalid_tenantId";
        ListBucketsRequest.Builder listBucketsBuilder =
                ListBucketsRequest.builder()
                        .namespaceName(namespaceName)
                        .compartmentId(invalidTenantId);

        ListVnicAttachmentsRequest.Builder listVnicAttachmentsRequest =
                ListVnicAttachmentsRequest.builder().compartmentId(invalidTenantId);

        boolean circuitBreakerOpen = false;

        for (int i = 0; i < MIN_NUM_CALLS + 6; i++) {
            try {
                // Alternate client requests to check shared circuitbreaker in action
                if (i == MIN_NUM_CALLS + 2)
                    listVnicAttachmentsRequest.compartmentId("<compartmentId>");
                if (i % 2 == 0 || i >= MIN_NUM_CALLS + 2) {
                    computeClient.listVnicAttachments(listVnicAttachmentsRequest.build());
                } else {
                    objectStorageClient.listBuckets(listBucketsBuilder.build());
                }

            } catch (BmcException e) {
                if (circuitBreakerOpen) {
                    e.printStackTrace();
                    Thread.sleep(2000);
                }
            }
            if (cb.getState().toString().equals(CircuitBreaker.State.OPEN.toString()))
                circuitBreakerOpen = true;
            else circuitBreakerOpen = false;
        }

        objectStorageClient.close();
        computeClient.close();
    }
}
