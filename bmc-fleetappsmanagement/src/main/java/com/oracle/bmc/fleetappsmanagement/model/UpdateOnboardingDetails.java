/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The information about updating onboarding. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateOnboardingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateOnboardingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isFamsTagEnabled",
        "isCostTrackingTagEnabled",
        "freeformTags",
        "definedTags"
    })
    public UpdateOnboardingDetails(
            Boolean isFamsTagEnabled,
            Boolean isCostTrackingTagEnabled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.isFamsTagEnabled = isFamsTagEnabled;
        this.isCostTrackingTagEnabled = isCostTrackingTagEnabled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A value determining Fleet Application Management tag is enabled or not */
        @com.fasterxml.jackson.annotation.JsonProperty("isFamsTagEnabled")
        private Boolean isFamsTagEnabled;

        /**
         * A value determining Fleet Application Management tag is enabled or not
         *
         * @param isFamsTagEnabled the value to set
         * @return this builder
         */
        public Builder isFamsTagEnabled(Boolean isFamsTagEnabled) {
            this.isFamsTagEnabled = isFamsTagEnabled;
            this.__explicitlySet__.add("isFamsTagEnabled");
            return this;
        }
        /** A value determining if cost tracking tag is enabled or not */
        @com.fasterxml.jackson.annotation.JsonProperty("isCostTrackingTagEnabled")
        private Boolean isCostTrackingTagEnabled;

        /**
         * A value determining if cost tracking tag is enabled or not
         *
         * @param isCostTrackingTagEnabled the value to set
         * @return this builder
         */
        public Builder isCostTrackingTagEnabled(Boolean isCostTrackingTagEnabled) {
            this.isCostTrackingTagEnabled = isCostTrackingTagEnabled;
            this.__explicitlySet__.add("isCostTrackingTagEnabled");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        public UpdateOnboardingDetails build() {
            UpdateOnboardingDetails model =
                    new UpdateOnboardingDetails(
                            this.isFamsTagEnabled,
                            this.isCostTrackingTagEnabled,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOnboardingDetails model) {
            if (model.wasPropertyExplicitlySet("isFamsTagEnabled")) {
                this.isFamsTagEnabled(model.getIsFamsTagEnabled());
            }
            if (model.wasPropertyExplicitlySet("isCostTrackingTagEnabled")) {
                this.isCostTrackingTagEnabled(model.getIsCostTrackingTagEnabled());
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

    /** A value determining Fleet Application Management tag is enabled or not */
    @com.fasterxml.jackson.annotation.JsonProperty("isFamsTagEnabled")
    private final Boolean isFamsTagEnabled;

    /**
     * A value determining Fleet Application Management tag is enabled or not
     *
     * @return the value
     */
    public Boolean getIsFamsTagEnabled() {
        return isFamsTagEnabled;
    }

    /** A value determining if cost tracking tag is enabled or not */
    @com.fasterxml.jackson.annotation.JsonProperty("isCostTrackingTagEnabled")
    private final Boolean isCostTrackingTagEnabled;

    /**
     * A value determining if cost tracking tag is enabled or not
     *
     * @return the value
     */
    public Boolean getIsCostTrackingTagEnabled() {
        return isCostTrackingTagEnabled;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
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
        sb.append("UpdateOnboardingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isFamsTagEnabled=").append(String.valueOf(this.isFamsTagEnabled));
        sb.append(", isCostTrackingTagEnabled=")
                .append(String.valueOf(this.isCostTrackingTagEnabled));
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
        if (!(o instanceof UpdateOnboardingDetails)) {
            return false;
        }

        UpdateOnboardingDetails other = (UpdateOnboardingDetails) o;
        return java.util.Objects.equals(this.isFamsTagEnabled, other.isFamsTagEnabled)
                && java.util.Objects.equals(
                        this.isCostTrackingTagEnabled, other.isCostTrackingTagEnabled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isFamsTagEnabled == null ? 43 : this.isFamsTagEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isCostTrackingTagEnabled == null
                                ? 43
                                : this.isCostTrackingTagEnabled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
