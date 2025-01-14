/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Field Details <br>
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
        builder = LogAnalyticsField.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsField
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /**
         * The name this field is given in the common event expression standard from mitre.org. This
         * is used for reference when exporting content conforming to CEE standard
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ceeAlias")
        private String ceeAlias;

        /**
         * The name this field is given in the common event expression standard from mitre.org. This
         * is used for reference when exporting content conforming to CEE standard
         *
         * @param ceeAlias the value to set
         * @return this builder
         */
        public Builder ceeAlias(String ceeAlias) {
            this.ceeAlias = ceeAlias;
            this.__explicitlySet__.add("ceeAlias");
            return this;
        }
        /** The field data type. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        /**
         * The field data type.
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /** The field default regular expression. */
        @com.fasterxml.jackson.annotation.JsonProperty("regularExpression")
        private String regularExpression;

        /**
         * The field default regular expression.
         *
         * @param regularExpression the value to set
         * @return this builder
         */
        public Builder regularExpression(String regularExpression) {
            this.regularExpression = regularExpression;
            this.__explicitlySet__.add("regularExpression");
            return this;
        }
        /** The field description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The field description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The field display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The field display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The field edit version. */
        @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
        private Long editVersion;

        /**
         * The field edit version.
         *
         * @param editVersion the value to set
         * @return this builder
         */
        public Builder editVersion(Long editVersion) {
            this.editVersion = editVersion;
            this.__explicitlySet__.add("editVersion");
            return this;
        }
        /** The facet priority. */
        @com.fasterxml.jackson.annotation.JsonProperty("facetPriority")
        private Long facetPriority;

        /**
         * The facet priority.
         *
         * @param facetPriority the value to set
         * @return this builder
         */
        public Builder facetPriority(Long facetPriority) {
            this.facetPriority = facetPriority;
            this.__explicitlySet__.add("facetPriority");
            return this;
        }
        /** The field internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The field internal name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** A flag inidcating whether or not the facet is elibigle for use. */
        @com.fasterxml.jackson.annotation.JsonProperty("isFacetEligible")
        private Boolean isFacetEligible;

        /**
         * A flag inidcating whether or not the facet is elibigle for use.
         *
         * @param isFacetEligible the value to set
         * @return this builder
         */
        public Builder isFacetEligible(Boolean isFacetEligible) {
            this.isFacetEligible = isFacetEligible;
            this.__explicitlySet__.add("isFacetEligible");
            return this;
        }
        /** A flag inidcating whether or not the cardinality of the field is high. */
        @com.fasterxml.jackson.annotation.JsonProperty("isHighCardinality")
        private Boolean isHighCardinality;

        /**
         * A flag inidcating whether or not the cardinality of the field is high.
         *
         * @param isHighCardinality the value to set
         * @return this builder
         */
        public Builder isHighCardinality(Boolean isHighCardinality) {
            this.isHighCardinality = isHighCardinality;
            this.__explicitlySet__.add("isHighCardinality");
            return this;
        }
        /** A flag inidcating whether or not the field is a large data field. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLargeData")
        private Boolean isLargeData;

        /**
         * A flag inidcating whether or not the field is a large data field.
         *
         * @param isLargeData the value to set
         * @return this builder
         */
        public Builder isLargeData(Boolean isLargeData) {
            this.isLargeData = isLargeData;
            this.__explicitlySet__.add("isLargeData");
            return this;
        }
        /** A flag indicating whether or not the field is multi-valued. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMultiValued")
        private Boolean isMultiValued;

        /**
         * A flag indicating whether or not the field is multi-valued.
         *
         * @param isMultiValued the value to set
         * @return this builder
         */
        public Builder isMultiValued(Boolean isMultiValued) {
            this.isMultiValued = isMultiValued;
            this.__explicitlySet__.add("isMultiValued");
            return this;
        }
        /** A flag inidcating whether or not this is a primary field. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
        private Boolean isPrimary;

        /**
         * A flag inidcating whether or not this is a primary field.
         *
         * @param isPrimary the value to set
         * @return this builder
         */
        public Builder isPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            this.__explicitlySet__.add("isPrimary");
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
        /** A flag inidcating whether or not the field can be summarized. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSummarizable")
        private Boolean isSummarizable;

        /**
         * A flag inidcating whether or not the field can be summarized.
         *
         * @param isSummarizable the value to set
         * @return this builder
         */
        public Builder isSummarizable(Boolean isSummarizable) {
            this.isSummarizable = isSummarizable;
            this.__explicitlySet__.add("isSummarizable");
            return this;
        }
        /** The mapped value. */
        @com.fasterxml.jackson.annotation.JsonProperty("mappedValue")
        private String mappedValue;

        /**
         * The mapped value.
         *
         * @param mappedValue the value to set
         * @return this builder
         */
        public Builder mappedValue(String mappedValue) {
            this.mappedValue = mappedValue;
            this.__explicitlySet__.add("mappedValue");
            return this;
        }
        /** A flag inidcating whether or not the field is metric key eligible. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMetricKeyEligible")
        private Boolean isMetricKeyEligible;

        /**
         * A flag inidcating whether or not the field is metric key eligible.
         *
         * @param isMetricKeyEligible the value to set
         * @return this builder
         */
        public Builder isMetricKeyEligible(Boolean isMetricKeyEligible) {
            this.isMetricKeyEligible = isMetricKeyEligible;
            this.__explicitlySet__.add("isMetricKeyEligible");
            return this;
        }
        /** A flag inidcating whether or not the field is metric value eligible. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMetricValueEligible")
        private Boolean isMetricValueEligible;

        /**
         * A flag inidcating whether or not the field is metric value eligible.
         *
         * @param isMetricValueEligible the value to set
         * @return this builder
         */
        public Builder isMetricValueEligible(Boolean isMetricValueEligible) {
            this.isMetricValueEligible = isMetricValueEligible;
            this.__explicitlySet__.add("isMetricValueEligible");
            return this;
        }
        /** A flag inidcating whether or not the field is range facet eligible. */
        @com.fasterxml.jackson.annotation.JsonProperty("rangeFacetEligible")
        private Long rangeFacetEligible;

        /**
         * A flag inidcating whether or not the field is range facet eligible.
         *
         * @param rangeFacetEligible the value to set
         * @return this builder
         */
        public Builder rangeFacetEligible(Long rangeFacetEligible) {
            this.rangeFacetEligible = rangeFacetEligible;
            this.__explicitlySet__.add("rangeFacetEligible");
            return this;
        }
        /** A flag inidcating whether or not the field is table eligible. */
        @com.fasterxml.jackson.annotation.JsonProperty("isTableEligible")
        private Boolean isTableEligible;

        /**
         * A flag inidcating whether or not the field is table eligible.
         *
         * @param isTableEligible the value to set
         * @return this builder
         */
        public Builder isTableEligible(Boolean isTableEligible) {
            this.isTableEligible = isTableEligible;
            this.__explicitlySet__.add("isTableEligible");
            return this;
        }
        /** The field unit type. */
        @com.fasterxml.jackson.annotation.JsonProperty("unitType")
        private String unitType;

        /**
         * The field unit type.
         *
         * @param unitType the value to set
         * @return this builder
         */
        public Builder unitType(String unitType) {
            this.unitType = unitType;
            this.__explicitlySet__.add("unitType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsField build() {
            LogAnalyticsField model =
                    new LogAnalyticsField(
                            this.ceeAlias,
                            this.dataType,
                            this.regularExpression,
                            this.description,
                            this.displayName,
                            this.editVersion,
                            this.facetPriority,
                            this.name,
                            this.isFacetEligible,
                            this.isHighCardinality,
                            this.isLargeData,
                            this.isMultiValued,
                            this.isPrimary,
                            this.isSystem,
                            this.isSummarizable,
                            this.mappedValue,
                            this.isMetricKeyEligible,
                            this.isMetricValueEligible,
                            this.rangeFacetEligible,
                            this.isTableEligible,
                            this.unitType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsField model) {
            if (model.wasPropertyExplicitlySet("ceeAlias")) {
                this.ceeAlias(model.getCeeAlias());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("regularExpression")) {
                this.regularExpression(model.getRegularExpression());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("editVersion")) {
                this.editVersion(model.getEditVersion());
            }
            if (model.wasPropertyExplicitlySet("facetPriority")) {
                this.facetPriority(model.getFacetPriority());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isFacetEligible")) {
                this.isFacetEligible(model.getIsFacetEligible());
            }
            if (model.wasPropertyExplicitlySet("isHighCardinality")) {
                this.isHighCardinality(model.getIsHighCardinality());
            }
            if (model.wasPropertyExplicitlySet("isLargeData")) {
                this.isLargeData(model.getIsLargeData());
            }
            if (model.wasPropertyExplicitlySet("isMultiValued")) {
                this.isMultiValued(model.getIsMultiValued());
            }
            if (model.wasPropertyExplicitlySet("isPrimary")) {
                this.isPrimary(model.getIsPrimary());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("isSummarizable")) {
                this.isSummarizable(model.getIsSummarizable());
            }
            if (model.wasPropertyExplicitlySet("mappedValue")) {
                this.mappedValue(model.getMappedValue());
            }
            if (model.wasPropertyExplicitlySet("isMetricKeyEligible")) {
                this.isMetricKeyEligible(model.getIsMetricKeyEligible());
            }
            if (model.wasPropertyExplicitlySet("isMetricValueEligible")) {
                this.isMetricValueEligible(model.getIsMetricValueEligible());
            }
            if (model.wasPropertyExplicitlySet("rangeFacetEligible")) {
                this.rangeFacetEligible(model.getRangeFacetEligible());
            }
            if (model.wasPropertyExplicitlySet("isTableEligible")) {
                this.isTableEligible(model.getIsTableEligible());
            }
            if (model.wasPropertyExplicitlySet("unitType")) {
                this.unitType(model.getUnitType());
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
     * The name this field is given in the common event expression standard from mitre.org. This is
     * used for reference when exporting content conforming to CEE standard
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ceeAlias")
    private final String ceeAlias;

    /**
     * The name this field is given in the common event expression standard from mitre.org. This is
     * used for reference when exporting content conforming to CEE standard
     *
     * @return the value
     */
    public String getCeeAlias() {
        return ceeAlias;
    }

    /** The field data type. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

    /**
     * The field data type.
     *
     * @return the value
     */
    public String getDataType() {
        return dataType;
    }

    /** The field default regular expression. */
    @com.fasterxml.jackson.annotation.JsonProperty("regularExpression")
    private final String regularExpression;

    /**
     * The field default regular expression.
     *
     * @return the value
     */
    public String getRegularExpression() {
        return regularExpression;
    }

    /** The field description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The field description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The field display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The field display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The field edit version. */
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    private final Long editVersion;

    /**
     * The field edit version.
     *
     * @return the value
     */
    public Long getEditVersion() {
        return editVersion;
    }

    /** The facet priority. */
    @com.fasterxml.jackson.annotation.JsonProperty("facetPriority")
    private final Long facetPriority;

    /**
     * The facet priority.
     *
     * @return the value
     */
    public Long getFacetPriority() {
        return facetPriority;
    }

    /** The field internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The field internal name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** A flag inidcating whether or not the facet is elibigle for use. */
    @com.fasterxml.jackson.annotation.JsonProperty("isFacetEligible")
    private final Boolean isFacetEligible;

    /**
     * A flag inidcating whether or not the facet is elibigle for use.
     *
     * @return the value
     */
    public Boolean getIsFacetEligible() {
        return isFacetEligible;
    }

    /** A flag inidcating whether or not the cardinality of the field is high. */
    @com.fasterxml.jackson.annotation.JsonProperty("isHighCardinality")
    private final Boolean isHighCardinality;

    /**
     * A flag inidcating whether or not the cardinality of the field is high.
     *
     * @return the value
     */
    public Boolean getIsHighCardinality() {
        return isHighCardinality;
    }

    /** A flag inidcating whether or not the field is a large data field. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLargeData")
    private final Boolean isLargeData;

    /**
     * A flag inidcating whether or not the field is a large data field.
     *
     * @return the value
     */
    public Boolean getIsLargeData() {
        return isLargeData;
    }

    /** A flag indicating whether or not the field is multi-valued. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiValued")
    private final Boolean isMultiValued;

    /**
     * A flag indicating whether or not the field is multi-valued.
     *
     * @return the value
     */
    public Boolean getIsMultiValued() {
        return isMultiValued;
    }

    /** A flag inidcating whether or not this is a primary field. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPrimary")
    private final Boolean isPrimary;

    /**
     * A flag inidcating whether or not this is a primary field.
     *
     * @return the value
     */
    public Boolean getIsPrimary() {
        return isPrimary;
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

    /** A flag inidcating whether or not the field can be summarized. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSummarizable")
    private final Boolean isSummarizable;

    /**
     * A flag inidcating whether or not the field can be summarized.
     *
     * @return the value
     */
    public Boolean getIsSummarizable() {
        return isSummarizable;
    }

    /** The mapped value. */
    @com.fasterxml.jackson.annotation.JsonProperty("mappedValue")
    private final String mappedValue;

    /**
     * The mapped value.
     *
     * @return the value
     */
    public String getMappedValue() {
        return mappedValue;
    }

    /** A flag inidcating whether or not the field is metric key eligible. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMetricKeyEligible")
    private final Boolean isMetricKeyEligible;

    /**
     * A flag inidcating whether or not the field is metric key eligible.
     *
     * @return the value
     */
    public Boolean getIsMetricKeyEligible() {
        return isMetricKeyEligible;
    }

    /** A flag inidcating whether or not the field is metric value eligible. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMetricValueEligible")
    private final Boolean isMetricValueEligible;

    /**
     * A flag inidcating whether or not the field is metric value eligible.
     *
     * @return the value
     */
    public Boolean getIsMetricValueEligible() {
        return isMetricValueEligible;
    }

    /** A flag inidcating whether or not the field is range facet eligible. */
    @com.fasterxml.jackson.annotation.JsonProperty("rangeFacetEligible")
    private final Long rangeFacetEligible;

    /**
     * A flag inidcating whether or not the field is range facet eligible.
     *
     * @return the value
     */
    public Long getRangeFacetEligible() {
        return rangeFacetEligible;
    }

    /** A flag inidcating whether or not the field is table eligible. */
    @com.fasterxml.jackson.annotation.JsonProperty("isTableEligible")
    private final Boolean isTableEligible;

    /**
     * A flag inidcating whether or not the field is table eligible.
     *
     * @return the value
     */
    public Boolean getIsTableEligible() {
        return isTableEligible;
    }

    /** The field unit type. */
    @com.fasterxml.jackson.annotation.JsonProperty("unitType")
    private final String unitType;

    /**
     * The field unit type.
     *
     * @return the value
     */
    public String getUnitType() {
        return unitType;
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
        sb.append("LogAnalyticsField(");
        sb.append("super=").append(super.toString());
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
