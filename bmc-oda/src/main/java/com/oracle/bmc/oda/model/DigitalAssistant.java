/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Digital Assistant metadata.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DigitalAssistant.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DigitalAssistant {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "version",
        "displayName",
        "category",
        "description",
        "namespace",
        "lifecycleState",
        "lifecycleDetails",
        "platformVersion",
        "baseId",
        "multilingualMode",
        "primaryLanguageTag",
        "nativeLanguageTags",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags"
    })
    public DigitalAssistant(
            String id,
            String name,
            String version,
            String displayName,
            String category,
            String description,
            String namespace,
            LifecycleState lifecycleState,
            BotPublishState lifecycleDetails,
            String platformVersion,
            String baseId,
            BotMultilingualMode multilingualMode,
            String primaryLanguageTag,
            java.util.List<String> nativeLanguageTags,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.name = name;
        this.version = version;
        this.displayName = displayName;
        this.category = category;
        this.description = description;
        this.namespace = namespace;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.platformVersion = platformVersion;
        this.baseId = baseId;
        this.multilingualMode = multilingualMode;
        this.primaryLanguageTag = primaryLanguageTag;
        this.nativeLanguageTags = nativeLanguageTags;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique immutable identifier that was assigned when the resource was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique immutable identifier that was assigned when the resource was created.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The reource's name. The name can contain only letters, numbers, periods, and underscores. The name must begin with a letter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The reource's name. The name can contain only letters, numbers, periods, and underscores. The name must begin with a letter.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The resource's version. The version can only contain numbers, letters, periods, underscores, dashes or spaces.  The version must begin with a letter or a number.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The resource's version. The version can only contain numbers, letters, periods, underscores, dashes or spaces.  The version must begin with a letter or a number.
         *
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The resource's display name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The resource's display name.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The resource's category.  This is used to group resource's together.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        /**
         * The resource's category.  This is used to group resource's together.
         * @param category the value to set
         * @return this builder
         **/
        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /**
         * A short description of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description of the resource.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The resource's namespace.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The resource's namespace.
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The resource's current state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The resource's current state.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The resource's publish state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private BotPublishState lifecycleDetails;

        /**
         * The resource's publish state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(BotPublishState lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The ODA Platform Version for this resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("platformVersion")
        private String platformVersion;

        /**
         * The ODA Platform Version for this resource.
         * @param platformVersion the value to set
         * @return this builder
         **/
        public Builder platformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            this.__explicitlySet__.add("platformVersion");
            return this;
        }
        /**
         * The unique identifier for the base reource (when this resource extends another).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("baseId")
        private String baseId;

        /**
         * The unique identifier for the base reource (when this resource extends another).
         * @param baseId the value to set
         * @return this builder
         **/
        public Builder baseId(String baseId) {
            this.baseId = baseId;
            this.__explicitlySet__.add("baseId");
            return this;
        }
        /**
         * The multilingual mode for the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("multilingualMode")
        private BotMultilingualMode multilingualMode;

        /**
         * The multilingual mode for the resource.
         * @param multilingualMode the value to set
         * @return this builder
         **/
        public Builder multilingualMode(BotMultilingualMode multilingualMode) {
            this.multilingualMode = multilingualMode;
            this.__explicitlySet__.add("multilingualMode");
            return this;
        }
        /**
         * The primary language for the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("primaryLanguageTag")
        private String primaryLanguageTag;

        /**
         * The primary language for the resource.
         * @param primaryLanguageTag the value to set
         * @return this builder
         **/
        public Builder primaryLanguageTag(String primaryLanguageTag) {
            this.primaryLanguageTag = primaryLanguageTag;
            this.__explicitlySet__.add("primaryLanguageTag");
            return this;
        }
        /**
         * A list of native languages supported by this resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nativeLanguageTags")
        private java.util.List<String> nativeLanguageTags;

        /**
         * A list of native languages supported by this resource.
         * @param nativeLanguageTags the value to set
         * @return this builder
         **/
        public Builder nativeLanguageTags(java.util.List<String> nativeLanguageTags) {
            this.nativeLanguageTags = nativeLanguageTags;
            this.__explicitlySet__.add("nativeLanguageTags");
            return this;
        }
        /**
         * When the resource was created. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * When the resource was created. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * When the resource was last updated. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * When the resource was last updated. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
         * Example: {@code {"bar-key": "value"}}
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
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DigitalAssistant build() {
            DigitalAssistant __instance__ =
                    new DigitalAssistant(
                            id,
                            name,
                            version,
                            displayName,
                            category,
                            description,
                            namespace,
                            lifecycleState,
                            lifecycleDetails,
                            platformVersion,
                            baseId,
                            multilingualMode,
                            primaryLanguageTag,
                            nativeLanguageTags,
                            timeCreated,
                            timeUpdated,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DigitalAssistant o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .version(o.getVersion())
                            .displayName(o.getDisplayName())
                            .category(o.getCategory())
                            .description(o.getDescription())
                            .namespace(o.getNamespace())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .platformVersion(o.getPlatformVersion())
                            .baseId(o.getBaseId())
                            .multilingualMode(o.getMultilingualMode())
                            .primaryLanguageTag(o.getPrimaryLanguageTag())
                            .nativeLanguageTags(o.getNativeLanguageTags())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Unique immutable identifier that was assigned when the resource was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique immutable identifier that was assigned when the resource was created.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The reource's name. The name can contain only letters, numbers, periods, and underscores. The name must begin with a letter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The reource's name. The name can contain only letters, numbers, periods, and underscores. The name must begin with a letter.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The resource's version. The version can only contain numbers, letters, periods, underscores, dashes or spaces.  The version must begin with a letter or a number.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The resource's version. The version can only contain numbers, letters, periods, underscores, dashes or spaces.  The version must begin with a letter or a number.
     *
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * The resource's display name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The resource's display name.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The resource's category.  This is used to group resource's together.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

    /**
     * The resource's category.  This is used to group resource's together.
     * @return the value
     **/
    public String getCategory() {
        return category;
    }

    /**
     * A short description of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the resource.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The resource's namespace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The resource's namespace.
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * The resource's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The resource's current state.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The resource's publish state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final BotPublishState lifecycleDetails;

    /**
     * The resource's publish state.
     * @return the value
     **/
    public BotPublishState getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The ODA Platform Version for this resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformVersion")
    private final String platformVersion;

    /**
     * The ODA Platform Version for this resource.
     * @return the value
     **/
    public String getPlatformVersion() {
        return platformVersion;
    }

    /**
     * The unique identifier for the base reource (when this resource extends another).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseId")
    private final String baseId;

    /**
     * The unique identifier for the base reource (when this resource extends another).
     * @return the value
     **/
    public String getBaseId() {
        return baseId;
    }

    /**
     * The multilingual mode for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("multilingualMode")
    private final BotMultilingualMode multilingualMode;

    /**
     * The multilingual mode for the resource.
     * @return the value
     **/
    public BotMultilingualMode getMultilingualMode() {
        return multilingualMode;
    }

    /**
     * The primary language for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primaryLanguageTag")
    private final String primaryLanguageTag;

    /**
     * The primary language for the resource.
     * @return the value
     **/
    public String getPrimaryLanguageTag() {
        return primaryLanguageTag;
    }

    /**
     * A list of native languages supported by this resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nativeLanguageTags")
    private final java.util.List<String> nativeLanguageTags;

    /**
     * A list of native languages supported by this resource.
     * @return the value
     **/
    public java.util.List<String> getNativeLanguageTags() {
        return nativeLanguageTags;
    }

    /**
     * When the resource was created. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * When the resource was created. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * When the resource was last updated. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * When the resource was last updated. A date-time string as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DigitalAssistant(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", platformVersion=").append(String.valueOf(this.platformVersion));
        sb.append(", baseId=").append(String.valueOf(this.baseId));
        sb.append(", multilingualMode=").append(String.valueOf(this.multilingualMode));
        sb.append(", primaryLanguageTag=").append(String.valueOf(this.primaryLanguageTag));
        sb.append(", nativeLanguageTags=").append(String.valueOf(this.nativeLanguageTags));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DigitalAssistant)) {
            return false;
        }

        DigitalAssistant other = (DigitalAssistant) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.platformVersion, other.platformVersion)
                && java.util.Objects.equals(this.baseId, other.baseId)
                && java.util.Objects.equals(this.multilingualMode, other.multilingualMode)
                && java.util.Objects.equals(this.primaryLanguageTag, other.primaryLanguageTag)
                && java.util.Objects.equals(this.nativeLanguageTags, other.nativeLanguageTags)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.platformVersion == null ? 43 : this.platformVersion.hashCode());
        result = (result * PRIME) + (this.baseId == null ? 43 : this.baseId.hashCode());
        result =
                (result * PRIME)
                        + (this.multilingualMode == null ? 43 : this.multilingualMode.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryLanguageTag == null
                                ? 43
                                : this.primaryLanguageTag.hashCode());
        result =
                (result * PRIME)
                        + (this.nativeLanguageTags == null
                                ? 43
                                : this.nativeLanguageTags.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
