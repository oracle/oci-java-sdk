/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * The declaration of a type of task that can be used in a MediaWorkflow. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MediaWorkflowTaskDeclaration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MediaWorkflowTaskDeclaration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "version",
        "parametersSchema",
        "parametersSchemaAllowingReferences",
        "locks"
    })
    public MediaWorkflowTaskDeclaration(
            String name,
            Integer version,
            java.util.Map<String, Object> parametersSchema,
            java.util.Map<String, Object> parametersSchemaAllowingReferences,
            java.util.List<ResourceLock> locks) {
        super();
        this.name = name;
        this.version = version;
        this.parametersSchema = parametersSchema;
        this.parametersSchemaAllowingReferences = parametersSchemaAllowingReferences;
        this.locks = locks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * MediaWorkflowTaskDeclaration identifier. The name and version should be unique among
         * MediaWorkflowTaskDeclarations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * MediaWorkflowTaskDeclaration identifier. The name and version should be unique among
         * MediaWorkflowTaskDeclarations.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The version of MediaWorkflowTaskDeclaration, incremented whenever the team implementing
         * the task processor modifies the JSON schema of this declaration's definitions, parameters
         * or list of required parameters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Integer version;

        /**
         * The version of MediaWorkflowTaskDeclaration, incremented whenever the team implementing
         * the task processor modifies the JSON schema of this declaration's definitions, parameters
         * or list of required parameters.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(Integer version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * JSON schema specifying the parameters supported by this type of task. This is used to
         * validate tasks' parameters when jobs are created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parametersSchema")
        private java.util.Map<String, Object> parametersSchema;

        /**
         * JSON schema specifying the parameters supported by this type of task. This is used to
         * validate tasks' parameters when jobs are created.
         *
         * @param parametersSchema the value to set
         * @return this builder
         */
        public Builder parametersSchema(java.util.Map<String, Object> parametersSchema) {
            this.parametersSchema = parametersSchema;
            this.__explicitlySet__.add("parametersSchema");
            return this;
        }
        /**
         * JSON schema similar to the parameterSchema, but permits parameter values to refer to
         * other parameters using the ${/path/to/another/parmeter} syntax. This is used to validate
         * task parameters when workflows are created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parametersSchemaAllowingReferences")
        private java.util.Map<String, Object> parametersSchemaAllowingReferences;

        /**
         * JSON schema similar to the parameterSchema, but permits parameter values to refer to
         * other parameters using the ${/path/to/another/parmeter} syntax. This is used to validate
         * task parameters when workflows are created.
         *
         * @param parametersSchemaAllowingReferences the value to set
         * @return this builder
         */
        public Builder parametersSchemaAllowingReferences(
                java.util.Map<String, Object> parametersSchemaAllowingReferences) {
            this.parametersSchemaAllowingReferences = parametersSchemaAllowingReferences;
            this.__explicitlySet__.add("parametersSchemaAllowingReferences");
            return this;
        }
        /** Locks associated with this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         *
         * @param locks the value to set
         * @return this builder
         */
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MediaWorkflowTaskDeclaration build() {
            MediaWorkflowTaskDeclaration model =
                    new MediaWorkflowTaskDeclaration(
                            this.name,
                            this.version,
                            this.parametersSchema,
                            this.parametersSchemaAllowingReferences,
                            this.locks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MediaWorkflowTaskDeclaration model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("parametersSchema")) {
                this.parametersSchema(model.getParametersSchema());
            }
            if (model.wasPropertyExplicitlySet("parametersSchemaAllowingReferences")) {
                this.parametersSchemaAllowingReferences(
                        model.getParametersSchemaAllowingReferences());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
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
     * MediaWorkflowTaskDeclaration identifier. The name and version should be unique among
     * MediaWorkflowTaskDeclarations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * MediaWorkflowTaskDeclaration identifier. The name and version should be unique among
     * MediaWorkflowTaskDeclarations.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The version of MediaWorkflowTaskDeclaration, incremented whenever the team implementing the
     * task processor modifies the JSON schema of this declaration's definitions, parameters or list
     * of required parameters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Integer version;

    /**
     * The version of MediaWorkflowTaskDeclaration, incremented whenever the team implementing the
     * task processor modifies the JSON schema of this declaration's definitions, parameters or list
     * of required parameters.
     *
     * @return the value
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * JSON schema specifying the parameters supported by this type of task. This is used to
     * validate tasks' parameters when jobs are created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parametersSchema")
    private final java.util.Map<String, Object> parametersSchema;

    /**
     * JSON schema specifying the parameters supported by this type of task. This is used to
     * validate tasks' parameters when jobs are created.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getParametersSchema() {
        return parametersSchema;
    }

    /**
     * JSON schema similar to the parameterSchema, but permits parameter values to refer to other
     * parameters using the ${/path/to/another/parmeter} syntax. This is used to validate task
     * parameters when workflows are created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parametersSchemaAllowingReferences")
    private final java.util.Map<String, Object> parametersSchemaAllowingReferences;

    /**
     * JSON schema similar to the parameterSchema, but permits parameter values to refer to other
     * parameters using the ${/path/to/another/parmeter} syntax. This is used to validate task
     * parameters when workflows are created.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getParametersSchemaAllowingReferences() {
        return parametersSchemaAllowingReferences;
    }

    /** Locks associated with this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     *
     * @return the value
     */
    public java.util.List<ResourceLock> getLocks() {
        return locks;
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
        sb.append("MediaWorkflowTaskDeclaration(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", parametersSchema=").append(String.valueOf(this.parametersSchema));
        sb.append(", parametersSchemaAllowingReferences=")
                .append(String.valueOf(this.parametersSchemaAllowingReferences));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MediaWorkflowTaskDeclaration)) {
            return false;
        }

        MediaWorkflowTaskDeclaration other = (MediaWorkflowTaskDeclaration) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.parametersSchema, other.parametersSchema)
                && java.util.Objects.equals(
                        this.parametersSchemaAllowingReferences,
                        other.parametersSchemaAllowingReferences)
                && java.util.Objects.equals(this.locks, other.locks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.parametersSchema == null ? 43 : this.parametersSchema.hashCode());
        result =
                (result * PRIME)
                        + (this.parametersSchemaAllowingReferences == null
                                ? 43
                                : this.parametersSchemaAllowingReferences.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
