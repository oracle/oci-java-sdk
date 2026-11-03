/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.Priorities;
import com.oracle.bmc.http.client.jersey.ClientBuilderDecorator;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;

/**
 * Example of request tracking with the Jersey HTTP provider.
 *
 * <p>The request interceptor and per-request invocation callback store tracking attributes on the
 * SDK {@code HttpRequest}. The Jersey provider copies those attributes to Jersey request
 * properties, where a Jersey {@link ClientResponseFilter} can read them and emit response metrics.
 */
public class JerseyResponseFilterRequestTrackingExample {
    private static final String OPERATION_NAME_ATTRIBUTE = "example.operationName";
    private static final String START_NANOS_ATTRIBUTE = "example.startNanos";

    public static void main(String[] args) throws Exception {
        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file "~/.oci/config", and a profile in that config with the name "DEFAULT".
        // Make changes to the following line if needed and use
        // ConfigFileReader.parse(CONFIG_LOCATION, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider authenticationDetailsProvider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        Identity identityClient =
                IdentityClient.builder()
                        .clientConfigurator(
                                builder -> {
                                    builder.registerRequestInterceptor(
                                            Priorities.HEADER_DECORATOR,
                                            request ->
                                                    request.attribute(
                                                            START_NANOS_ATTRIBUTE,
                                                            System.nanoTime()));

                                    builder.property(
                                            ClientBuilderDecorator.PROPERTY,
                                            clientBuilder ->
                                                    clientBuilder
                                                            .register(
                                                                    new RequestTrackingResponseFilter())
                                                            .build());
                                })
                        .build(authenticationDetailsProvider);

        List<AvailabilityDomain> availabilityDomains =
                identityClient
                        .listAvailabilityDomains(
                                ListAvailabilityDomainsRequest.builder()
                                        .compartmentId(authenticationDetailsProvider.getTenantId())
                                        .invocationCallback(
                                                request ->
                                                        request.attribute(
                                                                OPERATION_NAME_ATTRIBUTE,
                                                                "ListAvailabilityDomains"))
                                        .build())
                        .getItems();

        System.out.println("List of domains: " + availabilityDomains);

        identityClient.close();
    }

    private static final class RequestTrackingResponseFilter implements ClientResponseFilter {
        @Override
        public void filter(
                ClientRequestContext requestContext, ClientResponseContext responseContext)
                throws IOException {
            String operationName = (String) requestContext.getProperty(OPERATION_NAME_ATTRIBUTE);
            Long startNanos = (Long) requestContext.getProperty(START_NANOS_ATTRIBUTE);
            long latencyMillis =
                    startNanos == null
                            ? -1
                            : TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startNanos);
            boolean failed = responseContext.getStatus() >= 400;

            System.out.printf(
                    "operation=%s status=%d failed=%s latencyMillis=%d%n",
                    operationName, responseContext.getStatus(), failed, latencyMillis);
        }
    }
}
