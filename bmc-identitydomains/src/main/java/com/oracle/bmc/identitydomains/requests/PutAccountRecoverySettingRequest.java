/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.requests;

import com.oracle.bmc.identitydomains.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/PutAccountRecoverySettingExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use PutAccountRecoverySettingRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public class PutAccountRecoverySettingRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identitydomains.model.AccountRecoverySetting> {

    /**
     * ID of the resource
     */
    private String accountRecoverySettingId;

    /**
     * ID of the resource
     */
    public String getAccountRecoverySettingId() {
        return accountRecoverySettingId;
    }
    /**
     * The Authorization field value consists of credentials containing the authentication information of the user agent for the realm of the resource being requested.
     */
    private String authorization;

    /**
     * The Authorization field value consists of credentials containing the authentication information of the user agent for the realm of the resource being requested.
     */
    public String getAuthorization() {
        return authorization;
    }
    /**
     * An endpoint-specific schema version number to use in the Request. Allowed version values are Earliest Version or Latest Version as specified in each REST API endpoint description, or any sequential number inbetween. All schema attributes/body parameters are a part of version 1. After version 1, any attributes added or deprecated will be tagged with the version that they were added to or deprecated in. If no version is provided, the latest schema version is returned.
     */
    private String resourceTypeSchemaVersion;

    /**
     * An endpoint-specific schema version number to use in the Request. Allowed version values are Earliest Version or Latest Version as specified in each REST API endpoint description, or any sequential number inbetween. All schema attributes/body parameters are a part of version 1. After version 1, any attributes added or deprecated will be tagged with the version that they were added to or deprecated in. If no version is provided, the latest schema version is returned.
     */
    public String getResourceTypeSchemaVersion() {
        return resourceTypeSchemaVersion;
    }
    /**
     * A comma-delimited string that specifies the names of resource attributes that should be returned in the response. By default, a response that contains resource attributes contains only attributes that are defined in the schema for that resource type as returned=always or returned=default. An attribute that is defined as returned=request is returned in a response only if the request specifies its name in the value of this query parameter. If a request specifies this query parameter, the response contains the attributes that this query parameter specifies, as well as any attribute that is defined as returned=always.
     */
    private String attributes;

    /**
     * A comma-delimited string that specifies the names of resource attributes that should be returned in the response. By default, a response that contains resource attributes contains only attributes that are defined in the schema for that resource type as returned=always or returned=default. An attribute that is defined as returned=request is returned in a response only if the request specifies its name in the value of this query parameter. If a request specifies this query parameter, the response contains the attributes that this query parameter specifies, as well as any attribute that is defined as returned=always.
     */
    public String getAttributes() {
        return attributes;
    }
    /**
     * A multi-valued list of strings indicating the return type of attribute definition. The specified set of attributes can be fetched by the return type of the attribute. One or more values can be given together to fetch more than one group of attributes. If 'attributes' query parameter is also available, union of the two is fetched. Valid values - all, always, never, request, default. Values are case-insensitive.
     */
    private java.util.List<com.oracle.bmc.identitydomains.model.AttributeSets> attributeSets;

    /**
     * A multi-valued list of strings indicating the return type of attribute definition. The specified set of attributes can be fetched by the return type of the attribute. One or more values can be given together to fetch more than one group of attributes. If 'attributes' query parameter is also available, union of the two is fetched. Valid values - all, always, never, request, default. Values are case-insensitive.
     */
    public java.util.List<com.oracle.bmc.identitydomains.model.AttributeSets> getAttributeSets() {
        return attributeSets;
    }
    /**
     * Replace the current instance of AccountRecoverySettings with provided payload.
     * <p>
     * Before you specify an attribute-value in a request to replace a resource, please check the **'mutability'** property of that attribute in the resource-type schema below. Clicking on an attribute-row will expand that row to show the **SCIM++ Properties** of that attribute.
     * - Your request to create, update or replace a resource may specify in its payload a value for any attribute that is defined as *mutability:readWrite* or *mutability:writeOnly* or *mutability:immutable*:
     *   - The SCIM APIs to create a resource will ignore silently any value that you specify for an attribute that is defined as *mutability:readOnly*.
     *   - The SCIM APIs to update or replace a resource will fail with an error 400 Bad Request if you specify a value for an attribute that is defined as *mutability:readOnly*.
     *   - Similarly, the SCIM APIs to update or replace a resource will fail with an error 400 Bad Request if you specify any value for an attribute that is defined as *mutability:immutable* and that already has a value in the specified resource.
     * <p>
     * Also, before you use the query-parameter attributes to request specific attributes, please check the **'returned'** property of that attribute in the resource-type schema below:
     * - Your request to read a resource (or to search a resource-type) can specify as the value of attributes any attributes that are defined as *returned:default* or *returned:request* or *returned:always*:
     *   - If you request a specific set of attributes, the SCIM APIs to read a resource (or to search a resource-type) will return in each resource the set of attributes that you requested, as well as any attribute that is defined as *returned:always*.
     *   - If you do not request a specific set of attributes, the SCIM APIs to read a resource (or to search a resource-type) will return in each resource the the set of attributes defined as *returned:default*, as well as any attribute that is defined as *returned:always*.
     *   - The SCIM APIs to read a resource (or to search a resource-type) will ignore silently any request to return an attribute that is defined as *returned:never*.
     *
     */
    private com.oracle.bmc.identitydomains.model.AccountRecoverySetting accountRecoverySetting;

    /**
     * Replace the current instance of AccountRecoverySettings with provided payload.
     * <p>
     * Before you specify an attribute-value in a request to replace a resource, please check the **'mutability'** property of that attribute in the resource-type schema below. Clicking on an attribute-row will expand that row to show the **SCIM++ Properties** of that attribute.
     * - Your request to create, update or replace a resource may specify in its payload a value for any attribute that is defined as *mutability:readWrite* or *mutability:writeOnly* or *mutability:immutable*:
     *   - The SCIM APIs to create a resource will ignore silently any value that you specify for an attribute that is defined as *mutability:readOnly*.
     *   - The SCIM APIs to update or replace a resource will fail with an error 400 Bad Request if you specify a value for an attribute that is defined as *mutability:readOnly*.
     *   - Similarly, the SCIM APIs to update or replace a resource will fail with an error 400 Bad Request if you specify any value for an attribute that is defined as *mutability:immutable* and that already has a value in the specified resource.
     * <p>
     * Also, before you use the query-parameter attributes to request specific attributes, please check the **'returned'** property of that attribute in the resource-type schema below:
     * - Your request to read a resource (or to search a resource-type) can specify as the value of attributes any attributes that are defined as *returned:default* or *returned:request* or *returned:always*:
     *   - If you request a specific set of attributes, the SCIM APIs to read a resource (or to search a resource-type) will return in each resource the set of attributes that you requested, as well as any attribute that is defined as *returned:always*.
     *   - If you do not request a specific set of attributes, the SCIM APIs to read a resource (or to search a resource-type) will return in each resource the the set of attributes defined as *returned:default*, as well as any attribute that is defined as *returned:always*.
     *   - The SCIM APIs to read a resource (or to search a resource-type) will ignore silently any request to return an attribute that is defined as *returned:never*.
     *
     */
    public com.oracle.bmc.identitydomains.model.AccountRecoverySetting getAccountRecoverySetting() {
        return accountRecoverySetting;
    }
    /**
     * Used to make the request conditional on an ETag
     */
    private String ifMatch;

    /**
     * Used to make the request conditional on an ETag
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * A token you supply to uniquely identify the request and provide idempotency if the request is retried. Idempotency tokens expire after 24 hours.
     */
    private String opcRetryToken;

    /**
     * A token you supply to uniquely identify the request and provide idempotency if the request is retried. Idempotency tokens expire after 24 hours.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.identitydomains.model.AccountRecoverySetting getBody$() {
        return accountRecoverySetting;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PutAccountRecoverySettingRequest,
                    com.oracle.bmc.identitydomains.model.AccountRecoverySetting> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * ID of the resource
         */
        private String accountRecoverySettingId = null;

        /**
         * ID of the resource
         * @param accountRecoverySettingId the value to set
         * @return this builder instance
         */
        public Builder accountRecoverySettingId(String accountRecoverySettingId) {
            this.accountRecoverySettingId = accountRecoverySettingId;
            return this;
        }

        /**
         * The Authorization field value consists of credentials containing the authentication information of the user agent for the realm of the resource being requested.
         */
        private String authorization = null;

        /**
         * The Authorization field value consists of credentials containing the authentication information of the user agent for the realm of the resource being requested.
         * @param authorization the value to set
         * @return this builder instance
         */
        public Builder authorization(String authorization) {
            this.authorization = authorization;
            return this;
        }

        /**
         * An endpoint-specific schema version number to use in the Request. Allowed version values are Earliest Version or Latest Version as specified in each REST API endpoint description, or any sequential number inbetween. All schema attributes/body parameters are a part of version 1. After version 1, any attributes added or deprecated will be tagged with the version that they were added to or deprecated in. If no version is provided, the latest schema version is returned.
         */
        private String resourceTypeSchemaVersion = null;

        /**
         * An endpoint-specific schema version number to use in the Request. Allowed version values are Earliest Version or Latest Version as specified in each REST API endpoint description, or any sequential number inbetween. All schema attributes/body parameters are a part of version 1. After version 1, any attributes added or deprecated will be tagged with the version that they were added to or deprecated in. If no version is provided, the latest schema version is returned.
         * @param resourceTypeSchemaVersion the value to set
         * @return this builder instance
         */
        public Builder resourceTypeSchemaVersion(String resourceTypeSchemaVersion) {
            this.resourceTypeSchemaVersion = resourceTypeSchemaVersion;
            return this;
        }

        /**
         * A comma-delimited string that specifies the names of resource attributes that should be returned in the response. By default, a response that contains resource attributes contains only attributes that are defined in the schema for that resource type as returned=always or returned=default. An attribute that is defined as returned=request is returned in a response only if the request specifies its name in the value of this query parameter. If a request specifies this query parameter, the response contains the attributes that this query parameter specifies, as well as any attribute that is defined as returned=always.
         */
        private String attributes = null;

        /**
         * A comma-delimited string that specifies the names of resource attributes that should be returned in the response. By default, a response that contains resource attributes contains only attributes that are defined in the schema for that resource type as returned=always or returned=default. An attribute that is defined as returned=request is returned in a response only if the request specifies its name in the value of this query parameter. If a request specifies this query parameter, the response contains the attributes that this query parameter specifies, as well as any attribute that is defined as returned=always.
         * @param attributes the value to set
         * @return this builder instance
         */
        public Builder attributes(String attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * A multi-valued list of strings indicating the return type of attribute definition. The specified set of attributes can be fetched by the return type of the attribute. One or more values can be given together to fetch more than one group of attributes. If 'attributes' query parameter is also available, union of the two is fetched. Valid values - all, always, never, request, default. Values are case-insensitive.
         */
        private java.util.List<com.oracle.bmc.identitydomains.model.AttributeSets> attributeSets =
                null;

        /**
         * A multi-valued list of strings indicating the return type of attribute definition. The specified set of attributes can be fetched by the return type of the attribute. One or more values can be given together to fetch more than one group of attributes. If 'attributes' query parameter is also available, union of the two is fetched. Valid values - all, always, never, request, default. Values are case-insensitive.
         * @param attributeSets the value to set
         * @return this builder instance
         */
        public Builder attributeSets(
                java.util.List<com.oracle.bmc.identitydomains.model.AttributeSets> attributeSets) {
            this.attributeSets = attributeSets;
            return this;
        }

        /**
         * Singular setter. A multi-valued list of strings indicating the return type of attribute definition. The specified set of attributes can be fetched by the return type of the attribute. One or more values can be given together to fetch more than one group of attributes. If 'attributes' query parameter is also available, union of the two is fetched. Valid values - all, always, never, request, default. Values are case-insensitive.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder attributeSets(AttributeSets singularValue) {
            return this.attributeSets(java.util.Arrays.asList(singularValue));
        }

        /**
         * Replace the current instance of AccountRecoverySettings with provided payload.
         * <p>
         * Before you specify an attribute-value in a request to replace a resource, please check the **'mutability'** property of that attribute in the resource-type schema below. Clicking on an attribute-row will expand that row to show the **SCIM++ Properties** of that attribute.
         * - Your request to create, update or replace a resource may specify in its payload a value for any attribute that is defined as *mutability:readWrite* or *mutability:writeOnly* or *mutability:immutable*:
         *   - The SCIM APIs to create a resource will ignore silently any value that you specify for an attribute that is defined as *mutability:readOnly*.
         *   - The SCIM APIs to update or replace a resource will fail with an error 400 Bad Request if you specify a value for an attribute that is defined as *mutability:readOnly*.
         *   - Similarly, the SCIM APIs to update or replace a resource will fail with an error 400 Bad Request if you specify any value for an attribute that is defined as *mutability:immutable* and that already has a value in the specified resource.
         * <p>
         * Also, before you use the query-parameter attributes to request specific attributes, please check the **'returned'** property of that attribute in the resource-type schema below:
         * - Your request to read a resource (or to search a resource-type) can specify as the value of attributes any attributes that are defined as *returned:default* or *returned:request* or *returned:always*:
         *   - If you request a specific set of attributes, the SCIM APIs to read a resource (or to search a resource-type) will return in each resource the set of attributes that you requested, as well as any attribute that is defined as *returned:always*.
         *   - If you do not request a specific set of attributes, the SCIM APIs to read a resource (or to search a resource-type) will return in each resource the the set of attributes defined as *returned:default*, as well as any attribute that is defined as *returned:always*.
         *   - The SCIM APIs to read a resource (or to search a resource-type) will ignore silently any request to return an attribute that is defined as *returned:never*.
         *
         */
        private com.oracle.bmc.identitydomains.model.AccountRecoverySetting accountRecoverySetting =
                null;

        /**
         * Replace the current instance of AccountRecoverySettings with provided payload.
         * <p>
         * Before you specify an attribute-value in a request to replace a resource, please check the **'mutability'** property of that attribute in the resource-type schema below. Clicking on an attribute-row will expand that row to show the **SCIM++ Properties** of that attribute.
         * - Your request to create, update or replace a resource may specify in its payload a value for any attribute that is defined as *mutability:readWrite* or *mutability:writeOnly* or *mutability:immutable*:
         *   - The SCIM APIs to create a resource will ignore silently any value that you specify for an attribute that is defined as *mutability:readOnly*.
         *   - The SCIM APIs to update or replace a resource will fail with an error 400 Bad Request if you specify a value for an attribute that is defined as *mutability:readOnly*.
         *   - Similarly, the SCIM APIs to update or replace a resource will fail with an error 400 Bad Request if you specify any value for an attribute that is defined as *mutability:immutable* and that already has a value in the specified resource.
         * <p>
         * Also, before you use the query-parameter attributes to request specific attributes, please check the **'returned'** property of that attribute in the resource-type schema below:
         * - Your request to read a resource (or to search a resource-type) can specify as the value of attributes any attributes that are defined as *returned:default* or *returned:request* or *returned:always*:
         *   - If you request a specific set of attributes, the SCIM APIs to read a resource (or to search a resource-type) will return in each resource the set of attributes that you requested, as well as any attribute that is defined as *returned:always*.
         *   - If you do not request a specific set of attributes, the SCIM APIs to read a resource (or to search a resource-type) will return in each resource the the set of attributes defined as *returned:default*, as well as any attribute that is defined as *returned:always*.
         *   - The SCIM APIs to read a resource (or to search a resource-type) will ignore silently any request to return an attribute that is defined as *returned:never*.
         *
         * @param accountRecoverySetting the value to set
         * @return this builder instance
         */
        public Builder accountRecoverySetting(
                com.oracle.bmc.identitydomains.model.AccountRecoverySetting
                        accountRecoverySetting) {
            this.accountRecoverySetting = accountRecoverySetting;
            return this;
        }

        /**
         * Used to make the request conditional on an ETag
         */
        private String ifMatch = null;

        /**
         * Used to make the request conditional on an ETag
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * A token you supply to uniquely identify the request and provide idempotency if the request is retried. Idempotency tokens expire after 24 hours.
         */
        private String opcRetryToken = null;

        /**
         * A token you supply to uniquely identify the request and provide idempotency if the request is retried. Idempotency tokens expire after 24 hours.
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(PutAccountRecoverySettingRequest o) {
            accountRecoverySettingId(o.getAccountRecoverySettingId());
            authorization(o.getAuthorization());
            resourceTypeSchemaVersion(o.getResourceTypeSchemaVersion());
            attributes(o.getAttributes());
            attributeSets(o.getAttributeSets());
            accountRecoverySetting(o.getAccountRecoverySetting());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PutAccountRecoverySettingRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of PutAccountRecoverySettingRequest
         */
        public PutAccountRecoverySettingRequest build() {
            PutAccountRecoverySettingRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.identitydomains.model.AccountRecoverySetting body) {
            accountRecoverySetting(body);
            return this;
        }

        /**
         * Build the instance of PutAccountRecoverySettingRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PutAccountRecoverySettingRequest
         */
        public PutAccountRecoverySettingRequest buildWithoutInvocationCallback() {
            PutAccountRecoverySettingRequest request = new PutAccountRecoverySettingRequest();
            request.accountRecoverySettingId = accountRecoverySettingId;
            request.authorization = authorization;
            request.resourceTypeSchemaVersion = resourceTypeSchemaVersion;
            request.attributes = attributes;
            request.attributeSets = attributeSets;
            request.accountRecoverySetting = accountRecoverySetting;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new PutAccountRecoverySettingRequest(accountRecoverySettingId, authorization, resourceTypeSchemaVersion, attributes, attributeSets, accountRecoverySetting, ifMatch, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .accountRecoverySettingId(accountRecoverySettingId)
                .authorization(authorization)
                .resourceTypeSchemaVersion(resourceTypeSchemaVersion)
                .attributes(attributes)
                .attributeSets(attributeSets)
                .accountRecoverySetting(accountRecoverySetting)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",accountRecoverySettingId=")
                .append(String.valueOf(this.accountRecoverySettingId));
        sb.append(",authorization=").append(String.valueOf(this.authorization));
        sb.append(",resourceTypeSchemaVersion=")
                .append(String.valueOf(this.resourceTypeSchemaVersion));
        sb.append(",attributes=").append(String.valueOf(this.attributes));
        sb.append(",attributeSets=").append(String.valueOf(this.attributeSets));
        sb.append(",accountRecoverySetting=").append(String.valueOf(this.accountRecoverySetting));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PutAccountRecoverySettingRequest)) {
            return false;
        }

        PutAccountRecoverySettingRequest other = (PutAccountRecoverySettingRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.accountRecoverySettingId, other.accountRecoverySettingId)
                && java.util.Objects.equals(this.authorization, other.authorization)
                && java.util.Objects.equals(
                        this.resourceTypeSchemaVersion, other.resourceTypeSchemaVersion)
                && java.util.Objects.equals(this.attributes, other.attributes)
                && java.util.Objects.equals(this.attributeSets, other.attributeSets)
                && java.util.Objects.equals(
                        this.accountRecoverySetting, other.accountRecoverySetting)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.accountRecoverySettingId == null
                                ? 43
                                : this.accountRecoverySettingId.hashCode());
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
                        + (this.accountRecoverySetting == null
                                ? 43
                                : this.accountRecoverySetting.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
