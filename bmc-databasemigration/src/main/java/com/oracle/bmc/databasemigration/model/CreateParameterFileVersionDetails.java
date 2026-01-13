/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Details about a specific ParameterFileVersion <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateParameterFileVersionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateParameterFileVersionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"description", "kind", "content", "name"})
    public CreateParameterFileVersionDetails(
            String description, JobParameterFileVersionKind kind, String content, String name) {
        super();
        this.description = description;
        this.kind = kind;
        this.content = content;
        this.name = name;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Describes the current parameter file version */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Describes the current parameter file version
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Indicator of Parameter File 'kind' (for an EXTRACT or a REPLICAT) */
        @com.fasterxml.jackson.annotation.JsonProperty("kind")
        private JobParameterFileVersionKind kind;

        /**
         * Indicator of Parameter File 'kind' (for an EXTRACT or a REPLICAT)
         *
         * @param kind the value to set
         * @return this builder
         */
        public Builder kind(JobParameterFileVersionKind kind) {
            this.kind = kind;
            this.__explicitlySet__.add("kind");
            return this;
        }
        /**
         * The content in base64 encoded character string containing the value of the parameter file
         */
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private String content;

        /**
         * The content in base64 encoded character string containing the value of the parameter file
         *
         * @param content the value to set
         * @return this builder
         */
        public Builder content(String content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /** Customizable name for the paramenter file version. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Customizable name for the paramenter file version.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateParameterFileVersionDetails build() {
            CreateParameterFileVersionDetails model =
                    new CreateParameterFileVersionDetails(
                            this.description, this.kind, this.content, this.name);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateParameterFileVersionDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("kind")) {
                this.kind(model.getKind());
            }
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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

    /** Describes the current parameter file version */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Describes the current parameter file version
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Indicator of Parameter File 'kind' (for an EXTRACT or a REPLICAT) */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    private final JobParameterFileVersionKind kind;

    /**
     * Indicator of Parameter File 'kind' (for an EXTRACT or a REPLICAT)
     *
     * @return the value
     */
    public JobParameterFileVersionKind getKind() {
        return kind;
    }

    /** The content in base64 encoded character string containing the value of the parameter file */
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final String content;

    /**
     * The content in base64 encoded character string containing the value of the parameter file
     *
     * @return the value
     */
    public String getContent() {
        return content;
    }

    /** Customizable name for the paramenter file version. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Customizable name for the paramenter file version.
     *
     * @return the value
     */
    public String getName() {
        return name;
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
        sb.append("CreateParameterFileVersionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", kind=").append(String.valueOf(this.kind));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateParameterFileVersionDetails)) {
            return false;
        }

        CreateParameterFileVersionDetails other = (CreateParameterFileVersionDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.kind, other.kind)
                && java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.name, other.name)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.kind == null ? 43 : this.kind.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
