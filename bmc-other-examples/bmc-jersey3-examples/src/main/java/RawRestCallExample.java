/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import com.oracle.bmc.http.Priorities;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpRequest;
import com.oracle.bmc.http.client.HttpResponse;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.client.jersey3.Jersey3HttpProvider;
import com.oracle.bmc.http.signing.RequestSigningFilter;
import com.oracle.bmc.http.internal.ParamEncoder;

public class RawRestCallExample {

    public static void main(String[] args) throws Exception {
        // TODO: fill this out
        String instanceId = null;

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // 1) Create a request signing filter instance
        RequestSigningFilter requestSigningFilter =
                RequestSigningFilter.fromConfigFile(configurationFilePath, profile);

        // 2) Create an http client, register the request signing filter, and target an endpoint.
        // You must ensure that path arguments and query params are escaped correctly yourself.
        HttpClient client =
                Jersey3HttpProvider.getInstance()
                        .newBuilder()
                        .registerRequestInterceptor(Priorities.AUTHENTICATION, requestSigningFilter)
                        .baseUri(
                                URI.create(
                                        "https://iaas.us-phoenix-1.oraclecloud.com/20160918/instances/"
                                                + ParamEncoder.encodePathParam(instanceId)))
                        .build();

        // 3) Create a request and set the expected type header
        HttpRequest request =
                client.createRequest(Method.GET).header("accepts", "application/json");

        // 4) Invoke the call and get the response.
        HttpResponse response = request.execute().toCompletableFuture().get();

        // 5) Print the response headers and the body (JSON) as a string
        Map<String, List<String>> responseHeaders = response.headers();
        System.out.println(responseHeaders);
        InputStream responseBody = response.streamBody().toCompletableFuture().get();
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
}
