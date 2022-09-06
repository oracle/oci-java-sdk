/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.requests;

import com.oracle.bmc.dataconnectivity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataconnectivity/GetEngineConfigurationsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetEngineConfigurationsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public class GetEngineConfigurationsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * Specifies the runtime engine for the bulk read/write operation. Default is SPARK.
     */
    private EngineTypeQueryParam engineTypeQueryParam;

    /**
     * Specifies the runtime engine for the bulk read/write operation. Default is SPARK.
     **/
    public enum EngineTypeQueryParam {
        Spark("SPARK"),
        ;

        private final String value;
        private static java.util.Map<String, EngineTypeQueryParam> map;

        static {
            map = new java.util.HashMap<>();
            for (EngineTypeQueryParam v : EngineTypeQueryParam.values()) {
                map.put(v.getValue(), v);
            }
        }

        EngineTypeQueryParam(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EngineTypeQueryParam create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid EngineTypeQueryParam: " + key);
        }
    };

    /**
     * Specifies the runtime engine for the bulk read/write operation. Default is SPARK.
     */
    public EngineTypeQueryParam getEngineTypeQueryParam() {
        return engineTypeQueryParam;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetEngineConfigurationsRequest, java.lang.Void> {
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
         * Specifies the runtime engine for the bulk read/write operation. Default is SPARK.
         */
        private EngineTypeQueryParam engineTypeQueryParam = null;

        /**
         * Specifies the runtime engine for the bulk read/write operation. Default is SPARK.
         * @param engineTypeQueryParam the value to set
         * @return this builder instance
         */
        public Builder engineTypeQueryParam(EngineTypeQueryParam engineTypeQueryParam) {
            this.engineTypeQueryParam = engineTypeQueryParam;
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
        public Builder copy(GetEngineConfigurationsRequest o) {
            registryId(o.getRegistryId());
            connectionKey(o.getConnectionKey());
            engineTypeQueryParam(o.getEngineTypeQueryParam());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetEngineConfigurationsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetEngineConfigurationsRequest
         */
        public GetEngineConfigurationsRequest build() {
            GetEngineConfigurationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetEngineConfigurationsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetEngineConfigurationsRequest
         */
        public GetEngineConfigurationsRequest buildWithoutInvocationCallback() {
            GetEngineConfigurationsRequest request = new GetEngineConfigurationsRequest();
            request.registryId = registryId;
            request.connectionKey = connectionKey;
            request.engineTypeQueryParam = engineTypeQueryParam;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetEngineConfigurationsRequest(registryId, connectionKey, engineTypeQueryParam, opcRequestId);
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
                .engineTypeQueryParam(engineTypeQueryParam)
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
        sb.append(",registryId=").append(String.valueOf(this.registryId));
        sb.append(",connectionKey=").append(String.valueOf(this.connectionKey));
        sb.append(",engineTypeQueryParam=").append(String.valueOf(this.engineTypeQueryParam));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetEngineConfigurationsRequest)) {
            return false;
        }

        GetEngineConfigurationsRequest other = (GetEngineConfigurationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.registryId, other.registryId)
                && java.util.Objects.equals(this.connectionKey, other.connectionKey)
                && java.util.Objects.equals(this.engineTypeQueryParam, other.engineTypeQueryParam)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
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
                        + (this.engineTypeQueryParam == null
                                ? 43
                                : this.engineTypeQueryParam.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
