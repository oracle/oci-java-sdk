/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Summary of a restricted operation for a Digital Assistant instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RestrictedOperation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RestrictedOperation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"operationName", "restrictingService"})
    public RestrictedOperation(String operationName, String restrictingService) {
        super();
        this.operationName = operationName;
        this.restrictingService = restrictingService;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the restricted operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationName")
        private String operationName;

        /**
         * Name of the restricted operation.
         *
         * @param operationName the value to set
         * @return this builder
         */
        public Builder operationName(String operationName) {
            this.operationName = operationName;
            this.__explicitlySet__.add("operationName");
            return this;
        }
        /** Name of the service restricting the operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("restrictingService")
        private String restrictingService;

        /**
         * Name of the service restricting the operation.
         *
         * @param restrictingService the value to set
         * @return this builder
         */
        public Builder restrictingService(String restrictingService) {
            this.restrictingService = restrictingService;
            this.__explicitlySet__.add("restrictingService");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RestrictedOperation build() {
            RestrictedOperation model =
                    new RestrictedOperation(this.operationName, this.restrictingService);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestrictedOperation model) {
            if (model.wasPropertyExplicitlySet("operationName")) {
                this.operationName(model.getOperationName());
            }
            if (model.wasPropertyExplicitlySet("restrictingService")) {
                this.restrictingService(model.getRestrictingService());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Name of the restricted operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationName")
    private final String operationName;

    /**
     * Name of the restricted operation.
     *
     * @return the value
     */
    public String getOperationName() {
        return operationName;
    }

    /** Name of the service restricting the operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("restrictingService")
    private final String restrictingService;

    /**
     * Name of the service restricting the operation.
     *
     * @return the value
     */
    public String getRestrictingService() {
        return restrictingService;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RestrictedOperation(");
        sb.append("super=").append(super.toString());
        sb.append("operationName=").append(String.valueOf(this.operationName));
        sb.append(", restrictingService=").append(String.valueOf(this.restrictingService));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestrictedOperation)) {
            return false;
        }

        RestrictedOperation other = (RestrictedOperation) o;
        return java.util.Objects.equals(this.operationName, other.operationName)
                && java.util.Objects.equals(this.restrictingService, other.restrictingService)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationName == null ? 43 : this.operationName.hashCode());
        result =
                (result * PRIME)
                        + (this.restrictingService == null
                                ? 43
                                : this.restrictingService.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
