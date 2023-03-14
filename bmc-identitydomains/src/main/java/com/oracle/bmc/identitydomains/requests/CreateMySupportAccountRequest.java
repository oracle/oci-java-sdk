/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.requests;

import com.oracle.bmc.identitydomains.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/CreateMySupportAccountExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateMySupportAccountRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public class CreateMySupportAccountRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identitydomains.model.MySupportAccount> {

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
     * MySupportAccount schema.
     *
     * <p>Before you specify an attribute-value in a request to create a resource, please check the
     * **'mutability'** property of that attribute in the resource-type schema below. Clicking on an
     * attribute-row will expand that row to show the **SCIM++ Properties** of that attribute. -
     * Your request to create, update or replace a resource may specify in its payload a value for
     * any attribute that is defined as *mutability:readWrite* or *mutability:writeOnly* or
     * *mutability:immutable*: - The SCIM APIs to create a resource will ignore silently any value
     * that you specify for an attribute that is defined as *mutability:readOnly*. - The SCIM APIs
     * to update or replace a resource will fail with an error 400 Bad Request if you specify a
     * value for an attribute that is defined as *mutability:readOnly*. - Similarly, the SCIM APIs
     * to update or replace a resource will fail with an error 400 Bad Request if you specify any
     * value for an attribute that is defined as *mutability:immutable* and that already has a value
     * in the specified resource.
     *
     * <p>Also, before you use the query-parameter attributes to request specific attributes, please
     * check the **'returned'** property of that attribute in the resource-type schema below: - Your
     * request to read a resource (or to search a resource-type) can specify as the value of
     * attributes any attributes that are defined as *returned:default* or *returned:request* or
     * *returned:always*: - If you request a specific set of attributes, the SCIM APIs to read a
     * resource (or to search a resource-type) will return in each resource the set of attributes
     * that you requested, as well as any attribute that is defined as *returned:always*. - If you
     * do not request a specific set of attributes, the SCIM APIs to read a resource (or to search a
     * resource-type) will return in each resource the the set of attributes defined as
     * *returned:default*, as well as any attribute that is defined as *returned:always*. - The SCIM
     * APIs to read a resource (or to search a resource-type) will ignore silently any request to
     * return an attribute that is defined as *returned:never*.
     */
    private com.oracle.bmc.identitydomains.model.MySupportAccount mySupportAccount;

    /**
     * MySupportAccount schema.
     *
     * <p>Before you specify an attribute-value in a request to create a resource, please check the
     * **'mutability'** property of that attribute in the resource-type schema below. Clicking on an
     * attribute-row will expand that row to show the **SCIM++ Properties** of that attribute. -
     * Your request to create, update or replace a resource may specify in its payload a value for
     * any attribute that is defined as *mutability:readWrite* or *mutability:writeOnly* or
     * *mutability:immutable*: - The SCIM APIs to create a resource will ignore silently any value
     * that you specify for an attribute that is defined as *mutability:readOnly*. - The SCIM APIs
     * to update or replace a resource will fail with an error 400 Bad Request if you specify a
     * value for an attribute that is defined as *mutability:readOnly*. - Similarly, the SCIM APIs
     * to update or replace a resource will fail with an error 400 Bad Request if you specify any
     * value for an attribute that is defined as *mutability:immutable* and that already has a value
     * in the specified resource.
     *
     * <p>Also, before you use the query-parameter attributes to request specific attributes, please
     * check the **'returned'** property of that attribute in the resource-type schema below: - Your
     * request to read a resource (or to search a resource-type) can specify as the value of
     * attributes any attributes that are defined as *returned:default* or *returned:request* or
     * *returned:always*: - If you request a specific set of attributes, the SCIM APIs to read a
     * resource (or to search a resource-type) will return in each resource the set of attributes
     * that you requested, as well as any attribute that is defined as *returned:always*. - If you
     * do not request a specific set of attributes, the SCIM APIs to read a resource (or to search a
     * resource-type) will return in each resource the the set of attributes defined as
     * *returned:default*, as well as any attribute that is defined as *returned:always*. - The SCIM
     * APIs to read a resource (or to search a resource-type) will ignore silently any request to
     * return an attribute that is defined as *returned:never*.
     */
    public com.oracle.bmc.identitydomains.model.MySupportAccount getMySupportAccount() {
        return mySupportAccount;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.identitydomains.model.MySupportAccount getBody$() {
        return mySupportAccount;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateMySupportAccountRequest,
                    com.oracle.bmc.identitydomains.model.MySupportAccount> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
         * MySupportAccount schema.
         *
         * <p>Before you specify an attribute-value in a request to create a resource, please check
         * the **'mutability'** property of that attribute in the resource-type schema below.
         * Clicking on an attribute-row will expand that row to show the **SCIM++ Properties** of
         * that attribute. - Your request to create, update or replace a resource may specify in its
         * payload a value for any attribute that is defined as *mutability:readWrite* or
         * *mutability:writeOnly* or *mutability:immutable*: - The SCIM APIs to create a resource
         * will ignore silently any value that you specify for an attribute that is defined as
         * *mutability:readOnly*. - The SCIM APIs to update or replace a resource will fail with an
         * error 400 Bad Request if you specify a value for an attribute that is defined as
         * *mutability:readOnly*. - Similarly, the SCIM APIs to update or replace a resource will
         * fail with an error 400 Bad Request if you specify any value for an attribute that is
         * defined as *mutability:immutable* and that already has a value in the specified resource.
         *
         * <p>Also, before you use the query-parameter attributes to request specific attributes,
         * please check the **'returned'** property of that attribute in the resource-type schema
         * below: - Your request to read a resource (or to search a resource-type) can specify as
         * the value of attributes any attributes that are defined as *returned:default* or
         * *returned:request* or *returned:always*: - If you request a specific set of attributes,
         * the SCIM APIs to read a resource (or to search a resource-type) will return in each
         * resource the set of attributes that you requested, as well as any attribute that is
         * defined as *returned:always*. - If you do not request a specific set of attributes, the
         * SCIM APIs to read a resource (or to search a resource-type) will return in each resource
         * the the set of attributes defined as *returned:default*, as well as any attribute that is
         * defined as *returned:always*. - The SCIM APIs to read a resource (or to search a
         * resource-type) will ignore silently any request to return an attribute that is defined as
         * *returned:never*.
         */
        private com.oracle.bmc.identitydomains.model.MySupportAccount mySupportAccount = null;

        /**
         * MySupportAccount schema.
         *
         * <p>Before you specify an attribute-value in a request to create a resource, please check
         * the **'mutability'** property of that attribute in the resource-type schema below.
         * Clicking on an attribute-row will expand that row to show the **SCIM++ Properties** of
         * that attribute. - Your request to create, update or replace a resource may specify in its
         * payload a value for any attribute that is defined as *mutability:readWrite* or
         * *mutability:writeOnly* or *mutability:immutable*: - The SCIM APIs to create a resource
         * will ignore silently any value that you specify for an attribute that is defined as
         * *mutability:readOnly*. - The SCIM APIs to update or replace a resource will fail with an
         * error 400 Bad Request if you specify a value for an attribute that is defined as
         * *mutability:readOnly*. - Similarly, the SCIM APIs to update or replace a resource will
         * fail with an error 400 Bad Request if you specify any value for an attribute that is
         * defined as *mutability:immutable* and that already has a value in the specified resource.
         *
         * <p>Also, before you use the query-parameter attributes to request specific attributes,
         * please check the **'returned'** property of that attribute in the resource-type schema
         * below: - Your request to read a resource (or to search a resource-type) can specify as
         * the value of attributes any attributes that are defined as *returned:default* or
         * *returned:request* or *returned:always*: - If you request a specific set of attributes,
         * the SCIM APIs to read a resource (or to search a resource-type) will return in each
         * resource the set of attributes that you requested, as well as any attribute that is
         * defined as *returned:always*. - If you do not request a specific set of attributes, the
         * SCIM APIs to read a resource (or to search a resource-type) will return in each resource
         * the the set of attributes defined as *returned:default*, as well as any attribute that is
         * defined as *returned:always*. - The SCIM APIs to read a resource (or to search a
         * resource-type) will ignore silently any request to return an attribute that is defined as
         * *returned:never*.
         *
         * @param mySupportAccount the value to set
         * @return this builder instance
         */
        public Builder mySupportAccount(
                com.oracle.bmc.identitydomains.model.MySupportAccount mySupportAccount) {
            this.mySupportAccount = mySupportAccount;
            return this;
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
        public Builder copy(CreateMySupportAccountRequest o) {
            authorization(o.getAuthorization());
            resourceTypeSchemaVersion(o.getResourceTypeSchemaVersion());
            mySupportAccount(o.getMySupportAccount());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateMySupportAccountRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateMySupportAccountRequest
         */
        public CreateMySupportAccountRequest build() {
            CreateMySupportAccountRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.identitydomains.model.MySupportAccount body) {
            mySupportAccount(body);
            return this;
        }

        /**
         * Build the instance of CreateMySupportAccountRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateMySupportAccountRequest
         */
        public CreateMySupportAccountRequest buildWithoutInvocationCallback() {
            CreateMySupportAccountRequest request = new CreateMySupportAccountRequest();
            request.authorization = authorization;
            request.resourceTypeSchemaVersion = resourceTypeSchemaVersion;
            request.mySupportAccount = mySupportAccount;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateMySupportAccountRequest(authorization, resourceTypeSchemaVersion,
            // mySupportAccount, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .authorization(authorization)
                .resourceTypeSchemaVersion(resourceTypeSchemaVersion)
                .mySupportAccount(mySupportAccount)
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
        sb.append(",authorization=").append(String.valueOf(this.authorization));
        sb.append(",resourceTypeSchemaVersion=")
                .append(String.valueOf(this.resourceTypeSchemaVersion));
        sb.append(",mySupportAccount=").append(String.valueOf(this.mySupportAccount));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMySupportAccountRequest)) {
            return false;
        }

        CreateMySupportAccountRequest other = (CreateMySupportAccountRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.authorization, other.authorization)
                && java.util.Objects.equals(
                        this.resourceTypeSchemaVersion, other.resourceTypeSchemaVersion)
                && java.util.Objects.equals(this.mySupportAccount, other.mySupportAccount)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.authorization == null ? 43 : this.authorization.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypeSchemaVersion == null
                                ? 43
                                : this.resourceTypeSchemaVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.mySupportAccount == null ? 43 : this.mySupportAccount.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
