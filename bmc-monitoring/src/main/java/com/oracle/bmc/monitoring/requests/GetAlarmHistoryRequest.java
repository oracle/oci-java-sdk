/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.requests;

import com.oracle.bmc.monitoring.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/GetAlarmHistoryExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetAlarmHistoryRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
public class GetAlarmHistoryRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an
     * alarm.
     */
    private String alarmId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an
     * alarm.
     */
    public String getAlarmId() {
        return alarmId;
    }
    /**
     * Customer part of the request identifier token. If you need to contact Oracle about a
     * particular request, please provide the complete request ID.
     */
    private String opcRequestId;

    /**
     * Customer part of the request identifier token. If you need to contact Oracle about a
     * particular request, please provide the complete request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The type of history entries to retrieve. State history (STATE_HISTORY) or state transition
     * history (STATE_TRANSITION_HISTORY). If not specified, entries of both types are retrieved.
     *
     * <p>Example: {@code STATE_HISTORY}
     */
    private AlarmHistorytype alarmHistorytype;

    /**
     * The type of history entries to retrieve. State history (STATE_HISTORY) or state transition
     * history (STATE_TRANSITION_HISTORY). If not specified, entries of both types are retrieved.
     *
     * <p>Example: {@code STATE_HISTORY}
     */
    public enum AlarmHistorytype implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The type of history entries to retrieve. State history (STATE_HISTORY) or state transition
     * history (STATE_TRANSITION_HISTORY). If not specified, entries of both types are retrieved.
     *
     * <p>Example: {@code STATE_HISTORY}
     */
    public AlarmHistorytype getAlarmHistorytype() {
        return alarmHistorytype;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Default: 1000
     *
     * <p>Example: 500
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Default: 1000
     *
     * <p>Example: 500
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A filter to return only alarm history entries with timestamps occurring on or after the
     * specified date and time. Format defined by RFC3339.
     *
     * <p>Example: {@code 2019-01-01T01:00:00.789Z}
     */
    private java.util.Date timestampGreaterThanOrEqualTo;

    /**
     * A filter to return only alarm history entries with timestamps occurring on or after the
     * specified date and time. Format defined by RFC3339.
     *
     * <p>Example: {@code 2019-01-01T01:00:00.789Z}
     */
    public java.util.Date getTimestampGreaterThanOrEqualTo() {
        return timestampGreaterThanOrEqualTo;
    }
    /**
     * A filter to return only alarm history entries with timestamps occurring before the specified
     * date and time. Format defined by RFC3339.
     *
     * <p>Example: {@code 2019-01-02T01:00:00.789Z}
     */
    private java.util.Date timestampLessThan;

    /**
     * A filter to return only alarm history entries with timestamps occurring before the specified
     * date and time. Format defined by RFC3339.
     *
     * <p>Example: {@code 2019-01-02T01:00:00.789Z}
     */
    public java.util.Date getTimestampLessThan() {
        return timestampLessThan;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetAlarmHistoryRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of an alarm.
         */
        private String alarmId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of an alarm.
         *
         * @param alarmId the value to set
         * @return this builder instance
         */
        public Builder alarmId(String alarmId) {
            this.alarmId = alarmId;
            return this;
        }

        /**
         * Customer part of the request identifier token. If you need to contact Oracle about a
         * particular request, please provide the complete request ID.
         */
        private String opcRequestId = null;

        /**
         * Customer part of the request identifier token. If you need to contact Oracle about a
         * particular request, please provide the complete request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The type of history entries to retrieve. State history (STATE_HISTORY) or state
         * transition history (STATE_TRANSITION_HISTORY). If not specified, entries of both types
         * are retrieved.
         *
         * <p>Example: {@code STATE_HISTORY}
         */
        private AlarmHistorytype alarmHistorytype = null;

        /**
         * The type of history entries to retrieve. State history (STATE_HISTORY) or state
         * transition history (STATE_TRANSITION_HISTORY). If not specified, entries of both types
         * are retrieved.
         *
         * <p>Example: {@code STATE_HISTORY}
         *
         * @param alarmHistorytype the value to set
         * @return this builder instance
         */
        public Builder alarmHistorytype(AlarmHistorytype alarmHistorytype) {
            this.alarmHistorytype = alarmHistorytype;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Default: 1000
         *
         * <p>Example: 500
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Default: 1000
         *
         * <p>Example: 500
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * A filter to return only alarm history entries with timestamps occurring on or after the
         * specified date and time. Format defined by RFC3339.
         *
         * <p>Example: {@code 2019-01-01T01:00:00.789Z}
         */
        private java.util.Date timestampGreaterThanOrEqualTo = null;

        /**
         * A filter to return only alarm history entries with timestamps occurring on or after the
         * specified date and time. Format defined by RFC3339.
         *
         * <p>Example: {@code 2019-01-01T01:00:00.789Z}
         *
         * @param timestampGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timestampGreaterThanOrEqualTo(java.util.Date timestampGreaterThanOrEqualTo) {
            this.timestampGreaterThanOrEqualTo = timestampGreaterThanOrEqualTo;
            return this;
        }

        /**
         * A filter to return only alarm history entries with timestamps occurring before the
         * specified date and time. Format defined by RFC3339.
         *
         * <p>Example: {@code 2019-01-02T01:00:00.789Z}
         */
        private java.util.Date timestampLessThan = null;

        /**
         * A filter to return only alarm history entries with timestamps occurring before the
         * specified date and time. Format defined by RFC3339.
         *
         * <p>Example: {@code 2019-01-02T01:00:00.789Z}
         *
         * @param timestampLessThan the value to set
         * @return this builder instance
         */
        public Builder timestampLessThan(java.util.Date timestampLessThan) {
            this.timestampLessThan = timestampLessThan;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
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
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetAlarmHistoryRequest
         */
        public GetAlarmHistoryRequest build() {
            GetAlarmHistoryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetAlarmHistoryRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetAlarmHistoryRequest
         */
        public GetAlarmHistoryRequest buildWithoutInvocationCallback() {
            GetAlarmHistoryRequest request = new GetAlarmHistoryRequest();
            request.alarmId = alarmId;
            request.opcRequestId = opcRequestId;
            request.alarmHistorytype = alarmHistorytype;
            request.page = page;
            request.limit = limit;
            request.timestampGreaterThanOrEqualTo = timestampGreaterThanOrEqualTo;
            request.timestampLessThan = timestampLessThan;
            return request;
            // new GetAlarmHistoryRequest(alarmId, opcRequestId, alarmHistorytype, page, limit,
            // timestampGreaterThanOrEqualTo, timestampLessThan);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .alarmId(alarmId)
                .opcRequestId(opcRequestId)
                .alarmHistorytype(alarmHistorytype)
                .page(page)
                .limit(limit)
                .timestampGreaterThanOrEqualTo(timestampGreaterThanOrEqualTo)
                .timestampLessThan(timestampLessThan);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",alarmId=").append(String.valueOf(this.alarmId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",alarmHistorytype=").append(String.valueOf(this.alarmHistorytype));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",timestampGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timestampGreaterThanOrEqualTo));
        sb.append(",timestampLessThan=").append(String.valueOf(this.timestampLessThan));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAlarmHistoryRequest)) {
            return false;
        }

        GetAlarmHistoryRequest other = (GetAlarmHistoryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.alarmId, other.alarmId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.alarmHistorytype, other.alarmHistorytype)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(
                        this.timestampGreaterThanOrEqualTo, other.timestampGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timestampLessThan, other.timestampLessThan);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.alarmId == null ? 43 : this.alarmId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.alarmHistorytype == null ? 43 : this.alarmHistorytype.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result =
                (result * PRIME)
                        + (this.timestampGreaterThanOrEqualTo == null
                                ? 43
                                : this.timestampGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timestampLessThan == null ? 43 : this.timestampLessThan.hashCode());
        return result;
    }
}
