/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDatabaseCharacterSetsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListAutonomousDatabaseCharacterSetsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListAutonomousDatabaseCharacterSetsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Specifies whether this request is for an Autonomous AI Database Serverless instance. By
     * default, this request will be for Autonomous AI Database on Dedicated Exadata Infrastructure.
     */
    private Boolean isShared;

    /**
     * Specifies whether this request is for an Autonomous AI Database Serverless instance. By
     * default, this request will be for Autonomous AI Database on Dedicated Exadata Infrastructure.
     */
    public Boolean getIsShared() {
        return isShared;
    }
    /**
     * Specifies if the request is for an Autonomous AI Database Dedicated instance. The default
     * request is for an Autonomous AI Database Dedicated instance.
     */
    private Boolean isDedicated;

    /**
     * Specifies if the request is for an Autonomous AI Database Dedicated instance. The default
     * request is for an Autonomous AI Database Dedicated instance.
     */
    public Boolean getIsDedicated() {
        return isDedicated;
    }
    /**
     * Specifies whether this request pertains to database character sets or national character
     * sets.
     */
    private CharacterSetType characterSetType;

    /**
     * Specifies whether this request pertains to database character sets or national character
     * sets.
     */
    public enum CharacterSetType implements com.oracle.bmc.http.internal.BmcEnum {
        Database("DATABASE"),
        National("NATIONAL"),
        ;

        private final String value;
        private static java.util.Map<String, CharacterSetType> map;

        static {
            map = new java.util.HashMap<>();
            for (CharacterSetType v : CharacterSetType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CharacterSetType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CharacterSetType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CharacterSetType: " + key);
        }
    };

    /**
     * Specifies whether this request pertains to database character sets or national character
     * sets.
     */
    public CharacterSetType getCharacterSetType() {
        return characterSetType;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAutonomousDatabaseCharacterSetsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique identifier for the request. */
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
         * Specifies whether this request is for an Autonomous AI Database Serverless instance. By
         * default, this request will be for Autonomous AI Database on Dedicated Exadata
         * Infrastructure.
         */
        private Boolean isShared = null;

        /**
         * Specifies whether this request is for an Autonomous AI Database Serverless instance. By
         * default, this request will be for Autonomous AI Database on Dedicated Exadata
         * Infrastructure.
         *
         * @param isShared the value to set
         * @return this builder instance
         */
        public Builder isShared(Boolean isShared) {
            this.isShared = isShared;
            return this;
        }

        /**
         * Specifies if the request is for an Autonomous AI Database Dedicated instance. The default
         * request is for an Autonomous AI Database Dedicated instance.
         */
        private Boolean isDedicated = null;

        /**
         * Specifies if the request is for an Autonomous AI Database Dedicated instance. The default
         * request is for an Autonomous AI Database Dedicated instance.
         *
         * @param isDedicated the value to set
         * @return this builder instance
         */
        public Builder isDedicated(Boolean isDedicated) {
            this.isDedicated = isDedicated;
            return this;
        }

        /**
         * Specifies whether this request pertains to database character sets or national character
         * sets.
         */
        private CharacterSetType characterSetType = null;

        /**
         * Specifies whether this request pertains to database character sets or national character
         * sets.
         *
         * @param characterSetType the value to set
         * @return this builder instance
         */
        public Builder characterSetType(CharacterSetType characterSetType) {
            this.characterSetType = characterSetType;
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
        public Builder copy(ListAutonomousDatabaseCharacterSetsRequest o) {
            opcRequestId(o.getOpcRequestId());
            isShared(o.getIsShared());
            isDedicated(o.getIsDedicated());
            characterSetType(o.getCharacterSetType());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAutonomousDatabaseCharacterSetsRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListAutonomousDatabaseCharacterSetsRequest
         */
        public ListAutonomousDatabaseCharacterSetsRequest build() {
            ListAutonomousDatabaseCharacterSetsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAutonomousDatabaseCharacterSetsRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAutonomousDatabaseCharacterSetsRequest
         */
        public ListAutonomousDatabaseCharacterSetsRequest buildWithoutInvocationCallback() {
            ListAutonomousDatabaseCharacterSetsRequest request =
                    new ListAutonomousDatabaseCharacterSetsRequest();
            request.opcRequestId = opcRequestId;
            request.isShared = isShared;
            request.isDedicated = isDedicated;
            request.characterSetType = characterSetType;
            return request;
            // new ListAutonomousDatabaseCharacterSetsRequest(opcRequestId, isShared, isDedicated,
            // characterSetType);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .opcRequestId(opcRequestId)
                .isShared(isShared)
                .isDedicated(isDedicated)
                .characterSetType(characterSetType);
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
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isShared=").append(String.valueOf(this.isShared));
        sb.append(",isDedicated=").append(String.valueOf(this.isDedicated));
        sb.append(",characterSetType=").append(String.valueOf(this.characterSetType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAutonomousDatabaseCharacterSetsRequest)) {
            return false;
        }

        ListAutonomousDatabaseCharacterSetsRequest other =
                (ListAutonomousDatabaseCharacterSetsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isShared, other.isShared)
                && java.util.Objects.equals(this.isDedicated, other.isDedicated)
                && java.util.Objects.equals(this.characterSetType, other.characterSetType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.isShared == null ? 43 : this.isShared.hashCode());
        result = (result * PRIME) + (this.isDedicated == null ? 43 : this.isDedicated.hashCode());
        result =
                (result * PRIME)
                        + (this.characterSetType == null ? 43 : this.characterSetType.hashCode());
        return result;
    }
}
