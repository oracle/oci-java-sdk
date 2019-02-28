/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.monitoring.responses;

import com.oracle.bmc.monitoring.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetAlarmHistoryResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For list pagination. When this header appears in the response, additional pages of results remain.
     * For important details about how pagination works, see [List Pagination](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * The returned AlarmHistoryCollection instance.
     */
    private AlarmHistoryCollection alarmHistoryCollection;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetAlarmHistoryResponse o) {
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            alarmHistoryCollection(o.getAlarmHistoryCollection());

            return this;
        }
    }
}
