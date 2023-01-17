/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.requests;

import com.oracle.bmc.dataconnectivity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataconnectivity/CreateEntityShapeExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateEntityShapeRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public class CreateEntityShapeRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dataconnectivity.model.CreateEntityShapeDetails> {

    /**
     * The registry OCID.
     */
    private String registryId;

    /**
     * The registry OCID.
     */
    public String getRegistryId() {
        return registryId;
    }
    /**
     * The connection key.
     */
    private String connectionKey;

    /**
     * The connection key.
     */
    public String getConnectionKey() {
        return connectionKey;
    }
    /**
     * The schema resource name used for retrieving schemas.
     */
    private String schemaResourceName;

    /**
     * The schema resource name used for retrieving schemas.
     */
    public String getSchemaResourceName() {
        return schemaResourceName;
    }
    /**
     * The details required to create the data entity shape.
     */
    private com.oracle.bmc.dataconnectivity.model.CreateEntityShapeDetails createEntityShapeDetails;

    /**
     * The details required to create the data entity shape.
     */
    public com.oracle.bmc.dataconnectivity.model.CreateEntityShapeDetails
            getCreateEntityShapeDetails() {
        return createEntityShapeDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without the risk of executing that same action again.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without the risk of executing that same action again.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value.
     * When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value.
     * When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Authorization mode for communicating with another OCI service relevant for the API.
     */
    private AuthorizationMode authorizationMode;

    /**
     * Authorization mode for communicating with another OCI service relevant for the API.
     **/
    public enum AuthorizationMode {
        Obo("OBO"),
        UserPrincipal("USER_PRINCIPAL"),
        ResourcePrincipal("RESOURCE_PRINCIPAL"),
        InstancePrincipal("INSTANCE_PRINCIPAL"),
        Undefined("UNDEFINED"),
        ;

        private final String value;
        private static java.util.Map<String, AuthorizationMode> map;

        static {
            map = new java.util.HashMap<>();
            for (AuthorizationMode v : AuthorizationMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        AuthorizationMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuthorizationMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AuthorizationMode: " + key);
        }
    };

    /**
     * Authorization mode for communicating with another OCI service relevant for the API.
     */
    public AuthorizationMode getAuthorizationMode() {
        return authorizationMode;
    }
    /**
     * Endpoint ID used for getDataAssetFullDetails.
     */
    private String endpointId;

    /**
     * Endpoint ID used for getDataAssetFullDetails.
     */
    public String getEndpointId() {
        return endpointId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dataconnectivity.model.CreateEntityShapeDetails getBody$() {
        return createEntityShapeDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateEntityShapeRequest,
                    com.oracle.bmc.dataconnectivity.model.CreateEntityShapeDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The registry OCID.
         */
        private String registryId = null;

        /**
         * The registry OCID.
         * @param registryId the value to set
         * @return this builder instance
         */
        public Builder registryId(String registryId) {
            this.registryId = registryId;
            return this;
        }

        /**
         * The connection key.
         */
        private String connectionKey = null;

        /**
         * The connection key.
         * @param connectionKey the value to set
         * @return this builder instance
         */
        public Builder connectionKey(String connectionKey) {
            this.connectionKey = connectionKey;
            return this;
        }

        /**
         * The schema resource name used for retrieving schemas.
         */
        private String schemaResourceName = null;

        /**
         * The schema resource name used for retrieving schemas.
         * @param schemaResourceName the value to set
         * @return this builder instance
         */
        public Builder schemaResourceName(String schemaResourceName) {
            this.schemaResourceName = schemaResourceName;
            return this;
        }

        /**
         * The details required to create the data entity shape.
         */
        private com.oracle.bmc.dataconnectivity.model.CreateEntityShapeDetails
                createEntityShapeDetails = null;

        /**
         * The details required to create the data entity shape.
         * @param createEntityShapeDetails the value to set
         * @return this builder instance
         */
        public Builder createEntityShapeDetails(
                com.oracle.bmc.dataconnectivity.model.CreateEntityShapeDetails
                        createEntityShapeDetails) {
            this.createEntityShapeDetails = createEntityShapeDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without the risk of executing that same action again.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without the risk of executing that same action again.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value.
         * When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value.
         * When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Authorization mode for communicating with another OCI service relevant for the API.
         */
        private AuthorizationMode authorizationMode = null;

        /**
         * Authorization mode for communicating with another OCI service relevant for the API.
         * @param authorizationMode the value to set
         * @return this builder instance
         */
        public Builder authorizationMode(AuthorizationMode authorizationMode) {
            this.authorizationMode = authorizationMode;
            return this;
        }

        /**
         * Endpoint ID used for getDataAssetFullDetails.
         */
        private String endpointId = null;

        /**
         * Endpoint ID used for getDataAssetFullDetails.
         * @param endpointId the value to set
         * @return this builder instance
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
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
        public Builder copy(CreateEntityShapeRequest o) {
            registryId(o.getRegistryId());
            connectionKey(o.getConnectionKey());
            schemaResourceName(o.getSchemaResourceName());
            createEntityShapeDetails(o.getCreateEntityShapeDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            authorizationMode(o.getAuthorizationMode());
            endpointId(o.getEndpointId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateEntityShapeRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateEntityShapeRequest
         */
        public CreateEntityShapeRequest build() {
            CreateEntityShapeRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dataconnectivity.model.CreateEntityShapeDetails body) {
            createEntityShapeDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateEntityShapeRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateEntityShapeRequest
         */
        public CreateEntityShapeRequest buildWithoutInvocationCallback() {
            CreateEntityShapeRequest request = new CreateEntityShapeRequest();
            request.registryId = registryId;
            request.connectionKey = connectionKey;
            request.schemaResourceName = schemaResourceName;
            request.createEntityShapeDetails = createEntityShapeDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            request.authorizationMode = authorizationMode;
            request.endpointId = endpointId;
            return request;
            // new CreateEntityShapeRequest(registryId, connectionKey, schemaResourceName, createEntityShapeDetails, opcRequestId, opcRetryToken, ifMatch, authorizationMode, endpointId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .registryId(registryId)
                .connectionKey(connectionKey)
                .schemaResourceName(schemaResourceName)
                .createEntityShapeDetails(createEntityShapeDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .ifMatch(ifMatch)
                .authorizationMode(authorizationMode)
                .endpointId(endpointId);
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
        sb.append(",registryId=").append(String.valueOf(this.registryId));
        sb.append(",connectionKey=").append(String.valueOf(this.connectionKey));
        sb.append(",schemaResourceName=").append(String.valueOf(this.schemaResourceName));
        sb.append(",createEntityShapeDetails=")
                .append(String.valueOf(this.createEntityShapeDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",authorizationMode=").append(String.valueOf(this.authorizationMode));
        sb.append(",endpointId=").append(String.valueOf(this.endpointId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateEntityShapeRequest)) {
            return false;
        }

        CreateEntityShapeRequest other = (CreateEntityShapeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.registryId, other.registryId)
                && java.util.Objects.equals(this.connectionKey, other.connectionKey)
                && java.util.Objects.equals(this.schemaResourceName, other.schemaResourceName)
                && java.util.Objects.equals(
                        this.createEntityShapeDetails, other.createEntityShapeDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.authorizationMode, other.authorizationMode)
                && java.util.Objects.equals(this.endpointId, other.endpointId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.registryId == null ? 43 : this.registryId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionKey == null ? 43 : this.connectionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.schemaResourceName == null
                                ? 43
                                : this.schemaResourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.createEntityShapeDetails == null
                                ? 43
                                : this.createEntityShapeDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.authorizationMode == null ? 43 : this.authorizationMode.hashCode());
        result = (result * PRIME) + (this.endpointId == null ? 43 : this.endpointId.hashCode());
        return result;
    }
}
