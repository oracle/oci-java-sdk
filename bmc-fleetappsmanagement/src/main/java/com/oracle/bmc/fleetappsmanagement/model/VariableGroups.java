/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * variable groups object. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VariableGroups.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VariableGroups
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"array"})
    public VariableGroups(java.util.Map<String, VariableGroup> array) {
        super();
        this.array = array;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Map of group names to their respective VariableGroup objects. */
        @com.fasterxml.jackson.annotation.JsonProperty("array")
        private java.util.Map<String, VariableGroup> array;

        /**
         * Map of group names to their respective VariableGroup objects.
         *
         * @param array the value to set
         * @return this builder
         */
        public Builder array(java.util.Map<String, VariableGroup> array) {
            this.array = array;
            this.__explicitlySet__.add("array");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VariableGroups build() {
            VariableGroups model = new VariableGroups(this.array);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VariableGroups model) {
            if (model.wasPropertyExplicitlySet("array")) {
                this.array(model.getArray());
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

    /** Map of group names to their respective VariableGroup objects. */
    @com.fasterxml.jackson.annotation.JsonProperty("array")
    private final java.util.Map<String, VariableGroup> array;

    /**
     * Map of group names to their respective VariableGroup objects.
     *
     * @return the value
     */
    public java.util.Map<String, VariableGroup> getArray() {
        return array;
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
        sb.append("VariableGroups(");
        sb.append("super=").append(super.toString());
        sb.append("array=").append(String.valueOf(this.array));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VariableGroups)) {
            return false;
        }

        VariableGroups other = (VariableGroups) o;
        return java.util.Objects.equals(this.array, other.array) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.array == null ? 43 : this.array.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
