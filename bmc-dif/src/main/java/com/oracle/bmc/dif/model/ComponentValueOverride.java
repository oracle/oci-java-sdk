/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Component overrides for stack\u2011specific parameters applied during artifact template
 * rendering. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComponentValueOverride.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComponentValueOverride
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"componentName", "valueOverrides"})
    public ComponentValueOverride(
            String componentName, java.util.Map<String, String> valueOverrides) {
        super();
        this.componentName = componentName;
        this.valueOverrides = valueOverrides;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Logical name of the grouping independently deployable kubernetes resource artifacts for
         * the current deployment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("componentName")
        private String componentName;

        /**
         * Logical name of the grouping independently deployable kubernetes resource artifacts for
         * the current deployment.
         *
         * @param componentName the value to set
         * @return this builder
         */
        public Builder componentName(String componentName) {
            this.componentName = componentName;
            this.__explicitlySet__.add("componentName");
            return this;
        }
        /**
         * Free-form value overrides for the component. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. Used for overriding the values in value.yaml
         * artifact of the component. Example: {@code {"WORKER_THREADS": "8"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("valueOverrides")
        private java.util.Map<String, String> valueOverrides;

        /**
         * Free-form value overrides for the component. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. Used for overriding the values in value.yaml
         * artifact of the component. Example: {@code {"WORKER_THREADS": "8"}}
         *
         * @param valueOverrides the value to set
         * @return this builder
         */
        public Builder valueOverrides(java.util.Map<String, String> valueOverrides) {
            this.valueOverrides = valueOverrides;
            this.__explicitlySet__.add("valueOverrides");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComponentValueOverride build() {
            ComponentValueOverride model =
                    new ComponentValueOverride(this.componentName, this.valueOverrides);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComponentValueOverride model) {
            if (model.wasPropertyExplicitlySet("componentName")) {
                this.componentName(model.getComponentName());
            }
            if (model.wasPropertyExplicitlySet("valueOverrides")) {
                this.valueOverrides(model.getValueOverrides());
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
     * Logical name of the grouping independently deployable kubernetes resource artifacts for the
     * current deployment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("componentName")
    private final String componentName;

    /**
     * Logical name of the grouping independently deployable kubernetes resource artifacts for the
     * current deployment.
     *
     * @return the value
     */
    public String getComponentName() {
        return componentName;
    }

    /**
     * Free-form value overrides for the component. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. Used for overriding the values in value.yaml artifact of
     * the component. Example: {@code {"WORKER_THREADS": "8"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueOverrides")
    private final java.util.Map<String, String> valueOverrides;

    /**
     * Free-form value overrides for the component. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. Used for overriding the values in value.yaml artifact of
     * the component. Example: {@code {"WORKER_THREADS": "8"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getValueOverrides() {
        return valueOverrides;
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
        sb.append("ComponentValueOverride(");
        sb.append("super=").append(super.toString());
        sb.append("componentName=").append(String.valueOf(this.componentName));
        sb.append(", valueOverrides=").append(String.valueOf(this.valueOverrides));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComponentValueOverride)) {
            return false;
        }

        ComponentValueOverride other = (ComponentValueOverride) o;
        return java.util.Objects.equals(this.componentName, other.componentName)
                && java.util.Objects.equals(this.valueOverrides, other.valueOverrides)
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
                        + (this.valueOverrides == null ? 43 : this.valueOverrides.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
