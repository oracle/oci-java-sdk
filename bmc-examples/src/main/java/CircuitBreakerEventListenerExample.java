/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.CircuitBreakerEventListener;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.requests.ListRegionsRequest;
import com.oracle.bmc.identity.responses.ListRegionsResponse;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;

import java.io.IOException;
import java.time.Duration;

/**
 * Example demonstrating how to implement and use CircuitBreakerEventListener.
 */
public class CircuitBreakerEventListenerExample {

    public static void main(String[] args) throws IOException {

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        // Setup CircuitBreakerConfiguration with custom CircuitBreakerListener
        ClientConfiguration configuration =
                ClientConfiguration.builder()
                        .circuitBreakerConfiguration(
                                CircuitBreakerConfiguration.builder()
                                        .circuitBreakerEventListener(new MyCircuitBreakerListener())
                                        .build())
                        .build();

        // Create Client using above ClientConfiguration
        IdentityClient identityClient =
                IdentityClient.builder().configuration(configuration).build(provider);
        identityClient.setRegion(Region.US_PHOENIX_1);
        System.out.println("Querying for list of regions");
        final ListRegionsResponse response =
                identityClient.listRegions(ListRegionsRequest.builder().build());
        System.out.println("List of regions: " + response.getItems());
        identityClient.close();
    }

    // Simple implementation of CircuitBreakerEventListener that prints messages for each event.
    public static class MyCircuitBreakerListener implements CircuitBreakerEventListener {
        @Override
        public void onSuccess(Duration duration) {
            System.out.println("Call succeeded in " + duration.toMillis() + " ms");
        }

        @Override
        public void onError(Throwable throwable) {
            System.out.println("Call failed with error: " + throwable);
        }

        @Override
        public void onStateTransition(CircuitBreaker.StateTransition stateTransition) {
            System.out.println(
                    "State changed: "
                            + stateTransition.getFromState()
                            + " -> "
                            + stateTransition.getToState());
        }

        @Override
        public void onCallNotPermitted() {
            System.out.println("Circuit breaker blocked the call (not permitted).");
        }

        @Override
        public void onReset() {
            System.out.println("Circuit breaker was reset.");
        }

        @Override
        public void onFailureRateExceeded() {
            System.out.println("Failure rate threshold exceeded.");
        }
    }
}
