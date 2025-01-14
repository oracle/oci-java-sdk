/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * A parameter file detatails <br>
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
        builder = ParameterFileVersion.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ParameterFileVersion
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "description",
        "isCurrent",
        "isFactory",
        "kind",
        "timeCreated",
        "content"
    })
    public ParameterFileVersion(
            String name,
            String description,
            Boolean isCurrent,
            Boolean isFactory,
            JobParameterFileVersionKind kind,
            java.util.Date timeCreated,
            String content) {
        super();
        this.name = name;
        this.description = description;
        this.isCurrent = isCurrent;
        this.isFactory = isFactory;
        this.kind = kind;
        this.timeCreated = timeCreated;
        this.content = content;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A unique name associated with the current migration/job and extract/replicat name */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A unique name associated with the current migration/job and extract/replicat name
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
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
        /**
         * Return boolean true/false for the currently in-use parameter file (factory or a versioned
         * file)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCurrent")
        private Boolean isCurrent;

        /**
         * Return boolean true/false for the currently in-use parameter file (factory or a versioned
         * file)
         *
         * @param isCurrent the value to set
         * @return this builder
         */
        public Builder isCurrent(Boolean isCurrent) {
            this.isCurrent = isCurrent;
            this.__explicitlySet__.add("isCurrent");
            return this;
        }
        /** Return true/false for whether the parameter file is oracle provided (Factory) */
        @com.fasterxml.jackson.annotation.JsonProperty("isFactory")
        private Boolean isFactory;

        /**
         * Return true/false for whether the parameter file is oracle provided (Factory)
         *
         * @param isFactory the value to set
         * @return this builder
         */
        public Builder isFactory(Boolean isFactory) {
            this.isFactory = isFactory;
            this.__explicitlySet__.add("isFactory");
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
        /** The time when this parameter file was applied on the process */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when this parameter file was applied on the process
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParameterFileVersion build() {
            ParameterFileVersion model =
                    new ParameterFileVersion(
                            this.name,
                            this.description,
                            this.isCurrent,
                            this.isFactory,
                            this.kind,
                            this.timeCreated,
                            this.content);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParameterFileVersion model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isCurrent")) {
                this.isCurrent(model.getIsCurrent());
            }
            if (model.wasPropertyExplicitlySet("isFactory")) {
                this.isFactory(model.getIsFactory());
            }
            if (model.wasPropertyExplicitlySet("kind")) {
                this.kind(model.getKind());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
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

    /** A unique name associated with the current migration/job and extract/replicat name */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A unique name associated with the current migration/job and extract/replicat name
     *
     * @return the value
     */
    public String getName() {
        return name;
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

    /**
     * Return boolean true/false for the currently in-use parameter file (factory or a versioned
     * file)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCurrent")
    private final Boolean isCurrent;

    /**
     * Return boolean true/false for the currently in-use parameter file (factory or a versioned
     * file)
     *
     * @return the value
     */
    public Boolean getIsCurrent() {
        return isCurrent;
    }

    /** Return true/false for whether the parameter file is oracle provided (Factory) */
    @com.fasterxml.jackson.annotation.JsonProperty("isFactory")
    private final Boolean isFactory;

    /**
     * Return true/false for whether the parameter file is oracle provided (Factory)
     *
     * @return the value
     */
    public Boolean getIsFactory() {
        return isFactory;
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

    /** The time when this parameter file was applied on the process */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when this parameter file was applied on the process
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("ParameterFileVersion(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isCurrent=").append(String.valueOf(this.isCurrent));
        sb.append(", isFactory=").append(String.valueOf(this.isFactory));
        sb.append(", kind=").append(String.valueOf(this.kind));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParameterFileVersion)) {
            return false;
        }

        ParameterFileVersion other = (ParameterFileVersion) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isCurrent, other.isCurrent)
                && java.util.Objects.equals(this.isFactory, other.isFactory)
                && java.util.Objects.equals(this.kind, other.kind)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.content, other.content)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isCurrent == null ? 43 : this.isCurrent.hashCode());
        result = (result * PRIME) + (this.isFactory == null ? 43 : this.isFactory.hashCode());
        result = (result * PRIME) + (this.kind == null ? 43 : this.kind.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
