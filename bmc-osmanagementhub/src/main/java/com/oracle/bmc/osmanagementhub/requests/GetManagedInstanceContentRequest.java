/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/GetManagedInstanceContentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetManagedInstanceContentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class GetManagedInstanceContentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the managed instance.
     */
    private String managedInstanceId;

    /**
     * The OCID of the managed instance.
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /**
     * The assigned erratum name. It's unique and not changeable.
     * <p>
     * Example: {@code ELSA-2020-5804}
     *
     */
    private java.util.List<String> advisoryName;

    /**
     * The assigned erratum name. It's unique and not changeable.
     * <p>
     * Example: {@code ELSA-2020-5804}
     *
     */
    public java.util.List<String> getAdvisoryName() {
        return advisoryName;
    }
    /**
     * A filter to return resources that may partially match the erratum advisory name given.
     */
    private String advisoryNameContains;

    /**
     * A filter to return resources that may partially match the erratum advisory name given.
     */
    public String getAdvisoryNameContains() {
        return advisoryNameContains;
    }
    /**
     * A filter to return only errata that match the given advisory types.
     */
    private java.util.List<AdvisoryType> advisoryType;

    /**
     * A filter to return only errata that match the given advisory types.
     **/
    public enum AdvisoryType {
        Security("SECURITY"),
        Bugfix("BUGFIX"),
        Enhancement("ENHANCEMENT"),
        ;

        private final String value;
        private static java.util.Map<String, AdvisoryType> map;

        static {
            map = new java.util.HashMap<>();
            for (AdvisoryType v : AdvisoryType.values()) {
                map.put(v.getValue(), v);
            }
        }

        AdvisoryType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AdvisoryType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AdvisoryType: " + key);
        }
    };

    /**
     * A filter to return only errata that match the given advisory types.
     */
    public java.util.List<AdvisoryType> getAdvisoryType() {
        return advisoryType;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetManagedInstanceContentRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the managed instance.
         */
        private String managedInstanceId = null;

        /**
         * The OCID of the managed instance.
         * @param managedInstanceId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }

        /**
         * The assigned erratum name. It's unique and not changeable.
         * <p>
         * Example: {@code ELSA-2020-5804}
         *
         */
        private java.util.List<String> advisoryName = null;

        /**
         * The assigned erratum name. It's unique and not changeable.
         * <p>
         * Example: {@code ELSA-2020-5804}
         *
         * @param advisoryName the value to set
         * @return this builder instance
         */
        public Builder advisoryName(java.util.List<String> advisoryName) {
            this.advisoryName = advisoryName;
            return this;
        }

        /**
         * Singular setter. The assigned erratum name. It's unique and not changeable.
         * <p>
         * Example: {@code ELSA-2020-5804}
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder advisoryName(String singularValue) {
            return this.advisoryName(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return resources that may partially match the erratum advisory name given.
         */
        private String advisoryNameContains = null;

        /**
         * A filter to return resources that may partially match the erratum advisory name given.
         * @param advisoryNameContains the value to set
         * @return this builder instance
         */
        public Builder advisoryNameContains(String advisoryNameContains) {
            this.advisoryNameContains = advisoryNameContains;
            return this;
        }

        /**
         * A filter to return only errata that match the given advisory types.
         */
        private java.util.List<AdvisoryType> advisoryType = null;

        /**
         * A filter to return only errata that match the given advisory types.
         * @param advisoryType the value to set
         * @return this builder instance
         */
        public Builder advisoryType(java.util.List<AdvisoryType> advisoryType) {
            this.advisoryType = advisoryType;
            return this;
        }

        /**
         * Singular setter. A filter to return only errata that match the given advisory types.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder advisoryType(AdvisoryType singularValue) {
            return this.advisoryType(java.util.Arrays.asList(singularValue));
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
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
        public Builder copy(GetManagedInstanceContentRequest o) {
            managedInstanceId(o.getManagedInstanceId());
            advisoryName(o.getAdvisoryName());
            advisoryNameContains(o.getAdvisoryNameContains());
            advisoryType(o.getAdvisoryType());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetManagedInstanceContentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetManagedInstanceContentRequest
         */
        public GetManagedInstanceContentRequest build() {
            GetManagedInstanceContentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetManagedInstanceContentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetManagedInstanceContentRequest
         */
        public GetManagedInstanceContentRequest buildWithoutInvocationCallback() {
            GetManagedInstanceContentRequest request = new GetManagedInstanceContentRequest();
            request.managedInstanceId = managedInstanceId;
            request.advisoryName = advisoryName;
            request.advisoryNameContains = advisoryNameContains;
            request.advisoryType = advisoryType;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetManagedInstanceContentRequest(managedInstanceId, advisoryName, advisoryNameContains, advisoryType, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedInstanceId(managedInstanceId)
                .advisoryName(advisoryName)
                .advisoryNameContains(advisoryNameContains)
                .advisoryType(advisoryType)
                .opcRequestId(opcRequestId);
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
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",advisoryName=").append(String.valueOf(this.advisoryName));
        sb.append(",advisoryNameContains=").append(String.valueOf(this.advisoryNameContains));
        sb.append(",advisoryType=").append(String.valueOf(this.advisoryType));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetManagedInstanceContentRequest)) {
            return false;
        }

        GetManagedInstanceContentRequest other = (GetManagedInstanceContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.advisoryName, other.advisoryName)
                && java.util.Objects.equals(this.advisoryNameContains, other.advisoryNameContains)
                && java.util.Objects.equals(this.advisoryType, other.advisoryType)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.advisoryName == null ? 43 : this.advisoryName.hashCode());
        result =
                (result * PRIME)
                        + (this.advisoryNameContains == null
                                ? 43
                                : this.advisoryNameContains.hashCode());
        result = (result * PRIME) + (this.advisoryType == null ? 43 : this.advisoryType.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
