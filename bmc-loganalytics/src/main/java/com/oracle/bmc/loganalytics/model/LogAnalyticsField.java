/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsField.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsField {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * The name this field is given in the common event expression standard from mitre.org.
     * This is used for reference when exporting content conforming to CEE standard
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ceeAlias")
    String ceeAlias;

    /**
     * The field data type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    String dataType;

    /**
     * The field default regular expression.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regularExpression")
    String regularExpression;

    /**
     * The field description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The field display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The field edit version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    Long editVersion;

    /**
     * The facet priority.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("facetPriority")
    Long facetPriority;

    /**
     * The field internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * A flag inidcating whether or not the facet is elibigle for use.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFacetEligible")
    Boolean isFacetEligible;

    /**
     * A flag inidcating whether or not the cardinality of the field is high.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHighCardinality")
    Boolean isHighCardinality;

    /**
     * A flag inidcating whether or not the field is a large data field.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLargeData")
    Boolean isLargeData;

    /**
     * A flag indicating whether or not the field is multi-valued.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiValued")
    Boolean isMultiValued;

    /**
     * A flag inidcating whether or not this is a primary field.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
    Boolean isPrimary;

    /**
     * The system flag.  A value of false denotes a custom, or user
     * defined object.  A value of true denotes a built in object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    Boolean isSystem;

    /**
     * A flag inidcating whether or not the field can be summarized.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSummarizable")
    Boolean isSummarizable;

    /**
     * The mapped value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mappedValue")
    String mappedValue;

    /**
     * A flag inidcating whether or not the field is metric key eligible.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMetricKeyEligible")
    Boolean isMetricKeyEligible;

    /**
     * A flag inidcating whether or not the field is metric value eligible.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMetricValueEligible")
    Boolean isMetricValueEligible;

    /**
     * A flag inidcating whether or not the field is range facet eligible.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rangeFacetEligible")
    Long rangeFacetEligible;

    /**
     * A flag inidcating whether or not the field is table eligible.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTableEligible")
    Boolean isTableEligible;

    /**
     * The field unit type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitType")
    String unitType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
