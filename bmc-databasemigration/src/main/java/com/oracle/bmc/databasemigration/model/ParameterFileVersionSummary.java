/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * A parameter file detatails
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ParameterFileVersionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ParameterFileVersionSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "kind",
        "description",
        "isCurrent",
        "isFactory",
        "timeCreated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ParameterFileVersionSummary(
            String name,
            JobParameterFileVersionKind kind,
            String description,
            Boolean isCurrent,
            Boolean isFactory,
            java.util.Date timeCreated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.name = name;
        this.kind = kind;
        this.description = description;
        this.isCurrent = isCurrent;
        this.isFactory = isFactory;
        this.timeCreated = timeCreated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A unique name associated with the current migration/job and extract/replicat name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A unique name associated with the current migration/job and extract/replicat name
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Indicator of Parameter File 'kind' (for an EXTRACT or a REPLICAT)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kind")
        private JobParameterFileVersionKind kind;

        /**
         * Indicator of Parameter File 'kind' (for an EXTRACT or a REPLICAT)
         * @param kind the value to set
         * @return this builder
         **/
        public Builder kind(JobParameterFileVersionKind kind) {
            this.kind = kind;
            this.__explicitlySet__.add("kind");
            return this;
        }
        /**
         * A description to discribe the current parameter file version
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description to discribe the current parameter file version
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Return boolean true/false for the currently in-use parameter file (factory or a versioned file)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCurrent")
        private Boolean isCurrent;

        /**
         * Return boolean true/false for the currently in-use parameter file (factory or a versioned file)
         * @param isCurrent the value to set
         * @return this builder
         **/
        public Builder isCurrent(Boolean isCurrent) {
            this.isCurrent = isCurrent;
            this.__explicitlySet__.add("isCurrent");
            return this;
        }
        /**
         * Return true/false for whether the parameter file is oracle provided (Factory)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFactory")
        private Boolean isFactory;

        /**
         * Return true/false for whether the parameter file is oracle provided (Factory)
         * @param isFactory the value to set
         * @return this builder
         **/
        public Builder isFactory(Boolean isFactory) {
            this.isFactory = isFactory;
            this.__explicitlySet__.add("isFactory");
            return this;
        }
        /**
         * The time when this parameter file was applied on the process
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when this parameter file was applied on the process
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see Resource Tags. Example: {"Department": "Finance"}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see Resource Tags. Example: {"Department": "Finance"}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParameterFileVersionSummary build() {
            ParameterFileVersionSummary model =
                    new ParameterFileVersionSummary(
                            this.name,
                            this.kind,
                            this.description,
                            this.isCurrent,
                            this.isFactory,
                            this.timeCreated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParameterFileVersionSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("kind")) {
                this.kind(model.getKind());
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
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * A unique name associated with the current migration/job and extract/replicat name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A unique name associated with the current migration/job and extract/replicat name
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Indicator of Parameter File 'kind' (for an EXTRACT or a REPLICAT)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    private final JobParameterFileVersionKind kind;

    /**
     * Indicator of Parameter File 'kind' (for an EXTRACT or a REPLICAT)
     * @return the value
     **/
    public JobParameterFileVersionKind getKind() {
        return kind;
    }

    /**
     * A description to discribe the current parameter file version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description to discribe the current parameter file version
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Return boolean true/false for the currently in-use parameter file (factory or a versioned file)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCurrent")
    private final Boolean isCurrent;

    /**
     * Return boolean true/false for the currently in-use parameter file (factory or a versioned file)
     * @return the value
     **/
    public Boolean getIsCurrent() {
        return isCurrent;
    }

    /**
     * Return true/false for whether the parameter file is oracle provided (Factory)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFactory")
    private final Boolean isFactory;

    /**
     * Return true/false for whether the parameter file is oracle provided (Factory)
     * @return the value
     **/
    public Boolean getIsFactory() {
        return isFactory;
    }

    /**
     * The time when this parameter file was applied on the process
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when this parameter file was applied on the process
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see Resource Tags. Example: {"Department": "Finance"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see Resource Tags. Example: {"Department": "Finance"}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("ParameterFileVersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", kind=").append(String.valueOf(this.kind));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isCurrent=").append(String.valueOf(this.isCurrent));
        sb.append(", isFactory=").append(String.valueOf(this.isFactory));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParameterFileVersionSummary)) {
            return false;
        }

        ParameterFileVersionSummary other = (ParameterFileVersionSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.kind, other.kind)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isCurrent, other.isCurrent)
                && java.util.Objects.equals(this.isFactory, other.isFactory)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.kind == null ? 43 : this.kind.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isCurrent == null ? 43 : this.isCurrent.hashCode());
        result = (result * PRIME) + (this.isFactory == null ? 43 : this.isFactory.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
