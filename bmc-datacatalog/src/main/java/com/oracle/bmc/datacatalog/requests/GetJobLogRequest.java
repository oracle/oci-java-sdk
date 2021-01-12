/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetJobLogExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetJobLogRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class GetJobLogRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique catalog identifier.
     */
    private String catalogId;

    /**
     * Unique job key.
     */
    private String jobKey;

    /**
     * The key of the job execution.
     */
    private String jobExecutionKey;

    /**
     * Unique job log key.
     */
    private String jobLogKey;

    /**
     * Specifies the fields to return in a job log response.
     *
     */
    private java.util.List<Fields> fields;

    /**
     * Specifies the fields to return in a job log response.
     *
     **/
    public enum Fields {
        Key("key"),
        JobExecutionKey("jobExecutionKey"),
        CreatedById("createdById"),
        UpdatedById("updatedById"),
        TimeUpdated("timeUpdated"),
        TimeCreated("timeCreated"),
        Severity("severity"),
        LogMessage("logMessage"),
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
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetJobLogRequest, java.lang.Void> {
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
        public Builder copy(GetJobLogRequest o) {
            catalogId(o.getCatalogId());
            jobKey(o.getJobKey());
            jobExecutionKey(o.getJobExecutionKey());
            jobLogKey(o.getJobLogKey());
            fields(o.getFields());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetJobLogRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetJobLogRequest
         */
        public GetJobLogRequest build() {
            GetJobLogRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
