/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * The metadata which can be edited after model creation.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221109")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PatchModelOperation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PatchModelOperation extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"path", "value", "operation"})
    public PatchModelOperation(String path, String value, Operation operation) {
        super();
        this.path = path;
        this.value = value;
        this.operation = operation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The parameter of the resource to be changed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * The parameter of the resource to be changed.
         * @param path the value to set
         * @return this builder
         **/
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * The value of the parameter to be updated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The value of the parameter to be updated.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The value of the parameter to be updated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private Operation operation;

        /**
         * The value of the parameter to be updated.
         * @param operation the value to set
         * @return this builder
         **/
        public Builder operation(Operation operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchModelOperation build() {
            PatchModelOperation model =
                    new PatchModelOperation(this.path, this.value, this.operation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchModelOperation model) {
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("operation")) {
                this.operation(model.getOperation());
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

    /**
     * The parameter of the resource to be changed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * The parameter of the resource to be changed.
     * @return the value
     **/
    public String getPath() {
        return path;
    }

    /**
     * The value of the parameter to be updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The value of the parameter to be updated.
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * The value of the parameter to be updated.
     **/
    public enum Operation {
        Delete("DELETE"),
        Add("ADD"),
        Replace("REPLACE"),
        ;

        private final String value;
        private static java.util.Map<String, Operation> map;

        static {
            map = new java.util.HashMap<>();
            for (Operation v : Operation.values()) {
                map.put(v.getValue(), v);
            }
        }

        Operation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Operation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Operation: " + key);
        }
    };
    /**
     * The value of the parameter to be updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final Operation operation;

    /**
     * The value of the parameter to be updated.
     * @return the value
     **/
    public Operation getOperation() {
        return operation;
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
        sb.append("PatchModelOperation(");
        sb.append("super=").append(super.toString());
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", operation=").append(String.valueOf(this.operation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchModelOperation)) {
            return false;
        }

        PatchModelOperation other = (PatchModelOperation) o;
        return java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.operation, other.operation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
