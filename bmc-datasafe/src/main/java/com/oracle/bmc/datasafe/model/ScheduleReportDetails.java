/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details for the report schedule.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ScheduleReportDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScheduleReportDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "schedule",
        "mimeType",
        "compartmentId",
        "reportDetails"
    })
    public ScheduleReportDetails(
            String displayName,
            String schedule,
            MimeType mimeType,
            String compartmentId,
            ReportDetails reportDetails) {
        super();
        this.displayName = displayName;
        this.schedule = schedule;
        this.mimeType = mimeType;
        this.compartmentId = compartmentId;
        this.reportDetails = reportDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the report to be scheduled
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the report to be scheduled
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Schedule to generate the report periodically in the specified format:
         * <version-string>;<version-specific-schedule>
         * <p>
         * Allowed version strings - "v1"
         * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
         * Each of the above fields potentially introduce constraints. A workrequest is created only
         * when clock time satisfies all the constraints. Constraints introduced:
         * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
         * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
         * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
         * 4. <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
         * No constraint introduced when it is '*'. When not, day of week must equal the given value
         * 5. <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
         * No constraint introduced when it is '*'. When not, day of month must equal the given value
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private String schedule;

        /**
         * Schedule to generate the report periodically in the specified format:
         * <version-string>;<version-specific-schedule>
         * <p>
         * Allowed version strings - "v1"
         * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
         * Each of the above fields potentially introduce constraints. A workrequest is created only
         * when clock time satisfies all the constraints. Constraints introduced:
         * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
         * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
         * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
         * 4. <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
         * No constraint introduced when it is '*'. When not, day of week must equal the given value
         * 5. <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
         * No constraint introduced when it is '*'. When not, day of month must equal the given value
         *
         * @param schedule the value to set
         * @return this builder
         **/
        public Builder schedule(String schedule) {
            this.schedule = schedule;
            this.__explicitlySet__.add("schedule");
            return this;
        }
        /**
         * Specifies the format of report to be excel or pdf
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mimeType")
        private MimeType mimeType;

        /**
         * Specifies the format of report to be excel or pdf
         * @param mimeType the value to set
         * @return this builder
         **/
        public Builder mimeType(MimeType mimeType) {
            this.mimeType = mimeType;
            this.__explicitlySet__.add("mimeType");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment
         * in which the resource should be created.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment
         * in which the resource should be created.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reportDetails")
        private ReportDetails reportDetails;

        public Builder reportDetails(ReportDetails reportDetails) {
            this.reportDetails = reportDetails;
            this.__explicitlySet__.add("reportDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduleReportDetails build() {
            ScheduleReportDetails model =
                    new ScheduleReportDetails(
                            this.displayName,
                            this.schedule,
                            this.mimeType,
                            this.compartmentId,
                            this.reportDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduleReportDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("schedule")) {
                this.schedule(model.getSchedule());
            }
            if (model.wasPropertyExplicitlySet("mimeType")) {
                this.mimeType(model.getMimeType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("reportDetails")) {
                this.reportDetails(model.getReportDetails());
            }
            return this;
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
     * The name of the report to be scheduled
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the report to be scheduled
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Schedule to generate the report periodically in the specified format:
     * <version-string>;<version-specific-schedule>
     * <p>
     * Allowed version strings - "v1"
     * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
     * Each of the above fields potentially introduce constraints. A workrequest is created only
     * when clock time satisfies all the constraints. Constraints introduced:
     * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
     * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
     * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
     * 4. <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
     * No constraint introduced when it is '*'. When not, day of week must equal the given value
     * 5. <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
     * No constraint introduced when it is '*'. When not, day of month must equal the given value
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final String schedule;

    /**
     * Schedule to generate the report periodically in the specified format:
     * <version-string>;<version-specific-schedule>
     * <p>
     * Allowed version strings - "v1"
     * v1's version specific schedule -<ss> <mm> <hh> <day-of-week> <day-of-month>
     * Each of the above fields potentially introduce constraints. A workrequest is created only
     * when clock time satisfies all the constraints. Constraints introduced:
     * 1. seconds = <ss> (So, the allowed range for <ss> is [0, 59])
     * 2. minutes = <mm> (So, the allowed range for <mm> is [0, 59])
     * 3. hours = <hh> (So, the allowed range for <hh> is [0, 23])
     * 4. <day-of-week> can be either '*' (without quotes or a number between 1(Monday) and 7(Sunday))
     * No constraint introduced when it is '*'. When not, day of week must equal the given value
     * 5. <day-of-month> can be either '*' (without quotes or a number between 1 and 28)
     * No constraint introduced when it is '*'. When not, day of month must equal the given value
     *
     * @return the value
     **/
    public String getSchedule() {
        return schedule;
    }

    /**
     * Specifies the format of report to be excel or pdf
     **/
    public enum MimeType {
        Pdf("PDF"),
        Xls("XLS"),
        ;

        private final String value;
        private static java.util.Map<String, MimeType> map;

        static {
            map = new java.util.HashMap<>();
            for (MimeType v : MimeType.values()) {
                map.put(v.getValue(), v);
            }
        }

        MimeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MimeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid MimeType: " + key);
        }
    };
    /**
     * Specifies the format of report to be excel or pdf
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mimeType")
    private final MimeType mimeType;

    /**
     * Specifies the format of report to be excel or pdf
     * @return the value
     **/
    public MimeType getMimeType() {
        return mimeType;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment
     * in which the resource should be created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment
     * in which the resource should be created.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("reportDetails")
    private final ReportDetails reportDetails;

    public ReportDetails getReportDetails() {
        return reportDetails;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ScheduleReportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(", mimeType=").append(String.valueOf(this.mimeType));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", reportDetails=").append(String.valueOf(this.reportDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduleReportDetails)) {
            return false;
        }

        ScheduleReportDetails other = (ScheduleReportDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.schedule, other.schedule)
                && java.util.Objects.equals(this.mimeType, other.mimeType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.reportDetails, other.reportDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result = (result * PRIME) + (this.mimeType == null ? 43 : this.mimeType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.reportDetails == null ? 43 : this.reportDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
