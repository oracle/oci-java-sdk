/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * UpsertLogAnalyticsSourceDetails <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpsertLogAnalyticsSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpsertLogAnalyticsSourceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "labelConditions",
        "dataFilterDefinitions",
        "databaseCredential",
        "extendedFieldDefinitions",
        "isForCloud",
        "labels",
        "metricDefinitions",
        "metrics",
        "oobParsers",
        "parameters",
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
        "ruleId",
        "typeName",
        "warningConfig",
        "metadataFields",
        "labelDefinitions",
        "entityTypes",
        "isTimezoneOverride",
        "userParsers",
        "categories"
    })
    public UpsertLogAnalyticsSourceDetails(
            java.util.List<LogAnalyticsSourceLabelCondition> labelConditions,
            java.util.List<LogAnalyticsSourceDataFilter> dataFilterDefinitions,
            String databaseCredential,
            java.util.List<LogAnalyticsSourceExtendedFieldDefinition> extendedFieldDefinitions,
            Boolean isForCloud,
            java.util.List<LogAnalyticsLabelView> labels,
            java.util.List<LogAnalyticsMetric> metricDefinitions,
            java.util.List<LogAnalyticsSourceMetric> metrics,
            java.util.List<LogAnalyticsParser> oobParsers,
            java.util.List<LogAnalyticsParameter> parameters,
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
            Long ruleId,
            String typeName,
            Long warningConfig,
            java.util.List<LogAnalyticsSourceMetadataField> metadataFields,
            java.util.List<LogAnalyticsLabelDefinition> labelDefinitions,
            java.util.List<LogAnalyticsSourceEntityType> entityTypes,
            Boolean isTimezoneOverride,
            java.util.List<LogAnalyticsParser> userParsers,
            java.util.List<LogAnalyticsCategory> categories) {
        super();
        this.labelConditions = labelConditions;
        this.dataFilterDefinitions = dataFilterDefinitions;
        this.databaseCredential = databaseCredential;
        this.extendedFieldDefinitions = extendedFieldDefinitions;
        this.isForCloud = isForCloud;
        this.labels = labels;
        this.metricDefinitions = metricDefinitions;
        this.metrics = metrics;
        this.oobParsers = oobParsers;
        this.parameters = parameters;
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
        this.ruleId = ruleId;
        this.typeName = typeName;
        this.warningConfig = warningConfig;
        this.metadataFields = metadataFields;
        this.labelDefinitions = labelDefinitions;
        this.entityTypes = entityTypes;
        this.isTimezoneOverride = isTimezoneOverride;
        this.userParsers = userParsers;
        this.categories = categories;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An array of source label conditions. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelConditions")
        private java.util.List<LogAnalyticsSourceLabelCondition> labelConditions;

        /**
         * An array of source label conditions.
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
        /** An array of data filter definitions. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataFilterDefinitions")
        private java.util.List<LogAnalyticsSourceDataFilter> dataFilterDefinitions;

        /**
         * An array of data filter definitions.
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
        /** The database credential name. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
        private String databaseCredential;

        /**
         * The database credential name.
         *
         * @param databaseCredential the value to set
         * @return this builder
         */
        public Builder databaseCredential(String databaseCredential) {
            this.databaseCredential = databaseCredential;
            this.__explicitlySet__.add("databaseCredential");
            return this;
        }
        /** An array of extended field definitions. */
        @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinitions")
        private java.util.List<LogAnalyticsSourceExtendedFieldDefinition> extendedFieldDefinitions;

        /**
         * An array of extended field definitions.
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
        /** An array of labels. */
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<LogAnalyticsLabelView> labels;

        /**
         * An array of labels.
         *
         * @param labels the value to set
         * @return this builder
         */
        public Builder labels(java.util.List<LogAnalyticsLabelView> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }
        /** An array of metric definitions. */
        @com.fasterxml.jackson.annotation.JsonProperty("metricDefinitions")
        private java.util.List<LogAnalyticsMetric> metricDefinitions;

        /**
         * An array of metric definitions.
         *
         * @param metricDefinitions the value to set
         * @return this builder
         */
        public Builder metricDefinitions(java.util.List<LogAnalyticsMetric> metricDefinitions) {
            this.metricDefinitions = metricDefinitions;
            this.__explicitlySet__.add("metricDefinitions");
            return this;
        }
        /** An array of metrics. */
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<LogAnalyticsSourceMetric> metrics;

        /**
         * An array of metrics.
         *
         * @param metrics the value to set
         * @return this builder
         */
        public Builder metrics(java.util.List<LogAnalyticsSourceMetric> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }
        /** An array of built in source parsers. */
        @com.fasterxml.jackson.annotation.JsonProperty("oobParsers")
        private java.util.List<LogAnalyticsParser> oobParsers;

        /**
         * An array of built in source parsers.
         *
         * @param oobParsers the value to set
         * @return this builder
         */
        public Builder oobParsers(java.util.List<LogAnalyticsParser> oobParsers) {
            this.oobParsers = oobParsers;
            this.__explicitlySet__.add("oobParsers");
            return this;
        }
        /** An array of parameters. */
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<LogAnalyticsParameter> parameters;

        /**
         * An array of parameters.
         *
         * @param parameters the value to set
         * @return this builder
         */
        public Builder parameters(java.util.List<LogAnalyticsParameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
        /** An array of patterns. */
        @com.fasterxml.jackson.annotation.JsonProperty("patterns")
        private java.util.List<LogAnalyticsSourcePattern> patterns;

        /**
         * An array of patterns.
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
        /** An array of source functions. */
        @com.fasterxml.jackson.annotation.JsonProperty("functions")
        private java.util.List<LogAnalyticsSourceFunction> functions;

        /**
         * An array of source functions.
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
        /** An array of parser. */
        @com.fasterxml.jackson.annotation.JsonProperty("parsers")
        private java.util.List<LogAnalyticsParser> parsers;

        /**
         * An array of parser.
         *
         * @param parsers the value to set
         * @return this builder
         */
        public Builder parsers(java.util.List<LogAnalyticsParser> parsers) {
            this.parsers = parsers;
            this.__explicitlySet__.add("parsers");
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
        /** An array of source metadata fields. */
        @com.fasterxml.jackson.annotation.JsonProperty("metadataFields")
        private java.util.List<LogAnalyticsSourceMetadataField> metadataFields;

        /**
         * An array of source metadata fields.
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
        /** An array of labels. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelDefinitions")
        private java.util.List<LogAnalyticsLabelDefinition> labelDefinitions;

        /**
         * An array of labels.
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
        /** An array of entity types. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityTypes")
        private java.util.List<LogAnalyticsSourceEntityType> entityTypes;

        /**
         * An array of entity types.
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
        /**
         * An array of categories to assign to the source. Specifying the name attribute for each
         * category would suffice. Oracle-defined category assignments cannot be removed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("categories")
        private java.util.List<LogAnalyticsCategory> categories;

        /**
         * An array of categories to assign to the source. Specifying the name attribute for each
         * category would suffice. Oracle-defined category assignments cannot be removed.
         *
         * @param categories the value to set
         * @return this builder
         */
        public Builder categories(java.util.List<LogAnalyticsCategory> categories) {
            this.categories = categories;
            this.__explicitlySet__.add("categories");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpsertLogAnalyticsSourceDetails build() {
            UpsertLogAnalyticsSourceDetails model =
                    new UpsertLogAnalyticsSourceDetails(
                            this.labelConditions,
                            this.dataFilterDefinitions,
                            this.databaseCredential,
                            this.extendedFieldDefinitions,
                            this.isForCloud,
                            this.labels,
                            this.metricDefinitions,
                            this.metrics,
                            this.oobParsers,
                            this.parameters,
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
                            this.ruleId,
                            this.typeName,
                            this.warningConfig,
                            this.metadataFields,
                            this.labelDefinitions,
                            this.entityTypes,
                            this.isTimezoneOverride,
                            this.userParsers,
                            this.categories);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpsertLogAnalyticsSourceDetails model) {
            if (model.wasPropertyExplicitlySet("labelConditions")) {
                this.labelConditions(model.getLabelConditions());
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
            if (model.wasPropertyExplicitlySet("ruleId")) {
                this.ruleId(model.getRuleId());
            }
            if (model.wasPropertyExplicitlySet("typeName")) {
                this.typeName(model.getTypeName());
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
            if (model.wasPropertyExplicitlySet("categories")) {
                this.categories(model.getCategories());
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

    /** An array of source label conditions. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditions")
    private final java.util.List<LogAnalyticsSourceLabelCondition> labelConditions;

    /**
     * An array of source label conditions.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsSourceLabelCondition> getLabelConditions() {
        return labelConditions;
    }

    /** An array of data filter definitions. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataFilterDefinitions")
    private final java.util.List<LogAnalyticsSourceDataFilter> dataFilterDefinitions;

    /**
     * An array of data filter definitions.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsSourceDataFilter> getDataFilterDefinitions() {
        return dataFilterDefinitions;
    }

    /** The database credential name. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
    private final String databaseCredential;

    /**
     * The database credential name.
     *
     * @return the value
     */
    public String getDatabaseCredential() {
        return databaseCredential;
    }

    /** An array of extended field definitions. */
    @com.fasterxml.jackson.annotation.JsonProperty("extendedFieldDefinitions")
    private final java.util.List<LogAnalyticsSourceExtendedFieldDefinition>
            extendedFieldDefinitions;

    /**
     * An array of extended field definitions.
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

    /** An array of labels. */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<LogAnalyticsLabelView> labels;

    /**
     * An array of labels.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsLabelView> getLabels() {
        return labels;
    }

    /** An array of metric definitions. */
    @com.fasterxml.jackson.annotation.JsonProperty("metricDefinitions")
    private final java.util.List<LogAnalyticsMetric> metricDefinitions;

    /**
     * An array of metric definitions.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsMetric> getMetricDefinitions() {
        return metricDefinitions;
    }

    /** An array of metrics. */
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<LogAnalyticsSourceMetric> metrics;

    /**
     * An array of metrics.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsSourceMetric> getMetrics() {
        return metrics;
    }

    /** An array of built in source parsers. */
    @com.fasterxml.jackson.annotation.JsonProperty("oobParsers")
    private final java.util.List<LogAnalyticsParser> oobParsers;

    /**
     * An array of built in source parsers.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsParser> getOobParsers() {
        return oobParsers;
    }

    /** An array of parameters. */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<LogAnalyticsParameter> parameters;

    /**
     * An array of parameters.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsParameter> getParameters() {
        return parameters;
    }

    /** An array of patterns. */
    @com.fasterxml.jackson.annotation.JsonProperty("patterns")
    private final java.util.List<LogAnalyticsSourcePattern> patterns;

    /**
     * An array of patterns.
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

    /** An array of source functions. */
    @com.fasterxml.jackson.annotation.JsonProperty("functions")
    private final java.util.List<LogAnalyticsSourceFunction> functions;

    /**
     * An array of source functions.
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

    /** An array of parser. */
    @com.fasterxml.jackson.annotation.JsonProperty("parsers")
    private final java.util.List<LogAnalyticsParser> parsers;

    /**
     * An array of parser.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsParser> getParsers() {
        return parsers;
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

    /** An array of source metadata fields. */
    @com.fasterxml.jackson.annotation.JsonProperty("metadataFields")
    private final java.util.List<LogAnalyticsSourceMetadataField> metadataFields;

    /**
     * An array of source metadata fields.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsSourceMetadataField> getMetadataFields() {
        return metadataFields;
    }

    /** An array of labels. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelDefinitions")
    private final java.util.List<LogAnalyticsLabelDefinition> labelDefinitions;

    /**
     * An array of labels.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsLabelDefinition> getLabelDefinitions() {
        return labelDefinitions;
    }

    /** An array of entity types. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypes")
    private final java.util.List<LogAnalyticsSourceEntityType> entityTypes;

    /**
     * An array of entity types.
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

    /**
     * An array of categories to assign to the source. Specifying the name attribute for each
     * category would suffice. Oracle-defined category assignments cannot be removed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("categories")
    private final java.util.List<LogAnalyticsCategory> categories;

    /**
     * An array of categories to assign to the source. Specifying the name attribute for each
     * category would suffice. Oracle-defined category assignments cannot be removed.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsCategory> getCategories() {
        return categories;
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
        sb.append("UpsertLogAnalyticsSourceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("labelConditions=").append(String.valueOf(this.labelConditions));
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
        sb.append(", ruleId=").append(String.valueOf(this.ruleId));
        sb.append(", typeName=").append(String.valueOf(this.typeName));
        sb.append(", warningConfig=").append(String.valueOf(this.warningConfig));
        sb.append(", metadataFields=").append(String.valueOf(this.metadataFields));
        sb.append(", labelDefinitions=").append(String.valueOf(this.labelDefinitions));
        sb.append(", entityTypes=").append(String.valueOf(this.entityTypes));
        sb.append(", isTimezoneOverride=").append(String.valueOf(this.isTimezoneOverride));
        sb.append(", userParsers=").append(String.valueOf(this.userParsers));
        sb.append(", categories=").append(String.valueOf(this.categories));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpsertLogAnalyticsSourceDetails)) {
            return false;
        }

        UpsertLogAnalyticsSourceDetails other = (UpsertLogAnalyticsSourceDetails) o;
        return java.util.Objects.equals(this.labelConditions, other.labelConditions)
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
                && java.util.Objects.equals(this.ruleId, other.ruleId)
                && java.util.Objects.equals(this.typeName, other.typeName)
                && java.util.Objects.equals(this.warningConfig, other.warningConfig)
                && java.util.Objects.equals(this.metadataFields, other.metadataFields)
                && java.util.Objects.equals(this.labelDefinitions, other.labelDefinitions)
                && java.util.Objects.equals(this.entityTypes, other.entityTypes)
                && java.util.Objects.equals(this.isTimezoneOverride, other.isTimezoneOverride)
                && java.util.Objects.equals(this.userParsers, other.userParsers)
                && java.util.Objects.equals(this.categories, other.categories)
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
        result = (result * PRIME) + (this.ruleId == null ? 43 : this.ruleId.hashCode());
        result = (result * PRIME) + (this.typeName == null ? 43 : this.typeName.hashCode());
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
        result = (result * PRIME) + (this.categories == null ? 43 : this.categories.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
