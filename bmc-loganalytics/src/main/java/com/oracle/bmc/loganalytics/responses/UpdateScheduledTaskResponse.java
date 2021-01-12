/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class UpdateScheduledTaskResponse {

    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control. See `if-match`.
     *
     */
    private String etag;

    /**
     * The returned ScheduledTask instance, or null if {@link #isNotModified()} is true.
     */
    private ScheduledTask scheduledTask;

    /**
     * Flag to indicate whether or not the object was modified.  If this is true,
     * the getter for the object itself will return null.  Callers should check this
     * if they specified one of the request params that might result in a conditional
     * response (like 'if-match'/'if-none-match').
     */
    private boolean isNotModified;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateScheduledTaskResponse o) {
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            scheduledTask(o.getScheduledTask());
            isNotModified(o.isNotModified());
            return this;
        }
    }
}
