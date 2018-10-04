/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListVolumeGroupsResponse {

    /**
     * For list pagination. When this header appears in the response, additional pages of
     * results remain. For important details about how pagination works, see
     * [List Pagination](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * A list of VolumeGroup instances.
     */
    private java.util.List<VolumeGroup> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListVolumeGroupsResponse o) {
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            items(o.getItems());

            return this;
        }
    }
}
