/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * An Options object represents configuration options.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateOptionsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateOptionsDetails extends UpdateConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The name by which a configuration entity is displayed to the end user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name by which a configuration entity is displayed to the end user.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The options are stored here as JSON.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private Object options;

        /**
         * The options are stored here as JSON.
         * @param options the value to set
         * @return this builder
         **/
        public Builder options(Object options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }
        /**
         * A string that specifies the group that an OPTIONS item belongs to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("group")
        private String group;

        /**
         * A string that specifies the group that an OPTIONS item belongs to.
         *
         * @param group the value to set
         * @return this builder
         **/
        public Builder group(String group) {
            this.group = group;
            this.__explicitlySet__.add("group");
            return this;
        }
        /**
         * An optional string that describes what the options are intended or used for.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * An optional string that describes what the options are intended or used for.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOptionsDetails build() {
            UpdateOptionsDetails __instance__ =
                    new UpdateOptionsDetails(
                            freeformTags, definedTags, displayName, options, group, description);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOptionsDetails o) {
            Builder copiedBuilder =
                    freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .options(o.getOptions())
                            .group(o.getGroup())
                            .description(o.getDescription());

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

    @Deprecated
    public UpdateOptionsDetails(
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            Object options,
            String group,
            String description) {
        super(freeformTags, definedTags);
        this.displayName = displayName;
        this.options = options;
        this.group = group;
        this.description = description;
    }

    /**
     * The name by which a configuration entity is displayed to the end user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name by which a configuration entity is displayed to the end user.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The options are stored here as JSON.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final Object options;

    /**
     * The options are stored here as JSON.
     * @return the value
     **/
    public Object getOptions() {
        return options;
    }

    /**
     * A string that specifies the group that an OPTIONS item belongs to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("group")
    private final String group;

    /**
     * A string that specifies the group that an OPTIONS item belongs to.
     *
     * @return the value
     **/
    public String getGroup() {
        return group;
    }

    /**
     * An optional string that describes what the options are intended or used for.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * An optional string that describes what the options are intended or used for.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateOptionsDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", options=").append(String.valueOf(this.options));
        sb.append(", group=").append(String.valueOf(this.group));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOptionsDetails)) {
            return false;
        }

        UpdateOptionsDetails other = (UpdateOptionsDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.options, other.options)
                && java.util.Objects.equals(this.group, other.group)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        result = (result * PRIME) + (this.group == null ? 43 : this.group.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
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
