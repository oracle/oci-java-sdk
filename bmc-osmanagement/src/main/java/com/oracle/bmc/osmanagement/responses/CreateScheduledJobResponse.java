/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.osmanagement.responses;

import com.oracle.bmc.osmanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class CreateScheduledJobResponse {

    /**
     * A link to the created Scheduled Job
     */
    private String location;

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control. See if-match.
     *
     */
    private String etag;

    /**
     * The returned ScheduledJob instance.
     */
    private ScheduledJob scheduledJob;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateScheduledJobResponse o) {
            location(o.getLocation());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            scheduledJob(o.getScheduledJob());

            return this;
        }
    }
}
