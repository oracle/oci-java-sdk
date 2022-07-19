/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.model;

/**
 * The model for the parameters needed to update a private application.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdatePrivateApplicationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdatePrivateApplicationDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "shortDescription",
        "longDescription",
        "logoFileBase64Encoded",
        "definedTags",
        "freeformTags"
    })
    public UpdatePrivateApplicationDetails(
            String displayName,
            String shortDescription,
            String longDescription,
            String logoFileBase64Encoded,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags) {
        super();
        this.displayName = displayName;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.logoFileBase64Encoded = logoFileBase64Encoded;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the private application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the private application.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A short description of the private application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
        private String shortDescription;

        /**
         * A short description of the private application.
         * @param shortDescription the value to set
         * @return this builder
         **/
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            this.__explicitlySet__.add("shortDescription");
            return this;
        }
        /**
         * A long description of the private application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
        private String longDescription;

        /**
         * A long description of the private application.
         * @param longDescription the value to set
         * @return this builder
         **/
        public Builder longDescription(String longDescription) {
            this.longDescription = longDescription;
            this.__explicitlySet__.add("longDescription");
            return this;
        }
        /**
         * Base64-encoded logo to use as the private application icon.
         * Template icon file requirements: PNG format, 50 KB maximum, 130 x 130 pixels.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logoFileBase64Encoded")
        private String logoFileBase64Encoded;

        /**
         * Base64-encoded logo to use as the private application icon.
         * Template icon file requirements: PNG format, 50 KB maximum, 130 x 130 pixels.
         *
         * @param logoFileBase64Encoded the value to set
         * @return this builder
         **/
        public Builder logoFileBase64Encoded(String logoFileBase64Encoded) {
            this.logoFileBase64Encoded = logoFileBase64Encoded;
            this.__explicitlySet__.add("logoFileBase64Encoded");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePrivateApplicationDetails build() {
            UpdatePrivateApplicationDetails __instance__ =
                    new UpdatePrivateApplicationDetails(
                            displayName,
                            shortDescription,
                            longDescription,
                            logoFileBase64Encoded,
                            definedTags,
                            freeformTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePrivateApplicationDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .shortDescription(o.getShortDescription())
                            .longDescription(o.getLongDescription())
                            .logoFileBase64Encoded(o.getLogoFileBase64Encoded())
                            .definedTags(o.getDefinedTags())
                            .freeformTags(o.getFreeformTags());

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
     * The name of the private application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the private application.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A short description of the private application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shortDescription")
    private final String shortDescription;

    /**
     * A short description of the private application.
     * @return the value
     **/
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * A long description of the private application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
    private final String longDescription;

    /**
     * A long description of the private application.
     * @return the value
     **/
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Base64-encoded logo to use as the private application icon.
     * Template icon file requirements: PNG format, 50 KB maximum, 130 x 130 pixels.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logoFileBase64Encoded")
    private final String logoFileBase64Encoded;

    /**
     * Base64-encoded logo to use as the private application icon.
     * Template icon file requirements: PNG format, 50 KB maximum, 130 x 130 pixels.
     *
     * @return the value
     **/
    public String getLogoFileBase64Encoded() {
        return logoFileBase64Encoded;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
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
        sb.append("UpdatePrivateApplicationDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", shortDescription=").append(String.valueOf(this.shortDescription));
        sb.append(", longDescription=").append(String.valueOf(this.longDescription));
        sb.append(", logoFileBase64Encoded=").append(String.valueOf(this.logoFileBase64Encoded));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePrivateApplicationDetails)) {
            return false;
        }

        UpdatePrivateApplicationDetails other = (UpdatePrivateApplicationDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.shortDescription, other.shortDescription)
                && java.util.Objects.equals(this.longDescription, other.longDescription)
                && java.util.Objects.equals(this.logoFileBase64Encoded, other.logoFileBase64Encoded)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.shortDescription == null ? 43 : this.shortDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.longDescription == null ? 43 : this.longDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.logoFileBase64Encoded == null
                                ? 43
                                : this.logoFileBase64Encoded.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
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
