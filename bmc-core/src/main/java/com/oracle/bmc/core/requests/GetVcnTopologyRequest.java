/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVcnTopologyExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetVcnTopologyRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetVcnTopologyRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
     */
    private String vcnId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
     */
    public String getVcnId() {
        return vcnId;
    }
    /**
     * Valid values are {@code ANY} and {@code ACCESSIBLE}. The default is {@code ANY}.
     * Setting this to {@code ACCESSIBLE} returns only compartments for which a
     * user has INSPECT permissions, either directly or indirectly (permissions can be on a
     * resource in a subcompartment). A restricted set of fields is returned for compartments in which a user has
     * indirect INSPECT permissions.
     * <p>
     * When set to {@code ANY} permissions are not checked.
     *
     */
    private AccessLevel accessLevel;

    /**
     * Valid values are {@code ANY} and {@code ACCESSIBLE}. The default is {@code ANY}.
     * Setting this to {@code ACCESSIBLE} returns only compartments for which a
     * user has INSPECT permissions, either directly or indirectly (permissions can be on a
     * resource in a subcompartment). A restricted set of fields is returned for compartments in which a user has
     * indirect INSPECT permissions.
     * <p>
     * When set to {@code ANY} permissions are not checked.
     *
     **/
    public enum AccessLevel {
        Any("ANY"),
        Accessible("ACCESSIBLE"),
        ;

        private final String value;
        private static java.util.Map<String, AccessLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessLevel v : AccessLevel.values()) {
                map.put(v.getValue(), v);
            }
        }

        AccessLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccessLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AccessLevel: " + key);
        }
    };

    /**
     * Valid values are {@code ANY} and {@code ACCESSIBLE}. The default is {@code ANY}.
     * Setting this to {@code ACCESSIBLE} returns only compartments for which a
     * user has INSPECT permissions, either directly or indirectly (permissions can be on a
     * resource in a subcompartment). A restricted set of fields is returned for compartments in which a user has
     * indirect INSPECT permissions.
     * <p>
     * When set to {@code ANY} permissions are not checked.
     *
     */
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    /**
     * When set to true, the hierarchy of compartments is traversed
     * and the specified compartment and its subcompartments are
     * inspected depending on the the setting of {@code accessLevel}.
     * Default is false.
     *
     */
    private Boolean queryCompartmentSubtree;

    /**
     * When set to true, the hierarchy of compartments is traversed
     * and the specified compartment and its subcompartments are
     * inspected depending on the the setting of {@code accessLevel}.
     * Default is false.
     *
     */
    public Boolean getQueryCompartmentSubtree() {
        return queryCompartmentSubtree;
    }
    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For querying if there is a cached value on the server. The If-None-Match HTTP request header
     * makes the request conditional. For GET and HEAD methods, the server will send back the requested
     * resource, with a 200 status, only if it doesn't have an ETag matching the given ones.
     * For other methods, the request will be processed only if the eventually existing resource's
     * ETag doesn't match any of the values listed.
     *
     */
    private String ifNoneMatch;

    /**
     * For querying if there is a cached value on the server. The If-None-Match HTTP request header
     * makes the request conditional. For GET and HEAD methods, the server will send back the requested
     * resource, with a 200 status, only if it doesn't have an ETag matching the given ones.
     * For other methods, the request will be processed only if the eventually existing resource's
     * ETag doesn't match any of the values listed.
     *
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }
    /**
     * The Cache-Control HTTP header holds directives (instructions)
     * for caching in both requests and responses.
     *
     */
    private String cacheControl;

    /**
     * The Cache-Control HTTP header holds directives (instructions)
     * for caching in both requests and responses.
     *
     */
    public String getCacheControl() {
        return cacheControl;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetVcnTopologyRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
         */
        private String vcnId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
         * @param vcnId the value to set
         * @return this builder instance
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            return this;
        }

        /**
         * Valid values are {@code ANY} and {@code ACCESSIBLE}. The default is {@code ANY}.
         * Setting this to {@code ACCESSIBLE} returns only compartments for which a
         * user has INSPECT permissions, either directly or indirectly (permissions can be on a
         * resource in a subcompartment). A restricted set of fields is returned for compartments in which a user has
         * indirect INSPECT permissions.
         * <p>
         * When set to {@code ANY} permissions are not checked.
         *
         */
        private AccessLevel accessLevel = null;

        /**
         * Valid values are {@code ANY} and {@code ACCESSIBLE}. The default is {@code ANY}.
         * Setting this to {@code ACCESSIBLE} returns only compartments for which a
         * user has INSPECT permissions, either directly or indirectly (permissions can be on a
         * resource in a subcompartment). A restricted set of fields is returned for compartments in which a user has
         * indirect INSPECT permissions.
         * <p>
         * When set to {@code ANY} permissions are not checked.
         *
         * @param accessLevel the value to set
         * @return this builder instance
         */
        public Builder accessLevel(AccessLevel accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        /**
         * When set to true, the hierarchy of compartments is traversed
         * and the specified compartment and its subcompartments are
         * inspected depending on the the setting of {@code accessLevel}.
         * Default is false.
         *
         */
        private Boolean queryCompartmentSubtree = null;

        /**
         * When set to true, the hierarchy of compartments is traversed
         * and the specified compartment and its subcompartments are
         * inspected depending on the the setting of {@code accessLevel}.
         * Default is false.
         *
         * @param queryCompartmentSubtree the value to set
         * @return this builder instance
         */
        public Builder queryCompartmentSubtree(Boolean queryCompartmentSubtree) {
            this.queryCompartmentSubtree = queryCompartmentSubtree;
            return this;
        }

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For querying if there is a cached value on the server. The If-None-Match HTTP request header
         * makes the request conditional. For GET and HEAD methods, the server will send back the requested
         * resource, with a 200 status, only if it doesn't have an ETag matching the given ones.
         * For other methods, the request will be processed only if the eventually existing resource's
         * ETag doesn't match any of the values listed.
         *
         */
        private String ifNoneMatch = null;

        /**
         * For querying if there is a cached value on the server. The If-None-Match HTTP request header
         * makes the request conditional. For GET and HEAD methods, the server will send back the requested
         * resource, with a 200 status, only if it doesn't have an ETag matching the given ones.
         * For other methods, the request will be processed only if the eventually existing resource's
         * ETag doesn't match any of the values listed.
         *
         * @param ifNoneMatch the value to set
         * @return this builder instance
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
            return this;
        }

        /**
         * The Cache-Control HTTP header holds directives (instructions)
         * for caching in both requests and responses.
         *
         */
        private String cacheControl = null;

        /**
         * The Cache-Control HTTP header holds directives (instructions)
         * for caching in both requests and responses.
         *
         * @param cacheControl the value to set
         * @return this builder instance
         */
        public Builder cacheControl(String cacheControl) {
            this.cacheControl = cacheControl;
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
        public Builder copy(GetVcnTopologyRequest o) {
            compartmentId(o.getCompartmentId());
            vcnId(o.getVcnId());
            accessLevel(o.getAccessLevel());
            queryCompartmentSubtree(o.getQueryCompartmentSubtree());
            opcRequestId(o.getOpcRequestId());
            ifNoneMatch(o.getIfNoneMatch());
            cacheControl(o.getCacheControl());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetVcnTopologyRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetVcnTopologyRequest
         */
        public GetVcnTopologyRequest build() {
            GetVcnTopologyRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetVcnTopologyRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetVcnTopologyRequest
         */
        public GetVcnTopologyRequest buildWithoutInvocationCallback() {
            GetVcnTopologyRequest request = new GetVcnTopologyRequest();
            request.compartmentId = compartmentId;
            request.vcnId = vcnId;
            request.accessLevel = accessLevel;
            request.queryCompartmentSubtree = queryCompartmentSubtree;
            request.opcRequestId = opcRequestId;
            request.ifNoneMatch = ifNoneMatch;
            request.cacheControl = cacheControl;
            return request;
            // new GetVcnTopologyRequest(compartmentId, vcnId, accessLevel, queryCompartmentSubtree, opcRequestId, ifNoneMatch, cacheControl);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .vcnId(vcnId)
                .accessLevel(accessLevel)
                .queryCompartmentSubtree(queryCompartmentSubtree)
                .opcRequestId(opcRequestId)
                .ifNoneMatch(ifNoneMatch)
                .cacheControl(cacheControl);
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
        sb.append(",vcnId=").append(String.valueOf(this.vcnId));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",queryCompartmentSubtree=").append(String.valueOf(this.queryCompartmentSubtree));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(",cacheControl=").append(String.valueOf(this.cacheControl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetVcnTopologyRequest)) {
            return false;
        }

        GetVcnTopologyRequest other = (GetVcnTopologyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(
                        this.queryCompartmentSubtree, other.queryCompartmentSubtree)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch)
                && java.util.Objects.equals(this.cacheControl, other.cacheControl);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.queryCompartmentSubtree == null
                                ? 43
                                : this.queryCompartmentSubtree.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        result = (result * PRIME) + (this.cacheControl == null ? 43 : this.cacheControl.hashCode());
        return result;
    }
}
