/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Summary information for a managed list. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagedListSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedListSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "sourceManagedListId",
        "listType",
        "feedProvider",
        "isEditable",
        "listItems",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecyleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ManagedListSummary(
            String id,
            String displayName,
            String description,
            String compartmentId,
            String sourceManagedListId,
            ManagedListType listType,
            FeedProviderType feedProvider,
            Boolean isEditable,
            java.util.List<String> listItems,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecyleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.sourceManagedListId = sourceManagedListId;
        this.listType = listType;
        this.feedProvider = feedProvider;
        this.isEditable = isEditable;
        this.listItems = listItems;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecyleDetails = lifecyleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that can't be changed after creation */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that can't be changed after creation
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Managed list display name */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Managed list display name
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Managed list description */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Managed list description
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Compartment OCID where the resource is created */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment OCID where the resource is created
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** OCID of the source managed list */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceManagedListId")
        private String sourceManagedListId;

        /**
         * OCID of the source managed list
         *
         * @param sourceManagedListId the value to set
         * @return this builder
         */
        public Builder sourceManagedListId(String sourceManagedListId) {
            this.sourceManagedListId = sourceManagedListId;
            this.__explicitlySet__.add("sourceManagedListId");
            return this;
        }
        /** Type of information stored in the managed list */
        @com.fasterxml.jackson.annotation.JsonProperty("listType")
        private ManagedListType listType;

        /**
         * Type of information stored in the managed list
         *
         * @param listType the value to set
         * @return this builder
         */
        public Builder listType(ManagedListType listType) {
            this.listType = listType;
            this.__explicitlySet__.add("listType");
            return this;
        }
        /** Provider of the feed */
        @com.fasterxml.jackson.annotation.JsonProperty("feedProvider")
        private FeedProviderType feedProvider;

        /**
         * Provider of the feed
         *
         * @param feedProvider the value to set
         * @return this builder
         */
        public Builder feedProvider(FeedProviderType feedProvider) {
            this.feedProvider = feedProvider;
            this.__explicitlySet__.add("feedProvider");
            return this;
        }
        /** Is this list editable? */
        @com.fasterxml.jackson.annotation.JsonProperty("isEditable")
        private Boolean isEditable;

        /**
         * Is this list editable?
         *
         * @param isEditable the value to set
         * @return this builder
         */
        public Builder isEditable(Boolean isEditable) {
            this.isEditable = isEditable;
            this.__explicitlySet__.add("isEditable");
            return this;
        }
        /** List of items in the managed list */
        @com.fasterxml.jackson.annotation.JsonProperty("listItems")
        private java.util.List<String> listItems;

        /**
         * List of items in the managed list
         *
         * @param listItems the value to set
         * @return this builder
         */
        public Builder listItems(java.util.List<String> listItems) {
            this.listItems = listItems;
            this.__explicitlySet__.add("listItems");
            return this;
        }
        /** The date and time the managed list was created. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the managed list was created. Format defined by RFC3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the managed list was last updated. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the managed list was last updated. Format defined by RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current lifecycle state of the resource */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the resource
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
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state. [DEPRECATE]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecyleDetails")
        private String lifecyleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state. [DEPRECATE]
         *
         * @param lifecyleDetails the value to set
         * @return this builder
         */
        public Builder lifecyleDetails(String lifecyleDetails) {
            this.lifecyleDetails = lifecyleDetails;
            this.__explicitlySet__.add("lifecyleDetails");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * <p>Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * <p>Avoid entering confidential information.
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedListSummary build() {
            ManagedListSummary model =
                    new ManagedListSummary(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.sourceManagedListId,
                            this.listType,
                            this.feedProvider,
                            this.isEditable,
                            this.listItems,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecyleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedListSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("sourceManagedListId")) {
                this.sourceManagedListId(model.getSourceManagedListId());
            }
            if (model.wasPropertyExplicitlySet("listType")) {
                this.listType(model.getListType());
            }
            if (model.wasPropertyExplicitlySet("feedProvider")) {
                this.feedProvider(model.getFeedProvider());
            }
            if (model.wasPropertyExplicitlySet("isEditable")) {
                this.isEditable(model.getIsEditable());
            }
            if (model.wasPropertyExplicitlySet("listItems")) {
                this.listItems(model.getListItems());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecyleDetails")) {
                this.lifecyleDetails(model.getLifecyleDetails());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Unique identifier that can't be changed after creation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that can't be changed after creation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Managed list display name */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Managed list display name
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Managed list description */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Managed list description
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Compartment OCID where the resource is created */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment OCID where the resource is created
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** OCID of the source managed list */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceManagedListId")
    private final String sourceManagedListId;

    /**
     * OCID of the source managed list
     *
     * @return the value
     */
    public String getSourceManagedListId() {
        return sourceManagedListId;
    }

    /** Type of information stored in the managed list */
    @com.fasterxml.jackson.annotation.JsonProperty("listType")
    private final ManagedListType listType;

    /**
     * Type of information stored in the managed list
     *
     * @return the value
     */
    public ManagedListType getListType() {
        return listType;
    }

    /** Provider of the feed */
    @com.fasterxml.jackson.annotation.JsonProperty("feedProvider")
    private final FeedProviderType feedProvider;

    /**
     * Provider of the feed
     *
     * @return the value
     */
    public FeedProviderType getFeedProvider() {
        return feedProvider;
    }

    /** Is this list editable? */
    @com.fasterxml.jackson.annotation.JsonProperty("isEditable")
    private final Boolean isEditable;

    /**
     * Is this list editable?
     *
     * @return the value
     */
    public Boolean getIsEditable() {
        return isEditable;
    }

    /** List of items in the managed list */
    @com.fasterxml.jackson.annotation.JsonProperty("listItems")
    private final java.util.List<String> listItems;

    /**
     * List of items in the managed list
     *
     * @return the value
     */
    public java.util.List<String> getListItems() {
        return listItems;
    }

    /** The date and time the managed list was created. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the managed list was created. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the managed list was last updated. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the managed list was last updated. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current lifecycle state of the resource */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the resource
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state. [DEPRECATE]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecyleDetails")
    private final String lifecyleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state. [DEPRECATE]
     *
     * @return the value
     */
    public String getLifecyleDetails() {
        return lifecyleDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * <p>Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * <p>Avoid entering confidential information.
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

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("ManagedListSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", sourceManagedListId=").append(String.valueOf(this.sourceManagedListId));
        sb.append(", listType=").append(String.valueOf(this.listType));
        sb.append(", feedProvider=").append(String.valueOf(this.feedProvider));
        sb.append(", isEditable=").append(String.valueOf(this.isEditable));
        sb.append(", listItems=").append(String.valueOf(this.listItems));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecyleDetails=").append(String.valueOf(this.lifecyleDetails));
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
        if (!(o instanceof ManagedListSummary)) {
            return false;
        }

        ManagedListSummary other = (ManagedListSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.sourceManagedListId, other.sourceManagedListId)
                && java.util.Objects.equals(this.listType, other.listType)
                && java.util.Objects.equals(this.feedProvider, other.feedProvider)
                && java.util.Objects.equals(this.isEditable, other.isEditable)
                && java.util.Objects.equals(this.listItems, other.listItems)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecyleDetails, other.lifecyleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceManagedListId == null
                                ? 43
                                : this.sourceManagedListId.hashCode());
        result = (result * PRIME) + (this.listType == null ? 43 : this.listType.hashCode());
        result = (result * PRIME) + (this.feedProvider == null ? 43 : this.feedProvider.hashCode());
        result = (result * PRIME) + (this.isEditable == null ? 43 : this.isEditable.hashCode());
        result = (result * PRIME) + (this.listItems == null ? 43 : this.listItems.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecyleDetails == null ? 43 : this.lifecyleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
