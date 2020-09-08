/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.CircuitBreakerFactory;
import com.oracle.bmc.circuitbreaker.JaxRsCircuitBreaker;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.requests.ListRegionsRequest;
import com.oracle.bmc.identity.responses.ListRegionsResponse;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.model.BucketSummary;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;
import com.oracle.bmc.objectstorage.requests.ListBucketsRequest;
import com.oracle.bmc.objectstorage.responses.GetNamespaceResponse;
import com.oracle.bmc.objectstorage.responses.ListBucketsResponse;
import com.oracle.bmc.retrier.RetryConfiguration;
import java.time.Duration;

/**
 * A sample to demonstrate how to configure a client using circuit breaker configuration.
 */
public class CircuitBreakerExample {

    public static void main(String[] args) throws Exception {

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        //Circuit breaker setup with custom values
        setupCircuitBreakerWithCustomValues(provider);

        //Share same circuit breaker with multiple clients
        shareCircuitBreakerAmongMultipleClients(provider);
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
                                                ImmutableSet.of(
                                                        CircuitBreakerConfiguration
                                                                .TOO_MANY_REQUESTS,
                                                        CircuitBreakerConfiguration
                                                                .SERVICE_UNAVAILABLE))
                                        .recordExceptions(
                                                ImmutableList.of(
                                                        CircuitBreakerConfiguration
                                                                .SERVICE_UNAVAILABLE_EXCEPTION_CLASS))
                                        .build())
                        .build();

        // Create Client using above ClientConfiguration
        IdentityClient identityClient = new IdentityClient(provider, configuration);
        identityClient.setRegion(Region.US_PHOENIX_1);
        System.out.println("Querying for list of regions");
        final ListRegionsResponse response =
                identityClient.listRegions(ListRegionsRequest.builder().build());
        System.out.println("List of regions: " + response.getItems());
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
                                ImmutableSet.of(
                                        CircuitBreakerConfiguration.TOO_MANY_REQUESTS,
                                        CircuitBreakerConfiguration.SERVICE_UNAVAILABLE))
                        .recordExceptions(
                                ImmutableList.of(
                                        CircuitBreakerConfiguration
                                                .SERVICE_UNAVAILABLE_EXCEPTION_CLASS))
                        .build();

        JaxRsCircuitBreaker cb = CircuitBreakerFactory.build(circuitBreakerConfiguration);
        ClientConfiguration clientConfiguration =
                ClientConfiguration.builder()
                        .retryConfiguration(RetryConfiguration.builder().build())
                        .circuitBreaker(cb) // using the actual circuit breaker, not the config
                        .build();

        // Create Clients using above ClientConfiguration
        IdentityClient identityClient = new IdentityClient(provider, clientConfiguration);
        ObjectStorage client = new ObjectStorageClient(provider);
        identityClient.setRegion(Region.US_PHOENIX_1);
        client.setRegion(Region.US_PHOENIX_1);

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

        client.close();
    }
}
