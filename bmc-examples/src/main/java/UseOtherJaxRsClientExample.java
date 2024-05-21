/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.JaxRsCircuitBreaker;
import com.oracle.bmc.circuitbreaker.NoCircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.internal.JaxRsCircuitBreakerImpl;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.CompositeClientConfigurator;
import com.oracle.bmc.http.internal.EntityFactory;
import com.oracle.bmc.http.internal.RestClient;
import com.oracle.bmc.http.internal.RestClientFactory;
import com.oracle.bmc.http.internal.RestClientFactoryBuilder;
import com.oracle.bmc.http.signing.DefaultRequestSigner;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.SigningStrategy;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;

import javax.annotation.Nonnull;
import javax.ws.rs.client.Client;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * This is an example of how to supply your own JAX-RS Client (javax.ws.rs.client.Client),
 * which can be useful for testing. Use with care, since this will cause the client to
 * not use the standard javax.ws.rs.client.Client it normally uses.
 */
public class UseOtherJaxRsClientExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>The first argument is the path to the configuration file</li>
     *   <li>The second (optional) argument is the profile in the configuration file</li>
     * </ul>
     */
    public static void main(String[] args) throws Exception {
        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parse(args[0]);

        final String compartmentId;
        if (args.length == 1) {
            compartmentId = configFile.get("tenancy");
        } else if (args.length == 2) {
            compartmentId = args[0];
        } else {
            throw new IllegalArgumentException(
                    "Unexpected number of arguments received. Consult the script header comments for expected arguments");
        }

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        Client otherJaxRsClient =
                RestClientFactoryBuilder.builder()
                        .build()
                        .create(DefaultRequestSigner.createRequestSigner(provider))
                        .getClient();

        System.out.println(
                "Planning to use client "
                        + otherJaxRsClient
                        + " ("
                        + System.identityHashCode(otherJaxRsClient)
                        + ")");

        ObjectStorageClient objectStorageClient =
                ObjectStorageClient.builder()
                        .restClientFactoryBuilder(
                                new OtherJaxRsRestClientFactoryBuilder(otherJaxRsClient))
                        .build(provider);

        objectStorageClient.setRegion(Region.US_PHOENIX_1);

        // Construct GetNamespaceRequest with the given compartmentId.
        GetNamespaceRequest getNamespaceRequest =
                GetNamespaceRequest.builder().compartmentId(compartmentId).build();
        String namespace = objectStorageClient.getNamespace(getNamespaceRequest).getValue();

        System.out.println(
                String.format(
                        "Object Storage namespace for compartment [%s] is [%s]",
                        compartmentId,
                        namespace));
    }

    private static class OtherJaxRsRestClientFactoryBuilder extends RestClientFactoryBuilder {
        private final Client client;

        public OtherJaxRsRestClientFactoryBuilder(Client client) {
            this.client = client;
        }

        @Override
        public RestClientFactory build() {
            ClientConfigurator preferredClientConfigurator = getClientConfigurator();
            List<ClientConfigurator> configurators = new ArrayList<>();
            configurators.add(preferredClientConfigurator);
            configurators.addAll(getAdditionalClientConfigurators());
            System.out.println(
                    "Building RestClientFactory using client "
                            + client
                            + " ("
                            + System.identityHashCode(client)
                            + ")");
            return new OtherJaxRsRestClientFactory(
                    client,
                    new CompositeClientConfigurator(Collections.unmodifiableList(configurators)));
        }
    }

    private static class OtherJaxRsRestClientFactory extends RestClientFactory {
        private final Client client;

        public OtherJaxRsRestClientFactory(
                Client client, @Nonnull ClientConfigurator clientConfigurator) {
            super(clientConfigurator);
            this.client = client;
        }

        @Override
        public RestClient create(
                RequestSigner defaultRequestSigner,
                Map<SigningStrategy, RequestSigner> requestSigners,
                ClientConfiguration configuration,
                boolean isNonBuffering,
                JaxRsCircuitBreaker circuitBreaker) {
            if (circuitBreaker == null) {
                return create(
                        defaultRequestSigner,
                        requestSigners,
                        configuration,
                        isNonBuffering,
                        null,
                        null);
            }

            ClientConfiguration clientConfigurationToUse =
                    configuration != null ? configuration : ClientConfiguration.builder().build();

            System.out.println(
                    "Using client " + client + " (" + System.identityHashCode(client) + ")");

            return new RestClient(
                    this.client,
                    new EntityFactory(),
                    circuitBreaker,
                    isNonBuffering,
                    this.getClientConfigurator());
        }

        public RestClient create(
                RequestSigner defaultRequestSigner,
                Map<SigningStrategy, RequestSigner> requestSigners,
                ClientConfiguration configuration,
                boolean isNonBuffering,
                JaxRsCircuitBreaker circuitBreaker,
                CircuitBreakerConfiguration circuitBreakerConfiguration) {
            if (circuitBreaker != null && circuitBreakerConfiguration != null) {
                throw new IllegalArgumentException(
                        "Invalid CircuitBreaker setting. Please provide either CircuitBreaker configuration or CircuitBreaker and not both");
            }

            if (configuration != null
                    && (configuration.getCircuitBreakerConfiguration() != null
                            && configuration.getCircuitBreaker() != null)) {
                throw new IllegalArgumentException(
                        "Invalid CircuitBreaker setting. Please provide either CircuitBreaker configuration or CircuitBreaker and not both");
            }

            if (configuration != null && configuration.getCircuitBreaker() != null) {
                circuitBreaker = configuration.getCircuitBreaker();
            } else if (configuration != null
                    && configuration.getCircuitBreakerConfiguration() != null) {
                if (configuration.getCircuitBreakerConfiguration()
                        instanceof NoCircuitBreakerConfiguration) {
                    circuitBreaker = null;
                } else {
                    circuitBreaker =
                            new JaxRsCircuitBreakerImpl(
                                    configuration.getCircuitBreakerConfiguration());
                }
            } else if (circuitBreakerConfiguration != null) {
                if (circuitBreakerConfiguration instanceof NoCircuitBreakerConfiguration) {
                    circuitBreaker = null;
                } else {
                    circuitBreaker = new JaxRsCircuitBreakerImpl(circuitBreakerConfiguration);
                }
            }

            return new RestClient(
                    client,
                    new EntityFactory(),
                    circuitBreaker,
                    isNonBuffering,
                    this.getClientConfigurator());
        }
    }
}
