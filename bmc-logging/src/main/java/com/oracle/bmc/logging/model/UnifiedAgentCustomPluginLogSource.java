/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * User-customized-source-plugin log source object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UnifiedAgentCustomPluginLogSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UnifiedAgentCustomPluginLogSource extends UnifiedAgentLoggingSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** User customized source plugin. */
        @com.fasterxml.jackson.annotation.JsonProperty("customPlugin")
        private String customPlugin;

        /**
         * User customized source plugin.
         *
         * @param customPlugin the value to set
         * @return this builder
         */
        public Builder customPlugin(String customPlugin) {
            this.customPlugin = customPlugin;
            this.__explicitlySet__.add("customPlugin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentCustomPluginLogSource build() {
            UnifiedAgentCustomPluginLogSource model =
                    new UnifiedAgentCustomPluginLogSource(this.name, this.customPlugin);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentCustomPluginLogSource model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("customPlugin")) {
                this.customPlugin(model.getCustomPlugin());
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
    public UnifiedAgentCustomPluginLogSource(String name, String customPlugin) {
        super(name);
        this.customPlugin = customPlugin;
    }

    /** User customized source plugin. */
    @com.fasterxml.jackson.annotation.JsonProperty("customPlugin")
    private final String customPlugin;

    /**
     * User customized source plugin.
     *
     * @return the value
     */
    public String getCustomPlugin() {
        return customPlugin;
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
        sb.append("UnifiedAgentCustomPluginLogSource(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", customPlugin=").append(String.valueOf(this.customPlugin));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentCustomPluginLogSource)) {
            return false;
        }

        UnifiedAgentCustomPluginLogSource other = (UnifiedAgentCustomPluginLogSource) o;
        return java.util.Objects.equals(this.customPlugin, other.customPlugin)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.customPlugin == null ? 43 : this.customPlugin.hashCode());
        return result;
    }
}
