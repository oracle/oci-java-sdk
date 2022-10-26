/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client;

import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletionStage;

public interface HttpResponse extends Closeable {
    int status();

    Map<String, List<String>> headers();

    default String header(String name) {
        List<String> candidates = headers().get(name);
        if (candidates != null && !candidates.isEmpty()) {
            return candidates.get(0);
        } else {
            return null;
        }
    }

    CompletionStage<InputStream> streamBody();

    <T> CompletionStage<T> body(Class<T> type);

    <T> CompletionStage<List<T>> listBody(Class<T> type);

    CompletionStage<String> textBody();

    /**
     * Close this response. Some operations on the request will not work after this call (notably
     * {@link #body(Class)}). However if the body has already been requested, that body will remain
     * valid even if the stage has not yet completed, or if it is a streaming response ({@link
     * java.io.InputStream}). Such a response needs to be closed separately.
     */
    // todo: some way to cancel the request for the parsed body if the CompletionStage has not
    // returned yet?
    @Override
    void close();
}
