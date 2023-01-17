/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details for the report generation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GenerateReportDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class GenerateReportDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "targetIds",
        "description",
        "compartmentId",
        "mimeType",
        "timeLessThan",
        "timeGreaterThan",
        "rowLimit"
    })
    public GenerateReportDetails(
            String displayName,
            java.util.List<String> targetIds,
            String description,
            String compartmentId,
            MimeType mimeType,
            java.util.Date timeLessThan,
            java.util.Date timeGreaterThan,
            Integer rowLimit) {
        super();
        this.displayName = displayName;
        this.targetIds = targetIds;
        this.description = description;
        this.compartmentId = compartmentId;
        this.mimeType = mimeType;
        this.timeLessThan = timeLessThan;
        this.timeGreaterThan = timeGreaterThan;
        this.rowLimit = rowLimit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the report to be generated */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the report to be generated
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Array of database target OCIDs. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetIds")
        private java.util.List<String> targetIds;

        /**
         * Array of database target OCIDs.
         *
         * @param targetIds the value to set
         * @return this builder
         */
        public Builder targetIds(java.util.List<String> targetIds) {
            this.targetIds = targetIds;
            this.__explicitlySet__.add("targetIds");
            return this;
        }
        /** The description of the report to be generated */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the report to be generated
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment into which the resource should be moved.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment into which the resource should be moved.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Specifies the format of report to be excel or pdf */
        @com.fasterxml.jackson.annotation.JsonProperty("mimeType")
        private MimeType mimeType;

        /**
         * Specifies the format of report to be excel or pdf
         *
         * @param mimeType the value to set
         * @return this builder
         */
        public Builder mimeType(MimeType mimeType) {
            this.mimeType = mimeType;
            this.__explicitlySet__.add("mimeType");
            return this;
        }
        /** Specifies the time before which the data needs to be reported. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLessThan")
        private java.util.Date timeLessThan;

        /**
         * Specifies the time before which the data needs to be reported.
         *
         * @param timeLessThan the value to set
         * @return this builder
         */
        public Builder timeLessThan(java.util.Date timeLessThan) {
            this.timeLessThan = timeLessThan;
            this.__explicitlySet__.add("timeLessThan");
            return this;
        }
        /** Specifies the time after which the data needs to be reported. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeGreaterThan")
        private java.util.Date timeGreaterThan;

        /**
         * Specifies the time after which the data needs to be reported.
         *
         * @param timeGreaterThan the value to set
         * @return this builder
         */
        public Builder timeGreaterThan(java.util.Date timeGreaterThan) {
            this.timeGreaterThan = timeGreaterThan;
            this.__explicitlySet__.add("timeGreaterThan");
            return this;
        }
        /** Specifies the limit on number of rows in report. */
        @com.fasterxml.jackson.annotation.JsonProperty("rowLimit")
        private Integer rowLimit;

        /**
         * Specifies the limit on number of rows in report.
         *
         * @param rowLimit the value to set
         * @return this builder
         */
        public Builder rowLimit(Integer rowLimit) {
            this.rowLimit = rowLimit;
            this.__explicitlySet__.add("rowLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateReportDetails build() {
            GenerateReportDetails model =
                    new GenerateReportDetails(
                            this.displayName,
                            this.targetIds,
                            this.description,
                            this.compartmentId,
                            this.mimeType,
                            this.timeLessThan,
                            this.timeGreaterThan,
                            this.rowLimit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateReportDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("targetIds")) {
                this.targetIds(model.getTargetIds());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("mimeType")) {
                this.mimeType(model.getMimeType());
            }
            if (model.wasPropertyExplicitlySet("timeLessThan")) {
                this.timeLessThan(model.getTimeLessThan());
            }
            if (model.wasPropertyExplicitlySet("timeGreaterThan")) {
                this.timeGreaterThan(model.getTimeGreaterThan());
            }
            if (model.wasPropertyExplicitlySet("rowLimit")) {
                this.rowLimit(model.getRowLimit());
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

    /** The name of the report to be generated */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the report to be generated
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Array of database target OCIDs. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetIds")
    private final java.util.List<String> targetIds;

    /**
     * Array of database target OCIDs.
     *
     * @return the value
     */
    public java.util.List<String> getTargetIds() {
        return targetIds;
    }

    /** The description of the report to be generated */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the report to be generated
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment into which the resource should be moved.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment into which the resource should be moved.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Specifies the format of report to be excel or pdf */
    public enum MimeType implements com.oracle.bmc.http.internal.BmcEnum {
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
    /** Specifies the format of report to be excel or pdf */
    @com.fasterxml.jackson.annotation.JsonProperty("mimeType")
    private final MimeType mimeType;

    /**
     * Specifies the format of report to be excel or pdf
     *
     * @return the value
     */
    public MimeType getMimeType() {
        return mimeType;
    }

    /** Specifies the time before which the data needs to be reported. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLessThan")
    private final java.util.Date timeLessThan;

    /**
     * Specifies the time before which the data needs to be reported.
     *
     * @return the value
     */
    public java.util.Date getTimeLessThan() {
        return timeLessThan;
    }

    /** Specifies the time after which the data needs to be reported. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeGreaterThan")
    private final java.util.Date timeGreaterThan;

    /**
     * Specifies the time after which the data needs to be reported.
     *
     * @return the value
     */
    public java.util.Date getTimeGreaterThan() {
        return timeGreaterThan;
    }

    /** Specifies the limit on number of rows in report. */
    @com.fasterxml.jackson.annotation.JsonProperty("rowLimit")
    private final Integer rowLimit;

    /**
     * Specifies the limit on number of rows in report.
     *
     * @return the value
     */
    public Integer getRowLimit() {
        return rowLimit;
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
        sb.append("GenerateReportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", targetIds=").append(String.valueOf(this.targetIds));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", mimeType=").append(String.valueOf(this.mimeType));
        sb.append(", timeLessThan=").append(String.valueOf(this.timeLessThan));
        sb.append(", timeGreaterThan=").append(String.valueOf(this.timeGreaterThan));
        sb.append(", rowLimit=").append(String.valueOf(this.rowLimit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateReportDetails)) {
            return false;
        }

        GenerateReportDetails other = (GenerateReportDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.targetIds, other.targetIds)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.mimeType, other.mimeType)
                && java.util.Objects.equals(this.timeLessThan, other.timeLessThan)
                && java.util.Objects.equals(this.timeGreaterThan, other.timeGreaterThan)
                && java.util.Objects.equals(this.rowLimit, other.rowLimit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.targetIds == null ? 43 : this.targetIds.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.mimeType == null ? 43 : this.mimeType.hashCode());
        result = (result * PRIME) + (this.timeLessThan == null ? 43 : this.timeLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.timeGreaterThan == null ? 43 : this.timeGreaterThan.hashCode());
        result = (result * PRIME) + (this.rowLimit == null ? 43 : this.rowLimit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
