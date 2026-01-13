/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details used to save a security assessment. <br>
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
        builder = CreateSecurityAssessmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSecurityAssessmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "targetId",
        "targetType",
        "type",
        "templateAssessmentId",
        "baseSecurityAssessmentId",
        "isAssessmentScheduled",
        "schedule",
        "freeformTags",
        "definedTags"
    })
    public CreateSecurityAssessmentDetails(
            String compartmentId,
            String displayName,
            String description,
            String targetId,
            SecurityAssessmentTargetType targetType,
            Type type,
            String templateAssessmentId,
            String baseSecurityAssessmentId,
            Boolean isAssessmentScheduled,
            String schedule,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.targetId = targetId;
        this.targetType = targetType;
        this.type = type;
        this.templateAssessmentId = templateAssessmentId;
        this.baseSecurityAssessmentId = baseSecurityAssessmentId;
        this.isAssessmentScheduled = isAssessmentScheduled;
        this.schedule = schedule;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment that contains the security assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the security assessment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The display name of the security assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the security assessment.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the security assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the security assessment.
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
         * The OCID of the target database or target database group on which security assessment is
         * to be run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database or target database group on which security assessment is
         * to be run.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * The type of security assessment resource whether it is individual or group resource. For
         * individual target use type TARGET_DATABASE and for group resource use type
         * TARGET_DATABASE_GROUP. If not provided, TARGET_DATABASE would be used as default value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetType")
        private SecurityAssessmentTargetType targetType;

        /**
         * The type of security assessment resource whether it is individual or group resource. For
         * individual target use type TARGET_DATABASE and for group resource use type
         * TARGET_DATABASE_GROUP. If not provided, TARGET_DATABASE would be used as default value.
         *
         * @param targetType the value to set
         * @return this builder
         */
        public Builder targetType(SecurityAssessmentTargetType targetType) {
            this.targetType = targetType;
            this.__explicitlySet__.add("targetType");
            return this;
        }
        /** The type of the security assessment */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of the security assessment
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The OCID of the template assessment. It will be required while creating the template
         * baseline assessment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("templateAssessmentId")
        private String templateAssessmentId;

        /**
         * The OCID of the template assessment. It will be required while creating the template
         * baseline assessment.
         *
         * @param templateAssessmentId the value to set
         * @return this builder
         */
        public Builder templateAssessmentId(String templateAssessmentId) {
            this.templateAssessmentId = templateAssessmentId;
            this.__explicitlySet__.add("templateAssessmentId");
            return this;
        }
        /**
         * The OCID of the security assessment. The assessment should be of type SAVED. It will be
         * required while creating the template baseline assessment for individual targets to fetch
         * the detailed information from an existing security assessment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("baseSecurityAssessmentId")
        private String baseSecurityAssessmentId;

        /**
         * The OCID of the security assessment. The assessment should be of type SAVED. It will be
         * required while creating the template baseline assessment for individual targets to fetch
         * the detailed information from an existing security assessment.
         *
         * @param baseSecurityAssessmentId the value to set
         * @return this builder
         */
        public Builder baseSecurityAssessmentId(String baseSecurityAssessmentId) {
            this.baseSecurityAssessmentId = baseSecurityAssessmentId;
            this.__explicitlySet__.add("baseSecurityAssessmentId");
            return this;
        }
        /** Indicates whether the assessment is scheduled to run. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAssessmentScheduled")
        private Boolean isAssessmentScheduled;

        /**
         * Indicates whether the assessment is scheduled to run.
         *
         * @param isAssessmentScheduled the value to set
         * @return this builder
         */
        public Builder isAssessmentScheduled(Boolean isAssessmentScheduled) {
            this.isAssessmentScheduled = isAssessmentScheduled;
            this.__explicitlySet__.add("isAssessmentScheduled");
            return this;
        }
        /**
         * To schedule the assessment for running periodically, specify the schedule in this
         * attribute. Create or schedule one assessment per compartment. If not defined, the
         * assessment runs immediately. Format - <version-string>;<version-specific-schedule>
         *
         * <p>Allowed version strings - "v1" v1's version specific schedule -<ss> <mm> <hh>
         * <day-of-week> <day-of-month> Each of the above fields potentially introduce constraints.
         * A workrequest is created only when clock time satisfies all the constraints. Constraints
         * introduced: 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59]) 2. minutes =
         * <mm> (So, the allowed range for <mm> is [0, 59]) 3. hours = <hh> (So, the allowed range
         * for <hh> is [0, 23]) <day-of-week> can be either '*' (without quotes or a number between
         * 1(Monday) and 7(Sunday)) 4. No constraint introduced when it is '*'. When not, day of
         * week must equal the given value <day-of-month> can be either '*' (without quotes or a
         * number between 1 and 28) 5. No constraint introduced when it is '*'. When not, day of
         * month must equal the given value
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private String schedule;

        /**
         * To schedule the assessment for running periodically, specify the schedule in this
         * attribute. Create or schedule one assessment per compartment. If not defined, the
         * assessment runs immediately. Format - <version-string>;<version-specific-schedule>
         *
         * <p>Allowed version strings - "v1" v1's version specific schedule -<ss> <mm> <hh>
         * <day-of-week> <day-of-month> Each of the above fields potentially introduce constraints.
         * A workrequest is created only when clock time satisfies all the constraints. Constraints
         * introduced: 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59]) 2. minutes =
         * <mm> (So, the allowed range for <mm> is [0, 59]) 3. hours = <hh> (So, the allowed range
         * for <hh> is [0, 23]) <day-of-week> can be either '*' (without quotes or a number between
         * 1(Monday) and 7(Sunday)) 4. No constraint introduced when it is '*'. When not, day of
         * week must equal the given value <day-of-month> can be either '*' (without quotes or a
         * number between 1 and 28) 5. No constraint introduced when it is '*'. When not, day of
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

        public CreateSecurityAssessmentDetails build() {
            CreateSecurityAssessmentDetails model =
                    new CreateSecurityAssessmentDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.targetId,
                            this.targetType,
                            this.type,
                            this.templateAssessmentId,
                            this.baseSecurityAssessmentId,
                            this.isAssessmentScheduled,
                            this.schedule,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSecurityAssessmentDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("targetType")) {
                this.targetType(model.getTargetType());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("templateAssessmentId")) {
                this.templateAssessmentId(model.getTemplateAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("baseSecurityAssessmentId")) {
                this.baseSecurityAssessmentId(model.getBaseSecurityAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("isAssessmentScheduled")) {
                this.isAssessmentScheduled(model.getIsAssessmentScheduled());
            }
            if (model.wasPropertyExplicitlySet("schedule")) {
                this.schedule(model.getSchedule());
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

    /** The OCID of the compartment that contains the security assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the security assessment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The display name of the security assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the security assessment.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the security assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the security assessment.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The OCID of the target database or target database group on which security assessment is to
     * be run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database or target database group on which security assessment is to
     * be run.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * The type of security assessment resource whether it is individual or group resource. For
     * individual target use type TARGET_DATABASE and for group resource use type
     * TARGET_DATABASE_GROUP. If not provided, TARGET_DATABASE would be used as default value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetType")
    private final SecurityAssessmentTargetType targetType;

    /**
     * The type of security assessment resource whether it is individual or group resource. For
     * individual target use type TARGET_DATABASE and for group resource use type
     * TARGET_DATABASE_GROUP. If not provided, TARGET_DATABASE would be used as default value.
     *
     * @return the value
     */
    public SecurityAssessmentTargetType getTargetType() {
        return targetType;
    }

    /** The type of the security assessment */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Latest("LATEST"),
        Saved("SAVED"),
        SaveSchedule("SAVE_SCHEDULE"),
        Compartment("COMPARTMENT"),
        Template("TEMPLATE"),
        TemplateBaseline("TEMPLATE_BASELINE"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
    /** The type of the security assessment */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of the security assessment
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * The OCID of the template assessment. It will be required while creating the template baseline
     * assessment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("templateAssessmentId")
    private final String templateAssessmentId;

    /**
     * The OCID of the template assessment. It will be required while creating the template baseline
     * assessment.
     *
     * @return the value
     */
    public String getTemplateAssessmentId() {
        return templateAssessmentId;
    }

    /**
     * The OCID of the security assessment. The assessment should be of type SAVED. It will be
     * required while creating the template baseline assessment for individual targets to fetch the
     * detailed information from an existing security assessment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("baseSecurityAssessmentId")
    private final String baseSecurityAssessmentId;

    /**
     * The OCID of the security assessment. The assessment should be of type SAVED. It will be
     * required while creating the template baseline assessment for individual targets to fetch the
     * detailed information from an existing security assessment.
     *
     * @return the value
     */
    public String getBaseSecurityAssessmentId() {
        return baseSecurityAssessmentId;
    }

    /** Indicates whether the assessment is scheduled to run. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAssessmentScheduled")
    private final Boolean isAssessmentScheduled;

    /**
     * Indicates whether the assessment is scheduled to run.
     *
     * @return the value
     */
    public Boolean getIsAssessmentScheduled() {
        return isAssessmentScheduled;
    }

    /**
     * To schedule the assessment for running periodically, specify the schedule in this attribute.
     * Create or schedule one assessment per compartment. If not defined, the assessment runs
     * immediately. Format - <version-string>;<version-specific-schedule>
     *
     * <p>Allowed version strings - "v1" v1's version specific schedule -<ss> <mm> <hh>
     * <day-of-week> <day-of-month> Each of the above fields potentially introduce constraints. A
     * workrequest is created only when clock time satisfies all the constraints. Constraints
     * introduced: 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59]) 2. minutes = <mm>
     * (So, the allowed range for <mm> is [0, 59]) 3. hours = <hh> (So, the allowed range for <hh>
     * is [0, 23]) <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and
     * 7(Sunday)) 4. No constraint introduced when it is '*'. When not, day of week must equal the
     * given value <day-of-month> can be either '*' (without quotes or a number between 1 and 28) 5.
     * No constraint introduced when it is '*'. When not, day of month must equal the given value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final String schedule;

    /**
     * To schedule the assessment for running periodically, specify the schedule in this attribute.
     * Create or schedule one assessment per compartment. If not defined, the assessment runs
     * immediately. Format - <version-string>;<version-specific-schedule>
     *
     * <p>Allowed version strings - "v1" v1's version specific schedule -<ss> <mm> <hh>
     * <day-of-week> <day-of-month> Each of the above fields potentially introduce constraints. A
     * workrequest is created only when clock time satisfies all the constraints. Constraints
     * introduced: 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59]) 2. minutes = <mm>
     * (So, the allowed range for <mm> is [0, 59]) 3. hours = <hh> (So, the allowed range for <hh>
     * is [0, 23]) <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and
     * 7(Sunday)) 4. No constraint introduced when it is '*'. When not, day of week must equal the
     * given value <day-of-month> can be either '*' (without quotes or a number between 1 and 28) 5.
     * No constraint introduced when it is '*'. When not, day of month must equal the given value
     *
     * @return the value
     */
    public String getSchedule() {
        return schedule;
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
        sb.append("CreateSecurityAssessmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetType=").append(String.valueOf(this.targetType));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", templateAssessmentId=").append(String.valueOf(this.templateAssessmentId));
        sb.append(", baseSecurityAssessmentId=")
                .append(String.valueOf(this.baseSecurityAssessmentId));
        sb.append(", isAssessmentScheduled=").append(String.valueOf(this.isAssessmentScheduled));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
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
        if (!(o instanceof CreateSecurityAssessmentDetails)) {
            return false;
        }

        CreateSecurityAssessmentDetails other = (CreateSecurityAssessmentDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetType, other.targetType)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.templateAssessmentId, other.templateAssessmentId)
                && java.util.Objects.equals(
                        this.baseSecurityAssessmentId, other.baseSecurityAssessmentId)
                && java.util.Objects.equals(this.isAssessmentScheduled, other.isAssessmentScheduled)
                && java.util.Objects.equals(this.schedule, other.schedule)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.targetType == null ? 43 : this.targetType.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.templateAssessmentId == null
                                ? 43
                                : this.templateAssessmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.baseSecurityAssessmentId == null
                                ? 43
                                : this.baseSecurityAssessmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.isAssessmentScheduled == null
                                ? 43
                                : this.isAssessmentScheduled.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
