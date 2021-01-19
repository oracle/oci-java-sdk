/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSource
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
    builder = LogAnalyticsSource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("eventTypes")
        private java.util.List<EventType> eventTypes;

        public Builder eventTypes(java.util.List<EventType> eventTypes) {
            this.eventTypes = eventTypes;
            this.__explicitlySet__.add("eventTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSource build() {
            LogAnalyticsSource __instance__ =
                    new LogAnalyticsSource(
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
                            timeUpdated,
                            eventTypes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSource o) {
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
                            .timeUpdated(o.getTimeUpdated())
                            .eventTypes(o.getEventTypes());

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
     * alert conditions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditions")
    java.util.List<LogAnalyticsSourceLabelCondition> labelConditions;

    /**
     * association count
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associationCount")
    Integer associationCount;

    /**
     * association entity
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associationEntity")
    java.util.List<LogAnalyticsAssociation> associationEntity;

    /**
     * data filter definitions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataFilterDefinitions")
    java.util.List<LogAnalyticsSourceDataFilter> dataFilterDefinitions;

    /**
     * DB credential
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
    String databaseCredential;

    /**
     * extended field definition
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinitions")
    java.util.List<LogAnalyticsSourceExtendedFieldDefinition> extendedFieldDefinitions;

    /**
     * is for cloud flag
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isForCloud")
    Boolean isForCloud;

    /**
     * labels
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    java.util.List<LogAnalyticsLabelView> labels;

    /**
     * metric definitions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricDefinitions")
    java.util.List<LogAnalyticsMetric> metricDefinitions;

    /**
     * metric source map
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    java.util.List<LogAnalyticsSourceMetric> metrics;

    /**
     * out-of-the-box source parser list
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oobParsers")
    java.util.List<LogAnalyticsParser> oobParsers;

    /**
     * parameters
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    java.util.List<LogAnalyticsParameter> parameters;

    /**
     * pattern count
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patternCount")
    Integer patternCount;

    /**
     * patterns
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patterns")
    java.util.List<LogAnalyticsSourcePattern> patterns;

    /**
     * description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * display name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * source edit version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    Long editVersion;

    /**
     * source functions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functions")
    java.util.List<LogAnalyticsSourceFunction> functions;

    /**
     * source Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    Long sourceId;

    /**
     * source internal name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * is secure content flag
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSecureContent")
    Boolean isSecureContent;

    /**
     * is system flag
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    Boolean isSystem;

    /**
     * parser list
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parsers")
    java.util.List<LogAnalyticsParser> parsers;

    /**
     * rule auto association enabled flag
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoAssociationEnabled")
    Boolean isAutoAssociationEnabled;

    /**
     * rule auto association override
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoAssociationOverride")
    Boolean isAutoAssociationOverride;

    /**
     * rule Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleId")
    Long ruleId;

    /**
     * source type internal name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeName")
    String typeName;

    /**
     * source type name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeDisplayName")
    String typeDisplayName;

    /**
     * source warning configuration
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warningConfig")
    Long warningConfig;

    /**
     * source metadata fields
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadataFields")
    java.util.List<LogAnalyticsSourceMetadataField> metadataFields;

    /**
     * tags
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelDefinitions")
    java.util.List<LogAnalyticsLabelDefinition> labelDefinitions;

    /**
     * Entity types
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypes")
    java.util.List<LogAnalyticsSourceEntityType> entityTypes;

    /**
     * time zone override
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTimezoneOverride")
    Boolean isTimezoneOverride;

    /**
     * source parser list
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userParsers")
    java.util.List<LogAnalyticsParser> userParsers;

    /**
     * timeUpdated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * An array of event types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventTypes")
    java.util.List<EventType> eventTypes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
