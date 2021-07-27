/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.requests;

import com.oracle.bmc.monitoring.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/GetAlarmHistoryExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetAlarmHistoryRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetAlarmHistoryRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an alarm.
     *
     */
    private String alarmId;

    /**
     * Customer part of the request identifier token. If you need to contact Oracle about a particular
     * request, please provide the complete request ID.
     *
     */
    private String opcRequestId;

    /**
     * The type of history entries to retrieve. State history (STATE_HISTORY) or state transition history (STATE_TRANSITION_HISTORY).
     * If not specified, entries of both types are retrieved.
     * <p>
     * Example: {@code STATE_HISTORY}
     *
     */
    private AlarmHistorytype alarmHistorytype;

    /**
     * The type of history entries to retrieve. State history (STATE_HISTORY) or state transition history (STATE_TRANSITION_HISTORY).
     * If not specified, entries of both types are retrieved.
     * <p>
     * Example: {@code STATE_HISTORY}
     *
     **/
    public enum AlarmHistorytype {
        StateHistory("STATE_HISTORY"),
        StateTransitionHistory("STATE_TRANSITION_HISTORY"),
        ;

        private final String value;
        private static java.util.Map<String, AlarmHistorytype> map;

        static {
            map = new java.util.HashMap<>();
            for (AlarmHistorytype v : AlarmHistorytype.values()) {
                map.put(v.getValue(), v);
            }
        }

        AlarmHistorytype(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AlarmHistorytype create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AlarmHistorytype: " + key);
        }
    };
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Default: 1000
     * <p>
     * Example: 500
     *
     */
    private Integer limit;

    /**
     * A filter to return only alarm history entries with timestamps occurring on or after the specified date and time. Format defined by RFC3339.
     * <p>
     * Example: {@code 2019-01-01T01:00:00.789Z}
     *
     */
    private java.util.Date timestampGreaterThanOrEqualTo;

    /**
     * A filter to return only alarm history entries with timestamps occurring before the specified date and time. Format defined by RFC3339.
     * <p>
     * Example: {@code 2019-01-02T01:00:00.789Z}
     *
     */
    private java.util.Date timestampLessThan;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetAlarmHistoryRequest, java.lang.Void> {
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
        public Builder copy(GetAlarmHistoryRequest o) {
            alarmId(o.getAlarmId());
            opcRequestId(o.getOpcRequestId());
            alarmHistorytype(o.getAlarmHistorytype());
            page(o.getPage());
            limit(o.getLimit());
            timestampGreaterThanOrEqualTo(o.getTimestampGreaterThanOrEqualTo());
            timestampLessThan(o.getTimestampLessThan());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetAlarmHistoryRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetAlarmHistoryRequest
         */
        public GetAlarmHistoryRequest build() {
            GetAlarmHistoryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
