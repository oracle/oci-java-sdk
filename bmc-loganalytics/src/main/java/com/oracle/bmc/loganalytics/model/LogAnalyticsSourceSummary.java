/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourceSummary
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
    builder = LogAnalyticsSourceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsSourceSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "labelConditions",
        "associationCount",
        "associationEntity",
        "dataFilterDefinitions",
        "databaseCredential",
        "extendedFieldDefinitions",
        "isForCloud",
        "labels",
        "metricDefinitions",
        "metrics",
        "oobParsers",
        "parameters",
        "patternCount",
        "patterns",
        "description",
        "displayName",
        "editVersion",
        "functions",
        "sourceId",
        "name",
        "isSecureContent",
        "isSystem",
        "parsers",
        "isAutoAssociationEnabled",
        "isAutoAssociationOverride",
        "ruleId",
        "typeName",
        "typeDisplayName",
        "warningConfig",
        "metadataFields",
        "labelDefinitions",
        "entityTypes",
        "isTimezoneOverride",
        "userParsers",
        "timeUpdated"
    })
    public LogAnalyticsSourceSummary(
            java.util.List<LogAnalyticsSourceLabelCondition> labelConditions,
            Integer associationCount,
            java.util.List<LogAnalyticsAssociation> associationEntity,
            java.util.List<LogAnalyticsSourceDataFilter> dataFilterDefinitions,
            String databaseCredential,
            java.util.List<LogAnalyticsSourceExtendedFieldDefinition> extendedFieldDefinitions,
            Boolean isForCloud,
            java.util.List<LogAnalyticsLabelView> labels,
            java.util.List<LogAnalyticsMetric> metricDefinitions,
            java.util.List<LogAnalyticsSourceMetric> metrics,
            java.util.List<LogAnalyticsParser> oobParsers,
            java.util.List<LogAnalyticsParameter> parameters,
            Integer patternCount,
            java.util.List<LogAnalyticsSourcePattern> patterns,
            String description,
            String displayName,
            Long editVersion,
            java.util.List<LogAnalyticsSourceFunction> functions,
            Long sourceId,
            String name,
            Boolean isSecureContent,
            Boolean isSystem,
            java.util.List<LogAnalyticsParser> parsers,
            Boolean isAutoAssociationEnabled,
            Boolean isAutoAssociationOverride,
            Long ruleId,
            String typeName,
            String typeDisplayName,
            Long warningConfig,
            java.util.List<LogAnalyticsSourceMetadataField> metadataFields,
            java.util.List<LogAnalyticsLabelDefinition> labelDefinitions,
            java.util.List<LogAnalyticsSourceEntityType> entityTypes,
            Boolean isTimezoneOverride,
            java.util.List<LogAnalyticsParser> userParsers,
            java.util.Date timeUpdated) {
        super();
        this.labelConditions = labelConditions;
        this.associationCount = associationCount;
        this.associationEntity = associationEntity;
        this.dataFilterDefinitions = dataFilterDefinitions;
        this.databaseCredential = databaseCredential;
        this.extendedFieldDefinitions = extendedFieldDefinitions;
        this.isForCloud = isForCloud;
        this.labels = labels;
        this.metricDefinitions = metricDefinitions;
        this.metrics = metrics;
        this.oobParsers = oobParsers;
        this.parameters = parameters;
        this.patternCount = patternCount;
        this.patterns = patterns;
        this.description = description;
        this.displayName = displayName;
        this.editVersion = editVersion;
        this.functions = functions;
        this.sourceId = sourceId;
        this.name = name;
        this.isSecureContent = isSecureContent;
        this.isSystem = isSystem;
        this.parsers = parsers;
        this.isAutoAssociationEnabled = isAutoAssociationEnabled;
        this.isAutoAssociationOverride = isAutoAssociationOverride;
        this.ruleId = ruleId;
        this.typeName = typeName;
        this.typeDisplayName = typeDisplayName;
        this.warningConfig = warningConfig;
        this.metadataFields = metadataFields;
        this.labelDefinitions = labelDefinitions;
        this.entityTypes = entityTypes;
        this.isTimezoneOverride = isTimezoneOverride;
        this.userParsers = userParsers;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("labelConditions")
        private java.util.List<LogAnalyticsSourceLabelCondition> labelConditions;

        public Builder labelConditions(
                java.util.List<LogAnalyticsSourceLabelCondition> labelConditions) {
            this.labelConditions = labelConditions;
            this.__explicitlySet__.add("labelConditions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("associationCount")
        private Integer associationCount;

        public Builder associationCount(Integer associationCount) {
            this.associationCount = associationCount;
            this.__explicitlySet__.add("associationCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("associationEntity")
        private java.util.List<LogAnalyticsAssociation> associationEntity;

        public Builder associationEntity(
                java.util.List<LogAnalyticsAssociation> associationEntity) {
            this.associationEntity = associationEntity;
            this.__explicitlySet__.add("associationEntity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataFilterDefinitions")
        private java.util.List<LogAnalyticsSourceDataFilter> dataFilterDefinitions;

        public Builder dataFilterDefinitions(
                java.util.List<LogAnalyticsSourceDataFilter> dataFilterDefinitions) {
            this.dataFilterDefinitions = dataFilterDefinitions;
            this.__explicitlySet__.add("dataFilterDefinitions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
        private String databaseCredential;

        public Builder databaseCredential(String databaseCredential) {
            this.databaseCredential = databaseCredential;
            this.__explicitlySet__.add("databaseCredential");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinitions")
        private java.util.List<LogAnalyticsSourceExtendedFieldDefinition> extendedFieldDefinitions;

        public Builder extendedFieldDefinitions(
                java.util.List<LogAnalyticsSourceExtendedFieldDefinition>
                        extendedFieldDefinitions) {
            this.extendedFieldDefinitions = extendedFieldDefinitions;
            this.__explicitlySet__.add("extendedFieldDefinitions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isForCloud")
        private Boolean isForCloud;

        public Builder isForCloud(Boolean isForCloud) {
            this.isForCloud = isForCloud;
            this.__explicitlySet__.add("isForCloud");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<LogAnalyticsLabelView> labels;

        public Builder labels(java.util.List<LogAnalyticsLabelView> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metricDefinitions")
        private java.util.List<LogAnalyticsMetric> metricDefinitions;

        public Builder metricDefinitions(java.util.List<LogAnalyticsMetric> metricDefinitions) {
            this.metricDefinitions = metricDefinitions;
            this.__explicitlySet__.add("metricDefinitions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<LogAnalyticsSourceMetric> metrics;

        public Builder metrics(java.util.List<LogAnalyticsSourceMetric> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oobParsers")
        private java.util.List<LogAnalyticsParser> oobParsers;

        public Builder oobParsers(java.util.List<LogAnalyticsParser> oobParsers) {
            this.oobParsers = oobParsers;
            this.__explicitlySet__.add("oobParsers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<LogAnalyticsParameter> parameters;

        public Builder parameters(java.util.List<LogAnalyticsParameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patternCount")
        private Integer patternCount;

        public Builder patternCount(Integer patternCount) {
            this.patternCount = patternCount;
            this.__explicitlySet__.add("patternCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patterns")
        private java.util.List<LogAnalyticsSourcePattern> patterns;

        public Builder patterns(java.util.List<LogAnalyticsSourcePattern> patterns) {
            this.patterns = patterns;
            this.__explicitlySet__.add("patterns");
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

        @com.fasterxml.jackson.annotation.JsonProperty("functions")
        private java.util.List<LogAnalyticsSourceFunction> functions;

        public Builder functions(java.util.List<LogAnalyticsSourceFunction> functions) {
            this.functions = functions;
            this.__explicitlySet__.add("functions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSecureContent")
        private Boolean isSecureContent;

        public Builder isSecureContent(Boolean isSecureContent) {
            this.isSecureContent = isSecureContent;
            this.__explicitlySet__.add("isSecureContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parsers")
        private java.util.List<LogAnalyticsParser> parsers;

        public Builder parsers(java.util.List<LogAnalyticsParser> parsers) {
            this.parsers = parsers;
            this.__explicitlySet__.add("parsers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoAssociationEnabled")
        private Boolean isAutoAssociationEnabled;

        public Builder isAutoAssociationEnabled(Boolean isAutoAssociationEnabled) {
            this.isAutoAssociationEnabled = isAutoAssociationEnabled;
            this.__explicitlySet__.add("isAutoAssociationEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoAssociationOverride")
        private Boolean isAutoAssociationOverride;

        public Builder isAutoAssociationOverride(Boolean isAutoAssociationOverride) {
            this.isAutoAssociationOverride = isAutoAssociationOverride;
            this.__explicitlySet__.add("isAutoAssociationOverride");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ruleId")
        private Long ruleId;

        public Builder ruleId(Long ruleId) {
            this.ruleId = ruleId;
            this.__explicitlySet__.add("ruleId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("typeName")
        private String typeName;

        public Builder typeName(String typeName) {
            this.typeName = typeName;
            this.__explicitlySet__.add("typeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("typeDisplayName")
        private String typeDisplayName;

        public Builder typeDisplayName(String typeDisplayName) {
            this.typeDisplayName = typeDisplayName;
            this.__explicitlySet__.add("typeDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("warningConfig")
        private Long warningConfig;

        public Builder warningConfig(Long warningConfig) {
            this.warningConfig = warningConfig;
            this.__explicitlySet__.add("warningConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadataFields")
        private java.util.List<LogAnalyticsSourceMetadataField> metadataFields;

        public Builder metadataFields(
                java.util.List<LogAnalyticsSourceMetadataField> metadataFields) {
            this.metadataFields = metadataFields;
            this.__explicitlySet__.add("metadataFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labelDefinitions")
        private java.util.List<LogAnalyticsLabelDefinition> labelDefinitions;

        public Builder labelDefinitions(
                java.util.List<LogAnalyticsLabelDefinition> labelDefinitions) {
            this.labelDefinitions = labelDefinitions;
            this.__explicitlySet__.add("labelDefinitions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityTypes")
        private java.util.List<LogAnalyticsSourceEntityType> entityTypes;

        public Builder entityTypes(java.util.List<LogAnalyticsSourceEntityType> entityTypes) {
            this.entityTypes = entityTypes;
            this.__explicitlySet__.add("entityTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTimezoneOverride")
        private Boolean isTimezoneOverride;

        public Builder isTimezoneOverride(Boolean isTimezoneOverride) {
            this.isTimezoneOverride = isTimezoneOverride;
            this.__explicitlySet__.add("isTimezoneOverride");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userParsers")
        private java.util.List<LogAnalyticsParser> userParsers;

        public Builder userParsers(java.util.List<LogAnalyticsParser> userParsers) {
            this.userParsers = userParsers;
            this.__explicitlySet__.add("userParsers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourceSummary build() {
            LogAnalyticsSourceSummary __instance__ =
                    new LogAnalyticsSourceSummary(
                            labelConditions,
                            associationCount,
                            associationEntity,
                            dataFilterDefinitions,
                            databaseCredential,
                            extendedFieldDefinitions,
                            isForCloud,
                            labels,
                            metricDefinitions,
                            metrics,
                            oobParsers,
                            parameters,
                            patternCount,
                            patterns,
                            description,
                            displayName,
                            editVersion,
                            functions,
                            sourceId,
                            name,
                            isSecureContent,
                            isSystem,
                            parsers,
                            isAutoAssociationEnabled,
                            isAutoAssociationOverride,
                            ruleId,
                            typeName,
                            typeDisplayName,
                            warningConfig,
                            metadataFields,
                            labelDefinitions,
                            entityTypes,
                            isTimezoneOverride,
                            userParsers,
                            timeUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourceSummary o) {
            Builder copiedBuilder =
                    labelConditions(o.getLabelConditions())
                            .associationCount(o.getAssociationCount())
                            .associationEntity(o.getAssociationEntity())
                            .dataFilterDefinitions(o.getDataFilterDefinitions())
                            .databaseCredential(o.getDatabaseCredential())
                            .extendedFieldDefinitions(o.getExtendedFieldDefinitions())
                            .isForCloud(o.getIsForCloud())
                            .labels(o.getLabels())
                            .metricDefinitions(o.getMetricDefinitions())
                            .metrics(o.getMetrics())
                            .oobParsers(o.getOobParsers())
                            .parameters(o.getParameters())
                            .patternCount(o.getPatternCount())
                            .patterns(o.getPatterns())
                            .description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .editVersion(o.getEditVersion())
                            .functions(o.getFunctions())
                            .sourceId(o.getSourceId())
                            .name(o.getName())
                            .isSecureContent(o.getIsSecureContent())
                            .isSystem(o.getIsSystem())
                            .parsers(o.getParsers())
                            .isAutoAssociationEnabled(o.getIsAutoAssociationEnabled())
                            .isAutoAssociationOverride(o.getIsAutoAssociationOverride())
                            .ruleId(o.getRuleId())
                            .typeName(o.getTypeName())
                            .typeDisplayName(o.getTypeDisplayName())
                            .warningConfig(o.getWarningConfig())
                            .metadataFields(o.getMetadataFields())
                            .labelDefinitions(o.getLabelDefinitions())
                            .entityTypes(o.getEntityTypes())
                            .isTimezoneOverride(o.getIsTimezoneOverride())
                            .userParsers(o.getUserParsers())
                            .timeUpdated(o.getTimeUpdated());

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
     * The label alert conditions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditions")
    private final java.util.List<LogAnalyticsSourceLabelCondition> labelConditions;

    public java.util.List<LogAnalyticsSourceLabelCondition> getLabelConditions() {
        return labelConditions;
    }

    /**
     * The association count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associationCount")
    private final Integer associationCount;

    public Integer getAssociationCount() {
        return associationCount;
    }

    /**
     * The association entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associationEntity")
    private final java.util.List<LogAnalyticsAssociation> associationEntity;

    public java.util.List<LogAnalyticsAssociation> getAssociationEntity() {
        return associationEntity;
    }

    /**
     * The data filter definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataFilterDefinitions")
    private final java.util.List<LogAnalyticsSourceDataFilter> dataFilterDefinitions;

    public java.util.List<LogAnalyticsSourceDataFilter> getDataFilterDefinitions() {
        return dataFilterDefinitions;
    }

    /**
     * The database credential.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
    private final String databaseCredential;

    public String getDatabaseCredential() {
        return databaseCredential;
    }

    /**
     * The extended field definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinitions")
    private final java.util.List<LogAnalyticsSourceExtendedFieldDefinition>
            extendedFieldDefinitions;

    public java.util.List<LogAnalyticsSourceExtendedFieldDefinition> getExtendedFieldDefinitions() {
        return extendedFieldDefinitions;
    }

    /**
     * A flag indicating whether or not this is a cloud source.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isForCloud")
    private final Boolean isForCloud;

    public Boolean getIsForCloud() {
        return isForCloud;
    }

    /**
     * The labels associated with this source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<LogAnalyticsLabelView> labels;

    public java.util.List<LogAnalyticsLabelView> getLabels() {
        return labels;
    }

    /**
     * The metric definitions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricDefinitions")
    private final java.util.List<LogAnalyticsMetric> metricDefinitions;

    public java.util.List<LogAnalyticsMetric> getMetricDefinitions() {
        return metricDefinitions;
    }

    /**
     * The metric source map.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<LogAnalyticsSourceMetric> metrics;

    public java.util.List<LogAnalyticsSourceMetric> getMetrics() {
        return metrics;
    }

    /**
     * The built in source parser.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oobParsers")
    private final java.util.List<LogAnalyticsParser> oobParsers;

    public java.util.List<LogAnalyticsParser> getOobParsers() {
        return oobParsers;
    }

    /**
     * The parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<LogAnalyticsParameter> parameters;

    public java.util.List<LogAnalyticsParameter> getParameters() {
        return parameters;
    }

    /**
     * The pattern count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patternCount")
    private final Integer patternCount;

    public Integer getPatternCount() {
        return patternCount;
    }

    /**
     * The source patterns.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patterns")
    private final java.util.List<LogAnalyticsSourcePattern> patterns;

    public java.util.List<LogAnalyticsSourcePattern> getPatterns() {
        return patterns;
    }

    /**
     * The source description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The source display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The source edit version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    private final Long editVersion;

    public Long getEditVersion() {
        return editVersion;
    }

    /**
     * The source functions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functions")
    private final java.util.List<LogAnalyticsSourceFunction> functions;

    public java.util.List<LogAnalyticsSourceFunction> getFunctions() {
        return functions;
    }

    /**
     * The source unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final Long sourceId;

    public Long getSourceId() {
        return sourceId;
    }

    /**
     * The source internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * A flag indicating whether or not the source content is secure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSecureContent")
    private final Boolean isSecureContent;

    public Boolean getIsSecureContent() {
        return isSecureContent;
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
     * The list of parsers associated with this source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parsers")
    private final java.util.List<LogAnalyticsParser> parsers;

    public java.util.List<LogAnalyticsParser> getParsers() {
        return parsers;
    }

    /**
     * A flag indicating whether or not the source is marked for auto-association.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoAssociationEnabled")
    private final Boolean isAutoAssociationEnabled;

    public Boolean getIsAutoAssociationEnabled() {
        return isAutoAssociationEnabled;
    }

    /**
     * A flag indicating whether or not the auto-association state should be overriden.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoAssociationOverride")
    private final Boolean isAutoAssociationOverride;

    public Boolean getIsAutoAssociationOverride() {
        return isAutoAssociationOverride;
    }

    /**
     * The rule unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleId")
    private final Long ruleId;

    public Long getRuleId() {
        return ruleId;
    }

    /**
     * The source type internal name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeName")
    private final String typeName;

    public String getTypeName() {
        return typeName;
    }

    /**
     * The source type name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeDisplayName")
    private final String typeDisplayName;

    public String getTypeDisplayName() {
        return typeDisplayName;
    }

    /**
     * The source warning configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warningConfig")
    private final Long warningConfig;

    public Long getWarningConfig() {
        return warningConfig;
    }

    /**
     * The source metadata fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadataFields")
    private final java.util.List<LogAnalyticsSourceMetadataField> metadataFields;

    public java.util.List<LogAnalyticsSourceMetadataField> getMetadataFields() {
        return metadataFields;
    }

    /**
     * The label definitions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelDefinitions")
    private final java.util.List<LogAnalyticsLabelDefinition> labelDefinitions;

    public java.util.List<LogAnalyticsLabelDefinition> getLabelDefinitions() {
        return labelDefinitions;
    }

    /**
     * The entity types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypes")
    private final java.util.List<LogAnalyticsSourceEntityType> entityTypes;

    public java.util.List<LogAnalyticsSourceEntityType> getEntityTypes() {
        return entityTypes;
    }

    /**
     * A flag indicating whether or not the source has a time zone override.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTimezoneOverride")
    private final Boolean isTimezoneOverride;

    public Boolean getIsTimezoneOverride() {
        return isTimezoneOverride;
    }

    /**
     * An array of custom parsers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userParsers")
    private final java.util.List<LogAnalyticsParser> userParsers;

    public java.util.List<LogAnalyticsParser> getUserParsers() {
        return userParsers;
    }

    /**
     * The last updated date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsSourceSummary(");
        sb.append("labelConditions=").append(String.valueOf(this.labelConditions));
        sb.append(", associationCount=").append(String.valueOf(this.associationCount));
        sb.append(", associationEntity=").append(String.valueOf(this.associationEntity));
        sb.append(", dataFilterDefinitions=").append(String.valueOf(this.dataFilterDefinitions));
        sb.append(", databaseCredential=").append(String.valueOf(this.databaseCredential));
        sb.append(", extendedFieldDefinitions=")
                .append(String.valueOf(this.extendedFieldDefinitions));
        sb.append(", isForCloud=").append(String.valueOf(this.isForCloud));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(", metricDefinitions=").append(String.valueOf(this.metricDefinitions));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(", oobParsers=").append(String.valueOf(this.oobParsers));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", patternCount=").append(String.valueOf(this.patternCount));
        sb.append(", patterns=").append(String.valueOf(this.patterns));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", editVersion=").append(String.valueOf(this.editVersion));
        sb.append(", functions=").append(String.valueOf(this.functions));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", isSecureContent=").append(String.valueOf(this.isSecureContent));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", parsers=").append(String.valueOf(this.parsers));
        sb.append(", isAutoAssociationEnabled=")
                .append(String.valueOf(this.isAutoAssociationEnabled));
        sb.append(", isAutoAssociationOverride=")
                .append(String.valueOf(this.isAutoAssociationOverride));
        sb.append(", ruleId=").append(String.valueOf(this.ruleId));
        sb.append(", typeName=").append(String.valueOf(this.typeName));
        sb.append(", typeDisplayName=").append(String.valueOf(this.typeDisplayName));
        sb.append(", warningConfig=").append(String.valueOf(this.warningConfig));
        sb.append(", metadataFields=").append(String.valueOf(this.metadataFields));
        sb.append(", labelDefinitions=").append(String.valueOf(this.labelDefinitions));
        sb.append(", entityTypes=").append(String.valueOf(this.entityTypes));
        sb.append(", isTimezoneOverride=").append(String.valueOf(this.isTimezoneOverride));
        sb.append(", userParsers=").append(String.valueOf(this.userParsers));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsSourceSummary)) {
            return false;
        }

        LogAnalyticsSourceSummary other = (LogAnalyticsSourceSummary) o;
        return java.util.Objects.equals(this.labelConditions, other.labelConditions)
                && java.util.Objects.equals(this.associationCount, other.associationCount)
                && java.util.Objects.equals(this.associationEntity, other.associationEntity)
                && java.util.Objects.equals(this.dataFilterDefinitions, other.dataFilterDefinitions)
                && java.util.Objects.equals(this.databaseCredential, other.databaseCredential)
                && java.util.Objects.equals(
                        this.extendedFieldDefinitions, other.extendedFieldDefinitions)
                && java.util.Objects.equals(this.isForCloud, other.isForCloud)
                && java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(this.metricDefinitions, other.metricDefinitions)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && java.util.Objects.equals(this.oobParsers, other.oobParsers)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.patternCount, other.patternCount)
                && java.util.Objects.equals(this.patterns, other.patterns)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.editVersion, other.editVersion)
                && java.util.Objects.equals(this.functions, other.functions)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isSecureContent, other.isSecureContent)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.parsers, other.parsers)
                && java.util.Objects.equals(
                        this.isAutoAssociationEnabled, other.isAutoAssociationEnabled)
                && java.util.Objects.equals(
                        this.isAutoAssociationOverride, other.isAutoAssociationOverride)
                && java.util.Objects.equals(this.ruleId, other.ruleId)
                && java.util.Objects.equals(this.typeName, other.typeName)
                && java.util.Objects.equals(this.typeDisplayName, other.typeDisplayName)
                && java.util.Objects.equals(this.warningConfig, other.warningConfig)
                && java.util.Objects.equals(this.metadataFields, other.metadataFields)
                && java.util.Objects.equals(this.labelDefinitions, other.labelDefinitions)
                && java.util.Objects.equals(this.entityTypes, other.entityTypes)
                && java.util.Objects.equals(this.isTimezoneOverride, other.isTimezoneOverride)
                && java.util.Objects.equals(this.userParsers, other.userParsers)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.labelConditions == null ? 43 : this.labelConditions.hashCode());
        result =
                (result * PRIME)
                        + (this.associationCount == null ? 43 : this.associationCount.hashCode());
        result =
                (result * PRIME)
                        + (this.associationEntity == null ? 43 : this.associationEntity.hashCode());
        result =
                (result * PRIME)
                        + (this.dataFilterDefinitions == null
                                ? 43
                                : this.dataFilterDefinitions.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseCredential == null
                                ? 43
                                : this.databaseCredential.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedFieldDefinitions == null
                                ? 43
                                : this.extendedFieldDefinitions.hashCode());
        result = (result * PRIME) + (this.isForCloud == null ? 43 : this.isForCloud.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        result =
                (result * PRIME)
                        + (this.metricDefinitions == null ? 43 : this.metricDefinitions.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + (this.oobParsers == null ? 43 : this.oobParsers.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.patternCount == null ? 43 : this.patternCount.hashCode());
        result = (result * PRIME) + (this.patterns == null ? 43 : this.patterns.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.editVersion == null ? 43 : this.editVersion.hashCode());
        result = (result * PRIME) + (this.functions == null ? 43 : this.functions.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.isSecureContent == null ? 43 : this.isSecureContent.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result = (result * PRIME) + (this.parsers == null ? 43 : this.parsers.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoAssociationEnabled == null
                                ? 43
                                : this.isAutoAssociationEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoAssociationOverride == null
                                ? 43
                                : this.isAutoAssociationOverride.hashCode());
        result = (result * PRIME) + (this.ruleId == null ? 43 : this.ruleId.hashCode());
        result = (result * PRIME) + (this.typeName == null ? 43 : this.typeName.hashCode());
        result =
                (result * PRIME)
                        + (this.typeDisplayName == null ? 43 : this.typeDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.warningConfig == null ? 43 : this.warningConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.metadataFields == null ? 43 : this.metadataFields.hashCode());
        result =
                (result * PRIME)
                        + (this.labelDefinitions == null ? 43 : this.labelDefinitions.hashCode());
        result = (result * PRIME) + (this.entityTypes == null ? 43 : this.entityTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.isTimezoneOverride == null
                                ? 43
                                : this.isTimezoneOverride.hashCode());
        result = (result * PRIME) + (this.userParsers == null ? 43 : this.userParsers.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
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
