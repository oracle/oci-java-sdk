/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.requests;

import com.oracle.bmc.identitydomains.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/GetDynamicResourceGroupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetDynamicResourceGroupRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public class GetDynamicResourceGroupRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** ID of the resource */
    private String dynamicResourceGroupId;

    /** ID of the resource */
    public String getDynamicResourceGroupId() {
        return dynamicResourceGroupId;
    }
    /**
     * The Authorization field value consists of credentials containing the authentication
     * information of the user agent for the realm of the resource being requested.
     */
    private String authorization;

    /**
     * The Authorization field value consists of credentials containing the authentication
     * information of the user agent for the realm of the resource being requested.
     */
    public String getAuthorization() {
        return authorization;
    }
    /**
     * An endpoint-specific schema version number to use in the Request. Allowed version values are
     * Earliest Version or Latest Version as specified in each REST API endpoint description, or any
     * sequential number inbetween. All schema attributes/body parameters are a part of version 1.
     * After version 1, any attributes added or deprecated will be tagged with the version that they
     * were added to or deprecated in. If no version is provided, the latest schema version is
     * returned.
     */
    private String resourceTypeSchemaVersion;

    /**
     * An endpoint-specific schema version number to use in the Request. Allowed version values are
     * Earliest Version or Latest Version as specified in each REST API endpoint description, or any
     * sequential number inbetween. All schema attributes/body parameters are a part of version 1.
     * After version 1, any attributes added or deprecated will be tagged with the version that they
     * were added to or deprecated in. If no version is provided, the latest schema version is
     * returned.
     */
    public String getResourceTypeSchemaVersion() {
        return resourceTypeSchemaVersion;
    }
    /**
     * A comma-delimited string that specifies the names of resource attributes that should be
     * returned in the response. By default, a response that contains resource attributes contains
     * only attributes that are defined in the schema for that resource type as returned=always or
     * returned=default. An attribute that is defined as returned=request is returned in a response
     * only if the request specifies its name in the value of this query parameter. If a request
     * specifies this query parameter, the response contains the attributes that this query
     * parameter specifies, as well as any attribute that is defined as returned=always.
     */
    private String attributes;

    /**
     * A comma-delimited string that specifies the names of resource attributes that should be
     * returned in the response. By default, a response that contains resource attributes contains
     * only attributes that are defined in the schema for that resource type as returned=always or
     * returned=default. An attribute that is defined as returned=request is returned in a response
     * only if the request specifies its name in the value of this query parameter. If a request
     * specifies this query parameter, the response contains the attributes that this query
     * parameter specifies, as well as any attribute that is defined as returned=always.
     */
    public String getAttributes() {
        return attributes;
    }
    /**
     * A multi-valued list of strings indicating the return type of attribute definition. The
     * specified set of attributes can be fetched by the return type of the attribute. One or more
     * values can be given together to fetch more than one group of attributes. If 'attributes'
     * query parameter is also available, union of the two is fetched. Valid values - all, always,
     * never, request, default. Values are case-insensitive.
     */
    private java.util.List<com.oracle.bmc.identitydomains.model.AttributeSets> attributeSets;

    /**
     * A multi-valued list of strings indicating the return type of attribute definition. The
     * specified set of attributes can be fetched by the return type of the attribute. One or more
     * values can be given together to fetch more than one group of attributes. If 'attributes'
     * query parameter is also available, union of the two is fetched. Valid values - all, always,
     * never, request, default. Values are case-insensitive.
     */
    public java.util.List<com.oracle.bmc.identitydomains.model.AttributeSets> getAttributeSets() {
        return attributeSets;
    }
    /**
     * A token you supply to uniquely identify the request and provide idempotency if the request is
     * retried. Idempotency tokens expire after 24 hours.
     */
    private String opcRetryToken;

    /**
     * A token you supply to uniquely identify the request and provide idempotency if the request is
     * retried. Idempotency tokens expire after 24 hours.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDynamicResourceGroupRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** ID of the resource */
        private String dynamicResourceGroupId = null;

        /**
         * ID of the resource
         *
         * @param dynamicResourceGroupId the value to set
         * @return this builder instance
         */
        public Builder dynamicResourceGroupId(String dynamicResourceGroupId) {
            this.dynamicResourceGroupId = dynamicResourceGroupId;
            return this;
        }

        /**
         * The Authorization field value consists of credentials containing the authentication
         * information of the user agent for the realm of the resource being requested.
         */
        private String authorization = null;

        /**
         * The Authorization field value consists of credentials containing the authentication
         * information of the user agent for the realm of the resource being requested.
         *
         * @param authorization the value to set
         * @return this builder instance
         */
        public Builder authorization(String authorization) {
            this.authorization = authorization;
            return this;
        }

        /**
         * An endpoint-specific schema version number to use in the Request. Allowed version values
         * are Earliest Version or Latest Version as specified in each REST API endpoint
         * description, or any sequential number inbetween. All schema attributes/body parameters
         * are a part of version 1. After version 1, any attributes added or deprecated will be
         * tagged with the version that they were added to or deprecated in. If no version is
         * provided, the latest schema version is returned.
         */
        private String resourceTypeSchemaVersion = null;

        /**
         * An endpoint-specific schema version number to use in the Request. Allowed version values
         * are Earliest Version or Latest Version as specified in each REST API endpoint
         * description, or any sequential number inbetween. All schema attributes/body parameters
         * are a part of version 1. After version 1, any attributes added or deprecated will be
         * tagged with the version that they were added to or deprecated in. If no version is
         * provided, the latest schema version is returned.
         *
         * @param resourceTypeSchemaVersion the value to set
         * @return this builder instance
         */
        public Builder resourceTypeSchemaVersion(String resourceTypeSchemaVersion) {
            this.resourceTypeSchemaVersion = resourceTypeSchemaVersion;
            return this;
        }

        /**
         * A comma-delimited string that specifies the names of resource attributes that should be
         * returned in the response. By default, a response that contains resource attributes
         * contains only attributes that are defined in the schema for that resource type as
         * returned=always or returned=default. An attribute that is defined as returned=request is
         * returned in a response only if the request specifies its name in the value of this query
         * parameter. If a request specifies this query parameter, the response contains the
         * attributes that this query parameter specifies, as well as any attribute that is defined
         * as returned=always.
         */
        private String attributes = null;

        /**
         * A comma-delimited string that specifies the names of resource attributes that should be
         * returned in the response. By default, a response that contains resource attributes
         * contains only attributes that are defined in the schema for that resource type as
         * returned=always or returned=default. An attribute that is defined as returned=request is
         * returned in a response only if the request specifies its name in the value of this query
         * parameter. If a request specifies this query parameter, the response contains the
         * attributes that this query parameter specifies, as well as any attribute that is defined
         * as returned=always.
         *
         * @param attributes the value to set
         * @return this builder instance
         */
        public Builder attributes(String attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * A multi-valued list of strings indicating the return type of attribute definition. The
         * specified set of attributes can be fetched by the return type of the attribute. One or
         * more values can be given together to fetch more than one group of attributes. If
         * 'attributes' query parameter is also available, union of the two is fetched. Valid values
         * - all, always, never, request, default. Values are case-insensitive.
         */
        private java.util.List<com.oracle.bmc.identitydomains.model.AttributeSets> attributeSets =
                null;

        /**
         * A multi-valued list of strings indicating the return type of attribute definition. The
         * specified set of attributes can be fetched by the return type of the attribute. One or
         * more values can be given together to fetch more than one group of attributes. If
         * 'attributes' query parameter is also available, union of the two is fetched. Valid values
         * - all, always, never, request, default. Values are case-insensitive.
         *
         * @param attributeSets the value to set
         * @return this builder instance
         */
        public Builder attributeSets(
                java.util.List<com.oracle.bmc.identitydomains.model.AttributeSets> attributeSets) {
            this.attributeSets = attributeSets;
            return this;
        }

        /**
         * Singular setter. A multi-valued list of strings indicating the return type of attribute
         * definition. The specified set of attributes can be fetched by the return type of the
         * attribute. One or more values can be given together to fetch more than one group of
         * attributes. If 'attributes' query parameter is also available, union of the two is
         * fetched. Valid values - all, always, never, request, default. Values are
         * case-insensitive.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder attributeSets(AttributeSets singularValue) {
            return this.attributeSets(java.util.Arrays.asList(singularValue));
        }

        /**
         * A token you supply to uniquely identify the request and provide idempotency if the
         * request is retried. Idempotency tokens expire after 24 hours.
         */
        private String opcRetryToken = null;

        /**
         * A token you supply to uniquely identify the request and provide idempotency if the
         * request is retried. Idempotency tokens expire after 24 hours.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(GetDynamicResourceGroupRequest o) {
            dynamicResourceGroupId(o.getDynamicResourceGroupId());
            authorization(o.getAuthorization());
            resourceTypeSchemaVersion(o.getResourceTypeSchemaVersion());
            attributes(o.getAttributes());
            attributeSets(o.getAttributeSets());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDynamicResourceGroupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDynamicResourceGroupRequest
         */
        public GetDynamicResourceGroupRequest build() {
            GetDynamicResourceGroupRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDynamicResourceGroupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDynamicResourceGroupRequest
         */
        public GetDynamicResourceGroupRequest buildWithoutInvocationCallback() {
            GetDynamicResourceGroupRequest request = new GetDynamicResourceGroupRequest();
            request.dynamicResourceGroupId = dynamicResourceGroupId;
            request.authorization = authorization;
            request.resourceTypeSchemaVersion = resourceTypeSchemaVersion;
            request.attributes = attributes;
            request.attributeSets = attributeSets;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new GetDynamicResourceGroupRequest(dynamicResourceGroupId, authorization,
            // resourceTypeSchemaVersion, attributes, attributeSets, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .dynamicResourceGroupId(dynamicResourceGroupId)
                .authorization(authorization)
                .resourceTypeSchemaVersion(resourceTypeSchemaVersion)
                .attributes(attributes)
                .attributeSets(attributeSets)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",dynamicResourceGroupId=").append(String.valueOf(this.dynamicResourceGroupId));
        sb.append(",authorization=").append(String.valueOf(this.authorization));
        sb.append(",resourceTypeSchemaVersion=")
                .append(String.valueOf(this.resourceTypeSchemaVersion));
        sb.append(",attributes=").append(String.valueOf(this.attributes));
        sb.append(",attributeSets=").append(String.valueOf(this.attributeSets));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDynamicResourceGroupRequest)) {
            return false;
        }

        GetDynamicResourceGroupRequest other = (GetDynamicResourceGroupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.dynamicResourceGroupId, other.dynamicResourceGroupId)
                && java.util.Objects.equals(this.authorization, other.authorization)
                && java.util.Objects.equals(
                        this.resourceTypeSchemaVersion, other.resourceTypeSchemaVersion)
                && java.util.Objects.equals(this.attributes, other.attributes)
                && java.util.Objects.equals(this.attributeSets, other.attributeSets)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.dynamicResourceGroupId == null
                                ? 43
                                : this.dynamicResourceGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.authorization == null ? 43 : this.authorization.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypeSchemaVersion == null
                                ? 43
                                : this.resourceTypeSchemaVersion.hashCode());
        result = (result * PRIME) + (this.attributes == null ? 43 : this.attributes.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeSets == null ? 43 : this.attributeSets.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
