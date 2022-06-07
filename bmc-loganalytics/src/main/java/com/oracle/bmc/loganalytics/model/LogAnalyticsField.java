/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Field Details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsField.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsField {
    @Deprecated
    @java.beans.ConstructorProperties({
        "ceeAlias",
        "dataType",
        "regularExpression",
        "description",
        "displayName",
        "editVersion",
        "facetPriority",
        "name",
        "isFacetEligible",
        "isHighCardinality",
        "isLargeData",
        "isMultiValued",
        "isPrimary",
        "isSystem",
        "isSummarizable",
        "mappedValue",
        "isMetricKeyEligible",
        "isMetricValueEligible",
        "rangeFacetEligible",
        "isTableEligible",
        "unitType"
    })
    public LogAnalyticsField(
            String ceeAlias,
            String dataType,
            String regularExpression,
            String description,
            String displayName,
            Long editVersion,
            Long facetPriority,
            String name,
            Boolean isFacetEligible,
            Boolean isHighCardinality,
            Boolean isLargeData,
            Boolean isMultiValued,
            Boolean isPrimary,
            Boolean isSystem,
            Boolean isSummarizable,
            String mappedValue,
            Boolean isMetricKeyEligible,
            Boolean isMetricValueEligible,
            Long rangeFacetEligible,
            Boolean isTableEligible,
            String unitType) {
        super();
        this.ceeAlias = ceeAlias;
        this.dataType = dataType;
        this.regularExpression = regularExpression;
        this.description = description;
        this.displayName = displayName;
        this.editVersion = editVersion;
        this.facetPriority = facetPriority;
        this.name = name;
        this.isFacetEligible = isFacetEligible;
        this.isHighCardinality = isHighCardinality;
        this.isLargeData = isLargeData;
        this.isMultiValued = isMultiValued;
        this.isPrimary = isPrimary;
        this.isSystem = isSystem;
        this.isSummarizable = isSummarizable;
        this.mappedValue = mappedValue;
        this.isMetricKeyEligible = isMetricKeyEligible;
        this.isMetricValueEligible = isMetricValueEligible;
        this.rangeFacetEligible = rangeFacetEligible;
        this.isTableEligible = isTableEligible;
        this.unitType = unitType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("ceeAlias")
        private String ceeAlias;

        public Builder ceeAlias(String ceeAlias) {
            this.ceeAlias = ceeAlias;
            this.__explicitlySet__.add("ceeAlias");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("regularExpression")
        private String regularExpression;

        public Builder regularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            this.__explicitlySet__.add("regularExpression");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("facetPriority")
        private Long facetPriority;

        public Builder facetPriority(Long facetPriority) {
            this.facetPriority = facetPriority;
            this.__explicitlySet__.add("facetPriority");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFacetEligible")
        private Boolean isFacetEligible;

        public Builder isFacetEligible(Boolean isFacetEligible) {
            this.isFacetEligible = isFacetEligible;
            this.__explicitlySet__.add("isFacetEligible");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHighCardinality")
        private Boolean isHighCardinality;

        public Builder isHighCardinality(Boolean isHighCardinality) {
            this.isHighCardinality = isHighCardinality;
            this.__explicitlySet__.add("isHighCardinality");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isLargeData")
        private Boolean isLargeData;

        public Builder isLargeData(Boolean isLargeData) {
            this.isLargeData = isLargeData;
            this.__explicitlySet__.add("isLargeData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMultiValued")
        private Boolean isMultiValued;

        public Builder isMultiValued(Boolean isMultiValued) {
            this.isMultiValued = isMultiValued;
            this.__explicitlySet__.add("isMultiValued");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
        private Boolean isPrimary;

        public Builder isPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            this.__explicitlySet__.add("isPrimary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSummarizable")
        private Boolean isSummarizable;

        public Builder isSummarizable(Boolean isSummarizable) {
            this.isSummarizable = isSummarizable;
            this.__explicitlySet__.add("isSummarizable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mappedValue")
        private String mappedValue;

        public Builder mappedValue(String mappedValue) {
            this.mappedValue = mappedValue;
            this.__explicitlySet__.add("mappedValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMetricKeyEligible")
        private Boolean isMetricKeyEligible;

        public Builder isMetricKeyEligible(Boolean isMetricKeyEligible) {
            this.isMetricKeyEligible = isMetricKeyEligible;
            this.__explicitlySet__.add("isMetricKeyEligible");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMetricValueEligible")
        private Boolean isMetricValueEligible;

        public Builder isMetricValueEligible(Boolean isMetricValueEligible) {
            this.isMetricValueEligible = isMetricValueEligible;
            this.__explicitlySet__.add("isMetricValueEligible");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rangeFacetEligible")
        private Long rangeFacetEligible;

        public Builder rangeFacetEligible(Long rangeFacetEligible) {
            this.rangeFacetEligible = rangeFacetEligible;
            this.__explicitlySet__.add("rangeFacetEligible");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTableEligible")
        private Boolean isTableEligible;

        public Builder isTableEligible(Boolean isTableEligible) {
            this.isTableEligible = isTableEligible;
            this.__explicitlySet__.add("isTableEligible");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unitType")
        private String unitType;

        public Builder unitType(String unitType) {
            this.unitType = unitType;
            this.__explicitlySet__.add("unitType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsField build() {
            LogAnalyticsField __instance__ =
                    new LogAnalyticsField(
                            ceeAlias,
                            dataType,
                            regularExpression,
                            description,
                            displayName,
                            editVersion,
                            facetPriority,
                            name,
                            isFacetEligible,
                            isHighCardinality,
                            isLargeData,
                            isMultiValued,
                            isPrimary,
                            isSystem,
                            isSummarizable,
                            mappedValue,
                            isMetricKeyEligible,
                            isMetricValueEligible,
                            rangeFacetEligible,
                            isTableEligible,
                            unitType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsField o) {
            Builder copiedBuilder =
                    ceeAlias(o.getCeeAlias())
                            .dataType(o.getDataType())
                            .regularExpression(o.getRegularExpression())
                            .description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .editVersion(o.getEditVersion())
                            .facetPriority(o.getFacetPriority())
                            .name(o.getName())
                            .isFacetEligible(o.getIsFacetEligible())
                            .isHighCardinality(o.getIsHighCardinality())
                            .isLargeData(o.getIsLargeData())
                            .isMultiValued(o.getIsMultiValued())
                            .isPrimary(o.getIsPrimary())
                            .isSystem(o.getIsSystem())
                            .isSummarizable(o.getIsSummarizable())
                            .mappedValue(o.getMappedValue())
                            .isMetricKeyEligible(o.getIsMetricKeyEligible())
                            .isMetricValueEligible(o.getIsMetricValueEligible())
                            .rangeFacetEligible(o.getRangeFacetEligible())
                            .isTableEligible(o.getIsTableEligible())
                            .unitType(o.getUnitType());

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
     * The name this field is given in the common event expression standard from mitre.org.
     * This is used for reference when exporting content conforming to CEE standard
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ceeAlias")
    private final String ceeAlias;

    public String getCeeAlias() {
        return ceeAlias;
    }

    /**
     * The field data type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

    public String getDataType() {
        return dataType;
    }

    /**
     * The field default regular expression.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regularExpression")
    private final String regularExpression;

    public String getRegularExpression() {
        return regularExpression;
    }

    /**
     * The field description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The field display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The field edit version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    private final Long editVersion;

    public Long getEditVersion() {
        return editVersion;
    }

    /**
     * The facet priority.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("facetPriority")
    private final Long facetPriority;

    public Long getFacetPriority() {
        return facetPriority;
    }

    /**
     * The field internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * A flag inidcating whether or not the facet is elibigle for use.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFacetEligible")
    private final Boolean isFacetEligible;

    public Boolean getIsFacetEligible() {
        return isFacetEligible;
    }

    /**
     * A flag inidcating whether or not the cardinality of the field is high.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHighCardinality")
    private final Boolean isHighCardinality;

    public Boolean getIsHighCardinality() {
        return isHighCardinality;
    }

    /**
     * A flag inidcating whether or not the field is a large data field.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLargeData")
    private final Boolean isLargeData;

    public Boolean getIsLargeData() {
        return isLargeData;
    }

    /**
     * A flag indicating whether or not the field is multi-valued.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiValued")
    private final Boolean isMultiValued;

    public Boolean getIsMultiValued() {
        return isMultiValued;
    }

    /**
     * A flag inidcating whether or not this is a primary field.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
    private final Boolean isPrimary;

    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    public Boolean getIsSystem() {
        return isSystem;
    }

    /**
     * A flag inidcating whether or not the field can be summarized.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSummarizable")
    private final Boolean isSummarizable;

    public Boolean getIsSummarizable() {
        return isSummarizable;
    }

    /**
     * The mapped value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mappedValue")
    private final String mappedValue;

    public String getMappedValue() {
        return mappedValue;
    }

    /**
     * A flag inidcating whether or not the field is metric key eligible.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMetricKeyEligible")
    private final Boolean isMetricKeyEligible;

    public Boolean getIsMetricKeyEligible() {
        return isMetricKeyEligible;
    }

    /**
     * A flag inidcating whether or not the field is metric value eligible.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMetricValueEligible")
    private final Boolean isMetricValueEligible;

    public Boolean getIsMetricValueEligible() {
        return isMetricValueEligible;
    }

    /**
     * A flag inidcating whether or not the field is range facet eligible.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rangeFacetEligible")
    private final Long rangeFacetEligible;

    public Long getRangeFacetEligible() {
        return rangeFacetEligible;
    }

    /**
     * A flag inidcating whether or not the field is table eligible.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTableEligible")
    private final Boolean isTableEligible;

    public Boolean getIsTableEligible() {
        return isTableEligible;
    }

    /**
     * The field unit type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitType")
    private final String unitType;

    public String getUnitType() {
        return unitType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsField(");
        sb.append("ceeAlias=").append(String.valueOf(this.ceeAlias));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", regularExpression=").append(String.valueOf(this.regularExpression));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", editVersion=").append(String.valueOf(this.editVersion));
        sb.append(", facetPriority=").append(String.valueOf(this.facetPriority));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", isFacetEligible=").append(String.valueOf(this.isFacetEligible));
        sb.append(", isHighCardinality=").append(String.valueOf(this.isHighCardinality));
        sb.append(", isLargeData=").append(String.valueOf(this.isLargeData));
        sb.append(", isMultiValued=").append(String.valueOf(this.isMultiValued));
        sb.append(", isPrimary=").append(String.valueOf(this.isPrimary));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", isSummarizable=").append(String.valueOf(this.isSummarizable));
        sb.append(", mappedValue=").append(String.valueOf(this.mappedValue));
        sb.append(", isMetricKeyEligible=").append(String.valueOf(this.isMetricKeyEligible));
        sb.append(", isMetricValueEligible=").append(String.valueOf(this.isMetricValueEligible));
        sb.append(", rangeFacetEligible=").append(String.valueOf(this.rangeFacetEligible));
        sb.append(", isTableEligible=").append(String.valueOf(this.isTableEligible));
        sb.append(", unitType=").append(String.valueOf(this.unitType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsField)) {
            return false;
        }

        LogAnalyticsField other = (LogAnalyticsField) o;
        return java.util.Objects.equals(this.ceeAlias, other.ceeAlias)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.regularExpression, other.regularExpression)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.editVersion, other.editVersion)
                && java.util.Objects.equals(this.facetPriority, other.facetPriority)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isFacetEligible, other.isFacetEligible)
                && java.util.Objects.equals(this.isHighCardinality, other.isHighCardinality)
                && java.util.Objects.equals(this.isLargeData, other.isLargeData)
                && java.util.Objects.equals(this.isMultiValued, other.isMultiValued)
                && java.util.Objects.equals(this.isPrimary, other.isPrimary)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.isSummarizable, other.isSummarizable)
                && java.util.Objects.equals(this.mappedValue, other.mappedValue)
                && java.util.Objects.equals(this.isMetricKeyEligible, other.isMetricKeyEligible)
                && java.util.Objects.equals(this.isMetricValueEligible, other.isMetricValueEligible)
                && java.util.Objects.equals(this.rangeFacetEligible, other.rangeFacetEligible)
                && java.util.Objects.equals(this.isTableEligible, other.isTableEligible)
                && java.util.Objects.equals(this.unitType, other.unitType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ceeAlias == null ? 43 : this.ceeAlias.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result =
                (result * PRIME)
                        + (this.regularExpression == null ? 43 : this.regularExpression.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.editVersion == null ? 43 : this.editVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.facetPriority == null ? 43 : this.facetPriority.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.isFacetEligible == null ? 43 : this.isFacetEligible.hashCode());
        result =
                (result * PRIME)
                        + (this.isHighCardinality == null ? 43 : this.isHighCardinality.hashCode());
        result = (result * PRIME) + (this.isLargeData == null ? 43 : this.isLargeData.hashCode());
        result =
                (result * PRIME)
                        + (this.isMultiValued == null ? 43 : this.isMultiValued.hashCode());
        result = (result * PRIME) + (this.isPrimary == null ? 43 : this.isPrimary.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.isSummarizable == null ? 43 : this.isSummarizable.hashCode());
        result = (result * PRIME) + (this.mappedValue == null ? 43 : this.mappedValue.hashCode());
        result =
                (result * PRIME)
                        + (this.isMetricKeyEligible == null
                                ? 43
                                : this.isMetricKeyEligible.hashCode());
        result =
                (result * PRIME)
                        + (this.isMetricValueEligible == null
                                ? 43
                                : this.isMetricValueEligible.hashCode());
        result =
                (result * PRIME)
                        + (this.rangeFacetEligible == null
                                ? 43
                                : this.rangeFacetEligible.hashCode());
        result =
                (result * PRIME)
                        + (this.isTableEligible == null ? 43 : this.isTableEligible.hashCode());
        result = (result * PRIME) + (this.unitType == null ? 43 : this.unitType.hashCode());
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
