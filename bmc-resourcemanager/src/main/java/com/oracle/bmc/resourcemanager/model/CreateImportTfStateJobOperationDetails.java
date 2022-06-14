/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Job details that are specific to import Terraform state operations.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateImportTfStateJobOperationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "operation"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateImportTfStateJobOperationDetails extends CreateJobOperationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Base64-encoded state file
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tfStateBase64Encoded")
        private byte[] tfStateBase64Encoded;

        /**
         * Base64-encoded state file
         *
         * @param tfStateBase64Encoded the value to set
         * @return this builder
         **/
        public Builder tfStateBase64Encoded(byte[] tfStateBase64Encoded) {
            this.tfStateBase64Encoded = tfStateBase64Encoded;
            this.__explicitlySet__.add("tfStateBase64Encoded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateImportTfStateJobOperationDetails build() {
            CreateImportTfStateJobOperationDetails __instance__ =
                    new CreateImportTfStateJobOperationDetails(tfStateBase64Encoded);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateImportTfStateJobOperationDetails o) {
            Builder copiedBuilder = tfStateBase64Encoded(o.getTfStateBase64Encoded());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public CreateImportTfStateJobOperationDetails(byte[] tfStateBase64Encoded) {
        super();
        this.tfStateBase64Encoded = tfStateBase64Encoded;
    }

    /**
     * Base64-encoded state file
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tfStateBase64Encoded")
    private final byte[] tfStateBase64Encoded;

    /**
     * Base64-encoded state file
     *
     * @return the value
     **/
    public byte[] getTfStateBase64Encoded() {
        return tfStateBase64Encoded;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateImportTfStateJobOperationDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", tfStateBase64Encoded=").append(String.valueOf(this.tfStateBase64Encoded));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateImportTfStateJobOperationDetails)) {
            return false;
        }

        CreateImportTfStateJobOperationDetails other = (CreateImportTfStateJobOperationDetails) o;
        return java.util.Objects.equals(this.tfStateBase64Encoded, other.tfStateBase64Encoded)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.tfStateBase64Encoded == null
                                ? 43
                                : this.tfStateBase64Encoded.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
