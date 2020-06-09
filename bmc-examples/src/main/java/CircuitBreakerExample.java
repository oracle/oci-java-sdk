/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.requests.ListRegionsRequest;
import com.oracle.bmc.identity.responses.ListRegionsResponse;
import com.oracle.bmc.retrier.RetryConfiguration;

import java.time.Duration;

/**
 * A sample to demonstrate how to configure a client using circuit breaker configuration.
 */
public class CircuitBreakerExample {

    public static void main(String[] args) throws Exception {

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

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
        System.out.println("Querying for list of regions");
        final ListRegionsResponse response =
                identityClient.listRegions(ListRegionsRequest.builder().build());
        System.out.println("List of regions: " + response.getItems());
    }
}
