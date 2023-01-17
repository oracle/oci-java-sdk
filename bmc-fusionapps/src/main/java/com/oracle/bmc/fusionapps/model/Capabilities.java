/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Status of capabilities that can be enabled for an environment family.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Capabilities.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Capabilities extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isDataMaskingEnabled",
        "isBreakGlassEnabled",
        "isByokEnabled"
    })
    public Capabilities(
            Boolean isDataMaskingEnabled, Boolean isBreakGlassEnabled, Boolean isByokEnabled) {
        super();
        this.isDataMaskingEnabled = isDataMaskingEnabled;
        this.isBreakGlassEnabled = isBreakGlassEnabled;
        this.isByokEnabled = isByokEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether data masking is enabled for the environment family. When enabled, data masking activities are supported.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDataMaskingEnabled")
        private Boolean isDataMaskingEnabled;

        /**
         * Indicates whether data masking is enabled for the environment family. When enabled, data masking activities are supported.
         * @param isDataMaskingEnabled the value to set
         * @return this builder
         **/
        public Builder isDataMaskingEnabled(Boolean isDataMaskingEnabled) {
            this.isDataMaskingEnabled = isDataMaskingEnabled;
            this.__explicitlySet__.add("isDataMaskingEnabled");
            return this;
        }
        /**
         * Indicates whether Break Glass is enabled for the environment family.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isBreakGlassEnabled")
        private Boolean isBreakGlassEnabled;

        /**
         * Indicates whether Break Glass is enabled for the environment family.
         * @param isBreakGlassEnabled the value to set
         * @return this builder
         **/
        public Builder isBreakGlassEnabled(Boolean isBreakGlassEnabled) {
            this.isBreakGlassEnabled = isBreakGlassEnabled;
            this.__explicitlySet__.add("isBreakGlassEnabled");
            return this;
        }
        /**
         * Indicates whether customers can use their own encryption keys.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isByokEnabled")
        private Boolean isByokEnabled;

        /**
         * Indicates whether customers can use their own encryption keys.
         * @param isByokEnabled the value to set
         * @return this builder
         **/
        public Builder isByokEnabled(Boolean isByokEnabled) {
            this.isByokEnabled = isByokEnabled;
            this.__explicitlySet__.add("isByokEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Capabilities build() {
            Capabilities model =
                    new Capabilities(
                            this.isDataMaskingEnabled,
                            this.isBreakGlassEnabled,
                            this.isByokEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Capabilities model) {
            if (model.wasPropertyExplicitlySet("isDataMaskingEnabled")) {
                this.isDataMaskingEnabled(model.getIsDataMaskingEnabled());
            }
            if (model.wasPropertyExplicitlySet("isBreakGlassEnabled")) {
                this.isBreakGlassEnabled(model.getIsBreakGlassEnabled());
            }
            if (model.wasPropertyExplicitlySet("isByokEnabled")) {
                this.isByokEnabled(model.getIsByokEnabled());
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

    /**
     * Indicates whether data masking is enabled for the environment family. When enabled, data masking activities are supported.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDataMaskingEnabled")
    private final Boolean isDataMaskingEnabled;

    /**
     * Indicates whether data masking is enabled for the environment family. When enabled, data masking activities are supported.
     * @return the value
     **/
    public Boolean getIsDataMaskingEnabled() {
        return isDataMaskingEnabled;
    }

    /**
     * Indicates whether Break Glass is enabled for the environment family.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBreakGlassEnabled")
    private final Boolean isBreakGlassEnabled;

    /**
     * Indicates whether Break Glass is enabled for the environment family.
     * @return the value
     **/
    public Boolean getIsBreakGlassEnabled() {
        return isBreakGlassEnabled;
    }

    /**
     * Indicates whether customers can use their own encryption keys.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isByokEnabled")
    private final Boolean isByokEnabled;

    /**
     * Indicates whether customers can use their own encryption keys.
     * @return the value
     **/
    public Boolean getIsByokEnabled() {
        return isByokEnabled;
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
        sb.append("Capabilities(");
        sb.append("super=").append(super.toString());
        sb.append("isDataMaskingEnabled=").append(String.valueOf(this.isDataMaskingEnabled));
        sb.append(", isBreakGlassEnabled=").append(String.valueOf(this.isBreakGlassEnabled));
        sb.append(", isByokEnabled=").append(String.valueOf(this.isByokEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Capabilities)) {
            return false;
        }

        Capabilities other = (Capabilities) o;
        return java.util.Objects.equals(this.isDataMaskingEnabled, other.isDataMaskingEnabled)
                && java.util.Objects.equals(this.isBreakGlassEnabled, other.isBreakGlassEnabled)
                && java.util.Objects.equals(this.isByokEnabled, other.isByokEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isDataMaskingEnabled == null
                                ? 43
                                : this.isDataMaskingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isBreakGlassEnabled == null
                                ? 43
                                : this.isBreakGlassEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isByokEnabled == null ? 43 : this.isByokEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
