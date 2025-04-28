/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client;

import java.net.URI;

public interface HttpClientBuilder {
    HttpClientBuilder baseUri(URI uri);

    HttpClientBuilder baseUri(String uri);

    <T> HttpClientBuilder property(ClientProperty<T> key, T value);

    HttpClientBuilder registerRequestInterceptor(int priority, RequestInterceptor interceptor);

    HttpClient build();
}
