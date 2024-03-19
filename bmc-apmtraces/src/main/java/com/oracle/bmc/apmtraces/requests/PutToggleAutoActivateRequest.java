/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.requests;

import com.oracle.bmc.apmtraces.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/PutToggleAutoActivateExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * PutToggleAutoActivateRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class PutToggleAutoActivateRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The APM Domain ID for the intended request. */
    private String apmDomainId;

    /** The APM Domain ID for the intended request. */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /**
     * Autoactivate toggle switch. Set to true to turn on auto-activate. Set to false to turn off
     * auto-activate.
     */
    private Boolean isAutoActivateOn;

    /**
     * Autoactivate toggle switch. Set to true to turn on auto-activate. Set to false to turn off
     * auto-activate.
     */
    public Boolean getIsAutoActivateOn() {
        return isAutoActivateOn;
    }
    /** Data key type for which auto-activate needs to be turned on or off. */
    private DataKeyType dataKeyType;

    /** Data key type for which auto-activate needs to be turned on or off. */
    public enum DataKeyType implements com.oracle.bmc.http.internal.BmcEnum {
        PrivateDataKey("PRIVATE_DATA_KEY"),
        PublicDataKey("PUBLIC_DATA_KEY"),
        ;

        private final String value;
        private static java.util.Map<String, DataKeyType> map;

        static {
            map = new java.util.HashMap<>();
            for (DataKeyType v : DataKeyType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DataKeyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataKeyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DataKeyType: " + key);
        }
    };

    /** Data key type for which auto-activate needs to be turned on or off. */
    public DataKeyType getDataKeyType() {
        return dataKeyType;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PutToggleAutoActivateRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The APM Domain ID for the intended request. */
        private String apmDomainId = null;

        /**
         * The APM Domain ID for the intended request.
         *
         * @param apmDomainId the value to set
         * @return this builder instance
         */
        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = apmDomainId;
            return this;
        }

        /**
         * Autoactivate toggle switch. Set to true to turn on auto-activate. Set to false to turn
         * off auto-activate.
         */
        private Boolean isAutoActivateOn = null;

        /**
         * Autoactivate toggle switch. Set to true to turn on auto-activate. Set to false to turn
         * off auto-activate.
         *
         * @param isAutoActivateOn the value to set
         * @return this builder instance
         */
        public Builder isAutoActivateOn(Boolean isAutoActivateOn) {
            this.isAutoActivateOn = isAutoActivateOn;
            return this;
        }

        /** Data key type for which auto-activate needs to be turned on or off. */
        private DataKeyType dataKeyType = null;

        /**
         * Data key type for which auto-activate needs to be turned on or off.
         *
         * @param dataKeyType the value to set
         * @return this builder instance
         */
        public Builder dataKeyType(DataKeyType dataKeyType) {
            this.dataKeyType = dataKeyType;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(PutToggleAutoActivateRequest o) {
            apmDomainId(o.getApmDomainId());
            isAutoActivateOn(o.getIsAutoActivateOn());
            dataKeyType(o.getDataKeyType());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PutToggleAutoActivateRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of PutToggleAutoActivateRequest
         */
        public PutToggleAutoActivateRequest build() {
            PutToggleAutoActivateRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of PutToggleAutoActivateRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PutToggleAutoActivateRequest
         */
        public PutToggleAutoActivateRequest buildWithoutInvocationCallback() {
            PutToggleAutoActivateRequest request = new PutToggleAutoActivateRequest();
            request.apmDomainId = apmDomainId;
            request.isAutoActivateOn = isAutoActivateOn;
            request.dataKeyType = dataKeyType;
            request.opcRequestId = opcRequestId;
            return request;
            // new PutToggleAutoActivateRequest(apmDomainId, isAutoActivateOn, dataKeyType,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .isAutoActivateOn(isAutoActivateOn)
                .dataKeyType(dataKeyType)
                .opcRequestId(opcRequestId);
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
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",isAutoActivateOn=").append(String.valueOf(this.isAutoActivateOn));
        sb.append(",dataKeyType=").append(String.valueOf(this.dataKeyType));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PutToggleAutoActivateRequest)) {
            return false;
        }

        PutToggleAutoActivateRequest other = (PutToggleAutoActivateRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(this.isAutoActivateOn, other.isAutoActivateOn)
                && java.util.Objects.equals(this.dataKeyType, other.dataKeyType)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoActivateOn == null ? 43 : this.isAutoActivateOn.hashCode());
        result = (result * PRIME) + (this.dataKeyType == null ? 43 : this.dataKeyType.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
