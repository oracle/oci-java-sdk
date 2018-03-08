/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.ObjectStorageClient;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import java.io.IOException;

/**
 * Example of creating a client using the builder pattern.
 */
public class ClientBuilderExample {
    @Priority(Priorities.HEADER_DECORATOR)
    public static class AddMyOwnHeaderFilter implements ClientRequestFilter {
        @Override
        public void filter(ClientRequestContext requestContext) throws IOException {
            requestContext.getHeaders().putSingle("my-header", "my-value");
        }
    }

    public static void main(String[] args) throws Exception {
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        // Create a client using the builder
        ObjectStorage client =
                ObjectStorageClient.builder()
                        // optional settings

                        // This will run after, and in addition to, the default client configurator;
                        // this allows you to get the default behavior from the default client configurator
                        // (in the case of the ObjectStorageClient, the non-buffering behavior), but you
                        // can also add other things on top of it, like adding new headers
                        .additionalClientConfigurator(
                                new ClientConfigurator() {
                                    @Override
                                    public void customizeBuilder(ClientBuilder builder) {
                                        // additional customization of the ClientBuilder here
                                    }

                                    @Override
                                    public void customizeClient(Client client) {
                                        // additional customization of Client here
                                        // for example: add a custom header to the request
                                        client.register(AddMyOwnHeaderFilter.class);
                                    }
                                })

                        // .requestSignerFactory(requestSignerFactory)
                        // .configuration(configuration)
                        // .clientConfigurator(clientConfiguratorToReplaceDefault)

                        // authentication details provider is required, pass it to the build() method
                        .build(provider);

        client.setRegion(Region.US_PHOENIX_1);

        // use client...
    }
}
