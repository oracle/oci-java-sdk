/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.events.responses;

import com.oracle.bmc.events.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class CreateRuleResponse {

    /**
     * For optimistic concurrency control. Add this value to the `if-match` parameter
     * in a PUT or DELETE operation. The resource will be updated only if the value you
     * provide matches the `etag` on the resource.
     *
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The returned Rule instance.
     */
    private Rule rule;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateRuleResponse o) {
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            rule(o.getRule());

            return this;
        }
    }
}
