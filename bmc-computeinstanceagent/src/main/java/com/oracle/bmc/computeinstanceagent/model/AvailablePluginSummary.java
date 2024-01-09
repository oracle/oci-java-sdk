/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * Describes where the plugin is supported <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AvailablePluginSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AvailablePluginSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "summary", "isSupported", "isEnabledByDefault"})
    public AvailablePluginSummary(
            String name, String summary, Boolean isSupported, Boolean isEnabledByDefault) {
        super();
        this.name = name;
        this.summary = summary;
        this.isSupported = isSupported;
        this.isEnabledByDefault = isEnabledByDefault;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The plugin name */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The plugin name
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** A brief description of the plugin functionality */
        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        /**
         * A brief description of the plugin functionality
         *
         * @param summary the value to set
         * @return this builder
         */
        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }
        /** Is the plugin supported or not */
        @com.fasterxml.jackson.annotation.JsonProperty("isSupported")
        private Boolean isSupported;

        /**
         * Is the plugin supported or not
         *
         * @param isSupported the value to set
         * @return this builder
         */
        public Builder isSupported(Boolean isSupported) {
            this.isSupported = isSupported;
            this.__explicitlySet__.add("isSupported");
            return this;
        }
        /** Is the plugin enabled or disabled by default */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabledByDefault")
        private Boolean isEnabledByDefault;

        /**
         * Is the plugin enabled or disabled by default
         *
         * @param isEnabledByDefault the value to set
         * @return this builder
         */
        public Builder isEnabledByDefault(Boolean isEnabledByDefault) {
            this.isEnabledByDefault = isEnabledByDefault;
            this.__explicitlySet__.add("isEnabledByDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AvailablePluginSummary build() {
            AvailablePluginSummary model =
                    new AvailablePluginSummary(
                            this.name, this.summary, this.isSupported, this.isEnabledByDefault);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailablePluginSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("summary")) {
                this.summary(model.getSummary());
            }
            if (model.wasPropertyExplicitlySet("isSupported")) {
                this.isSupported(model.getIsSupported());
            }
            if (model.wasPropertyExplicitlySet("isEnabledByDefault")) {
                this.isEnabledByDefault(model.getIsEnabledByDefault());
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

    /** The plugin name */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The plugin name
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** A brief description of the plugin functionality */
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final String summary;

    /**
     * A brief description of the plugin functionality
     *
     * @return the value
     */
    public String getSummary() {
        return summary;
    }

    /** Is the plugin supported or not */
    @com.fasterxml.jackson.annotation.JsonProperty("isSupported")
    private final Boolean isSupported;

    /**
     * Is the plugin supported or not
     *
     * @return the value
     */
    public Boolean getIsSupported() {
        return isSupported;
    }

    /** Is the plugin enabled or disabled by default */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabledByDefault")
    private final Boolean isEnabledByDefault;

    /**
     * Is the plugin enabled or disabled by default
     *
     * @return the value
     */
    public Boolean getIsEnabledByDefault() {
        return isEnabledByDefault;
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
        sb.append("AvailablePluginSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(", isSupported=").append(String.valueOf(this.isSupported));
        sb.append(", isEnabledByDefault=").append(String.valueOf(this.isEnabledByDefault));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AvailablePluginSummary)) {
            return false;
        }

        AvailablePluginSummary other = (AvailablePluginSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(this.isSupported, other.isSupported)
                && java.util.Objects.equals(this.isEnabledByDefault, other.isEnabledByDefault)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result = (result * PRIME) + (this.isSupported == null ? 43 : this.isSupported.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnabledByDefault == null
                                ? 43
                                : this.isEnabledByDefault.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
