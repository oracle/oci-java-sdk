/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker;

/** HTTP response metadata used to classify circuit-breaker failures across SDK modules. */
public interface HttpStatusProvider {
    /**
     * Returns the HTTP response status, or a value outside 100–599 when no response is available.
     */
    int getStatusCode();
}
