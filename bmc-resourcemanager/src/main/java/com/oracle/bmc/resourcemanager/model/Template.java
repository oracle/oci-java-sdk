/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * The properties that define a template. A template is a pre-built Terraform configuration that
 * provisions a set of resources used in a common scenario. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Template.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Template extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "categoryId",
        "displayName",
        "description",
        "longDescription",
        "isFreeTier",
        "timeCreated",
        "templateConfigSource",
        "lifecycleState",
        "freeformTags",
        "definedTags"
    })
    public Template(
            String id,
            String compartmentId,
            String categoryId,
            String displayName,
            String description,
            String longDescription,
            Boolean isFreeTier,
            java.util.Date timeCreated,
            TemplateConfigSource templateConfigSource,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.categoryId = categoryId;
        this.displayName = displayName;
        this.description = description;
        this.longDescription = longDescription;
        this.isFreeTier = isFreeTier;
        this.timeCreated = timeCreated;
        this.templateConfigSource = templateConfigSource;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier
         * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) for
         * the template.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier
         * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) for
         * the template.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing this template.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing this template.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Unique identifier for the category where the template is located. Possible values are
         * {@code 0} (Quick Starts), {@code 1} (Service), {@code 2} (Architecture), and {@code 3}
         * (Private).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
        private String categoryId;

        /**
         * Unique identifier for the category where the template is located. Possible values are
         * {@code 0} (Quick Starts), {@code 1} (Service), {@code 2} (Architecture), and {@code 3}
         * (Private).
         *
         * @param categoryId the value to set
         * @return this builder
         */
        public Builder categoryId(String categoryId) {
            this.categoryId = categoryId;
            this.__explicitlySet__.add("categoryId");
            return this;
        }
        /** Human-readable name of the template. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Human-readable name of the template.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Brief description of the template. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Brief description of the template.
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
         * Detailed description of the template. This description is displayed in the Console page
         * listing templates when the template is expanded. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
        private String longDescription;

        /**
         * Detailed description of the template. This description is displayed in the Console page
         * listing templates when the template is expanded. Avoid entering confidential information.
         *
         * @param longDescription the value to set
         * @return this builder
         */
        public Builder longDescription(String longDescription) {
            this.longDescription = longDescription;
            this.__explicitlySet__.add("longDescription");
            return this;
        }
        /** whether the template will work for free tier tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("isFreeTier")
        private Boolean isFreeTier;

        /**
         * whether the template will work for free tier tenancy.
         *
         * @param isFreeTier the value to set
         * @return this builder
         */
        public Builder isFreeTier(Boolean isFreeTier) {
            this.isFreeTier = isFreeTier;
            this.__explicitlySet__.add("isFreeTier");
            return this;
        }
        /**
         * The date and time at which the template was created. Format is defined by RFC3339.
         * Example: {@code 2020-11-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time at which the template was created. Format is defined by RFC3339.
         * Example: {@code 2020-11-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("templateConfigSource")
        private TemplateConfigSource templateConfigSource;

        public Builder templateConfigSource(TemplateConfigSource templateConfigSource) {
            this.templateConfigSource = templateConfigSource;
            this.__explicitlySet__.add("templateConfigSource");
            return this;
        }
        /** The current lifecycle state of the template. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the template.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Free-form tags associated with the resource. Each tag is a key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags associated with the resource. Each tag is a key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Template build() {
            Template model =
                    new Template(
                            this.id,
                            this.compartmentId,
                            this.categoryId,
                            this.displayName,
                            this.description,
                            this.longDescription,
                            this.isFreeTier,
                            this.timeCreated,
                            this.templateConfigSource,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Template model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("categoryId")) {
                this.categoryId(model.getCategoryId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("longDescription")) {
                this.longDescription(model.getLongDescription());
            }
            if (model.wasPropertyExplicitlySet("isFreeTier")) {
                this.isFreeTier(model.getIsFreeTier());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("templateConfigSource")) {
                this.templateConfigSource(model.getTemplateConfigSource());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * Unique identifier
     * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) for the
     * template.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier
     * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)) for the
     * template.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing this template.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing this template.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Unique identifier for the category where the template is located. Possible values are {@code
     * 0} (Quick Starts), {@code 1} (Service), {@code 2} (Architecture), and {@code 3} (Private).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
    private final String categoryId;

    /**
     * Unique identifier for the category where the template is located. Possible values are {@code
     * 0} (Quick Starts), {@code 1} (Service), {@code 2} (Architecture), and {@code 3} (Private).
     *
     * @return the value
     */
    public String getCategoryId() {
        return categoryId;
    }

    /** Human-readable name of the template. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Human-readable name of the template.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Brief description of the template. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Brief description of the template.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Detailed description of the template. This description is displayed in the Console page
     * listing templates when the template is expanded. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("longDescription")
    private final String longDescription;

    /**
     * Detailed description of the template. This description is displayed in the Console page
     * listing templates when the template is expanded. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getLongDescription() {
        return longDescription;
    }

    /** whether the template will work for free tier tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("isFreeTier")
    private final Boolean isFreeTier;

    /**
     * whether the template will work for free tier tenancy.
     *
     * @return the value
     */
    public Boolean getIsFreeTier() {
        return isFreeTier;
    }

    /**
     * The date and time at which the template was created. Format is defined by RFC3339. Example:
     * {@code 2020-11-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time at which the template was created. Format is defined by RFC3339. Example:
     * {@code 2020-11-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("templateConfigSource")
    private final TemplateConfigSource templateConfigSource;

    public TemplateConfigSource getTemplateConfigSource() {
        return templateConfigSource;
    }

    /** The current lifecycle state of the template. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current lifecycle state of the template. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the template.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Free-form tags associated with the resource. Each tag is a key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags associated with the resource. Each tag is a key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("Template(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", categoryId=").append(String.valueOf(this.categoryId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", longDescription=").append(String.valueOf(this.longDescription));
        sb.append(", isFreeTier=").append(String.valueOf(this.isFreeTier));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", templateConfigSource=").append(String.valueOf(this.templateConfigSource));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Template)) {
            return false;
        }

        Template other = (Template) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.categoryId, other.categoryId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.longDescription, other.longDescription)
                && java.util.Objects.equals(this.isFreeTier, other.isFreeTier)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.templateConfigSource, other.templateConfigSource)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.categoryId == null ? 43 : this.categoryId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.longDescription == null ? 43 : this.longDescription.hashCode());
        result = (result * PRIME) + (this.isFreeTier == null ? 43 : this.isFreeTier.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.templateConfigSource == null
                                ? 43
                                : this.templateConfigSource.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
