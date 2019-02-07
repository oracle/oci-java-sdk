/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns.responses;

import com.oracle.bmc.dns.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class UpdateSteeringPolicyAttachmentResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to
     * contact Oracle about a particular request, please provide the request
     * ID.
     *
     */
    private String opcRequestId;

    /**
     * The current version of the resource, ending with a
     * representation-specific suffix. This value may be used in If-Match
     * and If-None-Match headers for later requests of the same resource.
     *
     */
    private String eTag;

    /**
     * The returned SteeringPolicyAttachment instance.
     */
    private SteeringPolicyAttachment steeringPolicyAttachment;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateSteeringPolicyAttachmentResponse o) {
            opcRequestId(o.getOpcRequestId());
            eTag(o.getETag());
            steeringPolicyAttachment(o.getSteeringPolicyAttachment());

            return this;
        }
    }
}
