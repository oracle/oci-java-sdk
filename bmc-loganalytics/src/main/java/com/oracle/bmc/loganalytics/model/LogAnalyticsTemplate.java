/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * A template object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsTemplate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsTemplate
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "description",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "name",
        "type",
        "isSystem",
        "lifecycleState",
        "facets",
        "content",
        "contentFormat",
        "parameters",
        "parametersFormat",
        "parametersMetadata"
    })
    public LogAnalyticsTemplate(
            String id,
            String description,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String name,
            String type,
            Boolean isSystem,
            ConfigLifecycleState lifecycleState,
            java.util.List<TemplateFacet> facets,
            String content,
            String contentFormat,
            String parameters,
            String parametersFormat,
            String parametersMetadata) {
        super();
        this.id = id;
        this.description = description;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.name = name;
        this.type = type;
        this.isSystem = isSystem;
        this.lifecycleState = lifecycleState;
        this.facets = facets;
        this.content = content;
        this.contentFormat = contentFormat;
        this.parameters = parameters;
        this.parametersFormat = parametersFormat;
        this.parametersMetadata = parametersMetadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The log analytics entity OCID. This ID is a reference used by log analytics features and
         * it represents a resource that is provisioned and managed by the customer on their
         * premises or on the cloud.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The log analytics entity OCID. This ID is a reference used by log analytics features and
         * it represents a resource that is provisioned and managed by the customer on their
         * premises or on the cloud.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Description for this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description for this resource.
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
         * Compartment Identifier [OCID]
         * (https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID]
         * (https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The date and time the resource was created, in the format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the resource was created, in the format defined by RFC3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the resource was last updated, in the format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the resource was last updated, in the format defined by RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** The template name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The template name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The template type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The template type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The system flag. A value of false denotes a custom, or user defined object. A value of
         * true denotes a built in object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        /**
         * The system flag. A value of false denotes a custom, or user defined object. A value of
         * true denotes a built in object.
         *
         * @param isSystem the value to set
         * @return this builder
         */
        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }
        /** The current state of the template. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ConfigLifecycleState lifecycleState;

        /**
         * The current state of the template.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ConfigLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Facets of the template */
        @com.fasterxml.jackson.annotation.JsonProperty("facets")
        private java.util.List<TemplateFacet> facets;

        /**
         * Facets of the template
         *
         * @param facets the value to set
         * @return this builder
         */
        public Builder facets(java.util.List<TemplateFacet> facets) {
            this.facets = facets;
            this.__explicitlySet__.add("facets");
            return this;
        }
        /** Base64 encoded template content. */
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private String content;

        /**
         * Base64 encoded template content.
         *
         * @param content the value to set
         * @return this builder
         */
        public Builder content(String content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /** Content format. For example - XML. */
        @com.fasterxml.jackson.annotation.JsonProperty("contentFormat")
        private String contentFormat;

        /**
         * Content format. For example - XML.
         *
         * @param contentFormat the value to set
         * @return this builder
         */
        public Builder contentFormat(String contentFormat) {
            this.contentFormat = contentFormat;
            this.__explicitlySet__.add("contentFormat");
            return this;
        }
        /** Base64 encoded template parameters. */
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private String parameters;

        /**
         * Base64 encoded template parameters.
         *
         * @param parameters the value to set
         * @return this builder
         */
        public Builder parameters(String parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
        /** Parameters format. For example - NAME_VALUE_PAIR. */
        @com.fasterxml.jackson.annotation.JsonProperty("parametersFormat")
        private String parametersFormat;

        /**
         * Parameters format. For example - NAME_VALUE_PAIR.
         *
         * @param parametersFormat the value to set
         * @return this builder
         */
        public Builder parametersFormat(String parametersFormat) {
            this.parametersFormat = parametersFormat;
            this.__explicitlySet__.add("parametersFormat");
            return this;
        }
        /** Base64 encoded parameters metadata definition. */
        @com.fasterxml.jackson.annotation.JsonProperty("parametersMetadata")
        private String parametersMetadata;

        /**
         * Base64 encoded parameters metadata definition.
         *
         * @param parametersMetadata the value to set
         * @return this builder
         */
        public Builder parametersMetadata(String parametersMetadata) {
            this.parametersMetadata = parametersMetadata;
            this.__explicitlySet__.add("parametersMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsTemplate build() {
            LogAnalyticsTemplate model =
                    new LogAnalyticsTemplate(
                            this.id,
                            this.description,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.name,
                            this.type,
                            this.isSystem,
                            this.lifecycleState,
                            this.facets,
                            this.content,
                            this.contentFormat,
                            this.parameters,
                            this.parametersFormat,
                            this.parametersMetadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsTemplate model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("facets")) {
                this.facets(model.getFacets());
            }
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
            }
            if (model.wasPropertyExplicitlySet("contentFormat")) {
                this.contentFormat(model.getContentFormat());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("parametersFormat")) {
                this.parametersFormat(model.getParametersFormat());
            }
            if (model.wasPropertyExplicitlySet("parametersMetadata")) {
                this.parametersMetadata(model.getParametersMetadata());
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
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it
     * represents a resource that is provisioned and managed by the customer on their premises or on
     * the cloud.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The log analytics entity OCID. This ID is a reference used by log analytics features and it
     * represents a resource that is provisioned and managed by the customer on their premises or on
     * the cloud.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Description for this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description for this resource.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Compartment Identifier [OCID]
     * (https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID]
     * (https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The date and time the resource was created, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource was created, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the resource was last updated, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the resource was last updated, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** The template name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The template name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The template type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The template type.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /**
     * The system flag. A value of false denotes a custom, or user defined object. A value of true
     * denotes a built in object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    /**
     * The system flag. A value of false denotes a custom, or user defined object. A value of true
     * denotes a built in object.
     *
     * @return the value
     */
    public Boolean getIsSystem() {
        return isSystem;
    }

    /** The current state of the template. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ConfigLifecycleState lifecycleState;

    /**
     * The current state of the template.
     *
     * @return the value
     */
    public ConfigLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Facets of the template */
    @com.fasterxml.jackson.annotation.JsonProperty("facets")
    private final java.util.List<TemplateFacet> facets;

    /**
     * Facets of the template
     *
     * @return the value
     */
    public java.util.List<TemplateFacet> getFacets() {
        return facets;
    }

    /** Base64 encoded template content. */
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final String content;

    /**
     * Base64 encoded template content.
     *
     * @return the value
     */
    public String getContent() {
        return content;
    }

    /** Content format. For example - XML. */
    @com.fasterxml.jackson.annotation.JsonProperty("contentFormat")
    private final String contentFormat;

    /**
     * Content format. For example - XML.
     *
     * @return the value
     */
    public String getContentFormat() {
        return contentFormat;
    }

    /** Base64 encoded template parameters. */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final String parameters;

    /**
     * Base64 encoded template parameters.
     *
     * @return the value
     */
    public String getParameters() {
        return parameters;
    }

    /** Parameters format. For example - NAME_VALUE_PAIR. */
    @com.fasterxml.jackson.annotation.JsonProperty("parametersFormat")
    private final String parametersFormat;

    /**
     * Parameters format. For example - NAME_VALUE_PAIR.
     *
     * @return the value
     */
    public String getParametersFormat() {
        return parametersFormat;
    }

    /** Base64 encoded parameters metadata definition. */
    @com.fasterxml.jackson.annotation.JsonProperty("parametersMetadata")
    private final String parametersMetadata;

    /**
     * Base64 encoded parameters metadata definition.
     *
     * @return the value
     */
    public String getParametersMetadata() {
        return parametersMetadata;
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
        sb.append("LogAnalyticsTemplate(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", facets=").append(String.valueOf(this.facets));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", contentFormat=").append(String.valueOf(this.contentFormat));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", parametersFormat=").append(String.valueOf(this.parametersFormat));
        sb.append(", parametersMetadata=").append(String.valueOf(this.parametersMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsTemplate)) {
            return false;
        }

        LogAnalyticsTemplate other = (LogAnalyticsTemplate) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.facets, other.facets)
                && java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.contentFormat, other.contentFormat)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.parametersFormat, other.parametersFormat)
                && java.util.Objects.equals(this.parametersMetadata, other.parametersMetadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.facets == null ? 43 : this.facets.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result =
                (result * PRIME)
                        + (this.contentFormat == null ? 43 : this.contentFormat.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result =
                (result * PRIME)
                        + (this.parametersFormat == null ? 43 : this.parametersFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.parametersMetadata == null
                                ? 43
                                : this.parametersMetadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
