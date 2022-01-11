/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourceDataFilter
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsSourceDataFilter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsSourceDataFilter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
        private Long editVersion;

        public Builder editVersion(Long editVersion) {
            this.editVersion = editVersion;
            this.__explicitlySet__.add("editVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hashType")
        private Integer hashType;

        public Builder hashType(Integer hashType) {
            this.hashType = hashType;
            this.__explicitlySet__.add("hashType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataFilterId")
        private Long dataFilterId;

        public Builder dataFilterId(Long dataFilterId) {
            this.dataFilterId = dataFilterId;
            this.__explicitlySet__.add("dataFilterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("matchRegularExpression")
        private String matchRegularExpression;

        public Builder matchRegularExpression(String matchRegularExpression) {
            this.matchRegularExpression = matchRegularExpression;
            this.__explicitlySet__.add("matchRegularExpression");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("order")
        private Long order;

        public Builder order(Long order) {
            this.order = order;
            this.__explicitlySet__.add("order");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replacementString")
        private String replacementString;

        public Builder replacementString(String replacementString) {
            this.replacementString = replacementString;
            this.__explicitlySet__.add("replacementString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filterType")
        private FilterType filterType;

        public Builder filterType(FilterType filterType) {
            this.filterType = filterType;
            this.__explicitlySet__.add("filterType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourceDataFilter build() {
            LogAnalyticsSourceDataFilter __instance__ =
                    new LogAnalyticsSourceDataFilter(
                            description,
                            displayName,
                            editVersion,
                            isEnabled,
                            fieldName,
                            hashType,
                            dataFilterId,
                            isSystem,
                            matchRegularExpression,
                            order,
                            path,
                            replacementString,
                            sourceId,
                            filterType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourceDataFilter o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .editVersion(o.getEditVersion())
                            .isEnabled(o.getIsEnabled())
                            .fieldName(o.getFieldName())
                            .hashType(o.getHashType())
                            .dataFilterId(o.getDataFilterId())
                            .isSystem(o.getIsSystem())
                            .matchRegularExpression(o.getMatchRegularExpression())
                            .order(o.getOrder())
                            .path(o.getPath())
                            .replacementString(o.getReplacementString())
                            .sourceId(o.getSourceId())
                            .filterType(o.getFilterType());

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

    /**
     * The filter description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The filter display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The filter edit version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    Long editVersion;

    /**
     * A flag inidcating whether or not the filter is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;

    /**
     * The field internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    String fieldName;

    /**
     * The hash type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hashType")
    Integer hashType;

    /**
     * The filter unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataFilterId")
    Long dataFilterId;

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    Boolean isSystem;

    /**
     * The regular expression for matching.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchRegularExpression")
    String matchRegularExpression;

    /**
     * The filter order.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("order")
    Long order;

    /**
     * The filter path.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;

    /**
     * The replacement string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replacementString")
    String replacementString;

    /**
     * The source unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    Long sourceId;
    /**
     * The filter type.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum FilterType {
        Mask("MASK"),
        HashMask("HASH_MASK"),
        DropLogEntry("DROP_LOG_ENTRY"),
        DropString("DROP_STRING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, FilterType> map;

        static {
            map = new java.util.HashMap<>();
            for (FilterType v : FilterType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FilterType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FilterType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FilterType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The filter type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filterType")
    FilterType filterType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
