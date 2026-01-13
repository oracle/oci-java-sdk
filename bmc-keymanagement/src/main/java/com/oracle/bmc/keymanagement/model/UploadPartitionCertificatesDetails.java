/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * An object that encapsulates the necessary partition certificates. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UploadPartitionCertificatesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UploadPartitionCertificatesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"partitionCertificate", "partitionOwnerCertificate"})
    public UploadPartitionCertificatesDetails(
            String partitionCertificate, String partitionOwnerCertificate) {
        super();
        this.partitionCertificate = partitionCertificate;
        this.partitionOwnerCertificate = partitionOwnerCertificate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Base64 encoded (StandardCharsets.UTF_8) Partition Certificate, which gets created when
         * the CSR is signed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("partitionCertificate")
        private String partitionCertificate;

        /**
         * Base64 encoded (StandardCharsets.UTF_8) Partition Certificate, which gets created when
         * the CSR is signed.
         *
         * @param partitionCertificate the value to set
         * @return this builder
         */
        public Builder partitionCertificate(String partitionCertificate) {
            this.partitionCertificate = partitionCertificate;
            this.__explicitlySet__.add("partitionCertificate");
            return this;
        }
        /**
         * Base64 encoded (StandardCharsets.UTF_8) Partition Owner Certificate, which is used to
         * help sign the CSR.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("partitionOwnerCertificate")
        private String partitionOwnerCertificate;

        /**
         * Base64 encoded (StandardCharsets.UTF_8) Partition Owner Certificate, which is used to
         * help sign the CSR.
         *
         * @param partitionOwnerCertificate the value to set
         * @return this builder
         */
        public Builder partitionOwnerCertificate(String partitionOwnerCertificate) {
            this.partitionOwnerCertificate = partitionOwnerCertificate;
            this.__explicitlySet__.add("partitionOwnerCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UploadPartitionCertificatesDetails build() {
            UploadPartitionCertificatesDetails model =
                    new UploadPartitionCertificatesDetails(
                            this.partitionCertificate, this.partitionOwnerCertificate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UploadPartitionCertificatesDetails model) {
            if (model.wasPropertyExplicitlySet("partitionCertificate")) {
                this.partitionCertificate(model.getPartitionCertificate());
            }
            if (model.wasPropertyExplicitlySet("partitionOwnerCertificate")) {
                this.partitionOwnerCertificate(model.getPartitionOwnerCertificate());
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

    /**
     * Base64 encoded (StandardCharsets.UTF_8) Partition Certificate, which gets created when the
     * CSR is signed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partitionCertificate")
    private final String partitionCertificate;

    /**
     * Base64 encoded (StandardCharsets.UTF_8) Partition Certificate, which gets created when the
     * CSR is signed.
     *
     * @return the value
     */
    public String getPartitionCertificate() {
        return partitionCertificate;
    }

    /**
     * Base64 encoded (StandardCharsets.UTF_8) Partition Owner Certificate, which is used to help
     * sign the CSR.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partitionOwnerCertificate")
    private final String partitionOwnerCertificate;

    /**
     * Base64 encoded (StandardCharsets.UTF_8) Partition Owner Certificate, which is used to help
     * sign the CSR.
     *
     * @return the value
     */
    public String getPartitionOwnerCertificate() {
        return partitionOwnerCertificate;
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
        sb.append("UploadPartitionCertificatesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("partitionCertificate=").append(String.valueOf(this.partitionCertificate));
        sb.append(", partitionOwnerCertificate=")
                .append(String.valueOf(this.partitionOwnerCertificate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadPartitionCertificatesDetails)) {
            return false;
        }

        UploadPartitionCertificatesDetails other = (UploadPartitionCertificatesDetails) o;
        return java.util.Objects.equals(this.partitionCertificate, other.partitionCertificate)
                && java.util.Objects.equals(
                        this.partitionOwnerCertificate, other.partitionOwnerCertificate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.partitionCertificate == null
                                ? 43
                                : this.partitionCertificate.hashCode());
        result =
                (result * PRIME)
                        + (this.partitionOwnerCertificate == null
                                ? 43
                                : this.partitionOwnerCertificate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
