/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsSourceSummary <br>
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
        builder = LogAnalyticsSourceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsSourceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The label alert conditions. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelConditions")
        private java.util.List<LogAnalyticsSourceLabelCondition> labelConditions;

        /**
         * The label alert conditions.
         *
         * @param labelConditions the value to set
         * @return this builder
         */
        public Builder labelConditions(
                java.util.List<LogAnalyticsSourceLabelCondition> labelConditions) {
            this.labelConditions = labelConditions;
            this.__explicitlySet__.add("labelConditions");
            return this;
        }
        /** The association count. */
        @com.fasterxml.jackson.annotation.JsonProperty("associationCount")
        private Integer associationCount;

        /**
         * The association count.
         *
         * @param associationCount the value to set
         * @return this builder
         */
        public Builder associationCount(Integer associationCount) {
            this.associationCount = associationCount;
            this.__explicitlySet__.add("associationCount");
            return this;
        }
        /** The association entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("associationEntity")
        private java.util.List<LogAnalyticsAssociation> associationEntity;

        /**
         * The association entity.
         *
         * @param associationEntity the value to set
         * @return this builder
         */
        public Builder associationEntity(
                java.util.List<LogAnalyticsAssociation> associationEntity) {
            this.associationEntity = associationEntity;
            this.__explicitlySet__.add("associationEntity");
            return this;
        }
        /** The data filter definition. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataFilterDefinitions")
        private java.util.List<LogAnalyticsSourceDataFilter> dataFilterDefinitions;

        /**
         * The data filter definition.
         *
         * @param dataFilterDefinitions the value to set
         * @return this builder
         */
        public Builder dataFilterDefinitions(
                java.util.List<LogAnalyticsSourceDataFilter> dataFilterDefinitions) {
            this.dataFilterDefinitions = dataFilterDefinitions;
            this.__explicitlySet__.add("dataFilterDefinitions");
            return this;
        }
        /** The database credential. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
        private String databaseCredential;

        /**
         * The database credential.
         *
         * @param databaseCredential the value to set
         * @return this builder
         */
        public Builder databaseCredential(String databaseCredential) {
            this.databaseCredential = databaseCredential;
            this.__explicitlySet__.add("databaseCredential");
            return this;
        }
        /** The extended field definition. */
        @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinitions")
        private java.util.List<LogAnalyticsSourceExtendedFieldDefinition> extendedFieldDefinitions;

        /**
         * The extended field definition.
         *
         * @param extendedFieldDefinitions the value to set
         * @return this builder
         */
        public Builder extendedFieldDefinitions(
                java.util.List<LogAnalyticsSourceExtendedFieldDefinition>
                        extendedFieldDefinitions) {
            this.extendedFieldDefinitions = extendedFieldDefinitions;
            this.__explicitlySet__.add("extendedFieldDefinitions");
            return this;
        }
        /** A flag indicating whether or not this is a cloud source. */
        @com.fasterxml.jackson.annotation.JsonProperty("isForCloud")
        private Boolean isForCloud;

        /**
         * A flag indicating whether or not this is a cloud source.
         *
         * @param isForCloud the value to set
         * @return this builder
         */
        public Builder isForCloud(Boolean isForCloud) {
            this.isForCloud = isForCloud;
            this.__explicitlySet__.add("isForCloud");
            return this;
        }
        /** The labels associated with this source. */
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<LogAnalyticsLabelView> labels;

        /**
         * The labels associated with this source.
         *
         * @param labels the value to set
         * @return this builder
         */
        public Builder labels(java.util.List<LogAnalyticsLabelView> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }
        /** The metric definitions. */
        @com.fasterxml.jackson.annotation.JsonProperty("metricDefinitions")
        private java.util.List<LogAnalyticsMetric> metricDefinitions;

        /**
         * The metric definitions.
         *
         * @param metricDefinitions the value to set
         * @return this builder
         */
        public Builder metricDefinitions(java.util.List<LogAnalyticsMetric> metricDefinitions) {
            this.metricDefinitions = metricDefinitions;
            this.__explicitlySet__.add("metricDefinitions");
            return this;
        }
        /** The metric source map. */
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<LogAnalyticsSourceMetric> metrics;

        /**
         * The metric source map.
         *
         * @param metrics the value to set
         * @return this builder
         */
        public Builder metrics(java.util.List<LogAnalyticsSourceMetric> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }
        /** The built in source parser. */
        @com.fasterxml.jackson.annotation.JsonProperty("oobParsers")
        private java.util.List<LogAnalyticsParser> oobParsers;

        /**
         * The built in source parser.
         *
         * @param oobParsers the value to set
         * @return this builder
         */
        public Builder oobParsers(java.util.List<LogAnalyticsParser> oobParsers) {
            this.oobParsers = oobParsers;
            this.__explicitlySet__.add("oobParsers");
            return this;
        }
        /** The parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<LogAnalyticsParameter> parameters;

        /**
         * The parameter.
         *
         * @param parameters the value to set
         * @return this builder
         */
        public Builder parameters(java.util.List<LogAnalyticsParameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
        /** The pattern count. */
        @com.fasterxml.jackson.annotation.JsonProperty("patternCount")
        private Integer patternCount;

        /**
         * The pattern count.
         *
         * @param patternCount the value to set
         * @return this builder
         */
        public Builder patternCount(Integer patternCount) {
            this.patternCount = patternCount;
            this.__explicitlySet__.add("patternCount");
            return this;
        }
        /** The source patterns. */
        @com.fasterxml.jackson.annotation.JsonProperty("patterns")
        private java.util.List<LogAnalyticsSourcePattern> patterns;

        /**
         * The source patterns.
         *
         * @param patterns the value to set
         * @return this builder
         */
        public Builder patterns(java.util.List<LogAnalyticsSourcePattern> patterns) {
            this.patterns = patterns;
            this.__explicitlySet__.add("patterns");
            return this;
        }
        /** The source description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The source description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The source display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The source display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The source edit version. */
        @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
        private Long editVersion;

        /**
         * The source edit version.
         *
         * @param editVersion the value to set
         * @return this builder
         */
        public Builder editVersion(Long editVersion) {
            this.editVersion = editVersion;
            this.__explicitlySet__.add("editVersion");
            return this;
        }
        /** The source functions. */
        @com.fasterxml.jackson.annotation.JsonProperty("functions")
        private java.util.List<LogAnalyticsSourceFunction> functions;

        /**
         * The source functions.
         *
         * @param functions the value to set
         * @return this builder
         */
        public Builder functions(java.util.List<LogAnalyticsSourceFunction> functions) {
            this.functions = functions;
            this.__explicitlySet__.add("functions");
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
        /** The source internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The source internal name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** A flag indicating whether or not the source content is secure. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSecureContent")
        private Boolean isSecureContent;

        /**
         * A flag indicating whether or not the source content is secure.
         *
         * @param isSecureContent the value to set
         * @return this builder
         */
        public Builder isSecureContent(Boolean isSecureContent) {
            this.isSecureContent = isSecureContent;
            this.__explicitlySet__.add("isSecureContent");
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
        /** The list of parsers associated with this source. */
        @com.fasterxml.jackson.annotation.JsonProperty("parsers")
        private java.util.List<LogAnalyticsParser> parsers;

        /**
         * The list of parsers associated with this source.
         *
         * @param parsers the value to set
         * @return this builder
         */
        public Builder parsers(java.util.List<LogAnalyticsParser> parsers) {
            this.parsers = parsers;
            this.__explicitlySet__.add("parsers");
            return this;
        }
        /** A flag indicating whether or not the source is marked for auto-association. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoAssociationEnabled")
        private Boolean isAutoAssociationEnabled;

        /**
         * A flag indicating whether or not the source is marked for auto-association.
         *
         * @param isAutoAssociationEnabled the value to set
         * @return this builder
         */
        public Builder isAutoAssociationEnabled(Boolean isAutoAssociationEnabled) {
            this.isAutoAssociationEnabled = isAutoAssociationEnabled;
            this.__explicitlySet__.add("isAutoAssociationEnabled");
            return this;
        }
        /** A flag indicating whether or not the auto-association state should be overriden. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoAssociationOverride")
        private Boolean isAutoAssociationOverride;

        /**
         * A flag indicating whether or not the auto-association state should be overriden.
         *
         * @param isAutoAssociationOverride the value to set
         * @return this builder
         */
        public Builder isAutoAssociationOverride(Boolean isAutoAssociationOverride) {
            this.isAutoAssociationOverride = isAutoAssociationOverride;
            this.__explicitlySet__.add("isAutoAssociationOverride");
            return this;
        }
        /** The rule unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("ruleId")
        private Long ruleId;

        /**
         * The rule unique identifier.
         *
         * @param ruleId the value to set
         * @return this builder
         */
        public Builder ruleId(Long ruleId) {
            this.ruleId = ruleId;
            this.__explicitlySet__.add("ruleId");
            return this;
        }
        /** The source type internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("typeName")
        private String typeName;

        /**
         * The source type internal name.
         *
         * @param typeName the value to set
         * @return this builder
         */
        public Builder typeName(String typeName) {
            this.typeName = typeName;
            this.__explicitlySet__.add("typeName");
            return this;
        }
        /** The source type name. */
        @com.fasterxml.jackson.annotation.JsonProperty("typeDisplayName")
        private String typeDisplayName;

        /**
         * The source type name.
         *
         * @param typeDisplayName the value to set
         * @return this builder
         */
        public Builder typeDisplayName(String typeDisplayName) {
            this.typeDisplayName = typeDisplayName;
            this.__explicitlySet__.add("typeDisplayName");
            return this;
        }
        /** The source warning configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("warningConfig")
        private Long warningConfig;

        /**
         * The source warning configuration.
         *
         * @param warningConfig the value to set
         * @return this builder
         */
        public Builder warningConfig(Long warningConfig) {
            this.warningConfig = warningConfig;
            this.__explicitlySet__.add("warningConfig");
            return this;
        }
        /** The source metadata fields. */
        @com.fasterxml.jackson.annotation.JsonProperty("metadataFields")
        private java.util.List<LogAnalyticsSourceMetadataField> metadataFields;

        /**
         * The source metadata fields.
         *
         * @param metadataFields the value to set
         * @return this builder
         */
        public Builder metadataFields(
                java.util.List<LogAnalyticsSourceMetadataField> metadataFields) {
            this.metadataFields = metadataFields;
            this.__explicitlySet__.add("metadataFields");
            return this;
        }
        /** The label definitions. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelDefinitions")
        private java.util.List<LogAnalyticsLabelDefinition> labelDefinitions;

        /**
         * The label definitions.
         *
         * @param labelDefinitions the value to set
         * @return this builder
         */
        public Builder labelDefinitions(
                java.util.List<LogAnalyticsLabelDefinition> labelDefinitions) {
            this.labelDefinitions = labelDefinitions;
            this.__explicitlySet__.add("labelDefinitions");
            return this;
        }
        /** The entity types. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityTypes")
        private java.util.List<LogAnalyticsSourceEntityType> entityTypes;

        /**
         * The entity types.
         *
         * @param entityTypes the value to set
         * @return this builder
         */
        public Builder entityTypes(java.util.List<LogAnalyticsSourceEntityType> entityTypes) {
            this.entityTypes = entityTypes;
            this.__explicitlySet__.add("entityTypes");
            return this;
        }
        /** A flag indicating whether or not the source has a time zone override. */
        @com.fasterxml.jackson.annotation.JsonProperty("isTimezoneOverride")
        private Boolean isTimezoneOverride;

        /**
         * A flag indicating whether or not the source has a time zone override.
         *
         * @param isTimezoneOverride the value to set
         * @return this builder
         */
        public Builder isTimezoneOverride(Boolean isTimezoneOverride) {
            this.isTimezoneOverride = isTimezoneOverride;
            this.__explicitlySet__.add("isTimezoneOverride");
            return this;
        }
        /** An array of custom parsers. */
        @com.fasterxml.jackson.annotation.JsonProperty("userParsers")
        private java.util.List<LogAnalyticsParser> userParsers;

        /**
         * An array of custom parsers.
         *
         * @param userParsers the value to set
         * @return this builder
         */
        public Builder userParsers(java.util.List<LogAnalyticsParser> userParsers) {
            this.userParsers = userParsers;
            this.__explicitlySet__.add("userParsers");
            return this;
        }
        /** The last updated date. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last updated date.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsSourceSummary build() {
            LogAnalyticsSourceSummary model =
                    new LogAnalyticsSourceSummary(
                            this.labelConditions,
                            this.associationCount,
                            this.associationEntity,
                            this.dataFilterDefinitions,
                            this.databaseCredential,
                            this.extendedFieldDefinitions,
                            this.isForCloud,
                            this.labels,
                            this.metricDefinitions,
                            this.metrics,
                            this.oobParsers,
                            this.parameters,
                            this.patternCount,
                            this.patterns,
                            this.description,
                            this.displayName,
                            this.editVersion,
                            this.functions,
                            this.sourceId,
                            this.name,
                            this.isSecureContent,
                            this.isSystem,
                            this.parsers,
                            this.isAutoAssociationEnabled,
                            this.isAutoAssociationOverride,
                            this.ruleId,
                            this.typeName,
                            this.typeDisplayName,
                            this.warningConfig,
                            this.metadataFields,
                            this.labelDefinitions,
                            this.entityTypes,
                            this.isTimezoneOverride,
                            this.userParsers,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsSourceSummary model) {
            if (model.wasPropertyExplicitlySet("labelConditions")) {
                this.labelConditions(model.getLabelConditions());
            }
            if (model.wasPropertyExplicitlySet("associationCount")) {
                this.associationCount(model.getAssociationCount());
            }
            if (model.wasPropertyExplicitlySet("associationEntity")) {
                this.associationEntity(model.getAssociationEntity());
            }
            if (model.wasPropertyExplicitlySet("dataFilterDefinitions")) {
                this.dataFilterDefinitions(model.getDataFilterDefinitions());
            }
            if (model.wasPropertyExplicitlySet("databaseCredential")) {
                this.databaseCredential(model.getDatabaseCredential());
            }
            if (model.wasPropertyExplicitlySet("extendedFieldDefinitions")) {
                this.extendedFieldDefinitions(model.getExtendedFieldDefinitions());
            }
            if (model.wasPropertyExplicitlySet("isForCloud")) {
                this.isForCloud(model.getIsForCloud());
            }
            if (model.wasPropertyExplicitlySet("labels")) {
                this.labels(model.getLabels());
            }
            if (model.wasPropertyExplicitlySet("metricDefinitions")) {
                this.metricDefinitions(model.getMetricDefinitions());
            }
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
            }
            if (model.wasPropertyExplicitlySet("oobParsers")) {
                this.oobParsers(model.getOobParsers());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("patternCount")) {
                this.patternCount(model.getPatternCount());
            }
            if (model.wasPropertyExplicitlySet("patterns")) {
                this.patterns(model.getPatterns());
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
            if (model.wasPropertyExplicitlySet("functions")) {
                this.functions(model.getFunctions());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isSecureContent")) {
                this.isSecureContent(model.getIsSecureContent());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("parsers")) {
                this.parsers(model.getParsers());
            }
            if (model.wasPropertyExplicitlySet("isAutoAssociationEnabled")) {
                this.isAutoAssociationEnabled(model.getIsAutoAssociationEnabled());
            }
            if (model.wasPropertyExplicitlySet("isAutoAssociationOverride")) {
                this.isAutoAssociationOverride(model.getIsAutoAssociationOverride());
            }
            if (model.wasPropertyExplicitlySet("ruleId")) {
                this.ruleId(model.getRuleId());
            }
            if (model.wasPropertyExplicitlySet("typeName")) {
                this.typeName(model.getTypeName());
            }
            if (model.wasPropertyExplicitlySet("typeDisplayName")) {
                this.typeDisplayName(model.getTypeDisplayName());
            }
            if (model.wasPropertyExplicitlySet("warningConfig")) {
                this.warningConfig(model.getWarningConfig());
            }
            if (model.wasPropertyExplicitlySet("metadataFields")) {
                this.metadataFields(model.getMetadataFields());
            }
            if (model.wasPropertyExplicitlySet("labelDefinitions")) {
                this.labelDefinitions(model.getLabelDefinitions());
            }
            if (model.wasPropertyExplicitlySet("entityTypes")) {
                this.entityTypes(model.getEntityTypes());
            }
            if (model.wasPropertyExplicitlySet("isTimezoneOverride")) {
                this.isTimezoneOverride(model.getIsTimezoneOverride());
            }
            if (model.wasPropertyExplicitlySet("userParsers")) {
                this.userParsers(model.getUserParsers());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /** The label alert conditions. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditions")
    private final java.util.List<LogAnalyticsSourceLabelCondition> labelConditions;

    /**
     * The label alert conditions.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsSourceLabelCondition> getLabelConditions() {
        return labelConditions;
    }

    /** The association count. */
    @com.fasterxml.jackson.annotation.JsonProperty("associationCount")
    private final Integer associationCount;

    /**
     * The association count.
     *
     * @return the value
     */
    public Integer getAssociationCount() {
        return associationCount;
    }

    /** The association entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("associationEntity")
    private final java.util.List<LogAnalyticsAssociation> associationEntity;

    /**
     * The association entity.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsAssociation> getAssociationEntity() {
        return associationEntity;
    }

    /** The data filter definition. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataFilterDefinitions")
    private final java.util.List<LogAnalyticsSourceDataFilter> dataFilterDefinitions;

    /**
     * The data filter definition.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsSourceDataFilter> getDataFilterDefinitions() {
        return dataFilterDefinitions;
    }

    /** The database credential. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
    private final String databaseCredential;

    /**
     * The database credential.
     *
     * @return the value
     */
    public String getDatabaseCredential() {
        return databaseCredential;
    }

    /** The extended field definition. */
    @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinitions")
    private final java.util.List<LogAnalyticsSourceExtendedFieldDefinition>
            extendedFieldDefinitions;

    /**
     * The extended field definition.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsSourceExtendedFieldDefinition> getExtendedFieldDefinitions() {
        return extendedFieldDefinitions;
    }

    /** A flag indicating whether or not this is a cloud source. */
    @com.fasterxml.jackson.annotation.JsonProperty("isForCloud")
    private final Boolean isForCloud;

    /**
     * A flag indicating whether or not this is a cloud source.
     *
     * @return the value
     */
    public Boolean getIsForCloud() {
        return isForCloud;
    }

    /** The labels associated with this source. */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<LogAnalyticsLabelView> labels;

    /**
     * The labels associated with this source.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsLabelView> getLabels() {
        return labels;
    }

    /** The metric definitions. */
    @com.fasterxml.jackson.annotation.JsonProperty("metricDefinitions")
    private final java.util.List<LogAnalyticsMetric> metricDefinitions;

    /**
     * The metric definitions.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsMetric> getMetricDefinitions() {
        return metricDefinitions;
    }

    /** The metric source map. */
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<LogAnalyticsSourceMetric> metrics;

    /**
     * The metric source map.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsSourceMetric> getMetrics() {
        return metrics;
    }

    /** The built in source parser. */
    @com.fasterxml.jackson.annotation.JsonProperty("oobParsers")
    private final java.util.List<LogAnalyticsParser> oobParsers;

    /**
     * The built in source parser.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsParser> getOobParsers() {
        return oobParsers;
    }

    /** The parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<LogAnalyticsParameter> parameters;

    /**
     * The parameter.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsParameter> getParameters() {
        return parameters;
    }

    /** The pattern count. */
    @com.fasterxml.jackson.annotation.JsonProperty("patternCount")
    private final Integer patternCount;

    /**
     * The pattern count.
     *
     * @return the value
     */
    public Integer getPatternCount() {
        return patternCount;
    }

    /** The source patterns. */
    @com.fasterxml.jackson.annotation.JsonProperty("patterns")
    private final java.util.List<LogAnalyticsSourcePattern> patterns;

    /**
     * The source patterns.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsSourcePattern> getPatterns() {
        return patterns;
    }

    /** The source description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The source description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The source display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The source display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The source edit version. */
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    private final Long editVersion;

    /**
     * The source edit version.
     *
     * @return the value
     */
    public Long getEditVersion() {
        return editVersion;
    }

    /** The source functions. */
    @com.fasterxml.jackson.annotation.JsonProperty("functions")
    private final java.util.List<LogAnalyticsSourceFunction> functions;

    /**
     * The source functions.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsSourceFunction> getFunctions() {
        return functions;
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

    /** The source internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The source internal name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** A flag indicating whether or not the source content is secure. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSecureContent")
    private final Boolean isSecureContent;

    /**
     * A flag indicating whether or not the source content is secure.
     *
     * @return the value
     */
    public Boolean getIsSecureContent() {
        return isSecureContent;
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

    /** The list of parsers associated with this source. */
    @com.fasterxml.jackson.annotation.JsonProperty("parsers")
    private final java.util.List<LogAnalyticsParser> parsers;

    /**
     * The list of parsers associated with this source.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsParser> getParsers() {
        return parsers;
    }

    /** A flag indicating whether or not the source is marked for auto-association. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoAssociationEnabled")
    private final Boolean isAutoAssociationEnabled;

    /**
     * A flag indicating whether or not the source is marked for auto-association.
     *
     * @return the value
     */
    public Boolean getIsAutoAssociationEnabled() {
        return isAutoAssociationEnabled;
    }

    /** A flag indicating whether or not the auto-association state should be overriden. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoAssociationOverride")
    private final Boolean isAutoAssociationOverride;

    /**
     * A flag indicating whether or not the auto-association state should be overriden.
     *
     * @return the value
     */
    public Boolean getIsAutoAssociationOverride() {
        return isAutoAssociationOverride;
    }

    /** The rule unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("ruleId")
    private final Long ruleId;

    /**
     * The rule unique identifier.
     *
     * @return the value
     */
    public Long getRuleId() {
        return ruleId;
    }

    /** The source type internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("typeName")
    private final String typeName;

    /**
     * The source type internal name.
     *
     * @return the value
     */
    public String getTypeName() {
        return typeName;
    }

    /** The source type name. */
    @com.fasterxml.jackson.annotation.JsonProperty("typeDisplayName")
    private final String typeDisplayName;

    /**
     * The source type name.
     *
     * @return the value
     */
    public String getTypeDisplayName() {
        return typeDisplayName;
    }

    /** The source warning configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("warningConfig")
    private final Long warningConfig;

    /**
     * The source warning configuration.
     *
     * @return the value
     */
    public Long getWarningConfig() {
        return warningConfig;
    }

    /** The source metadata fields. */
    @com.fasterxml.jackson.annotation.JsonProperty("metadataFields")
    private final java.util.List<LogAnalyticsSourceMetadataField> metadataFields;

    /**
     * The source metadata fields.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsSourceMetadataField> getMetadataFields() {
        return metadataFields;
    }

    /** The label definitions. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelDefinitions")
    private final java.util.List<LogAnalyticsLabelDefinition> labelDefinitions;

    /**
     * The label definitions.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsLabelDefinition> getLabelDefinitions() {
        return labelDefinitions;
    }

    /** The entity types. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypes")
    private final java.util.List<LogAnalyticsSourceEntityType> entityTypes;

    /**
     * The entity types.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsSourceEntityType> getEntityTypes() {
        return entityTypes;
    }

    /** A flag indicating whether or not the source has a time zone override. */
    @com.fasterxml.jackson.annotation.JsonProperty("isTimezoneOverride")
    private final Boolean isTimezoneOverride;

    /**
     * A flag indicating whether or not the source has a time zone override.
     *
     * @return the value
     */
    public Boolean getIsTimezoneOverride() {
        return isTimezoneOverride;
    }

    /** An array of custom parsers. */
    @com.fasterxml.jackson.annotation.JsonProperty("userParsers")
    private final java.util.List<LogAnalyticsParser> userParsers;

    /**
     * An array of custom parsers.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsParser> getUserParsers() {
        return userParsers;
    }

    /** The last updated date. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last updated date.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("LogAnalyticsSourceSummary(");
        sb.append("super=").append(super.toString());
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
