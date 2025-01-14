/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Update Request for SSLInboundInspection used on the firewall policy rules. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateSslInboundInspectionProfileDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSslInboundInspectionProfileDetails extends UpdateDecryptionProfileDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Whether to block sessions if SSL version is not supported. */
        @com.fasterxml.jackson.annotation.JsonProperty("isUnsupportedVersionBlocked")
        private Boolean isUnsupportedVersionBlocked;

        /**
         * Whether to block sessions if SSL version is not supported.
         *
         * @param isUnsupportedVersionBlocked the value to set
         * @return this builder
         */
        public Builder isUnsupportedVersionBlocked(Boolean isUnsupportedVersionBlocked) {
            this.isUnsupportedVersionBlocked = isUnsupportedVersionBlocked;
            this.__explicitlySet__.add("isUnsupportedVersionBlocked");
            return this;
        }
        /** Whether to block sessions if SSL cipher suite is not supported. */
        @com.fasterxml.jackson.annotation.JsonProperty("isUnsupportedCipherBlocked")
        private Boolean isUnsupportedCipherBlocked;

        /**
         * Whether to block sessions if SSL cipher suite is not supported.
         *
         * @param isUnsupportedCipherBlocked the value to set
         * @return this builder
         */
        public Builder isUnsupportedCipherBlocked(Boolean isUnsupportedCipherBlocked) {
            this.isUnsupportedCipherBlocked = isUnsupportedCipherBlocked;
            this.__explicitlySet__.add("isUnsupportedCipherBlocked");
            return this;
        }
        /**
         * Whether to block sessions if the firewall is temporarily unable to decrypt their traffic.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOutOfCapacityBlocked")
        private Boolean isOutOfCapacityBlocked;

        /**
         * Whether to block sessions if the firewall is temporarily unable to decrypt their traffic.
         *
         * @param isOutOfCapacityBlocked the value to set
         * @return this builder
         */
        public Builder isOutOfCapacityBlocked(Boolean isOutOfCapacityBlocked) {
            this.isOutOfCapacityBlocked = isOutOfCapacityBlocked;
            this.__explicitlySet__.add("isOutOfCapacityBlocked");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSslInboundInspectionProfileDetails build() {
            UpdateSslInboundInspectionProfileDetails model =
                    new UpdateSslInboundInspectionProfileDetails(
                            this.isUnsupportedVersionBlocked,
                            this.isUnsupportedCipherBlocked,
                            this.isOutOfCapacityBlocked);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSslInboundInspectionProfileDetails model) {
            if (model.wasPropertyExplicitlySet("isUnsupportedVersionBlocked")) {
                this.isUnsupportedVersionBlocked(model.getIsUnsupportedVersionBlocked());
            }
            if (model.wasPropertyExplicitlySet("isUnsupportedCipherBlocked")) {
                this.isUnsupportedCipherBlocked(model.getIsUnsupportedCipherBlocked());
            }
            if (model.wasPropertyExplicitlySet("isOutOfCapacityBlocked")) {
                this.isOutOfCapacityBlocked(model.getIsOutOfCapacityBlocked());
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

    @Deprecated
    public UpdateSslInboundInspectionProfileDetails(
            Boolean isUnsupportedVersionBlocked,
            Boolean isUnsupportedCipherBlocked,
            Boolean isOutOfCapacityBlocked) {
        super();
        this.isUnsupportedVersionBlocked = isUnsupportedVersionBlocked;
        this.isUnsupportedCipherBlocked = isUnsupportedCipherBlocked;
        this.isOutOfCapacityBlocked = isOutOfCapacityBlocked;
    }

    /** Whether to block sessions if SSL version is not supported. */
    @com.fasterxml.jackson.annotation.JsonProperty("isUnsupportedVersionBlocked")
    private final Boolean isUnsupportedVersionBlocked;

    /**
     * Whether to block sessions if SSL version is not supported.
     *
     * @return the value
     */
    public Boolean getIsUnsupportedVersionBlocked() {
        return isUnsupportedVersionBlocked;
    }

    /** Whether to block sessions if SSL cipher suite is not supported. */
    @com.fasterxml.jackson.annotation.JsonProperty("isUnsupportedCipherBlocked")
    private final Boolean isUnsupportedCipherBlocked;

    /**
     * Whether to block sessions if SSL cipher suite is not supported.
     *
     * @return the value
     */
    public Boolean getIsUnsupportedCipherBlocked() {
        return isUnsupportedCipherBlocked;
    }

    /** Whether to block sessions if the firewall is temporarily unable to decrypt their traffic. */
    @com.fasterxml.jackson.annotation.JsonProperty("isOutOfCapacityBlocked")
    private final Boolean isOutOfCapacityBlocked;

    /**
     * Whether to block sessions if the firewall is temporarily unable to decrypt their traffic.
     *
     * @return the value
     */
    public Boolean getIsOutOfCapacityBlocked() {
        return isOutOfCapacityBlocked;
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
        sb.append("UpdateSslInboundInspectionProfileDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isUnsupportedVersionBlocked=")
                .append(String.valueOf(this.isUnsupportedVersionBlocked));
        sb.append(", isUnsupportedCipherBlocked=")
                .append(String.valueOf(this.isUnsupportedCipherBlocked));
        sb.append(", isOutOfCapacityBlocked=").append(String.valueOf(this.isOutOfCapacityBlocked));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSslInboundInspectionProfileDetails)) {
            return false;
        }

        UpdateSslInboundInspectionProfileDetails other =
                (UpdateSslInboundInspectionProfileDetails) o;
        return java.util.Objects.equals(
                        this.isUnsupportedVersionBlocked, other.isUnsupportedVersionBlocked)
                && java.util.Objects.equals(
                        this.isUnsupportedCipherBlocked, other.isUnsupportedCipherBlocked)
                && java.util.Objects.equals(
                        this.isOutOfCapacityBlocked, other.isOutOfCapacityBlocked)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isUnsupportedVersionBlocked == null
                                ? 43
                                : this.isUnsupportedVersionBlocked.hashCode());
        result =
                (result * PRIME)
                        + (this.isUnsupportedCipherBlocked == null
                                ? 43
                                : this.isUnsupportedCipherBlocked.hashCode());
        result =
                (result * PRIME)
                        + (this.isOutOfCapacityBlocked == null
                                ? 43
                                : this.isOutOfCapacityBlocked.hashCode());
        return result;
    }
}
