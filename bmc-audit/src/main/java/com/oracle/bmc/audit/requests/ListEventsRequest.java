/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.audit.requests;

import com.oracle.bmc.audit.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/audit/ListEventsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListEventsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListEventsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * Returns events that were processed at or after this start date and time, expressed in
     * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * <p>
     * For example, a start value of {@code 2017-01-15T11:30:00Z} will retrieve a list of all events processed
     * since 30 minutes after the 11th hour of January 15, 2017, in Coordinated Universal Time (UTC).
     * You can specify a value with granularity to the minute. Seconds (and milliseconds, if included) must
     * be set to {@code 0}.
     *
     */
    private java.util.Date startTime;

    /**
     * Returns events that were processed before this end date and time, expressed in
     * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * <p>
     * For example, a start value of {@code 2017-01-01T00:00:00Z} and an end value of {@code 2017-01-02T00:00:00Z}
     * will retrieve a list of all events processed on January 1, 2017. Similarly, a start value of
     * {@code 2017-01-01T00:00:00Z} and an end value of {@code 2017-02-01T00:00:00Z} will result in a list of all
     * events processed between January 1, 2017 and January 31, 2017. You can specify a value with
     * granularity to the minute. Seconds (and milliseconds, if included) must be set to {@code 0}.
     *
     */
    private java.util.Date endTime;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListEventsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListEventsRequest o) {
            compartmentId(o.getCompartmentId());
            startTime(o.getStartTime());
            endTime(o.getEndTime());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListEventsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListEventsRequest
         */
        public ListEventsRequest build() {
            ListEventsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
