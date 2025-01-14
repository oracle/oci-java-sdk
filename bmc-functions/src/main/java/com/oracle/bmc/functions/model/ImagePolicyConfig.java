/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * Define the image signature verification policy for an application. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImagePolicyConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImagePolicyConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isPolicyEnabled", "keyDetails"})
    public ImagePolicyConfig(Boolean isPolicyEnabled, java.util.List<KeyDetails> keyDetails) {
        super();
        this.isPolicyEnabled = isPolicyEnabled;
        this.keyDetails = keyDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Define if image signature verification policy is enabled for the application. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPolicyEnabled")
        private Boolean isPolicyEnabled;

        /**
         * Define if image signature verification policy is enabled for the application.
         *
         * @param isPolicyEnabled the value to set
         * @return this builder
         */
        public Builder isPolicyEnabled(Boolean isPolicyEnabled) {
            this.isPolicyEnabled = isPolicyEnabled;
            this.__explicitlySet__.add("isPolicyEnabled");
            return this;
        }
        /** A list of KMS key details. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyDetails")
        private java.util.List<KeyDetails> keyDetails;

        /**
         * A list of KMS key details.
         *
         * @param keyDetails the value to set
         * @return this builder
         */
        public Builder keyDetails(java.util.List<KeyDetails> keyDetails) {
            this.keyDetails = keyDetails;
            this.__explicitlySet__.add("keyDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImagePolicyConfig build() {
            ImagePolicyConfig model = new ImagePolicyConfig(this.isPolicyEnabled, this.keyDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImagePolicyConfig model) {
            if (model.wasPropertyExplicitlySet("isPolicyEnabled")) {
                this.isPolicyEnabled(model.getIsPolicyEnabled());
            }
            if (model.wasPropertyExplicitlySet("keyDetails")) {
                this.keyDetails(model.getKeyDetails());
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

    /** Define if image signature verification policy is enabled for the application. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPolicyEnabled")
    private final Boolean isPolicyEnabled;

    /**
     * Define if image signature verification policy is enabled for the application.
     *
     * @return the value
     */
    public Boolean getIsPolicyEnabled() {
        return isPolicyEnabled;
    }

    /** A list of KMS key details. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyDetails")
    private final java.util.List<KeyDetails> keyDetails;

    /**
     * A list of KMS key details.
     *
     * @return the value
     */
    public java.util.List<KeyDetails> getKeyDetails() {
        return keyDetails;
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
        sb.append("ImagePolicyConfig(");
        sb.append("super=").append(super.toString());
        sb.append("isPolicyEnabled=").append(String.valueOf(this.isPolicyEnabled));
        sb.append(", keyDetails=").append(String.valueOf(this.keyDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImagePolicyConfig)) {
            return false;
        }

        ImagePolicyConfig other = (ImagePolicyConfig) o;
        return java.util.Objects.equals(this.isPolicyEnabled, other.isPolicyEnabled)
                && java.util.Objects.equals(this.keyDetails, other.keyDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isPolicyEnabled == null ? 43 : this.isPolicyEnabled.hashCode());
        result = (result * PRIME) + (this.keyDetails == null ? 43 : this.keyDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
