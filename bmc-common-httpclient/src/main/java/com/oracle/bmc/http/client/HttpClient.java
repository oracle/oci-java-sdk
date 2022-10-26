/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client;

import java.io.Closeable;

public interface HttpClient extends Closeable {
    HttpRequest createRequest(Method method);

    @Override
    void close();

    /** Check whether the given exception is a "processing exception", e.g. a json parse failure. */
    boolean isProcessingException(Exception e);
}
