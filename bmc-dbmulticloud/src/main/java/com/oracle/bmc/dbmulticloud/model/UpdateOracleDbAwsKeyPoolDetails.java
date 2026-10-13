/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/**
 * Details for updating an Oracle DB AWS key pool resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateOracleDbAwsKeyPoolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateOracleDbAwsKeyPoolDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "isReuseAllowed",
        "isMultiRegionKeyPool",
        "freeformTags",
        "definedTags"
    })
    public UpdateOracleDbAwsKeyPoolDetails(
            String displayName,
            Boolean isReuseAllowed,
            Boolean isMultiRegionKeyPool,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.isReuseAllowed = isReuseAllowed;
        this.isMultiRegionKeyPool = isMultiRegionKeyPool;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The display name of the Oracle DB AWS key pool resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the Oracle DB AWS key pool resource.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Indicates whether AWS KMS keys in this key pool can be reused. */
        @com.fasterxml.jackson.annotation.JsonProperty("isReuseAllowed")
        private Boolean isReuseAllowed;

        /**
         * Indicates whether AWS KMS keys in this key pool can be reused.
         *
         * @param isReuseAllowed the value to set
         * @return this builder
         */
        public Builder isReuseAllowed(Boolean isReuseAllowed) {
            this.isReuseAllowed = isReuseAllowed;
            this.__explicitlySet__.add("isReuseAllowed");
            return this;
        }
        /**
         * Indicates whether this key pool accepts only multi-region AWS KMS keys. When false, the
         * key pool accepts only single-region AWS KMS keys.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isMultiRegionKeyPool")
        private Boolean isMultiRegionKeyPool;

        /**
         * Indicates whether this key pool accepts only multi-region AWS KMS keys. When false, the
         * key pool accepts only single-region AWS KMS keys.
         *
         * @param isMultiRegionKeyPool the value to set
         * @return this builder
         */
        public Builder isMultiRegionKeyPool(Boolean isMultiRegionKeyPool) {
            this.isMultiRegionKeyPool = isMultiRegionKeyPool;
            this.__explicitlySet__.add("isMultiRegionKeyPool");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOracleDbAwsKeyPoolDetails build() {
            UpdateOracleDbAwsKeyPoolDetails model =
                    new UpdateOracleDbAwsKeyPoolDetails(
                            this.displayName,
                            this.isReuseAllowed,
                            this.isMultiRegionKeyPool,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOracleDbAwsKeyPoolDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isReuseAllowed")) {
                this.isReuseAllowed(model.getIsReuseAllowed());
            }
            if (model.wasPropertyExplicitlySet("isMultiRegionKeyPool")) {
                this.isMultiRegionKeyPool(model.getIsMultiRegionKeyPool());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The display name of the Oracle DB AWS key pool resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the Oracle DB AWS key pool resource.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Indicates whether AWS KMS keys in this key pool can be reused. */
    @com.fasterxml.jackson.annotation.JsonProperty("isReuseAllowed")
    private final Boolean isReuseAllowed;

    /**
     * Indicates whether AWS KMS keys in this key pool can be reused.
     *
     * @return the value
     */
    public Boolean getIsReuseAllowed() {
        return isReuseAllowed;
    }

    /**
     * Indicates whether this key pool accepts only multi-region AWS KMS keys. When false, the key
     * pool accepts only single-region AWS KMS keys.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiRegionKeyPool")
    private final Boolean isMultiRegionKeyPool;

    /**
     * Indicates whether this key pool accepts only multi-region AWS KMS keys. When false, the key
     * pool accepts only single-region AWS KMS keys.
     *
     * @return the value
     */
    public Boolean getIsMultiRegionKeyPool() {
        return isMultiRegionKeyPool;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateOracleDbAwsKeyPoolDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", isReuseAllowed=").append(String.valueOf(this.isReuseAllowed));
        sb.append(", isMultiRegionKeyPool=").append(String.valueOf(this.isMultiRegionKeyPool));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOracleDbAwsKeyPoolDetails)) {
            return false;
        }

        UpdateOracleDbAwsKeyPoolDetails other = (UpdateOracleDbAwsKeyPoolDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isReuseAllowed, other.isReuseAllowed)
                && java.util.Objects.equals(this.isMultiRegionKeyPool, other.isMultiRegionKeyPool)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.isReuseAllowed == null ? 43 : this.isReuseAllowed.hashCode());
        result =
                (result * PRIME)
                        + (this.isMultiRegionKeyPool == null
                                ? 43
                                : this.isMultiRegionKeyPool.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
