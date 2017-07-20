/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetConsoleHistoryContentRequest {

    /**
     * The OCID of the console history.
     */
    private String instanceConsoleHistoryId;

    /**
     * Offset of the snapshot data to retrieve.
     */
    private Integer offset;

    /**
     * Length of the snapshot data to retrieve.
     */
    private Integer length;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetConsoleHistoryContentRequest o) {
            instanceConsoleHistoryId(o.getInstanceConsoleHistoryId());
            offset(o.getOffset());
            length(o.getLength());
            return this;
        }
    }
}
