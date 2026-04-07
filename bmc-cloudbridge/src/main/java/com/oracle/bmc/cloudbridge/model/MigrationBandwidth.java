/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Defines the bandwidth used by migration <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MigrationBandwidth.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MigrationBandwidth
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"assignmentMethod"})
    public MigrationBandwidth(AssignmentMethod assignmentMethod) {
        super();
        this.assignmentMethod = assignmentMethod;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Defines how the migration bandwidth is assigned */
        @com.fasterxml.jackson.annotation.JsonProperty("assignmentMethod")
        private AssignmentMethod assignmentMethod;

        /**
         * Defines how the migration bandwidth is assigned
         *
         * @param assignmentMethod the value to set
         * @return this builder
         */
        public Builder assignmentMethod(AssignmentMethod assignmentMethod) {
            this.assignmentMethod = assignmentMethod;
            this.__explicitlySet__.add("assignmentMethod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MigrationBandwidth build() {
            MigrationBandwidth model = new MigrationBandwidth(this.assignmentMethod);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MigrationBandwidth model) {
            if (model.wasPropertyExplicitlySet("assignmentMethod")) {
                this.assignmentMethod(model.getAssignmentMethod());
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

    /** Defines how the migration bandwidth is assigned */
    public enum AssignmentMethod implements com.oracle.bmc.http.internal.BmcEnum {
        Auto("AUTO"),
        Custom("CUSTOM"),
        HypervisorDefault("HYPERVISOR_DEFAULT"),
        ;

        private final String value;
        private static java.util.Map<String, AssignmentMethod> map;

        static {
            map = new java.util.HashMap<>();
            for (AssignmentMethod v : AssignmentMethod.values()) {
                map.put(v.getValue(), v);
            }
        }

        AssignmentMethod(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AssignmentMethod create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AssignmentMethod: " + key);
        }
    };
    /** Defines how the migration bandwidth is assigned */
    @com.fasterxml.jackson.annotation.JsonProperty("assignmentMethod")
    private final AssignmentMethod assignmentMethod;

    /**
     * Defines how the migration bandwidth is assigned
     *
     * @return the value
     */
    public AssignmentMethod getAssignmentMethod() {
        return assignmentMethod;
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
        sb.append("MigrationBandwidth(");
        sb.append("super=").append(super.toString());
        sb.append("assignmentMethod=").append(String.valueOf(this.assignmentMethod));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MigrationBandwidth)) {
            return false;
        }

        MigrationBandwidth other = (MigrationBandwidth) o;
        return java.util.Objects.equals(this.assignmentMethod, other.assignmentMethod)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.assignmentMethod == null ? 43 : this.assignmentMethod.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
