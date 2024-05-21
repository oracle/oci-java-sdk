/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Logging custom filter plugin.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UnifiedAgentCustomFilter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "filterType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UnifiedAgentCustomFilter extends UnifiedAgentLoggingFilter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Type of the custom filter
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customFilterType")
        private String customFilterType;

        /**
         * Type of the custom filter
         * @param customFilterType the value to set
         * @return this builder
         **/
        public Builder customFilterType(String customFilterType) {
            this.customFilterType = customFilterType;
            this.__explicitlySet__.add("customFilterType");
            return this;
        }
        /**
         * Parameters of the custom filter
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("params")
        private java.util.Map<String, String> params;

        /**
         * Parameters of the custom filter
         * @param params the value to set
         * @return this builder
         **/
        public Builder params(java.util.Map<String, String> params) {
            this.params = params;
            this.__explicitlySet__.add("params");
            return this;
        }
        /**
         * List of custom sections in custom filter
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customSections")
        private java.util.List<UnifiedAgentCustomSection> customSections;

        /**
         * List of custom sections in custom filter
         * @param customSections the value to set
         * @return this builder
         **/
        public Builder customSections(java.util.List<UnifiedAgentCustomSection> customSections) {
            this.customSections = customSections;
            this.__explicitlySet__.add("customSections");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentCustomFilter build() {
            UnifiedAgentCustomFilter model =
                    new UnifiedAgentCustomFilter(
                            this.name, this.customFilterType, this.params, this.customSections);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentCustomFilter model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("customFilterType")) {
                this.customFilterType(model.getCustomFilterType());
            }
            if (model.wasPropertyExplicitlySet("params")) {
                this.params(model.getParams());
            }
            if (model.wasPropertyExplicitlySet("customSections")) {
                this.customSections(model.getCustomSections());
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

    @Deprecated
    public UnifiedAgentCustomFilter(
            String name,
            String customFilterType,
            java.util.Map<String, String> params,
            java.util.List<UnifiedAgentCustomSection> customSections) {
        super(name);
        this.customFilterType = customFilterType;
        this.params = params;
        this.customSections = customSections;
    }

    /**
     * Type of the custom filter
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customFilterType")
    private final String customFilterType;

    /**
     * Type of the custom filter
     * @return the value
     **/
    public String getCustomFilterType() {
        return customFilterType;
    }

    /**
     * Parameters of the custom filter
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("params")
    private final java.util.Map<String, String> params;

    /**
     * Parameters of the custom filter
     * @return the value
     **/
    public java.util.Map<String, String> getParams() {
        return params;
    }

    /**
     * List of custom sections in custom filter
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customSections")
    private final java.util.List<UnifiedAgentCustomSection> customSections;

    /**
     * List of custom sections in custom filter
     * @return the value
     **/
    public java.util.List<UnifiedAgentCustomSection> getCustomSections() {
        return customSections;
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
        sb.append("UnifiedAgentCustomFilter(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", customFilterType=").append(String.valueOf(this.customFilterType));
        sb.append(", params=").append(String.valueOf(this.params));
        sb.append(", customSections=").append(String.valueOf(this.customSections));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentCustomFilter)) {
            return false;
        }

        UnifiedAgentCustomFilter other = (UnifiedAgentCustomFilter) o;
        return java.util.Objects.equals(this.customFilterType, other.customFilterType)
                && java.util.Objects.equals(this.params, other.params)
                && java.util.Objects.equals(this.customSections, other.customSections)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.customFilterType == null ? 43 : this.customFilterType.hashCode());
        result = (result * PRIME) + (this.params == null ? 43 : this.params.hashCode());
        result =
                (result * PRIME)
                        + (this.customSections == null ? 43 : this.customSections.hashCode());
        return result;
    }
}
