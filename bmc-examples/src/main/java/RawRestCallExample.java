/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import com.google.common.net.UrlEscapers;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.signing.DefaultRequestSigner;
import com.oracle.bmc.http.signing.RequestSigner;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class RawRestCallExample {

    public static void main(String[] args) throws Exception {
        // TODO: fill this out
        String instanceId = null;

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // 1) Create your auth provider and request signer
        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);
        RequestSigner requestSigner = DefaultRequestSigner.createRequestSigner(provider);

        // 2) Create a Jersey client
        Client client =
                ClientBuilder.newBuilder().build().register(new SigningFilter(requestSigner));

        // 3) Target an endpoint. You must ensure that path arguments and query
        // params are escaped correctly yourself
        WebTarget target =
                client.target("https://iaas.us-phoenix-1.oraclecloud.com")
                        .path("20160918")
                        .path("instances")
                        .path(UrlEscapers.urlPathSegmentEscaper().escape(instanceId));

        // 4) Set the expected type and invoke the call
        Invocation.Builder ib = target.request();
        ib.accept(MediaType.APPLICATION_JSON);
        Response response = ib.get();

        // 5) Print the response headers and the body (JSON) as a string
        MultivaluedMap<String, Object> responseHeaders = response.getHeaders();
        System.out.println(responseHeaders);
        InputStream responseBody = (InputStream) response.getEntity();
        try (final BufferedReader reader =
                new BufferedReader(new InputStreamReader(responseBody, StandardCharsets.UTF_8))) {
            StringBuilder jsonBody = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonBody.append(line);
            }
            System.out.println(jsonBody.toString());
        }
    }

    @Priority(Priorities.AUTHENTICATION)
    @RequiredArgsConstructor
    private static class SigningFilter implements ClientRequestFilter {
        private final RequestSigner requestSigner;

        @Override
        public void filter(@NonNull ClientRequestContext clientRequestContext) throws IOException {
            Map<String, String> authHeaders =
                    requestSigner.signRequest(
                            clientRequestContext.getUri(),
                            clientRequestContext.getMethod(),
                            clientRequestContext.getStringHeaders(),
                            clientRequestContext.getEntity());

            for (Map.Entry<String, String> e : authHeaders.entrySet()) {
                clientRequestContext.getHeaders().putSingle(e.getKey(), e.getValue());
            }
        }
    }
}
