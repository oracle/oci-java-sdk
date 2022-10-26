/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpProvider;
import com.oracle.bmc.http.client.HttpResponse;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.client.StandardClientProperties;
import com.oracle.bmc.http.internal.SyncFutureWaiter;
import com.oracle.bmc.util.VisibleForTesting;
import org.slf4j.Logger;

import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static com.oracle.bmc.http.internal.HeaderUtils.AUTHORIZATION_HEADER_NAME;

/**
 * This path provider is used as a fallback when environment variables are not set.
 *
 * <p>For the path, use the current path: "/20180711/resourcePrincipalToken/{id}" For the resource
 * id, use IMDS to get the instance id
 */
public class ImdsRptPathProvider extends AbstractTemplateRptPathProvider {

    /** Default path template of metadata service. */
    private static final String IMDS_PATH_TEMPLATE = "/20180711/resourcePrincipalToken/{id}";

    /** Default base url of metadata service. */
    protected static final String METADATA_SERVICE_BASE_URL = "http://169.254.169.254/opc/v2/";

    /** The Authorization header value to be sent for requests to the metadata service. */
    private static final String AUTHORIZATION_HEADER_VALUE = "Bearer Oracle";

    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(ImdsRptPathProvider.class);

    private final Map<String, String> replacements;

    /**
     * Constructor of ImdsRptPathProvider.
     *
     * @param pathTemplate string template with placeholders like "{id}"
     */
    public ImdsRptPathProvider(String pathTemplate) {
        super(pathTemplate);
        replacements = buildReplacements();
    }

    @Override
    protected Map<String, String> getReplacements() {
        return replacements;
    }

    static String getPathTemplate() {
        return IMDS_PATH_TEMPLATE;
    }

    static Map<String, String> buildReplacements() {
        // Get instance Id from metadata service
        Map<String, String> replacements = new HashMap<>();
        replacements.put("id", getInstanceIdFromIMDS(METADATA_SERVICE_BASE_URL));
        return Collections.unmodifiableMap(replacements);
    }

    @InternalSdk
    @VisibleForTesting
    public static String getInstanceIdFromIMDS(String metadataServiceBaseUrl) {
        Throwable lastException = null;
        try (HttpClient client =
                HttpProvider.getDefault()
                        .newBuilder()
                        .property(StandardClientProperties.ASYNC_POOL_SIZE, 1)
                        .baseUri(URI.create(metadataServiceBaseUrl + "instance/"))
                        .build()) {

            for (int retry = 0; retry < 3; retry++) {
                try {
                    SyncFutureWaiter waiter = new SyncFutureWaiter();

                    try (HttpResponse response =
                            waiter.listenForResult(
                                    client.createRequest(Method.GET)
                                            .offloadExecutor(waiter)
                                            .appendPathPart("id")
                                            .header("Accept", "text/plain")
                                            .header(
                                                    AUTHORIZATION_HEADER_NAME,
                                                    AUTHORIZATION_HEADER_VALUE)
                                            .execute())) {
                        if (response.status() >= 300) {
                            throw new IOException("Bad response status code " + response.status());
                        }
                        return waiter.listenForResult(response.textBody());
                    }
                } catch (Throwable e) {
                    LOG.warn(
                            "Attempt {} - Rest call to get instance id from metadata service failed ",
                            (retry + 1),
                            e);
                    lastException = e;
                    try {
                        Thread.sleep(TimeUnit.SECONDS.toMillis(30));
                    } catch (InterruptedException interruptedException) {
                        LOG.debug(
                                "Thread interrupted while waiting to make next call to get instance id from instance metadata service",
                                interruptedException);
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }
        }

        if (lastException instanceof RuntimeException) {
            throw (RuntimeException) lastException;
        } else {
            throw new RuntimeException(lastException);
        }
    }
}
