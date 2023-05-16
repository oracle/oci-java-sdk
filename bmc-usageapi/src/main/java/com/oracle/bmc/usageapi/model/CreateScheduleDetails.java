/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The saved schedule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateScheduleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateScheduleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "compartmentId",
        "description",
        "outputFileFormat",
        "savedReportId",
        "resultLocation",
        "scheduleRecurrences",
        "timeScheduled",
        "queryProperties",
        "freeformTags",
        "definedTags"
    })
    public CreateScheduleDetails(
            String name,
            String compartmentId,
            String description,
            OutputFileFormat outputFileFormat,
            String savedReportId,
            ResultLocation resultLocation,
            String scheduleRecurrences,
            java.util.Date timeScheduled,
            QueryProperties queryProperties,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.name = name;
        this.compartmentId = compartmentId;
        this.description = description;
        this.outputFileFormat = outputFileFormat;
        this.savedReportId = savedReportId;
        this.resultLocation = resultLocation;
        this.scheduleRecurrences = scheduleRecurrences;
        this.timeScheduled = timeScheduled;
        this.queryProperties = queryProperties;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique name of the user-created schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The unique name of the user-created schedule.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The customer tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The customer tenancy.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The description of the schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the schedule.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Specifies supported output file format. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputFileFormat")
        private OutputFileFormat outputFileFormat;

        /**
         * Specifies supported output file format.
         *
         * @param outputFileFormat the value to set
         * @return this builder
         */
        public Builder outputFileFormat(OutputFileFormat outputFileFormat) {
            this.outputFileFormat = outputFileFormat;
            this.__explicitlySet__.add("outputFileFormat");
            return this;
        }
        /** The saved report id which can also be used to generate query. */
        @com.fasterxml.jackson.annotation.JsonProperty("savedReportId")
        private String savedReportId;

        /**
         * The saved report id which can also be used to generate query.
         *
         * @param savedReportId the value to set
         * @return this builder
         */
        public Builder savedReportId(String savedReportId) {
            this.savedReportId = savedReportId;
            this.__explicitlySet__.add("savedReportId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resultLocation")
        private ResultLocation resultLocation;

        public Builder resultLocation(ResultLocation resultLocation) {
            this.resultLocation = resultLocation;
            this.__explicitlySet__.add("resultLocation");
            return this;
        }
        /**
         * Specifies the frequency according to when the schedule will be run, in the
         * x-obmcs-recurring-time format described in [RFC 5545 section
         * 3.3.10](https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10). Supported values
         * are : ONE_TIME, DAILY, WEEKLY and MONTHLY.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleRecurrences")
        private String scheduleRecurrences;

        /**
         * Specifies the frequency according to when the schedule will be run, in the
         * x-obmcs-recurring-time format described in [RFC 5545 section
         * 3.3.10](https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10). Supported values
         * are : ONE_TIME, DAILY, WEEKLY and MONTHLY.
         *
         * @param scheduleRecurrences the value to set
         * @return this builder
         */
        public Builder scheduleRecurrences(String scheduleRecurrences) {
            this.scheduleRecurrences = scheduleRecurrences;
            this.__explicitlySet__.add("scheduleRecurrences");
            return this;
        }
        /** The date and time of the first time job execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        /**
         * The date and time of the first time job execution.
         *
         * @param timeScheduled the value to set
         * @return this builder
         */
        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryProperties")
        private QueryProperties queryProperties;

        public Builder queryProperties(QueryProperties queryProperties) {
            this.queryProperties = queryProperties;
            this.__explicitlySet__.add("queryProperties");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        public CreateScheduleDetails build() {
            CreateScheduleDetails model =
                    new CreateScheduleDetails(
                            this.name,
                            this.compartmentId,
                            this.description,
                            this.outputFileFormat,
                            this.savedReportId,
                            this.resultLocation,
                            this.scheduleRecurrences,
                            this.timeScheduled,
                            this.queryProperties,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateScheduleDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("outputFileFormat")) {
                this.outputFileFormat(model.getOutputFileFormat());
            }
            if (model.wasPropertyExplicitlySet("savedReportId")) {
                this.savedReportId(model.getSavedReportId());
            }
            if (model.wasPropertyExplicitlySet("resultLocation")) {
                this.resultLocation(model.getResultLocation());
            }
            if (model.wasPropertyExplicitlySet("scheduleRecurrences")) {
                this.scheduleRecurrences(model.getScheduleRecurrences());
            }
            if (model.wasPropertyExplicitlySet("timeScheduled")) {
                this.timeScheduled(model.getTimeScheduled());
            }
            if (model.wasPropertyExplicitlySet("queryProperties")) {
                this.queryProperties(model.getQueryProperties());
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

    /** The unique name of the user-created schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The unique name of the user-created schedule.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The customer tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The customer tenancy.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The description of the schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the schedule.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Specifies supported output file format. */
    public enum OutputFileFormat implements com.oracle.bmc.http.internal.BmcEnum {
        Csv("CSV"),
        Pdf("PDF"),
        ;

        private final String value;
        private static java.util.Map<String, OutputFileFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (OutputFileFormat v : OutputFileFormat.values()) {
                map.put(v.getValue(), v);
            }
        }

        OutputFileFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OutputFileFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid OutputFileFormat: " + key);
        }
    };
    /** Specifies supported output file format. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputFileFormat")
    private final OutputFileFormat outputFileFormat;

    /**
     * Specifies supported output file format.
     *
     * @return the value
     */
    public OutputFileFormat getOutputFileFormat() {
        return outputFileFormat;
    }

    /** The saved report id which can also be used to generate query. */
    @com.fasterxml.jackson.annotation.JsonProperty("savedReportId")
    private final String savedReportId;

    /**
     * The saved report id which can also be used to generate query.
     *
     * @return the value
     */
    public String getSavedReportId() {
        return savedReportId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resultLocation")
    private final ResultLocation resultLocation;

    public ResultLocation getResultLocation() {
        return resultLocation;
    }

    /**
     * Specifies the frequency according to when the schedule will be run, in the
     * x-obmcs-recurring-time format described in [RFC 5545 section
     * 3.3.10](https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10). Supported values are :
     * ONE_TIME, DAILY, WEEKLY and MONTHLY.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleRecurrences")
    private final String scheduleRecurrences;

    /**
     * Specifies the frequency according to when the schedule will be run, in the
     * x-obmcs-recurring-time format described in [RFC 5545 section
     * 3.3.10](https://datatracker.ietf.org/doc/html/rfc5545#section-3.3.10). Supported values are :
     * ONE_TIME, DAILY, WEEKLY and MONTHLY.
     *
     * @return the value
     */
    public String getScheduleRecurrences() {
        return scheduleRecurrences;
    }

    /** The date and time of the first time job execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    private final java.util.Date timeScheduled;

    /**
     * The date and time of the first time job execution.
     *
     * @return the value
     */
    public java.util.Date getTimeScheduled() {
        return timeScheduled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("queryProperties")
    private final QueryProperties queryProperties;

    public QueryProperties getQueryProperties() {
        return queryProperties;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        sb.append("CreateScheduleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", outputFileFormat=").append(String.valueOf(this.outputFileFormat));
        sb.append(", savedReportId=").append(String.valueOf(this.savedReportId));
        sb.append(", resultLocation=").append(String.valueOf(this.resultLocation));
        sb.append(", scheduleRecurrences=").append(String.valueOf(this.scheduleRecurrences));
        sb.append(", timeScheduled=").append(String.valueOf(this.timeScheduled));
        sb.append(", queryProperties=").append(String.valueOf(this.queryProperties));
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
        if (!(o instanceof CreateScheduleDetails)) {
            return false;
        }

        CreateScheduleDetails other = (CreateScheduleDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.outputFileFormat, other.outputFileFormat)
                && java.util.Objects.equals(this.savedReportId, other.savedReportId)
                && java.util.Objects.equals(this.resultLocation, other.resultLocation)
                && java.util.Objects.equals(this.scheduleRecurrences, other.scheduleRecurrences)
                && java.util.Objects.equals(this.timeScheduled, other.timeScheduled)
                && java.util.Objects.equals(this.queryProperties, other.queryProperties)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.outputFileFormat == null ? 43 : this.outputFileFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.savedReportId == null ? 43 : this.savedReportId.hashCode());
        result =
                (result * PRIME)
                        + (this.resultLocation == null ? 43 : this.resultLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleRecurrences == null
                                ? 43
                                : this.scheduleRecurrences.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduled == null ? 43 : this.timeScheduled.hashCode());
        result =
                (result * PRIME)
                        + (this.queryProperties == null ? 43 : this.queryProperties.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
