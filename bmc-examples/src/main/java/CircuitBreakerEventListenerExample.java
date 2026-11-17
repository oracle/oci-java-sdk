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
import java.time.Duration;

/** Example demonstrating how to implement and use CircuitBreakerEventListener. */
public class CircuitBreakerEventListenerExample {

    public static void main(String[] args) throws Exception {
        // Uses the DEFAULT profile in ~/.oci/config. To select another file or profile,
        // use ConfigFileReader.parse(configurationFilePath, profile) instead.
        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        ClientConfiguration configuration =
                ClientConfiguration.builder()
                        .circuitBreakerConfiguration(
                                CircuitBreakerConfiguration.builder()
                                        .circuitBreakerEventListener(new MyCircuitBreakerListener())
                                        .build())
                        .build();

        try (IdentityClient identityClient =
                IdentityClient.builder().configuration(configuration).build(provider)) {
            identityClient.setRegion(Region.US_PHOENIX_1);
            System.out.println("Querying for list of regions");
            final ListRegionsResponse response =
                    identityClient.listRegions(ListRegionsRequest.builder().build());
            System.out.println("List of regions: " + response.getItems());
        }
    }

    // Simple implementation that prints a message for each supported event.
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
