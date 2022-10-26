/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourceDataFilter <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsSourceDataFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsSourceDataFilter
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "displayName",
        "editVersion",
        "isEnabled",
        "fieldName",
        "hashType",
        "dataFilterId",
        "isSystem",
        "matchRegularExpression",
        "order",
        "path",
        "replacementString",
        "sourceId",
        "filterType"
    })
    public LogAnalyticsSourceDataFilter(
            String description,
            String displayName,
            Long editVersion,
            Boolean isEnabled,
            String fieldName,
            Integer hashType,
            Long dataFilterId,
            Boolean isSystem,
            String matchRegularExpression,
            Long order,
            String path,
            String replacementString,
            Long sourceId,
            FilterType filterType) {
        super();
        this.description = description;
        this.displayName = displayName;
        this.editVersion = editVersion;
        this.isEnabled = isEnabled;
        this.fieldName = fieldName;
        this.hashType = hashType;
        this.dataFilterId = dataFilterId;
        this.isSystem = isSystem;
        this.matchRegularExpression = matchRegularExpression;
        this.order = order;
        this.path = path;
        this.replacementString = replacementString;
        this.sourceId = sourceId;
        this.filterType = filterType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The filter description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The filter description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The filter display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The filter display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The filter edit version. */
        @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
        private Long editVersion;

        /**
         * The filter edit version.
         *
         * @param editVersion the value to set
         * @return this builder
         */
        public Builder editVersion(Long editVersion) {
            this.editVersion = editVersion;
            this.__explicitlySet__.add("editVersion");
            return this;
        }
        /** A flag inidcating whether or not the filter is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * A flag inidcating whether or not the filter is enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** The field internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        /**
         * The field internal name.
         *
         * @param fieldName the value to set
         * @return this builder
         */
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }
        /** The hash type. */
        @com.fasterxml.jackson.annotation.JsonProperty("hashType")
        private Integer hashType;

        /**
         * The hash type.
         *
         * @param hashType the value to set
         * @return this builder
         */
        public Builder hashType(Integer hashType) {
            this.hashType = hashType;
            this.__explicitlySet__.add("hashType");
            return this;
        }
        /** The filter unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataFilterId")
        private Long dataFilterId;

        /**
         * The filter unique identifier.
         *
         * @param dataFilterId the value to set
         * @return this builder
         */
        public Builder dataFilterId(Long dataFilterId) {
            this.dataFilterId = dataFilterId;
            this.__explicitlySet__.add("dataFilterId");
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
        /** The regular expression for matching. */
        @com.fasterxml.jackson.annotation.JsonProperty("matchRegularExpression")
        private String matchRegularExpression;

        /**
         * The regular expression for matching.
         *
         * @param matchRegularExpression the value to set
         * @return this builder
         */
        public Builder matchRegularExpression(String matchRegularExpression) {
            this.matchRegularExpression = matchRegularExpression;
            this.__explicitlySet__.add("matchRegularExpression");
            return this;
        }
        /** The filter order. */
        @com.fasterxml.jackson.annotation.JsonProperty("order")
        private Long order;

        /**
         * The filter order.
         *
         * @param order the value to set
         * @return this builder
         */
        public Builder order(Long order) {
            this.order = order;
            this.__explicitlySet__.add("order");
            return this;
        }
        /** The filter path. */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * The filter path.
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /** The replacement string. */
        @com.fasterxml.jackson.annotation.JsonProperty("replacementString")
        private String replacementString;

        /**
         * The replacement string.
         *
         * @param replacementString the value to set
         * @return this builder
         */
        public Builder replacementString(String replacementString) {
            this.replacementString = replacementString;
            this.__explicitlySet__.add("replacementString");
            return this;
        }
        /** The source unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        /**
         * The source unique identifier.
         *
         * @param sourceId the value to set
         * @return this builder
         */
        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }
        /** The filter type. */
        @com.fasterxml.jackson.annotation.JsonProperty("filterType")
        private FilterType filterType;

        /**
         * The filter type.
         *
         * @param filterType the value to set
         * @return this builder
         */
        public Builder filterType(FilterType filterType) {
            this.filterType = filterType;
            this.__explicitlySet__.add("filterType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourceDataFilter build() {
            LogAnalyticsSourceDataFilter model =
                    new LogAnalyticsSourceDataFilter(
                            this.description,
                            this.displayName,
                            this.editVersion,
                            this.isEnabled,
                            this.fieldName,
                            this.hashType,
                            this.dataFilterId,
                            this.isSystem,
                            this.matchRegularExpression,
                            this.order,
                            this.path,
                            this.replacementString,
                            this.sourceId,
                            this.filterType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourceDataFilter model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("editVersion")) {
                this.editVersion(model.getEditVersion());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("fieldName")) {
                this.fieldName(model.getFieldName());
            }
            if (model.wasPropertyExplicitlySet("hashType")) {
                this.hashType(model.getHashType());
            }
            if (model.wasPropertyExplicitlySet("dataFilterId")) {
                this.dataFilterId(model.getDataFilterId());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("matchRegularExpression")) {
                this.matchRegularExpression(model.getMatchRegularExpression());
            }
            if (model.wasPropertyExplicitlySet("order")) {
                this.order(model.getOrder());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("replacementString")) {
                this.replacementString(model.getReplacementString());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("filterType")) {
                this.filterType(model.getFilterType());
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

    /** The filter description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The filter description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The filter display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The filter display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The filter edit version. */
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    private final Long editVersion;

    /**
     * The filter edit version.
     *
     * @return the value
     */
    public Long getEditVersion() {
        return editVersion;
    }

    /** A flag inidcating whether or not the filter is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * A flag inidcating whether or not the filter is enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** The field internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    /**
     * The field internal name.
     *
     * @return the value
     */
    public String getFieldName() {
        return fieldName;
    }

    /** The hash type. */
    @com.fasterxml.jackson.annotation.JsonProperty("hashType")
    private final Integer hashType;

    /**
     * The hash type.
     *
     * @return the value
     */
    public Integer getHashType() {
        return hashType;
    }

    /** The filter unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataFilterId")
    private final Long dataFilterId;

    /**
     * The filter unique identifier.
     *
     * @return the value
     */
    public Long getDataFilterId() {
        return dataFilterId;
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

    /** The regular expression for matching. */
    @com.fasterxml.jackson.annotation.JsonProperty("matchRegularExpression")
    private final String matchRegularExpression;

    /**
     * The regular expression for matching.
     *
     * @return the value
     */
    public String getMatchRegularExpression() {
        return matchRegularExpression;
    }

    /** The filter order. */
    @com.fasterxml.jackson.annotation.JsonProperty("order")
    private final Long order;

    /**
     * The filter order.
     *
     * @return the value
     */
    public Long getOrder() {
        return order;
    }

    /** The filter path. */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * The filter path.
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /** The replacement string. */
    @com.fasterxml.jackson.annotation.JsonProperty("replacementString")
    private final String replacementString;

    /**
     * The replacement string.
     *
     * @return the value
     */
    public String getReplacementString() {
        return replacementString;
    }

    /** The source unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final Long sourceId;

    /**
     * The source unique identifier.
     *
     * @return the value
     */
    public Long getSourceId() {
        return sourceId;
    }

    /** The filter type. */
    public enum FilterType implements com.oracle.bmc.http.internal.BmcEnum {
        Mask("MASK"),
        HashMask("HASH_MASK"),
        DropLogEntry("DROP_LOG_ENTRY"),
        DropString("DROP_STRING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FilterType.class);

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
    /** The filter type. */
    @com.fasterxml.jackson.annotation.JsonProperty("filterType")
    private final FilterType filterType;

    /**
     * The filter type.
     *
     * @return the value
     */
    public FilterType getFilterType() {
        return filterType;
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
        sb.append("LogAnalyticsSourceDataFilter(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", editVersion=").append(String.valueOf(this.editVersion));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", hashType=").append(String.valueOf(this.hashType));
        sb.append(", dataFilterId=").append(String.valueOf(this.dataFilterId));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", matchRegularExpression=").append(String.valueOf(this.matchRegularExpression));
        sb.append(", order=").append(String.valueOf(this.order));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", replacementString=").append(String.valueOf(this.replacementString));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", filterType=").append(String.valueOf(this.filterType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsSourceDataFilter)) {
            return false;
        }

        LogAnalyticsSourceDataFilter other = (LogAnalyticsSourceDataFilter) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.editVersion, other.editVersion)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.hashType, other.hashType)
                && java.util.Objects.equals(this.dataFilterId, other.dataFilterId)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(
                        this.matchRegularExpression, other.matchRegularExpression)
                && java.util.Objects.equals(this.order, other.order)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.replacementString, other.replacementString)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.filterType, other.filterType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.editVersion == null ? 43 : this.editVersion.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.hashType == null ? 43 : this.hashType.hashCode());
        result = (result * PRIME) + (this.dataFilterId == null ? 43 : this.dataFilterId.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.matchRegularExpression == null
                                ? 43
                                : this.matchRegularExpression.hashCode());
        result = (result * PRIME) + (this.order == null ? 43 : this.order.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result =
                (result * PRIME)
                        + (this.replacementString == null ? 43 : this.replacementString.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result = (result * PRIME) + (this.filterType == null ? 43 : this.filterType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
