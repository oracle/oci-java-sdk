/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of report definition. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ReportDefinitionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ReportDefinitionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "id",
        "category",
        "description",
        "isSeeded",
        "displayOrder",
        "timeCreated",
        "timeUpdated",
        "compartmentId",
        "dataSource",
        "lifecycleState",
        "schedule",
        "complianceStandards",
        "freeformTags",
        "definedTags"
    })
    public ReportDefinitionSummary(
            String displayName,
            String id,
            Category category,
            String description,
            Boolean isSeeded,
            Integer displayOrder,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String compartmentId,
            ReportDefinitionDataSource dataSource,
            ReportDefinitionLifecycleState lifecycleState,
            String schedule,
            java.util.List<String> complianceStandards,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.id = id;
        this.category = category;
        this.description = description;
        this.isSeeded = isSeeded;
        this.displayOrder = displayOrder;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.compartmentId = compartmentId;
        this.dataSource = dataSource;
        this.lifecycleState = lifecycleState;
        this.schedule = schedule;
        this.complianceStandards = complianceStandards;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the report definition. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Name of the report definition.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the report definition. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the report definition.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Specifies the name of the category that this report belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private Category category;

        /**
         * Specifies the name of the category that this report belongs to.
         *
         * @param category the value to set
         * @return this builder
         */
        public Builder category(Category category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /** A description of the report definition. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the report definition.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Signifies whether the definition is seeded or user defined. Values can either be 'true'
         * or 'false'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSeeded")
        private Boolean isSeeded;

        /**
         * Signifies whether the definition is seeded or user defined. Values can either be 'true'
         * or 'false'.
         *
         * @param isSeeded the value to set
         * @return this builder
         */
        public Builder isSeeded(Boolean isSeeded) {
            this.isSeeded = isSeeded;
            this.__explicitlySet__.add("isSeeded");
            return this;
        }
        /** Specifies how the report definitions are ordered in the display. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayOrder")
        private Integer displayOrder;

        /**
         * Specifies how the report definitions are ordered in the display.
         *
         * @param displayOrder the value to set
         * @return this builder
         */
        public Builder displayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            this.__explicitlySet__.add("displayOrder");
            return this;
        }
        /** Specifies the time at which the report definition was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Specifies the time at which the report definition was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time of the report definition update in Data Safe. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time of the report definition update in Data Safe.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The OCID of the compartment containing the report definition. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the report definition.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Specifies the name of a resource that provides data for the report. For example alerts,
         * events.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataSource")
        private ReportDefinitionDataSource dataSource;

        /**
         * Specifies the name of a resource that provides data for the report. For example alerts,
         * events.
         *
         * @param dataSource the value to set
         * @return this builder
         */
        public Builder dataSource(ReportDefinitionDataSource dataSource) {
            this.dataSource = dataSource;
            this.__explicitlySet__.add("dataSource");
            return this;
        }
        /** The current state of the audit report. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ReportDefinitionLifecycleState lifecycleState;

        /**
         * The current state of the audit report.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ReportDefinitionLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The schedule to generate the report periodically in the specified format:
         * <version-string>;<version-specific-schedule>
         *
         * <p>Allowed version strings - "v1" v1's version specific schedule -<ss> <mm> <hh>
         * <day-of-week> <day-of-month> Each of the above fields potentially introduce constraints.
         * A work request is created only when clock time satisfies all the constraints. Constraints
         * introduced: 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59]) 2. minutes =
         * <mm> (So, the allowed range for <mm> is [0, 59]) 3. hours = <hh> (So, the allowed range
         * for <hh> is [0, 23]) 4. <day-of-week> can be either '*' (without quotes or a number
         * between 1(Monday) and 7(Sunday)) No constraint introduced when it is '*'. When not, day
         * of week must equal the given value. 5. <day-of-month> can be either '*' (without quotes
         * or a number between 1 and 28) No constraint introduced when it is '*'. When not, day of
         * month must equal the given value
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private String schedule;

        /**
         * The schedule to generate the report periodically in the specified format:
         * <version-string>;<version-specific-schedule>
         *
         * <p>Allowed version strings - "v1" v1's version specific schedule -<ss> <mm> <hh>
         * <day-of-week> <day-of-month> Each of the above fields potentially introduce constraints.
         * A work request is created only when clock time satisfies all the constraints. Constraints
         * introduced: 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59]) 2. minutes =
         * <mm> (So, the allowed range for <mm> is [0, 59]) 3. hours = <hh> (So, the allowed range
         * for <hh> is [0, 23]) 4. <day-of-week> can be either '*' (without quotes or a number
         * between 1(Monday) and 7(Sunday)) No constraint introduced when it is '*'. When not, day
         * of week must equal the given value. 5. <day-of-month> can be either '*' (without quotes
         * or a number between 1 and 28) No constraint introduced when it is '*'. When not, day of
         * month must equal the given value
         *
         * @param schedule the value to set
         * @return this builder
         */
        public Builder schedule(String schedule) {
            this.schedule = schedule;
            this.__explicitlySet__.add("schedule");
            return this;
        }
        /**
         * The list of data protection regulations/standards used in the report that will help
         * demonstrate compliance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("complianceStandards")
        private java.util.List<String> complianceStandards;

        /**
         * The list of data protection regulations/standards used in the report that will help
         * demonstrate compliance.
         *
         * @param complianceStandards the value to set
         * @return this builder
         */
        public Builder complianceStandards(java.util.List<String> complianceStandards) {
            this.complianceStandards = complianceStandards;
            this.__explicitlySet__.add("complianceStandards");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReportDefinitionSummary build() {
            ReportDefinitionSummary model =
                    new ReportDefinitionSummary(
                            this.displayName,
                            this.id,
                            this.category,
                            this.description,
                            this.isSeeded,
                            this.displayOrder,
                            this.timeCreated,
                            this.timeUpdated,
                            this.compartmentId,
                            this.dataSource,
                            this.lifecycleState,
                            this.schedule,
                            this.complianceStandards,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReportDefinitionSummary model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isSeeded")) {
                this.isSeeded(model.getIsSeeded());
            }
            if (model.wasPropertyExplicitlySet("displayOrder")) {
                this.displayOrder(model.getDisplayOrder());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dataSource")) {
                this.dataSource(model.getDataSource());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("schedule")) {
                this.schedule(model.getSchedule());
            }
            if (model.wasPropertyExplicitlySet("complianceStandards")) {
                this.complianceStandards(model.getComplianceStandards());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** Name of the report definition. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Name of the report definition.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the report definition. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the report definition.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Specifies the name of the category that this report belongs to. */
    public enum Category implements com.oracle.bmc.http.internal.BmcEnum {
        CustomReports("CUSTOM_REPORTS"),
        Summary("SUMMARY"),
        ActivityAuditing("ACTIVITY_AUDITING"),
        SecurityAssessment("SECURITY_ASSESSMENT"),
        FirewallViolations("FIREWALL_VIOLATIONS"),
        AllowedSql("ALLOWED_SQL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Category.class);

        private final String value;
        private static java.util.Map<String, Category> map;

        static {
            map = new java.util.HashMap<>();
            for (Category v : Category.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Category(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Category create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Category', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specifies the name of the category that this report belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final Category category;

    /**
     * Specifies the name of the category that this report belongs to.
     *
     * @return the value
     */
    public Category getCategory() {
        return category;
    }

    /** A description of the report definition. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the report definition.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Signifies whether the definition is seeded or user defined. Values can either be 'true' or
     * 'false'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSeeded")
    private final Boolean isSeeded;

    /**
     * Signifies whether the definition is seeded or user defined. Values can either be 'true' or
     * 'false'.
     *
     * @return the value
     */
    public Boolean getIsSeeded() {
        return isSeeded;
    }

    /** Specifies how the report definitions are ordered in the display. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayOrder")
    private final Integer displayOrder;

    /**
     * Specifies how the report definitions are ordered in the display.
     *
     * @return the value
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /** Specifies the time at which the report definition was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Specifies the time at which the report definition was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time of the report definition update in Data Safe. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time of the report definition update in Data Safe.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The OCID of the compartment containing the report definition. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the report definition.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Specifies the name of a resource that provides data for the report. For example alerts,
     * events.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataSource")
    private final ReportDefinitionDataSource dataSource;

    /**
     * Specifies the name of a resource that provides data for the report. For example alerts,
     * events.
     *
     * @return the value
     */
    public ReportDefinitionDataSource getDataSource() {
        return dataSource;
    }

    /** The current state of the audit report. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ReportDefinitionLifecycleState lifecycleState;

    /**
     * The current state of the audit report.
     *
     * @return the value
     */
    public ReportDefinitionLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The schedule to generate the report periodically in the specified format:
     * <version-string>;<version-specific-schedule>
     *
     * <p>Allowed version strings - "v1" v1's version specific schedule -<ss> <mm> <hh>
     * <day-of-week> <day-of-month> Each of the above fields potentially introduce constraints. A
     * work request is created only when clock time satisfies all the constraints. Constraints
     * introduced: 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59]) 2. minutes = <mm>
     * (So, the allowed range for <mm> is [0, 59]) 3. hours = <hh> (So, the allowed range for <hh>
     * is [0, 23]) 4. <day-of-week> can be either '*' (without quotes or a number between 1(Monday)
     * and 7(Sunday)) No constraint introduced when it is '*'. When not, day of week must equal the
     * given value. 5. <day-of-month> can be either '*' (without quotes or a number between 1 and
     * 28) No constraint introduced when it is '*'. When not, day of month must equal the given
     * value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final String schedule;

    /**
     * The schedule to generate the report periodically in the specified format:
     * <version-string>;<version-specific-schedule>
     *
     * <p>Allowed version strings - "v1" v1's version specific schedule -<ss> <mm> <hh>
     * <day-of-week> <day-of-month> Each of the above fields potentially introduce constraints. A
     * work request is created only when clock time satisfies all the constraints. Constraints
     * introduced: 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59]) 2. minutes = <mm>
     * (So, the allowed range for <mm> is [0, 59]) 3. hours = <hh> (So, the allowed range for <hh>
     * is [0, 23]) 4. <day-of-week> can be either '*' (without quotes or a number between 1(Monday)
     * and 7(Sunday)) No constraint introduced when it is '*'. When not, day of week must equal the
     * given value. 5. <day-of-month> can be either '*' (without quotes or a number between 1 and
     * 28) No constraint introduced when it is '*'. When not, day of month must equal the given
     * value
     *
     * @return the value
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * The list of data protection regulations/standards used in the report that will help
     * demonstrate compliance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("complianceStandards")
    private final java.util.List<String> complianceStandards;

    /**
     * The list of data protection regulations/standards used in the report that will help
     * demonstrate compliance.
     *
     * @return the value
     */
    public java.util.List<String> getComplianceStandards() {
        return complianceStandards;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("ReportDefinitionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isSeeded=").append(String.valueOf(this.isSeeded));
        sb.append(", displayOrder=").append(String.valueOf(this.displayOrder));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dataSource=").append(String.valueOf(this.dataSource));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(", complianceStandards=").append(String.valueOf(this.complianceStandards));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReportDefinitionSummary)) {
            return false;
        }

        ReportDefinitionSummary other = (ReportDefinitionSummary) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isSeeded, other.isSeeded)
                && java.util.Objects.equals(this.displayOrder, other.displayOrder)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dataSource, other.dataSource)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.schedule, other.schedule)
                && java.util.Objects.equals(this.complianceStandards, other.complianceStandards)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isSeeded == null ? 43 : this.isSeeded.hashCode());
        result = (result * PRIME) + (this.displayOrder == null ? 43 : this.displayOrder.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.dataSource == null ? 43 : this.dataSource.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result =
                (result * PRIME)
                        + (this.complianceStandards == null
                                ? 43
                                : this.complianceStandards.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
