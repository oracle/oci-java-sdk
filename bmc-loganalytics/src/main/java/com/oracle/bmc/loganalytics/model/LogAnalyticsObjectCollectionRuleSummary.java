/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The summary of an Object Storage based collection rule. <br>
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
        builder = LogAnalyticsObjectCollectionRuleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsObjectCollectionRuleSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "description",
        "compartmentId",
        "osNamespace",
        "osBucketName",
        "collectionType",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "isEnabled",
        "objectNameFilters",
        "logType",
        "definedTags",
        "freeformTags"
    })
    public LogAnalyticsObjectCollectionRuleSummary(
            String id,
            String name,
            String description,
            String compartmentId,
            String osNamespace,
            String osBucketName,
            ObjectCollectionRuleCollectionTypes collectionType,
            ObjectCollectionRuleLifecycleStates lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Boolean isEnabled,
            java.util.List<String> objectNameFilters,
            LogTypes logType,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.compartmentId = compartmentId;
        this.osNamespace = osNamespace;
        this.osBucketName = osBucketName;
        this.collectionType = collectionType;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.isEnabled = isEnabled;
        this.objectNameFilters = objectNameFilters;
        this.logType = logType;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this
         * rule.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this
         * rule.
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
         * A unique name to the rule. The name must be unique, within the tenancy, and cannot be
         * changed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A unique name to the rule. The name must be unique, within the tenancy, and cannot be
         * changed.
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
         * A unique name given to the rule. The name must be unique within the tenancy, and cannot
         * be modified. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A unique name given to the rule. The name must be unique within the tenancy, and cannot
         * be modified. Avoid entering confidential information.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to which this rule belongs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to which this rule belongs.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Object Storage namespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("osNamespace")
        private String osNamespace;

        /**
         * Object Storage namespace.
         *
         * @param osNamespace the value to set
         * @return this builder
         */
        public Builder osNamespace(String osNamespace) {
            this.osNamespace = osNamespace;
            this.__explicitlySet__.add("osNamespace");
            return this;
        }
        /** Name of the Object Storage bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("osBucketName")
        private String osBucketName;

        /**
         * Name of the Object Storage bucket.
         *
         * @param osBucketName the value to set
         * @return this builder
         */
        public Builder osBucketName(String osBucketName) {
            this.osBucketName = osBucketName;
            this.__explicitlySet__.add("osBucketName");
            return this;
        }
        /** The type of log collection. */
        @com.fasterxml.jackson.annotation.JsonProperty("collectionType")
        private ObjectCollectionRuleCollectionTypes collectionType;

        /**
         * The type of log collection.
         *
         * @param collectionType the value to set
         * @return this builder
         */
        public Builder collectionType(ObjectCollectionRuleCollectionTypes collectionType) {
            this.collectionType = collectionType;
            this.__explicitlySet__.add("collectionType");
            return this;
        }
        /** The current state of the rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ObjectCollectionRuleLifecycleStates lifecycleState;

        /**
         * The current state of the rule.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ObjectCollectionRuleLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** A detailed status of the life cycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A detailed status of the life cycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The time when this rule was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when this rule was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time when this rule was last updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time when this rule was last updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Whether or not this rule is currently enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Whether or not this rule is currently enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * When the filters are provided, only the objects matching the filters are picked up for
         * processing. The matchType supported is exact match and accommodates wildcard "*". For
         * more information on filters, see [Event
         * Filters](https://docs.oracle.com/en-us/iaas/Content/Events/Concepts/filterevents.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectNameFilters")
        private java.util.List<String> objectNameFilters;

        /**
         * When the filters are provided, only the objects matching the filters are picked up for
         * processing. The matchType supported is exact match and accommodates wildcard "*". For
         * more information on filters, see [Event
         * Filters](https://docs.oracle.com/en-us/iaas/Content/Events/Concepts/filterevents.htm).
         *
         * @param objectNameFilters the value to set
         * @return this builder
         */
        public Builder objectNameFilters(java.util.List<String> objectNameFilters) {
            this.objectNameFilters = objectNameFilters;
            this.__explicitlySet__.add("objectNameFilters");
            return this;
        }
        /** Type of files/objects in this object collection rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("logType")
        private LogTypes logType;

        /**
         * Type of files/objects in this object collection rule.
         *
         * @param logType the value to set
         * @return this builder
         */
        public Builder logType(LogTypes logType) {
            this.logType = logType;
            this.__explicitlySet__.add("logType");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsObjectCollectionRuleSummary build() {
            LogAnalyticsObjectCollectionRuleSummary model =
                    new LogAnalyticsObjectCollectionRuleSummary(
                            this.id,
                            this.name,
                            this.description,
                            this.compartmentId,
                            this.osNamespace,
                            this.osBucketName,
                            this.collectionType,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.isEnabled,
                            this.objectNameFilters,
                            this.logType,
                            this.definedTags,
                            this.freeformTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsObjectCollectionRuleSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("osNamespace")) {
                this.osNamespace(model.getOsNamespace());
            }
            if (model.wasPropertyExplicitlySet("osBucketName")) {
                this.osBucketName(model.getOsBucketName());
            }
            if (model.wasPropertyExplicitlySet("collectionType")) {
                this.collectionType(model.getCollectionType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("objectNameFilters")) {
                this.objectNameFilters(model.getObjectNameFilters());
            }
            if (model.wasPropertyExplicitlySet("logType")) {
                this.logType(model.getLogType());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this
     * rule.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this
     * rule.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * A unique name to the rule. The name must be unique, within the tenancy, and cannot be
     * changed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A unique name to the rule. The name must be unique, within the tenancy, and cannot be
     * changed.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * A unique name given to the rule. The name must be unique within the tenancy, and cannot be
     * modified. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A unique name given to the rule. The name must be unique within the tenancy, and cannot be
     * modified. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to which this rule belongs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to which this rule belongs.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Object Storage namespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("osNamespace")
    private final String osNamespace;

    /**
     * Object Storage namespace.
     *
     * @return the value
     */
    public String getOsNamespace() {
        return osNamespace;
    }

    /** Name of the Object Storage bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("osBucketName")
    private final String osBucketName;

    /**
     * Name of the Object Storage bucket.
     *
     * @return the value
     */
    public String getOsBucketName() {
        return osBucketName;
    }

    /** The type of log collection. */
    @com.fasterxml.jackson.annotation.JsonProperty("collectionType")
    private final ObjectCollectionRuleCollectionTypes collectionType;

    /**
     * The type of log collection.
     *
     * @return the value
     */
    public ObjectCollectionRuleCollectionTypes getCollectionType() {
        return collectionType;
    }

    /** The current state of the rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ObjectCollectionRuleLifecycleStates lifecycleState;

    /**
     * The current state of the rule.
     *
     * @return the value
     */
    public ObjectCollectionRuleLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /** A detailed status of the life cycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A detailed status of the life cycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The time when this rule was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when this rule was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time when this rule was last updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time when this rule was last updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Whether or not this rule is currently enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether or not this rule is currently enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * When the filters are provided, only the objects matching the filters are picked up for
     * processing. The matchType supported is exact match and accommodates wildcard "*". For more
     * information on filters, see [Event
     * Filters](https://docs.oracle.com/en-us/iaas/Content/Events/Concepts/filterevents.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectNameFilters")
    private final java.util.List<String> objectNameFilters;

    /**
     * When the filters are provided, only the objects matching the filters are picked up for
     * processing. The matchType supported is exact match and accommodates wildcard "*". For more
     * information on filters, see [Event
     * Filters](https://docs.oracle.com/en-us/iaas/Content/Events/Concepts/filterevents.htm).
     *
     * @return the value
     */
    public java.util.List<String> getObjectNameFilters() {
        return objectNameFilters;
    }

    /** Type of files/objects in this object collection rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("logType")
    private final LogTypes logType;

    /**
     * Type of files/objects in this object collection rule.
     *
     * @return the value
     */
    public LogTypes getLogType() {
        return logType;
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
        sb.append("LogAnalyticsObjectCollectionRuleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", osNamespace=").append(String.valueOf(this.osNamespace));
        sb.append(", osBucketName=").append(String.valueOf(this.osBucketName));
        sb.append(", collectionType=").append(String.valueOf(this.collectionType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", objectNameFilters=").append(String.valueOf(this.objectNameFilters));
        sb.append(", logType=").append(String.valueOf(this.logType));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsObjectCollectionRuleSummary)) {
            return false;
        }

        LogAnalyticsObjectCollectionRuleSummary other = (LogAnalyticsObjectCollectionRuleSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.osNamespace, other.osNamespace)
                && java.util.Objects.equals(this.osBucketName, other.osBucketName)
                && java.util.Objects.equals(this.collectionType, other.collectionType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.objectNameFilters, other.objectNameFilters)
                && java.util.Objects.equals(this.logType, other.logType)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.osNamespace == null ? 43 : this.osNamespace.hashCode());
        result = (result * PRIME) + (this.osBucketName == null ? 43 : this.osBucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.collectionType == null ? 43 : this.collectionType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.objectNameFilters == null ? 43 : this.objectNameFilters.hashCode());
        result = (result * PRIME) + (this.logType == null ? 43 : this.logType.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
