/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;
import java.util.Map;

public interface HttpClient extends Closeable {
    /**
     * Creates a new {@link HttpRequest} with the specified HTTP method.
     *
     * <p>Contrary to {@link #createRequest(Method, Map, Map)}, no placeholders will be replaced.
     *
     * <p>The oci-java-sdk-common library will only call this {@link #createRequest(Method)} method
     * if {@code hasCapability(StandardHttpProviderCapability#PARAMETERIZED_ENDPOINTS)} returns
     * false.
     *
     * @param method the HTTP method for the request
     * @return a new {@link HttpRequest} instance
     */
    HttpRequest createRequest(Method method);

    /**
     * Creates a new {@link HttpRequest} with the specified HTTP method and replaces placeholders
     * and options in the request URI with the provided parameter values.
     *
     * <p>Note that not all {@link HttpClient} implementations support parameterized endpoints. If
     * an implementation does not support it, a warning will be logged and the request will be
     * created without replacing any parameters or options.
     *
     * <p>The oci-java-sdk-common library will only call this {@link #createRequest(Method, Map,
     * Map)} method if {@code hasCapability(StandardHttpProviderCapability#OPTIONS_IN_ENDPOINTS)}
     * returns true.
     *
     * @param method the HTTP method for the request
     * @param requiredParametersMap a map of parameter names to their corresponding values
     * @param optionsMap the map from option name to enabled/disabled status
     * @return a new {@link HttpRequest} instance
     */
    default HttpRequest createRequest(
            Method method,
            Map<String, Object> requiredParametersMap,
            Map<String, Boolean> optionsMap) {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.warn(
                "HTTP client '{}' does not support options in endpoints, not replacing parameters or options.",
                this.getClass().getName());
        return createRequest(method);
    }

    @Override
    void close();

    /** Check whether the given exception is a "processing exception", e.g. a json parse failure. */
    boolean isProcessingException(Exception e);

    /**
     * Updates the endpoint URL used by this HTTP client instance.
     *
     * @param baseTarget A string representing the new base target URL for all subsequent requests
     *     made through this client.
     */
    @Deprecated
    default void updateEndpoint(String baseTarget) {
        // does not do anything
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.warn(
                "The HttpClient.updateEndpoint(String) method is deprecated and should not be called");
    }

    /**
     * Returns true if this HTTP client has the requested capability.
     *
     * <p>By default, this method returns false, indicating that no specific capabilities are
     * supported. Subclasses may override this method to provide their own capabilities.
     *
     * @return true if this HTTP client has the requested capability.
     */
    default boolean hasCapability(HttpProviderCapability capability) {
        return false;
    }
}
