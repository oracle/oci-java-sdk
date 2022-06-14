/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties that are required to create a Skill.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = CreateSkillDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CloneSkillDetails.class,
        name = "CLONE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateNewSkillDetails.class,
        name = "NEW"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateSkillVersionDetails.class,
        name = "VERSION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExtendSkillDetails.class,
        name = "EXTEND"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateSkillDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "category",
        "description",
        "platformVersion",
        "multilingualMode",
        "primaryLanguageTag",
        "freeformTags",
        "definedTags"
    })
    protected CreateSkillDetails(
            String category,
            String description,
            String platformVersion,
            BotMultilingualMode multilingualMode,
            String primaryLanguageTag,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.category = category;
        this.description = description;
        this.platformVersion = platformVersion;
        this.multilingualMode = multilingualMode;
        this.primaryLanguageTag = primaryLanguageTag;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
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
        sb.append("CreateSkillDetails(");
        sb.append("category=").append(String.valueOf(this.category));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", platformVersion=").append(String.valueOf(this.platformVersion));
        sb.append(", multilingualMode=").append(String.valueOf(this.multilingualMode));
        sb.append(", primaryLanguageTag=").append(String.valueOf(this.primaryLanguageTag));
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
        if (!(o instanceof CreateSkillDetails)) {
            return false;
        }

        CreateSkillDetails other = (CreateSkillDetails) o;
        return java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.platformVersion, other.platformVersion)
                && java.util.Objects.equals(this.multilingualMode, other.multilingualMode)
                && java.util.Objects.equals(this.primaryLanguageTag, other.primaryLanguageTag)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.platformVersion == null ? 43 : this.platformVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.multilingualMode == null ? 43 : this.multilingualMode.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryLanguageTag == null
                                ? 43
                                : this.primaryLanguageTag.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        return result;
    }
}
