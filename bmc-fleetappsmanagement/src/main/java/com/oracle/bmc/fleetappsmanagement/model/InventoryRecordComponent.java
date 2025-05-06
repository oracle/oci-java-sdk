/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Details about a target component <br>
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
        builder = InventoryRecordComponent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InventoryRecordComponent
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "componentName",
        "componentVersion",
        "componentPath",
        "properties"
    })
    public InventoryRecordComponent(
            String componentName,
            String componentVersion,
            String componentPath,
            java.util.List<InventoryRecordProperty> properties) {
        super();
        this.componentName = componentName;
        this.componentVersion = componentVersion;
        this.componentPath = componentPath;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the target component */
        @com.fasterxml.jackson.annotation.JsonProperty("componentName")
        private String componentName;

        /**
         * Name of the target component
         *
         * @param componentName the value to set
         * @return this builder
         */
        public Builder componentName(String componentName) {
            this.componentName = componentName;
            this.__explicitlySet__.add("componentName");
            return this;
        }
        /** Version of the target component */
        @com.fasterxml.jackson.annotation.JsonProperty("componentVersion")
        private String componentVersion;

        /**
         * Version of the target component
         *
         * @param componentVersion the value to set
         * @return this builder
         */
        public Builder componentVersion(String componentVersion) {
            this.componentVersion = componentVersion;
            this.__explicitlySet__.add("componentVersion");
            return this;
        }
        /** Path of the component */
        @com.fasterxml.jackson.annotation.JsonProperty("componentPath")
        private String componentPath;

        /**
         * Path of the component
         *
         * @param componentPath the value to set
         * @return this builder
         */
        public Builder componentPath(String componentPath) {
            this.componentPath = componentPath;
            this.__explicitlySet__.add("componentPath");
            return this;
        }
        /** List of component properties */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<InventoryRecordProperty> properties;

        /**
         * List of component properties
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.List<InventoryRecordProperty> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InventoryRecordComponent build() {
            InventoryRecordComponent model =
                    new InventoryRecordComponent(
                            this.componentName,
                            this.componentVersion,
                            this.componentPath,
                            this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InventoryRecordComponent model) {
            if (model.wasPropertyExplicitlySet("componentName")) {
                this.componentName(model.getComponentName());
            }
            if (model.wasPropertyExplicitlySet("componentVersion")) {
                this.componentVersion(model.getComponentVersion());
            }
            if (model.wasPropertyExplicitlySet("componentPath")) {
                this.componentPath(model.getComponentPath());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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

    /** Name of the target component */
    @com.fasterxml.jackson.annotation.JsonProperty("componentName")
    private final String componentName;

    /**
     * Name of the target component
     *
     * @return the value
     */
    public String getComponentName() {
        return componentName;
    }

    /** Version of the target component */
    @com.fasterxml.jackson.annotation.JsonProperty("componentVersion")
    private final String componentVersion;

    /**
     * Version of the target component
     *
     * @return the value
     */
    public String getComponentVersion() {
        return componentVersion;
    }

    /** Path of the component */
    @com.fasterxml.jackson.annotation.JsonProperty("componentPath")
    private final String componentPath;

    /**
     * Path of the component
     *
     * @return the value
     */
    public String getComponentPath() {
        return componentPath;
    }

    /** List of component properties */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<InventoryRecordProperty> properties;

    /**
     * List of component properties
     *
     * @return the value
     */
    public java.util.List<InventoryRecordProperty> getProperties() {
        return properties;
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
        sb.append("InventoryRecordComponent(");
        sb.append("super=").append(super.toString());
        sb.append("componentName=").append(String.valueOf(this.componentName));
        sb.append(", componentVersion=").append(String.valueOf(this.componentVersion));
        sb.append(", componentPath=").append(String.valueOf(this.componentPath));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InventoryRecordComponent)) {
            return false;
        }

        InventoryRecordComponent other = (InventoryRecordComponent) o;
        return java.util.Objects.equals(this.componentName, other.componentName)
                && java.util.Objects.equals(this.componentVersion, other.componentVersion)
                && java.util.Objects.equals(this.componentPath, other.componentPath)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.componentName == null ? 43 : this.componentName.hashCode());
        result =
                (result * PRIME)
                        + (this.componentVersion == null ? 43 : this.componentVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.componentPath == null ? 43 : this.componentPath.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
