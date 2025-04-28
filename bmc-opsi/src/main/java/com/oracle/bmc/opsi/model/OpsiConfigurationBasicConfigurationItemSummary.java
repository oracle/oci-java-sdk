/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Basic configuration item summary. Value and defaultValue fields will contain the custom value
 * stored in the resource and default value from Ops Insights respectively. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OpsiConfigurationBasicConfigurationItemSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configItemType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OpsiConfigurationBasicConfigurationItemSummary
        extends OpsiConfigurationConfigurationItemSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of configuration item. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of configuration item.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Value of configuration item. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Value of configuration item.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** Value of configuration item. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * Value of configuration item.
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /** List of contexts in Operations Insights where this configuration item is applicable. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicableContexts")
        private java.util.List<String> applicableContexts;

        /**
         * List of contexts in Operations Insights where this configuration item is applicable.
         *
         * @param applicableContexts the value to set
         * @return this builder
         */
        public Builder applicableContexts(java.util.List<String> applicableContexts) {
            this.applicableContexts = applicableContexts;
            this.__explicitlySet__.add("applicableContexts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ConfigurationItemMetadata metadata;

        public Builder metadata(ConfigurationItemMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpsiConfigurationBasicConfigurationItemSummary build() {
            OpsiConfigurationBasicConfigurationItemSummary model =
                    new OpsiConfigurationBasicConfigurationItemSummary(
                            this.name,
                            this.value,
                            this.defaultValue,
                            this.applicableContexts,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpsiConfigurationBasicConfigurationItemSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("applicableContexts")) {
                this.applicableContexts(model.getApplicableContexts());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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
    public OpsiConfigurationBasicConfigurationItemSummary(
            String name,
            String value,
            String defaultValue,
            java.util.List<String> applicableContexts,
            ConfigurationItemMetadata metadata) {
        super();
        this.name = name;
        this.value = value;
        this.defaultValue = defaultValue;
        this.applicableContexts = applicableContexts;
        this.metadata = metadata;
    }

    /** Name of configuration item. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of configuration item.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Value of configuration item. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Value of configuration item.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** Value of configuration item. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * Value of configuration item.
     *
     * @return the value
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /** List of contexts in Operations Insights where this configuration item is applicable. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicableContexts")
    private final java.util.List<String> applicableContexts;

    /**
     * List of contexts in Operations Insights where this configuration item is applicable.
     *
     * @return the value
     */
    public java.util.List<String> getApplicableContexts() {
        return applicableContexts;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ConfigurationItemMetadata metadata;

    public ConfigurationItemMetadata getMetadata() {
        return metadata;
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
        sb.append("OpsiConfigurationBasicConfigurationItemSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", applicableContexts=").append(String.valueOf(this.applicableContexts));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpsiConfigurationBasicConfigurationItemSummary)) {
            return false;
        }

        OpsiConfigurationBasicConfigurationItemSummary other =
                (OpsiConfigurationBasicConfigurationItemSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.applicableContexts, other.applicableContexts)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result =
                (result * PRIME)
                        + (this.applicableContexts == null
                                ? 43
                                : this.applicableContexts.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        return result;
    }
}
