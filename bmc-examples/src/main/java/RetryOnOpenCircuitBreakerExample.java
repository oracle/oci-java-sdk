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
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;
import com.oracle.bmc.objectstorage.requests.ListBucketsRequest;
import com.oracle.bmc.objectstorage.responses.GetNamespaceResponse;
import com.oracle.bmc.objectstorage.responses.ListBucketsResponse;
import com.oracle.bmc.retrier.RetryConfiguration;

import javax.ws.rs.core.Response;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/** A sample to demonstrate how to configure a client using circuit breaker configuration. */
public class RetryOnOpenCircuitBreakerExample {

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

        // Retry even when the CircuitBreaker is OPEN
        retryRegardlessOfCircuitBreakerStatus(provider);
    }

    private static void retryRegardlessOfCircuitBreakerStatus(
            AuthenticationDetailsProvider provider) throws Exception {
        // Just for this example add one more status code SERVICE_NOTFOUND - 404(compare with
        // default circuit breaker setting) as the failure request in circuit breaker.
        int SERVICE_NOTFOUND = Response.Status.NOT_FOUND.getStatusCode();
        int MIN_NUM_CALLS = 2;
        CircuitBreakerConfiguration circuitBreakerConfiguration =
                CircuitBreakerConfiguration.builder()
                        .failureRateThreshold(50)
                        .slowCallRateThreshold(20)
                        .slowCallDurationThreshold(Duration.ofSeconds(6))
                        .permittedNumberOfCallsInHalfOpenState(2)
                        .slidingWindowSize(10)
                        .minimumNumberOfCalls(MIN_NUM_CALLS)
                        .waitDurationInOpenState(Duration.ofSeconds(10))
                        .recordHttpStatuses(
                                Collections.unmodifiableSet(
                                        new HashSet<>(
                                                Arrays.asList(
                                                        CircuitBreakerConfiguration
                                                                .TOO_MANY_REQUESTS,
                                                        CircuitBreakerConfiguration
                                                                .SERVICE_UNAVAILABLE,
                                                        SERVICE_NOTFOUND))))
                        .build();

        OciCircuitBreaker cb = CircuitBreakerFactory.build(circuitBreakerConfiguration, null);

        ClientConfiguration clientConfiguration =
                ClientConfiguration.builder()
                        .circuitBreaker(cb) // using the actual circuit breaker, not the config
                        .retryConfiguration(
                                RetryConfiguration
                                        .SDK_RETRY_ON_OPEN_CIRCUIT_BREAKER_DEFAULT_RETRY_CONFIGURATION)
                        .build();

        // Create Clients using above ClientConfiguration
        ObjectStorage client =
                ObjectStorageClient.builder()
                        .region(Region.US_PHOENIX_1)
                        .configuration(clientConfiguration)
                        .build(provider);

        GetNamespaceResponse namespaceResponse =
                client.getNamespace(GetNamespaceRequest.builder().build());
        String namespaceName = namespaceResponse.getValue();

        // Make the tenancy OCID incorrect to invoke 404 errors
        String invalidTenantId = "invalid_tenantId";
        ListBucketsRequest.Builder listBucketsBuilder =
                ListBucketsRequest.builder()
                        .namespaceName(namespaceName)
                        .compartmentId(invalidTenantId);

        for (int i = 0; i <= MIN_NUM_CALLS; i++) {
            try {
                System.out.println("Circuit Breaker Status - " + cb.getState());
                ListBucketsResponse listBucketsResponse =
                        client.listBuckets(listBucketsBuilder.build());
            } catch (BmcException e) {
                System.out.println(
                        "StatusCode - "
                                + e.getStatusCode()
                                + ", ServiceCode - "
                                + e.getServiceCode()
                                + " Cause - "
                                + e.getCause());
            }
        }
        client.close();
    }
}
