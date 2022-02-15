/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of the sensitive type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SensitiveTypePattern.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entityType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SensitiveTypePattern extends SensitiveType {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DiscoveryLifecycleState lifecycleState;

        public Builder lifecycleState(DiscoveryLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shortName")
        private String shortName;

        public Builder shortName(String shortName) {
            this.shortName = shortName;
            this.__explicitlySet__.add("shortName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private SensitiveTypeSource source;

        public Builder source(SensitiveTypeSource source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentCategoryId")
        private String parentCategoryId;

        public Builder parentCategoryId(String parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            this.__explicitlySet__.add("parentCategoryId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("namePattern")
        private String namePattern;

        public Builder namePattern(String namePattern) {
            this.namePattern = namePattern;
            this.__explicitlySet__.add("namePattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commentPattern")
        private String commentPattern;

        public Builder commentPattern(String commentPattern) {
            this.commentPattern = commentPattern;
            this.__explicitlySet__.add("commentPattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataPattern")
        private String dataPattern;

        public Builder dataPattern(String dataPattern) {
            this.dataPattern = dataPattern;
            this.__explicitlySet__.add("dataPattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("searchType")
        private SearchType searchType;

        public Builder searchType(SearchType searchType) {
            this.searchType = searchType;
            this.__explicitlySet__.add("searchType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultMaskingFormatId")
        private String defaultMaskingFormatId;

        public Builder defaultMaskingFormatId(String defaultMaskingFormatId) {
            this.defaultMaskingFormatId = defaultMaskingFormatId;
            this.__explicitlySet__.add("defaultMaskingFormatId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SensitiveTypePattern build() {
            SensitiveTypePattern __instance__ =
                    new SensitiveTypePattern(
                            id,
                            displayName,
                            compartmentId,
                            lifecycleState,
                            shortName,
                            source,
                            timeCreated,
                            timeUpdated,
                            description,
                            parentCategoryId,
                            freeformTags,
                            definedTags,
                            systemTags,
                            namePattern,
                            commentPattern,
                            dataPattern,
                            searchType,
                            defaultMaskingFormatId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SensitiveTypePattern o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .lifecycleState(o.getLifecycleState())
                            .shortName(o.getShortName())
                            .source(o.getSource())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .description(o.getDescription())
                            .parentCategoryId(o.getParentCategoryId())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags())
                            .namePattern(o.getNamePattern())
                            .commentPattern(o.getCommentPattern())
                            .dataPattern(o.getDataPattern())
                            .searchType(o.getSearchType())
                            .defaultMaskingFormatId(o.getDefaultMaskingFormatId());

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

    @Deprecated
    public SensitiveTypePattern(
            String id,
            String displayName,
            String compartmentId,
            DiscoveryLifecycleState lifecycleState,
            String shortName,
            SensitiveTypeSource source,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String description,
            String parentCategoryId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String namePattern,
            String commentPattern,
            String dataPattern,
            SearchType searchType,
            String defaultMaskingFormatId) {
        super(
                id,
                displayName,
                compartmentId,
                lifecycleState,
                shortName,
                source,
                timeCreated,
                timeUpdated,
                description,
                parentCategoryId,
                freeformTags,
                definedTags,
                systemTags);
        this.namePattern = namePattern;
        this.commentPattern = commentPattern;
        this.dataPattern = dataPattern;
        this.searchType = searchType;
        this.defaultMaskingFormatId = defaultMaskingFormatId;
    }

    /**
     * A regular expression to be used by data discovery for matching column names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namePattern")
    String namePattern;

    /**
     * A regular expression to be used by data discovery for matching column comments.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commentPattern")
    String commentPattern;

    /**
     * A regular expression to be used by data discovery for matching column data values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataPattern")
    String dataPattern;
    /**
     * The search type indicating how the column name, comment and data patterns should be used by data discovery.
     * [Learn more](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/sensitive-types.html#GUID-1D1AD98E-B93F-4FF2-80AE-CB7D8A14F6CC).
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum SearchType {
        Or("OR"),
        And("AND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, SearchType> map;

        static {
            map = new java.util.HashMap<>();
            for (SearchType v : SearchType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SearchType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SearchType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SearchType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The search type indicating how the column name, comment and data patterns should be used by data discovery.
     * [Learn more](https://docs.oracle.com/en/cloud/paas/data-safe/udscs/sensitive-types.html#GUID-1D1AD98E-B93F-4FF2-80AE-CB7D8A14F6CC).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("searchType")
    SearchType searchType;

    /**
     * The OCID of the library masking format that should be used to mask the sensitive columns associated with the sensitive type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultMaskingFormatId")
    String defaultMaskingFormatId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
