/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.client.StandardClientProperties;
import com.oracle.bmc.http.client.jersey.ApacheClientProperties;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy;

import javax.net.ssl.SSLContext;
import java.io.IOException;

/**
 * This class provide a basic example of how to set custom properties for the Apache Connector.
 *
 * <p>Note: Apache Configurator by default configures a connection pool with default values for
 * defaultMaxConnectionsPerRoute and maximum open connections. Please make sure to close all
 * InputStreams obtained from the response object by calling close on the stream object. For example
 * - GetObjectReponse.getInputStream().close or try-with-resources. Otherwise, the connection is not
 * released from the pool and results in hanging for an indefinite time
 */
public class ApacheConnectorPropertiesExample {

    public static void main(String[] args) throws IOException {

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        // Define ssl context for the client
        SSLContext sslContext = null;

        // Define a connection manager and its properties
        final PoolingHttpClientConnectionManager poolConnectionManager =
                new PoolingHttpClientConnectionManager();
        poolConnectionManager.setMaxTotal(100);
        poolConnectionManager.setDefaultMaxPerRoute(50);

        // Initialize the client with the Apache Configurator with custom properties
        ObjectStorageClient objectStorageClient =
                ObjectStorageClient.builder()
                        .clientConfigurator(
                                builder -> {
                                    builder.property(
                                            StandardClientProperties.HOSTNAME_VERIFIER,
                                            NoopHostnameVerifier.INSTANCE);
                                    builder.property(
                                            StandardClientProperties.SSL_CONTEXT, sslContext);
                                    builder.property(
                                            StandardClientProperties.BUFFER_REQUEST, false);
                                    builder.property(
                                            ApacheClientProperties.CONNECTION_MANAGER,
                                            poolConnectionManager);
                                })
                        .build(provider);

        // When using ApacheConnectionClosingStrategy.GracefulClosingStrategy, streams returned from
        // response are read till the end of the stream when closing the stream. This can introduce
        // additional time when closing the stream with partial read, depending on how large the
        // remaining stream is. Use ApacheConnectionClosingStrategy.ImmediateClosingStrategy for
        // large files with partial reads instead for faster close.
        // ApacheConnectionClosingStrategy.ImmediateClosingStrategy on the other hand takes longer
        // when using partial read for smaller stream size (< 1MB). Please consider your use-case
        // and change accordingly.

        ObjectStorageClient objectStorageGracefulClosingClient =
                ObjectStorageClient.builder()
                        .clientConfigurator(
                                builder -> {
                                    builder.property(
                                            StandardClientProperties.BUFFER_REQUEST, false);
                                    builder.property(
                                            ApacheClientProperties.CONNECTION_CLOSING_STRATEGY,
                                            new ApacheConnectionClosingStrategy
                                                    .GracefulClosingStrategy());
                                })
                        .build(provider);

        ObjectStorageClient objectStorageImmediateClosingClient =
                ObjectStorageClient.builder()
                        .clientConfigurator(
                                builder -> {
                                    builder.property(
                                            StandardClientProperties.BUFFER_REQUEST, false);
                                    builder.property(
                                            ApacheClientProperties.CONNECTION_CLOSING_STRATEGY,
                                            new ApacheConnectionClosingStrategy
                                                    .ImmediateClosingStrategy());
                                })
                        .build(provider);
    }
}
