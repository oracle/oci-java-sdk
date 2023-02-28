/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetJobExecutionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetJobExecutionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class GetJobExecutionRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique catalog identifier. */
    private String catalogId;

    /** Unique catalog identifier. */
    public String getCatalogId() {
        return catalogId;
    }
    /** Unique job key. */
    private String jobKey;

    /** Unique job key. */
    public String getJobKey() {
        return jobKey;
    }
    /** The key of the job execution. */
    private String jobExecutionKey;

    /** The key of the job execution. */
    public String getJobExecutionKey() {
        return jobExecutionKey;
    }
    /** Specifies the fields to return in a job execution response. */
    private java.util.List<Fields> fields;

    /** Specifies the fields to return in a job execution response. */
    public enum Fields implements com.oracle.bmc.http.internal.BmcEnum {
        Key("key"),
        JobKey("jobKey"),
        JobType("jobType"),
        SubType("subType"),
        ParentKey("parentKey"),
        ScheduleInstanceKey("scheduleInstanceKey"),
        LifecycleState("lifecycleState"),
        TimeCreated("timeCreated"),
        TimeStarted("timeStarted"),
        TimeEnded("timeEnded"),
        ErrorCode("errorCode"),
        ErrorMessage("errorMessage"),
        ProcessKey("processKey"),
        ExternalUrl("externalUrl"),
        EventKey("eventKey"),
        DataEntityKey("dataEntityKey"),
        CreatedById("createdById"),
        UpdatedById("updatedById"),
        Properties("properties"),
        Uri("uri"),
        ;

        private final String value;
        private static java.util.Map<String, Fields> map;

        static {
            map = new java.util.HashMap<>();
            for (Fields v : Fields.values()) {
                map.put(v.getValue(), v);
            }
        }

        Fields(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Fields create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Fields: " + key);
        }
    };

    /** Specifies the fields to return in a job execution response. */
    public java.util.List<Fields> getFields() {
        return fields;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetJobExecutionRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique catalog identifier. */
        private String catalogId = null;

        /**
         * Unique catalog identifier.
         *
         * @param catalogId the value to set
         * @return this builder instance
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /** Unique job key. */
        private String jobKey = null;

        /**
         * Unique job key.
         *
         * @param jobKey the value to set
         * @return this builder instance
         */
        public Builder jobKey(String jobKey) {
            this.jobKey = jobKey;
            return this;
        }

        /** The key of the job execution. */
        private String jobExecutionKey = null;

        /**
         * The key of the job execution.
         *
         * @param jobExecutionKey the value to set
         * @return this builder instance
         */
        public Builder jobExecutionKey(String jobExecutionKey) {
            this.jobExecutionKey = jobExecutionKey;
            return this;
        }

        /** Specifies the fields to return in a job execution response. */
        private java.util.List<Fields> fields = null;

        /**
         * Specifies the fields to return in a job execution response.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in a job execution response.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
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
        public Builder copy(GetJobExecutionRequest o) {
            catalogId(o.getCatalogId());
            jobKey(o.getJobKey());
            jobExecutionKey(o.getJobExecutionKey());
            fields(o.getFields());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetJobExecutionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetJobExecutionRequest
         */
        public GetJobExecutionRequest build() {
            GetJobExecutionRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetJobExecutionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetJobExecutionRequest
         */
        public GetJobExecutionRequest buildWithoutInvocationCallback() {
            GetJobExecutionRequest request = new GetJobExecutionRequest();
            request.catalogId = catalogId;
            request.jobKey = jobKey;
            request.jobExecutionKey = jobExecutionKey;
            request.fields = fields;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetJobExecutionRequest(catalogId, jobKey, jobExecutionKey, fields, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogId(catalogId)
                .jobKey(jobKey)
                .jobExecutionKey(jobExecutionKey)
                .fields(fields)
                .opcRequestId(opcRequestId);
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
        sb.append(",catalogId=").append(String.valueOf(this.catalogId));
        sb.append(",jobKey=").append(String.valueOf(this.jobKey));
        sb.append(",jobExecutionKey=").append(String.valueOf(this.jobExecutionKey));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetJobExecutionRequest)) {
            return false;
        }

        GetJobExecutionRequest other = (GetJobExecutionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.jobKey, other.jobKey)
                && java.util.Objects.equals(this.jobExecutionKey, other.jobExecutionKey)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.jobKey == null ? 43 : this.jobKey.hashCode());
        result =
                (result * PRIME)
                        + (this.jobExecutionKey == null ? 43 : this.jobExecutionKey.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
