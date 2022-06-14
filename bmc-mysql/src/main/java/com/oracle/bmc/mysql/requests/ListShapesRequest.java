/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.requests;

import com.oracle.bmc.mysql.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/ListShapesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListShapesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class ListShapesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String compartmentId;

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Customer-defined unique identifier for the request. If you need to
     * contact Oracle about a specific request, please provide the request
     * ID that you supplied in this header with the request.
     *
     */
    private String opcRequestId;

    /**
     * Customer-defined unique identifier for the request. If you need to
     * contact Oracle about a specific request, please provide the request
     * ID that you supplied in this header with the request.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Return shapes that are supported by the service feature.
     *
     */
    private java.util.List<IsSupportedFor> isSupportedFor;

    /**
     * Return shapes that are supported by the service feature.
     *
     **/
    public enum IsSupportedFor {
        Dbsystem("DBSYSTEM"),
        Analyticscluster("ANALYTICSCLUSTER"),
        Heatwavecluster("HEATWAVECLUSTER"),
        ;

        private final String value;
        private static java.util.Map<String, IsSupportedFor> map;

        static {
            map = new java.util.HashMap<>();
            for (IsSupportedFor v : IsSupportedFor.values()) {
                map.put(v.getValue(), v);
            }
        }

        IsSupportedFor(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IsSupportedFor create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid IsSupportedFor: " + key);
        }
    };

    /**
     * Return shapes that are supported by the service feature.
     *
     */
    public java.util.List<IsSupportedFor> getIsSupportedFor() {
        return isSupportedFor;
    }
    /**
     * The name of the Availability Domain.
     */
    private String availabilityDomain;

    /**
     * The name of the Availability Domain.
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }
    /**
     * Name
     */
    private String name;

    /**
     * Name
     */
    public String getName() {
        return name;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListShapesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The compartment [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String compartmentId = null;

        /**
         * The compartment [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Customer-defined unique identifier for the request. If you need to
         * contact Oracle about a specific request, please provide the request
         * ID that you supplied in this header with the request.
         *
         */
        private String opcRequestId = null;

        /**
         * Customer-defined unique identifier for the request. If you need to
         * contact Oracle about a specific request, please provide the request
         * ID that you supplied in this header with the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Return shapes that are supported by the service feature.
         *
         */
        private java.util.List<IsSupportedFor> isSupportedFor = null;

        /**
         * Return shapes that are supported by the service feature.
         *
         * @param isSupportedFor the value to set
         * @return this builder instance
         */
        public Builder isSupportedFor(java.util.List<IsSupportedFor> isSupportedFor) {
            this.isSupportedFor = isSupportedFor;
            return this;
        }

        /**
         * Singular setter. Return shapes that are supported by the service feature.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder isSupportedFor(IsSupportedFor singularValue) {
            return this.isSupportedFor(java.util.Arrays.asList(singularValue));
        }

        /**
         * The name of the Availability Domain.
         */
        private String availabilityDomain = null;

        /**
         * The name of the Availability Domain.
         * @param availabilityDomain the value to set
         * @return this builder instance
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            return this;
        }

        /**
         * Name
         */
        private String name = null;

        /**
         * Name
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
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
        public Builder copy(ListShapesRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            isSupportedFor(o.getIsSupportedFor());
            availabilityDomain(o.getAvailabilityDomain());
            name(o.getName());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListShapesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListShapesRequest
         */
        public ListShapesRequest build() {
            ListShapesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListShapesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListShapesRequest
         */
        public ListShapesRequest buildWithoutInvocationCallback() {
            ListShapesRequest request = new ListShapesRequest();
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.isSupportedFor = isSupportedFor;
            request.availabilityDomain = availabilityDomain;
            request.name = name;
            return request;
            // new ListShapesRequest(compartmentId, opcRequestId, isSupportedFor, availabilityDomain, name);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .isSupportedFor(isSupportedFor)
                .availabilityDomain(availabilityDomain)
                .name(name);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isSupportedFor=").append(String.valueOf(this.isSupportedFor));
        sb.append(",availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListShapesRequest)) {
            return false;
        }

        ListShapesRequest other = (ListShapesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isSupportedFor, other.isSupportedFor)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.isSupportedFor == null ? 43 : this.isSupportedFor.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        return result;
    }
}
