/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * Describes an item that references the span filter. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SpanFilterReference.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SpanFilterReference
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "configType", "optionsGroup", "displayName"})
    public SpanFilterReference(
            String id, ConfigTypes configType, String optionsGroup, String displayName) {
        super();
        this.id = id;
        this.configType = configType;
        this.optionsGroup = optionsGroup;
        this.displayName = displayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * configuration item. An OCID is generated when the item is created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * configuration item. An OCID is generated when the item is created.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The type of configuration item. */
        @com.fasterxml.jackson.annotation.JsonProperty("configType")
        private ConfigTypes configType;

        /**
         * The type of configuration item.
         *
         * @param configType the value to set
         * @return this builder
         */
        public Builder configType(ConfigTypes configType) {
            this.configType = configType;
            this.__explicitlySet__.add("configType");
            return this;
        }
        /** A string that specifies the group that an OPTIONS item belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("optionsGroup")
        private String optionsGroup;

        /**
         * A string that specifies the group that an OPTIONS item belongs to.
         *
         * @param optionsGroup the value to set
         * @return this builder
         */
        public Builder optionsGroup(String optionsGroup) {
            this.optionsGroup = optionsGroup;
            this.__explicitlySet__.add("optionsGroup");
            return this;
        }
        /** The name by which a configuration entity is displayed to the end user. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name by which a configuration entity is displayed to the end user.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SpanFilterReference build() {
            SpanFilterReference model =
                    new SpanFilterReference(
                            this.id, this.configType, this.optionsGroup, this.displayName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SpanFilterReference model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("configType")) {
                this.configType(model.getConfigType());
            }
            if (model.wasPropertyExplicitlySet("optionsGroup")) {
                this.optionsGroup(model.getOptionsGroup());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * configuration item. An OCID is generated when the item is created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * configuration item. An OCID is generated when the item is created.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The type of configuration item. */
    @com.fasterxml.jackson.annotation.JsonProperty("configType")
    private final ConfigTypes configType;

    /**
     * The type of configuration item.
     *
     * @return the value
     */
    public ConfigTypes getConfigType() {
        return configType;
    }

    /** A string that specifies the group that an OPTIONS item belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("optionsGroup")
    private final String optionsGroup;

    /**
     * A string that specifies the group that an OPTIONS item belongs to.
     *
     * @return the value
     */
    public String getOptionsGroup() {
        return optionsGroup;
    }

    /** The name by which a configuration entity is displayed to the end user. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name by which a configuration entity is displayed to the end user.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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
        sb.append("SpanFilterReference(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", configType=").append(String.valueOf(this.configType));
        sb.append(", optionsGroup=").append(String.valueOf(this.optionsGroup));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SpanFilterReference)) {
            return false;
        }

        SpanFilterReference other = (SpanFilterReference) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.configType, other.configType)
                && java.util.Objects.equals(this.optionsGroup, other.optionsGroup)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.configType == null ? 43 : this.configType.hashCode());
        result = (result * PRIME) + (this.optionsGroup == null ? 43 : this.optionsGroup.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
