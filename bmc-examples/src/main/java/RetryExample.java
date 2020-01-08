/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.requests.ListRegionsRequest;
import com.oracle.bmc.identity.responses.ListRegionsResponse;
import com.oracle.bmc.retrier.Retriers;
import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.waiter.FixedTimeDelayStrategy;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;

/**
 * This example demonstrates how to use the SDK retries.
 *
 * Retry configuration may be set at
 * a) the SDK level (using {@link Retriers#setDefaultRetryConfiguration(RetryConfiguration)}
 * b) the client level (using {@link ClientConfiguration}
 * c) the request level (using {@link com.oracle.bmc.requests.BmcRequest#setRetryConfiguration(RetryConfiguration)}
 */
public class RetryExample {
    public static void main(String[] args) throws Exception {
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        // Set the default retry strategy for all operations to set retry attempts to 3
        Retriers.setDefaultRetryConfiguration(
                RetryConfiguration.builder()
                        .terminationStrategy(new MaxAttemptsTerminationStrategy(3))
                        .build());

        // Override the default retry strategy for the identity client and update retry attempts to 4
        final Identity identityClient =
                new IdentityClient(
                        provider,
                        ClientConfiguration.builder()
                                .retryConfiguration(
                                        RetryConfiguration.builder()
                                                .terminationStrategy(
                                                        new MaxAttemptsTerminationStrategy(4))
                                                .build())
                                .build());

        // Override the client's retry strategy for the list regions request and wait for 5ms between retrying
        final ListRegionsRequest listRegionsRequest =
                ListRegionsRequest.builder()
                        .retryConfiguration(
                                RetryConfiguration.builder()
                                        .terminationStrategy(new MaxAttemptsTerminationStrategy(2))
                                        .delayStrategy(new FixedTimeDelayStrategy(5L))
                                        .build())
                        .build();
        final ListRegionsResponse listRegionsResponse =
                identityClient.listRegions(listRegionsRequest);

        System.out.println(listRegionsResponse.getItems());
    }
}
