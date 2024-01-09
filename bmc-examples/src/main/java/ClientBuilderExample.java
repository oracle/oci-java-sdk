/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.client.KeyStoreWithPassword;
import com.oracle.bmc.http.client.StandardClientProperties;
import com.oracle.bmc.http.client.jersey.ApacheClientProperties;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

import javax.ws.rs.Priorities;
import java.security.KeyStore;
import java.time.Duration;

/** Example of creating a client using the builder pattern. */
public class ClientBuilderExample {

    private static final Duration READ_TIMEOUT_IN_MILLISECONDS = Duration.ofMillis(30000);

    public static void main(String[] args) throws Exception {

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);
        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        // Define a connection manager and its properties
        final PoolingHttpClientConnectionManager poolConnectionManager =
                new PoolingHttpClientConnectionManager();
        poolConnectionManager.setMaxTotal(100);
        poolConnectionManager.setDefaultMaxPerRoute(50);

        // Create a keyStore with password
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        String keyStorePassword = "somePassword";

        // Define ssl context for the client
        javax.net.ssl.SSLContext sslContext = null;

        // Create a client using the builder
        ObjectStorage client =
                ObjectStorageClient.builder()
                        // optional settings

                        // This will run after, and in addition to, the default client configurator;
                        // this allows you to get the default behavior from the default client
                        // configurator
                        // (in the case of the ObjectStorageClient, the non-buffering behavior), but
                        // you
                        // can also add other things on top of it, like adding new headers
                        .additionalClientConfigurator(
                                builder -> {
                                    // Setting an Apache connection manager
                                    // see also ApacheConnectorPropertiesExample.java
                                    builder.property(
                                                    ApacheClientProperties.CONNECTION_MANAGER,
                                                    poolConnectionManager)

                                            // Setting a key store
                                            .property(
                                                    StandardClientProperties.KEY_STORE,
                                                    new KeyStoreWithPassword(
                                                            keyStore, keyStorePassword))

                                            // Setting the SSL context
                                            // see also ApacheConnectorPropertiesExample.java
                                            .property(
                                                    StandardClientProperties.SSL_CONTEXT,
                                                    sslContext)

                                            // Setting a proxy
                                            // for full example, see HttpProxyExample.java
                                            // .property(StandardClientProperties.PROXY,
                                            // proxyConfig)

                                            // Setting a hostname verifier
                                            .property(
                                                    StandardClientProperties.HOSTNAME_VERIFIER,
                                                    NoopHostnameVerifier.INSTANCE)

                                            // Setting read timeout
                                            .property(
                                                    StandardClientProperties.READ_TIMEOUT,
                                                    READ_TIMEOUT_IN_MILLISECONDS)

                                            // Adding a custom header
                                            .registerRequestInterceptor(
                                                    Priorities.HEADER_DECORATOR,
                                                    request -> {
                                                        request.header("my-header", "my-value");
                                                    });
                                })

                        // authentication details provider is required, pass it to the build()
                        // method
                        .region(Region.US_PHOENIX_1)
                        .build(provider);

        // use client...
    }
}
