/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.ConfigFileReader;
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
 * <p>Retry configuration may be set at a) the SDK level (using {@link
 * Retriers#setDefaultRetryConfiguration(RetryConfiguration)} b) the client level (using {@link
 * ClientConfiguration} c) the request level (using {@link
 * com.oracle.bmc.requests.BmcRequest#setRetryConfiguration(RetryConfiguration)}
 */
public class RetryExample {
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

        // Set the default retry strategy for all operations to set retry attempts to 3
        Retriers.setDefaultRetryConfiguration(
                RetryConfiguration.builder()
                        .terminationStrategy(new MaxAttemptsTerminationStrategy(3))
                        .build());

        // Override the default retry strategy for the identity client and update retry attempts to
        // 4
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

        // Override the client's retry strategy for the list regions request and wait for 5ms
        // between retrying
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
