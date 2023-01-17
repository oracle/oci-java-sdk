/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
        @com.fasterxml.jackson.annotation.JsonProperty("isProviderUpgradeRequired")
        private Boolean isProviderUpgradeRequired;

        public Builder isProviderUpgradeRequired(Boolean isProviderUpgradeRequired) {
            this.isProviderUpgradeRequired = isProviderUpgradeRequired;
            this.__explicitlySet__.add("isProviderUpgradeRequired");
            return this;
        }
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
            CreateImportTfStateJobOperationDetails model =
                    new CreateImportTfStateJobOperationDetails(
                            this.isProviderUpgradeRequired, this.tfStateBase64Encoded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateImportTfStateJobOperationDetails model) {
            if (model.wasPropertyExplicitlySet("isProviderUpgradeRequired")) {
                this.isProviderUpgradeRequired(model.getIsProviderUpgradeRequired());
            }
            if (model.wasPropertyExplicitlySet("tfStateBase64Encoded")) {
                this.tfStateBase64Encoded(model.getTfStateBase64Encoded());
            }
            return this;
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
    public CreateImportTfStateJobOperationDetails(
            Boolean isProviderUpgradeRequired, byte[] tfStateBase64Encoded) {
        super(isProviderUpgradeRequired);
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
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateImportTfStateJobOperationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", tfStateBase64Encoded=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.tfStateBase64Encoded)
                                : (String.valueOf(this.tfStateBase64Encoded)
                                        + (this.tfStateBase64Encoded != null
                                                ? " (byte["
                                                        + this.tfStateBase64Encoded.length
                                                        + "])"
                                                : ""))));
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
        return java.util.Arrays.equals(this.tfStateBase64Encoded, other.tfStateBase64Encoded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + java.util.Arrays.hashCode(this.tfStateBase64Encoded);
        return result;
    }
}
