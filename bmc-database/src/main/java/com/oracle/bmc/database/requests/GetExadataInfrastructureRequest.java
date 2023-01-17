/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExadataInfrastructureExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetExadataInfrastructureRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetExadataInfrastructureRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Exadata infrastructure [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String exadataInfrastructureId;

    /**
     * The Exadata infrastructure [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getExadataInfrastructureId() {
        return exadataInfrastructureId;
    }
    /**
     * Unique identifier for the request.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * If provided, the specified fields will be excluded in the response.
     */
    private java.util.List<ExcludedFields> excludedFields;

    /**
     * If provided, the specified fields will be excluded in the response.
     **/
    public enum ExcludedFields {
        MultiRackConfigurationFile("multiRackConfigurationFile"),
        ;

        private final String value;
        private static java.util.Map<String, ExcludedFields> map;

        static {
            map = new java.util.HashMap<>();
            for (ExcludedFields v : ExcludedFields.values()) {
                map.put(v.getValue(), v);
            }
        }

        ExcludedFields(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExcludedFields create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ExcludedFields: " + key);
        }
    };

    /**
     * If provided, the specified fields will be excluded in the response.
     */
    public java.util.List<ExcludedFields> getExcludedFields() {
        return excludedFields;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetExadataInfrastructureRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Exadata infrastructure [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String exadataInfrastructureId = null;

        /**
         * The Exadata infrastructure [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param exadataInfrastructureId the value to set
         * @return this builder instance
         */
        public Builder exadataInfrastructureId(String exadataInfrastructureId) {
            this.exadataInfrastructureId = exadataInfrastructureId;
            return this;
        }

        /**
         * Unique identifier for the request.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * If provided, the specified fields will be excluded in the response.
         */
        private java.util.List<ExcludedFields> excludedFields = null;

        /**
         * If provided, the specified fields will be excluded in the response.
         * @param excludedFields the value to set
         * @return this builder instance
         */
        public Builder excludedFields(java.util.List<ExcludedFields> excludedFields) {
            this.excludedFields = excludedFields;
            return this;
        }

        /**
         * Singular setter. If provided, the specified fields will be excluded in the response.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder excludedFields(ExcludedFields singularValue) {
            return this.excludedFields(java.util.Arrays.asList(singularValue));
        }

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
        public Builder copy(GetExadataInfrastructureRequest o) {
            exadataInfrastructureId(o.getExadataInfrastructureId());
            opcRequestId(o.getOpcRequestId());
            excludedFields(o.getExcludedFields());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetExadataInfrastructureRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetExadataInfrastructureRequest
         */
        public GetExadataInfrastructureRequest build() {
            GetExadataInfrastructureRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetExadataInfrastructureRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetExadataInfrastructureRequest
         */
        public GetExadataInfrastructureRequest buildWithoutInvocationCallback() {
            GetExadataInfrastructureRequest request = new GetExadataInfrastructureRequest();
            request.exadataInfrastructureId = exadataInfrastructureId;
            request.opcRequestId = opcRequestId;
            request.excludedFields = excludedFields;
            return request;
            // new GetExadataInfrastructureRequest(exadataInfrastructureId, opcRequestId, excludedFields);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .exadataInfrastructureId(exadataInfrastructureId)
                .opcRequestId(opcRequestId)
                .excludedFields(excludedFields);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",exadataInfrastructureId=").append(String.valueOf(this.exadataInfrastructureId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",excludedFields=").append(String.valueOf(this.excludedFields));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetExadataInfrastructureRequest)) {
            return false;
        }

        GetExadataInfrastructureRequest other = (GetExadataInfrastructureRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.exadataInfrastructureId, other.exadataInfrastructureId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.excludedFields, other.excludedFields);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.exadataInfrastructureId == null
                                ? 43
                                : this.exadataInfrastructureId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.excludedFields == null ? 43 : this.excludedFields.hashCode());
        return result;
    }
}
