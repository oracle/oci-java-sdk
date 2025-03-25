/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Resource name generation overriding configurations for telegraf resource types. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TelegrafResourceNameConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TelegrafResourceNameConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isUseTagsOnly", "includeTags", "excludeTags"})
    public TelegrafResourceNameConfigurationDetails(
            Boolean isUseTagsOnly,
            java.util.List<String> includeTags,
            java.util.List<String> excludeTags) {
        super();
        this.isUseTagsOnly = isUseTagsOnly;
        this.includeTags = includeTags;
        this.excludeTags = excludeTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Flag to indicate if only tags will be used for resource name generation. */
        @com.fasterxml.jackson.annotation.JsonProperty("isUseTagsOnly")
        private Boolean isUseTagsOnly;

        /**
         * Flag to indicate if only tags will be used for resource name generation.
         *
         * @param isUseTagsOnly the value to set
         * @return this builder
         */
        public Builder isUseTagsOnly(Boolean isUseTagsOnly) {
            this.isUseTagsOnly = isUseTagsOnly;
            this.__explicitlySet__.add("isUseTagsOnly");
            return this;
        }
        /** List of tag names to be included. */
        @com.fasterxml.jackson.annotation.JsonProperty("includeTags")
        private java.util.List<String> includeTags;

        /**
         * List of tag names to be included.
         *
         * @param includeTags the value to set
         * @return this builder
         */
        public Builder includeTags(java.util.List<String> includeTags) {
            this.includeTags = includeTags;
            this.__explicitlySet__.add("includeTags");
            return this;
        }
        /** List of tag names to be excluded. */
        @com.fasterxml.jackson.annotation.JsonProperty("excludeTags")
        private java.util.List<String> excludeTags;

        /**
         * List of tag names to be excluded.
         *
         * @param excludeTags the value to set
         * @return this builder
         */
        public Builder excludeTags(java.util.List<String> excludeTags) {
            this.excludeTags = excludeTags;
            this.__explicitlySet__.add("excludeTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TelegrafResourceNameConfigurationDetails build() {
            TelegrafResourceNameConfigurationDetails model =
                    new TelegrafResourceNameConfigurationDetails(
                            this.isUseTagsOnly, this.includeTags, this.excludeTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TelegrafResourceNameConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("isUseTagsOnly")) {
                this.isUseTagsOnly(model.getIsUseTagsOnly());
            }
            if (model.wasPropertyExplicitlySet("includeTags")) {
                this.includeTags(model.getIncludeTags());
            }
            if (model.wasPropertyExplicitlySet("excludeTags")) {
                this.excludeTags(model.getExcludeTags());
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

    /** Flag to indicate if only tags will be used for resource name generation. */
    @com.fasterxml.jackson.annotation.JsonProperty("isUseTagsOnly")
    private final Boolean isUseTagsOnly;

    /**
     * Flag to indicate if only tags will be used for resource name generation.
     *
     * @return the value
     */
    public Boolean getIsUseTagsOnly() {
        return isUseTagsOnly;
    }

    /** List of tag names to be included. */
    @com.fasterxml.jackson.annotation.JsonProperty("includeTags")
    private final java.util.List<String> includeTags;

    /**
     * List of tag names to be included.
     *
     * @return the value
     */
    public java.util.List<String> getIncludeTags() {
        return includeTags;
    }

    /** List of tag names to be excluded. */
    @com.fasterxml.jackson.annotation.JsonProperty("excludeTags")
    private final java.util.List<String> excludeTags;

    /**
     * List of tag names to be excluded.
     *
     * @return the value
     */
    public java.util.List<String> getExcludeTags() {
        return excludeTags;
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
        sb.append("TelegrafResourceNameConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isUseTagsOnly=").append(String.valueOf(this.isUseTagsOnly));
        sb.append(", includeTags=").append(String.valueOf(this.includeTags));
        sb.append(", excludeTags=").append(String.valueOf(this.excludeTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TelegrafResourceNameConfigurationDetails)) {
            return false;
        }

        TelegrafResourceNameConfigurationDetails other =
                (TelegrafResourceNameConfigurationDetails) o;
        return java.util.Objects.equals(this.isUseTagsOnly, other.isUseTagsOnly)
                && java.util.Objects.equals(this.includeTags, other.includeTags)
                && java.util.Objects.equals(this.excludeTags, other.excludeTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isUseTagsOnly == null ? 43 : this.isUseTagsOnly.hashCode());
        result = (result * PRIME) + (this.includeTags == null ? 43 : this.includeTags.hashCode());
        result = (result * PRIME) + (this.excludeTags == null ? 43 : this.excludeTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
