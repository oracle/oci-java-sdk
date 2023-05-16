/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Configuration values can be string, objects, or parameters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ConfigValues.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConfigValues extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"configParamValues", "parentRef"})
    public ConfigValues(
            java.util.Map<String, ConfigParameterValue> configParamValues,
            ParentReference parentRef) {
        super();
        this.configParamValues = configParamValues;
        this.parentRef = parentRef;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The configuration parameter values. */
        @com.fasterxml.jackson.annotation.JsonProperty("configParamValues")
        private java.util.Map<String, ConfigParameterValue> configParamValues;

        /**
         * The configuration parameter values.
         *
         * @param configParamValues the value to set
         * @return this builder
         */
        public Builder configParamValues(
                java.util.Map<String, ConfigParameterValue> configParamValues) {
            this.configParamValues = configParamValues;
            this.__explicitlySet__.add("configParamValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigValues build() {
            ConfigValues model = new ConfigValues(this.configParamValues, this.parentRef);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigValues model) {
            if (model.wasPropertyExplicitlySet("configParamValues")) {
                this.configParamValues(model.getConfigParamValues());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
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

    /** The configuration parameter values. */
    @com.fasterxml.jackson.annotation.JsonProperty("configParamValues")
    private final java.util.Map<String, ConfigParameterValue> configParamValues;

    /**
     * The configuration parameter values.
     *
     * @return the value
     */
    public java.util.Map<String, ConfigParameterValue> getConfigParamValues() {
        return configParamValues;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
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
        sb.append("ConfigValues(");
        sb.append("super=").append(super.toString());
        sb.append("configParamValues=").append(String.valueOf(this.configParamValues));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigValues)) {
            return false;
        }

        ConfigValues other = (ConfigValues) o;
        return java.util.Objects.equals(this.configParamValues, other.configParamValues)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.configParamValues == null ? 43 : this.configParamValues.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
