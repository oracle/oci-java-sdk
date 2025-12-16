/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.model;

/**
 * A batch task contains common properties for all types of job tasks. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = CreateBatchTaskDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateComputeTaskDetails.class,
            name = "COMPUTE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CreateBatchTaskDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "description",
        "entitlementClaims",
        "dependencies",
        "environmentVariables"
    })
    protected CreateBatchTaskDetails(
            String name,
            String description,
            java.util.List<String> entitlementClaims,
            java.util.List<String> dependencies,
            java.util.List<EnvironmentVariable> environmentVariables) {
        super();
        this.name = name;
        this.description = description;
        this.entitlementClaims = entitlementClaims;
        this.dependencies = dependencies;
        this.environmentVariables = environmentVariables;
    }

    /** The name of the batch task. It must be unique within its parent batch job. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the batch task. It must be unique within its parent batch job.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** An optional description that provides additional context next to the displayName. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * An optional description that provides additional context next to the displayName.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** A list of resources (for example licences) this task needs for its execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("entitlementClaims")
    private final java.util.List<String> entitlementClaims;

    /**
     * A list of resources (for example licences) this task needs for its execution.
     *
     * @return the value
     */
    public java.util.List<String> getEntitlementClaims() {
        return entitlementClaims;
    }

    /** A list of tasks from the same job this task depends on referenced by name. */
    @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
    private final java.util.List<String> dependencies;

    /**
     * A list of tasks from the same job this task depends on referenced by name.
     *
     * @return the value
     */
    public java.util.List<String> getDependencies() {
        return dependencies;
    }

    /** Environment variables to use for the task execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
    private final java.util.List<EnvironmentVariable> environmentVariables;

    /**
     * Environment variables to use for the task execution.
     *
     * @return the value
     */
    public java.util.List<EnvironmentVariable> getEnvironmentVariables() {
        return environmentVariables;
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
        sb.append("CreateBatchTaskDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", entitlementClaims=").append(String.valueOf(this.entitlementClaims));
        sb.append(", dependencies=").append(String.valueOf(this.dependencies));
        sb.append(", environmentVariables=").append(String.valueOf(this.environmentVariables));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateBatchTaskDetails)) {
            return false;
        }

        CreateBatchTaskDetails other = (CreateBatchTaskDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.entitlementClaims, other.entitlementClaims)
                && java.util.Objects.equals(this.dependencies, other.dependencies)
                && java.util.Objects.equals(this.environmentVariables, other.environmentVariables)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.entitlementClaims == null ? 43 : this.entitlementClaims.hashCode());
        result = (result * PRIME) + (this.dependencies == null ? 43 : this.dependencies.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentVariables == null
                                ? 43
                                : this.environmentVariables.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Type of the batch task. Also serves as a discriminator for sub-entities. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Compute("COMPUTE"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
}
