# Apache Connector

When using the Jersey 2 or Jersey 3 HTTP clients (`oci-java-sdk-common-httpclient-jersey` or `oci-java-sdk-common-httpclient-jersey3`), the Oracle Cloud Infrastructure Java SDK now by default uses the `ApacheConnector` instead of the Jersey default `HttpUrlConnector` to send requests to the service.

## Memory Consumption due to Buffering by the Apache Connector

The `ApacheConfigurator` buffers requests into memory and can impact memory utilization of your application.  This increased use of memory is especially relevant when using`ObjectStorageClient` to upload large objects to the Object Storage service.
In order to prevent buffering of requests in memory please use `ApacheConfigurator.NonBuffering` and provide the `contentLength` when calling the API. For example, when calling `ObjectStorageClient.putObject()`, pass the content length when creating 
`PutObjectRequest`. For `ObjectStorageClient`, `ApacheConfigurator.NonBuffering` is the default option. Overriding the 
`clientConfigurator` will default back to Jersey Default Connector.

## Switching Back to Jersey Default HttpUrlConnectorProvider

The Oracle Cloud Infrastructure SDK for Java (starting versions 2.0.0) supports Jersey `ApacheConnectorProvider` by default instead of Jersey default `HttpUrlConnectorProvider`. This is to enable the support for the Apache HttpClient for making service calls. For customers who would like to switch back to the old Jersey default client, we provide an option to do so. 

There are multiple ways to configure this option depending up whether you want to switch back to the Jersey default HttpUrlConnectorProvider globally or per-client. This can be achieved by the following ways:

1. per client
2. globally by excluding the Apache HttpClient dependencies
3. globally by setting an environment variable

## Switching Back to Jersey Default HttpUrlConnectorProvider: per client

At the client level, the SDK provides the following way to switch back to the old Jersey default connector:

```
ObjectStorageClient nonBufferingObjectStorageClient = ObjectStorageClient
        .builder()
        .clientConfigurator(builder -> {
            builder.property(JerseyClientProperties.USE_APACHE_CONNECTOR, false);
        })
        // ...
        .build(provider);
```

## Switching Back to Jersey Default HttpUrlConnectorProvider: globally by excluding the Apache HttpClient dependencies

At the global level, the SDK for Java provides the following way to switch back to the old Jersey default Connector:

### Self-Managed Dependencies

If you are managing dependencies yourself:

1. Remove the `org.apache.httpcomponents.httpclient` and `org.glassfish.jersey.connectors.jersey-apache-connector` JARs from the classpath

### Maven-Managed Dependencies

If you are using Maven to manage your dependencies:

1. Add exclusion for the `org.apache.httpcomponents.httpclient` and `org.glassfish.jersey.connectors.jersey-apache-connector` dependencies.

Depending on whether you use Jersey 2:

    <dependencies>
        ...
        <dependency>
            <groupId>com.oracle.oci.sdk</groupId>
            <artifactId>oci-java-sdk-common-httpclient-jersey</artifactId>
            <version>...</version>
            <exclusions>
                <exclusion>
                    <groupId>org.glassfish.jersey.connectors</groupId>
                    <artifactId>jersey-apache-connector</artifactId>
                </exclusion>
                <exclusion>
                    <groupId>org.apache.httpcomponents</groupId>
                    <artifactId>httpclient</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        ...
    <dependencies>

or Jersey 3:

    <dependencies>
        ...
        <dependency>
            <groupId>com.oracle.oci.sdk</groupId>
            <artifactId>oci-java-sdk-common-httpclient-jersey3</artifactId>
            <version>...</version>
            <exclusions>
                <exclusion>
                    <groupId>org.glassfish.jersey.connectors</groupId>
                    <artifactId>jersey-apache-connector</artifactId>
                </exclusion>
                <exclusion>
                    <groupId>org.apache.httpcomponents</groupId>
                    <artifactId>httpclient</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        ...
    <dependencies>


## Switching Back to Jersey Default HttpUrlConnectorProvider: globally via environment variable

The SDK for Java also provides an environment variable to switch back to the old Jersey Default Connector at the global level. To achieve the same, please set the value of the environment variable - `OCI_JAVASDK_JERSEY_CLIENT_DEFAULT_CONNECTOR_ENABLED` to true. By default, this value is set as false.

## Maximum size of stream with BufferedInputStream

When using the `BufferedInputStream` with API operations to upload streams to the service, e.g. to upload objects to the Object Storage service using `putObject`, the stream is buffered into the memory. The maximum buffer size in this case is `Integer.MAX_VALUE - 8` as defined in the [source code](https://github.com/AdoptOpenJDK/openjdk-jdk11/blob/master/src/java.base/share/classes/java/io/InputStream.java#L297). Hence, don't use or wrap the object into `BufferedInputStream` when the size of the object to upload is greater than `2.14 GB`. This would lead to `Connection pool shutdown`/`Out of memory` errors.

# Switching off auto-close of streams 

For API calls that return binary/stream response, the SDK will auto-close the stream once the stream has been completely read by the customer. If reading the stream completely, the SDK will automatically try to close the stream to release the connection from the connection pool, to disable this feature of auto-closing streams on full read, please call `com.oracle.bmc.http.client.Options.shouldAutoCloseResponseInputStream(false)`. This is because the SDK for Java supports the Apache Connector for sending requests and managing connections to the service. By default, the Apache Connector supports connection pooling and in the cases where the stream from the response is not closed, the connections don't get released from the connection pool and in turn results in an indefinite wait time.

# Configuration for Apache Connector

## Configure the Connection Pool

The ApacheConfigurator configures a connection pool by default. However, the connection pool can be configured or disabled. Configure the connection pool as follows:

    final PoolingHttpClientConnectionManager poolConnectionManager =
            new PoolingHttpClientConnectionManager();
    poolConnectionManager.setMaxTotal(100);
    poolConnectionManager.setDefaultMaxPerRoute(50);

    // Initialize the client with custom properties
    ObjectStorageClient objectStorageClient =
            ObjectStorageClient.builder()
                    .clientConfigurator(
                            builder -> {
                                builder.property(
                                        StandardClientProperties.BUFFER_REQUEST, false);
                                builder.property(
                                        ApacheClientProperties.CONNECTION_MANAGER,
                                        poolConnectionManager);
                            })
                    .build(provider);

Note: If connection pooling is disabled, then the thread-safe `BasicHttpClientConnectionManager` is used for the Apache HttpClient, i.e. 
a connection manager for a single connection. This connection manager maintains only one active connection. Even
though this class is fully thread-safe it ought to be used by one execution thread only, as only one thread a
time can lease the connection at a time. This connection manager implementation should be used inside an EJB container.
			
Documentation explaining the configuration concepts can be found [here](https://hc.apache.org/httpcomponents-client-ga/tutorial/html/connmgmt.html).

## Configure the SSLContext and HostNameVerifier

    final javax.net.ssl.HostnameVerifier hostnameVerifier =
        org.apache.http.conn.ssl.NoopHostnameVerifier.INSTANCE;

    final javax.net.ssl.SSLContext sslContext =
        javax.net.ssl.SSLContext.getDefault();

    ObjectStorage client = ObjectStorageClient.builder()
            .clientConfigurator(
                    builder -> {
                        builder.property(
                                StandardClientProperties.HOSTNAME_VERIFIER,
                                hostnameVerifier);
                        builder.property(
                                StandardClientProperties.SSL_CONTEXT,
                                sslContext);
                    })
            .build(authenticationDetailsProvider);

## Example

An example of configuring the Apache connector can be found [here](https://github.com/oracle/oci-java-sdk/tree/master/bmc-examples/src/main/java/ApacheConnectorPropertiesExample.java).

# Configure an HTTP Proxy

This add-on supports configuring a client to use an HTTP or HTTPS proxy.  It is configured on a per-client basis, meaning that a proxy must be configured for each new client instance.

Configure an HTTP or HTTPS proxy as follows:

## Authenticated Proxy

    ProxyConfiguration proxyConfig =
        ProxyConfiguration.builder()
            .proxy(new Proxy(Proxy.Type.HTTP,
                new InetSocketAddress("http://proxy.domain.com", 8000)))
            .username("username")
            .password("password".toCharArray())
            .build();

    IdentityClient identityClient = IdentityClient.builder()
            .clientConfigurator(builder -> {
                builder.property(StandardClientProperties.PROXY, proxyConfig);
            })
            .build(authenticationDetailsProvider);

## Unauthenticated Proxy

    ProxyConfiguration proxyConfig =
        ProxyConfiguration.builder()
            .proxy(new Proxy(Proxy.Type.HTTP,
                new InetSocketAddress("http://proxy.domain.com", 8000)))
            .build();

    IdentityClient identityClient = IdentityClient.builder()
            .clientConfigurator(builder -> {
                builder.property(StandardClientProperties.PROXY, proxyConfig);
            })
            .build(authenticationDetailsProvider);

## Example
An example of configuring a proxy can be found [here](https://github.com/oracle/oci-java-sdk/tree/master/bmc-examples/src/main/java/HttpProxyExample.java).

# Known Issues

## Program hangs for an indefinite time

`ApacheConfigurator` by default configures a connection pool with `defaultMaxConnectionsPerRoute` and
`maximumOpenConnections`. Please make sure to close all `InputStreams` obtained from the response object by
calling close on the stream object if doing partial read or if not reading at all. If the stream is read completely, then the SDK will try to
auto-close the stream to release the connection from the connection pool. 
To manually close the stream in case of partial read of stream/no read. Please call close on the stream.
For example - `GetObjectResponse.getInputStream().close()` or
use try-with-resources. Otherwise, a partial read without closing will lead to the connection not being released from 
the pool and results in hanging for an indefinite time.

In addition to the above steps, please make sure to specify the `ConnectionRequestTimeout` in the `ClientConfigurator`. By adding this, requests made after connection pool exhaustion will throw a Timeout exception instead of hanging indefinitely.
An example can be found [here](https://github.com/oracle/oci-java-sdk/tree/master/bmc-examples/src/main/java/ApacheConnectorPropertiesExample.java).

## Performance issues and switching between connection closing strategies with the Apache Connector

The Java SDK supports the Apache Connector as the default. The Apache Connector supports the use of two connection closing strategies - `ApacheConnectionClosingStrategy.GracefulClosingStrategy` and `ApacheConnectionClosingStrategy.ImmediateClosingStrategy`. 
When using `ApacheConnectionClosingStrategy.GracefulClosingStrategy`, streams returned from response are read till the end of the stream when closing the stream. This can introduce additional time when closing the stream with partial read, depending on how large the remaining stream is.
Use `ApacheConnectionClosingStrategy.ImmediateClosingStrategy` for large files with partial reads instead for faster close. One of the disadvantages of using
`ApacheConnectionClosingStrategy.ImmediateClosingStrategy` on the other hand takes longer when using partial read for smaller stream size (< 1MB). Please consider your use-case and change accordingly.

Note : If both the above Apache Connection closing strategies do not give you optimal results for your use-cases, please consider switching back to Jersey Default `HttpUrlConnectorProvider` using the method stated in the above section.

An example can be found [here](https://github.com/oracle/oci-java-sdk/tree/master/bmc-examples/src/main/java/ApacheConnectorPropertiesExample.java)

## More info

### Idle connection monitor thread to evict idle and expired connections
The SDK since version `3.31.0` by default enables an idle connection monitor thread to evict idle and expired connections in the Apache Connector. More details can be found [here](https://hc.apache.org/httpcomponents-client-4.5.x/current/tutorial/html/connmgmt.html) With this change we have also enabled connection reuse which fixes a performance regression caused in version `2.14.1`. Link to the detailed issue can be found [here](https://github.com/oracle/oci-java-sdk/issues/378). To disable the idle connection monitor thread, set the system property `oci.javasdk.apache.idle.connection.monitor.thread.enabled` to `false`. You can also configure the idle connection monitor thread by following this [example](https://github.com/oracle/oci-java-sdk/tree/master/bmc-other-examples/bmc-jersey-examples/src/main/java/ConfigureApacheIdleConnectionMonitorExample.java)

Note : Disabling connection monitor thread by changing the system property disables the connection reuse

### Disabling extra logs related to streams
The SDK emits warnings related to streams when an API that returns streams in its response is called. To disable the logs around streams, you can set 
the system property `oci.javasdk.extra.stream.logs.enabled` to `false`. This can be done programmatically or by passing a system property in the java command line.

More examples related to customizing Apache Connector can be found [here](https://github.com/oracle/oci-java-sdk/tree/master/bmc-examples/src/main/java/ApacheConnectorPropertiesExample.java) 

## License
Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl
or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

See [LICENSE](LICENSE.txt) for more details.
