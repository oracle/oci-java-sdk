/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/GetQueryResultExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetQueryResultRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class GetQueryResultRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * Work Request Identifier [OCID]
     * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * asynchronous request.
     */
    private String workRequestId;

    /**
     * Work Request Identifier [OCID]
     * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * asynchronous request.
     */
    public String getWorkRequestId() {
        return workRequestId;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * Maximum number of results to return in this request. Note a limit=-1 returns all results from
     * pageId onwards up to maxtotalCount.
     */
    private Integer limit;

    /**
     * Maximum number of results to return in this request. Note a limit=-1 returns all results from
     * pageId onwards up to maxtotalCount.
     */
    public Integer getLimit() {
        return limit;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** Include columns in response */
    private Boolean shouldIncludeColumns;

    /** Include columns in response */
    public Boolean getShouldIncludeColumns() {
        return shouldIncludeColumns;
    }
    /** Include fields in response */
    private Boolean shouldIncludeFields;

    /** Include fields in response */
    public Boolean getShouldIncludeFields() {
        return shouldIncludeFields;
    }
    /** Specifies the format for the returned results. */
    private OutputMode outputMode;

    /** Specifies the format for the returned results. */
    public enum OutputMode implements com.oracle.bmc.http.internal.BmcEnum {
        JsonRows("JSON_ROWS"),
        ;

        private final String value;
        private static java.util.Map<String, OutputMode> map;

        static {
            map = new java.util.HashMap<>();
            for (OutputMode v : OutputMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        OutputMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OutputMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid OutputMode: " + key);
        }
    };

    /** Specifies the format for the returned results. */
    public OutputMode getOutputMode() {
        return outputMode;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetQueryResultRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Logging Analytics namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * Work Request Identifier [OCID]
         * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * asynchronous request.
         */
        private String workRequestId = null;

        /**
         * Work Request Identifier [OCID]
         * (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * asynchronous request.
         *
         * @param workRequestId the value to set
         * @return this builder instance
         */
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Maximum number of results to return in this request. Note a limit=-1 returns all results
         * from pageId onwards up to maxtotalCount.
         */
        private Integer limit = null;

        /**
         * Maximum number of results to return in this request. Note a limit=-1 returns all results
         * from pageId onwards up to maxtotalCount.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** Include columns in response */
        private Boolean shouldIncludeColumns = null;

        /**
         * Include columns in response
         *
         * @param shouldIncludeColumns the value to set
         * @return this builder instance
         */
        public Builder shouldIncludeColumns(Boolean shouldIncludeColumns) {
            this.shouldIncludeColumns = shouldIncludeColumns;
            return this;
        }

        /** Include fields in response */
        private Boolean shouldIncludeFields = null;

        /**
         * Include fields in response
         *
         * @param shouldIncludeFields the value to set
         * @return this builder instance
         */
        public Builder shouldIncludeFields(Boolean shouldIncludeFields) {
            this.shouldIncludeFields = shouldIncludeFields;
            return this;
        }

        /** Specifies the format for the returned results. */
        private OutputMode outputMode = null;

        /**
         * Specifies the format for the returned results.
         *
         * @param outputMode the value to set
         * @return this builder instance
         */
        public Builder outputMode(OutputMode outputMode) {
            this.outputMode = outputMode;
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
        public Builder copy(GetQueryResultRequest o) {
            namespaceName(o.getNamespaceName());
            workRequestId(o.getWorkRequestId());
            page(o.getPage());
            limit(o.getLimit());
            opcRequestId(o.getOpcRequestId());
            shouldIncludeColumns(o.getShouldIncludeColumns());
            shouldIncludeFields(o.getShouldIncludeFields());
            outputMode(o.getOutputMode());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetQueryResultRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetQueryResultRequest
         */
        public GetQueryResultRequest build() {
            GetQueryResultRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetQueryResultRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetQueryResultRequest
         */
        public GetQueryResultRequest buildWithoutInvocationCallback() {
            GetQueryResultRequest request = new GetQueryResultRequest();
            request.namespaceName = namespaceName;
            request.workRequestId = workRequestId;
            request.page = page;
            request.limit = limit;
            request.opcRequestId = opcRequestId;
            request.shouldIncludeColumns = shouldIncludeColumns;
            request.shouldIncludeFields = shouldIncludeFields;
            request.outputMode = outputMode;
            return request;
            // new GetQueryResultRequest(namespaceName, workRequestId, page, limit, opcRequestId,
            // shouldIncludeColumns, shouldIncludeFields, outputMode);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .workRequestId(workRequestId)
                .page(page)
                .limit(limit)
                .opcRequestId(opcRequestId)
                .shouldIncludeColumns(shouldIncludeColumns)
                .shouldIncludeFields(shouldIncludeFields)
                .outputMode(outputMode);
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",shouldIncludeColumns=").append(String.valueOf(this.shouldIncludeColumns));
        sb.append(",shouldIncludeFields=").append(String.valueOf(this.shouldIncludeFields));
        sb.append(",outputMode=").append(String.valueOf(this.outputMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetQueryResultRequest)) {
            return false;
        }

        GetQueryResultRequest other = (GetQueryResultRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.shouldIncludeColumns, other.shouldIncludeColumns)
                && java.util.Objects.equals(this.shouldIncludeFields, other.shouldIncludeFields)
                && java.util.Objects.equals(this.outputMode, other.outputMode);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldIncludeColumns == null
                                ? 43
                                : this.shouldIncludeColumns.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldIncludeFields == null
                                ? 43
                                : this.shouldIncludeFields.hashCode());
        result = (result * PRIME) + (this.outputMode == null ? 43 : this.outputMode.hashCode());
        return result;
    }
}
