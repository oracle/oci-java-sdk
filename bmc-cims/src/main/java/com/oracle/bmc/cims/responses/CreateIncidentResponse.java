/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.responses;

import com.oracle.bmc.cims.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class CreateIncidentResponse {

    /**
     * OPC Request Id
     */
    private String opcRequestId;

    /**
     * e-Tag
     */
    private String etag;

    /**
     * The returned Incident instance.
     */
    private Incident incident;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateIncidentResponse o) {
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            incident(o.getIncident());

            return this;
        }
    }
}
