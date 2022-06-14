/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a image verification policy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateImagePolicyConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateImagePolicyConfigDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"isPolicyEnabled", "keyDetails"})
    public CreateImagePolicyConfigDetails(
            Boolean isPolicyEnabled, java.util.List<KeyDetails> keyDetails) {
        super();
        this.isPolicyEnabled = isPolicyEnabled;
        this.keyDetails = keyDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether the image verification policy is enabled. Defaults to false. If set to true, the images will be verified against the policy at runtime.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPolicyEnabled")
        private Boolean isPolicyEnabled;

        /**
         * Whether the image verification policy is enabled. Defaults to false. If set to true, the images will be verified against the policy at runtime.
         * @param isPolicyEnabled the value to set
         * @return this builder
         **/
        public Builder isPolicyEnabled(Boolean isPolicyEnabled) {
            this.isPolicyEnabled = isPolicyEnabled;
            this.__explicitlySet__.add("isPolicyEnabled");
            return this;
        }
        /**
         * A list of KMS key details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyDetails")
        private java.util.List<KeyDetails> keyDetails;

        /**
         * A list of KMS key details.
         * @param keyDetails the value to set
         * @return this builder
         **/
        public Builder keyDetails(java.util.List<KeyDetails> keyDetails) {
            this.keyDetails = keyDetails;
            this.__explicitlySet__.add("keyDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateImagePolicyConfigDetails build() {
            CreateImagePolicyConfigDetails __instance__ =
                    new CreateImagePolicyConfigDetails(isPolicyEnabled, keyDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateImagePolicyConfigDetails o) {
            Builder copiedBuilder =
                    isPolicyEnabled(o.getIsPolicyEnabled()).keyDetails(o.getKeyDetails());

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

    /**
     * Whether the image verification policy is enabled. Defaults to false. If set to true, the images will be verified against the policy at runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPolicyEnabled")
    private final Boolean isPolicyEnabled;

    /**
     * Whether the image verification policy is enabled. Defaults to false. If set to true, the images will be verified against the policy at runtime.
     * @return the value
     **/
    public Boolean getIsPolicyEnabled() {
        return isPolicyEnabled;
    }

    /**
     * A list of KMS key details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyDetails")
    private final java.util.List<KeyDetails> keyDetails;

    /**
     * A list of KMS key details.
     * @return the value
     **/
    public java.util.List<KeyDetails> getKeyDetails() {
        return keyDetails;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateImagePolicyConfigDetails(");
        sb.append("isPolicyEnabled=").append(String.valueOf(this.isPolicyEnabled));
        sb.append(", keyDetails=").append(String.valueOf(this.keyDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateImagePolicyConfigDetails)) {
            return false;
        }

        CreateImagePolicyConfigDetails other = (CreateImagePolicyConfigDetails) o;
        return java.util.Objects.equals(this.isPolicyEnabled, other.isPolicyEnabled)
                && java.util.Objects.equals(this.keyDetails, other.keyDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isPolicyEnabled == null ? 43 : this.isPolicyEnabled.hashCode());
        result = (result * PRIME) + (this.keyDetails == null ? 43 : this.keyDetails.hashCode());
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
