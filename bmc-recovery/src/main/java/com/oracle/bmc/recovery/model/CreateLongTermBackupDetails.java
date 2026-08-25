/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.model;

/**
 * Describes the parameters required to create an on demand long term backup. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateLongTermBackupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateLongTermBackupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "protectedDatabaseId",
        "retentionScn",
        "retentionPointInTime",
        "retentionPeriod",
        "freeformTags",
        "definedTags"
    })
    public CreateLongTermBackupDetails(
            String displayName,
            String protectedDatabaseId,
            Integer retentionScn,
            java.util.Date retentionPointInTime,
            java.util.List<RetentionPeriodValue> retentionPeriod,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.protectedDatabaseId = protectedDatabaseId;
        this.retentionScn = retentionScn;
        this.retentionPointInTime = retentionPointInTime;
        this.retentionPeriod = retentionPeriod;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user provided name for the long term backup. The 'displayName' does not have to be
         * unique, and it can be modified. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user provided name for the long term backup. The 'displayName' does not have to be
         * unique, and it can be modified. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the protected database for which you want to create the long-term backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("protectedDatabaseId")
        private String protectedDatabaseId;

        /**
         * The OCID of the protected database for which you want to create the long-term backup.
         *
         * @param protectedDatabaseId the value to set
         * @return this builder
         */
        public Builder protectedDatabaseId(String protectedDatabaseId) {
            this.protectedDatabaseId = protectedDatabaseId;
            this.__explicitlySet__.add("protectedDatabaseId");
            return this;
        }
        /**
         * The desired target point (SCN) at which you want to create the long-term backup of the
         * database.For example, specify the value as 1000 if you want to create the long-term
         * backup until SCN 1000. If you want to specify the target point as a time expression
         * instead of the SCN value, then use the longTermRetentionPointInTime parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionScn")
        private Integer retentionScn;

        /**
         * The desired target point (SCN) at which you want to create the long-term backup of the
         * database.For example, specify the value as 1000 if you want to create the long-term
         * backup until SCN 1000. If you want to specify the target point as a time expression
         * instead of the SCN value, then use the longTermRetentionPointInTime parameter.
         *
         * @param retentionScn the value to set
         * @return this builder
         */
        public Builder retentionScn(Integer retentionScn) {
            this.retentionScn = retentionScn;
            this.__explicitlySet__.add("retentionScn");
            return this;
        }
        /**
         * An RFC3339 formatted datetime string that indicates the desired target point in time in
         * the database at which you want to create the long-term backup. For example, if you want
         * the long-term backup to include all the changes until May 22 at 9:10 PM, then specify the
         * value as, '2020-05-22T21:10:00.000Z'. If you want to specify the target point as an SCN
         * value instead of the target time, then use the databaseSCN parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPointInTime")
        private java.util.Date retentionPointInTime;

        /**
         * An RFC3339 formatted datetime string that indicates the desired target point in time in
         * the database at which you want to create the long-term backup. For example, if you want
         * the long-term backup to include all the changes until May 22 at 9:10 PM, then specify the
         * value as, '2020-05-22T21:10:00.000Z'. If you want to specify the target point as an SCN
         * value instead of the target time, then use the databaseSCN parameter.
         *
         * @param retentionPointInTime the value to set
         * @return this builder
         */
        public Builder retentionPointInTime(java.util.Date retentionPointInTime) {
            this.retentionPointInTime = retentionPointInTime;
            this.__explicitlySet__.add("retentionPointInTime");
            return this;
        }
        /**
         * The maximum period to retain the long-term backup. Specify the retention period type and
         * the duration for the long-term backup. If you have chosen the retention period type as
         * 'DAYS', then specify a duration ranging from 90 days to 3650 days. If you have chosen the
         * retention period type as 'YEARS', then specify a duration ranging from 1 year to 10
         * years.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriod")
        private java.util.List<RetentionPeriodValue> retentionPeriod;

        /**
         * The maximum period to retain the long-term backup. Specify the retention period type and
         * the duration for the long-term backup. If you have chosen the retention period type as
         * 'DAYS', then specify a duration ranging from 90 days to 3650 days. If you have chosen the
         * retention period type as 'YEARS', then specify a duration ranging from 1 year to 10
         * years.
         *
         * @param retentionPeriod the value to set
         * @return this builder
         */
        public Builder retentionPeriod(java.util.List<RetentionPeriodValue> retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            this.__explicitlySet__.add("retentionPeriod");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see
         * [Resource
         * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see
         * [Resource
         * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
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

        public CreateLongTermBackupDetails build() {
            CreateLongTermBackupDetails model =
                    new CreateLongTermBackupDetails(
                            this.displayName,
                            this.protectedDatabaseId,
                            this.retentionScn,
                            this.retentionPointInTime,
                            this.retentionPeriod,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLongTermBackupDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("protectedDatabaseId")) {
                this.protectedDatabaseId(model.getProtectedDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("retentionScn")) {
                this.retentionScn(model.getRetentionScn());
            }
            if (model.wasPropertyExplicitlySet("retentionPointInTime")) {
                this.retentionPointInTime(model.getRetentionPointInTime());
            }
            if (model.wasPropertyExplicitlySet("retentionPeriod")) {
                this.retentionPeriod(model.getRetentionPeriod());
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

    /**
     * A user provided name for the long term backup. The 'displayName' does not have to be unique,
     * and it can be modified. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user provided name for the long term backup. The 'displayName' does not have to be unique,
     * and it can be modified. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the protected database for which you want to create the long-term backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("protectedDatabaseId")
    private final String protectedDatabaseId;

    /**
     * The OCID of the protected database for which you want to create the long-term backup.
     *
     * @return the value
     */
    public String getProtectedDatabaseId() {
        return protectedDatabaseId;
    }

    /**
     * The desired target point (SCN) at which you want to create the long-term backup of the
     * database.For example, specify the value as 1000 if you want to create the long-term backup
     * until SCN 1000. If you want to specify the target point as a time expression instead of the
     * SCN value, then use the longTermRetentionPointInTime parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionScn")
    private final Integer retentionScn;

    /**
     * The desired target point (SCN) at which you want to create the long-term backup of the
     * database.For example, specify the value as 1000 if you want to create the long-term backup
     * until SCN 1000. If you want to specify the target point as a time expression instead of the
     * SCN value, then use the longTermRetentionPointInTime parameter.
     *
     * @return the value
     */
    public Integer getRetentionScn() {
        return retentionScn;
    }

    /**
     * An RFC3339 formatted datetime string that indicates the desired target point in time in the
     * database at which you want to create the long-term backup. For example, if you want the
     * long-term backup to include all the changes until May 22 at 9:10 PM, then specify the value
     * as, '2020-05-22T21:10:00.000Z'. If you want to specify the target point as an SCN value
     * instead of the target time, then use the databaseSCN parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPointInTime")
    private final java.util.Date retentionPointInTime;

    /**
     * An RFC3339 formatted datetime string that indicates the desired target point in time in the
     * database at which you want to create the long-term backup. For example, if you want the
     * long-term backup to include all the changes until May 22 at 9:10 PM, then specify the value
     * as, '2020-05-22T21:10:00.000Z'. If you want to specify the target point as an SCN value
     * instead of the target time, then use the databaseSCN parameter.
     *
     * @return the value
     */
    public java.util.Date getRetentionPointInTime() {
        return retentionPointInTime;
    }

    /**
     * The maximum period to retain the long-term backup. Specify the retention period type and the
     * duration for the long-term backup. If you have chosen the retention period type as 'DAYS',
     * then specify a duration ranging from 90 days to 3650 days. If you have chosen the retention
     * period type as 'YEARS', then specify a duration ranging from 1 year to 10 years.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriod")
    private final java.util.List<RetentionPeriodValue> retentionPeriod;

    /**
     * The maximum period to retain the long-term backup. Specify the retention period type and the
     * duration for the long-term backup. If you have chosen the retention period type as 'DAYS',
     * then specify a duration ranging from 90 days to 3650 days. If you have chosen the retention
     * period type as 'YEARS', then specify a duration ranging from 1 year to 10 years.
     *
     * @return the value
     */
    public java.util.List<RetentionPeriodValue> getRetentionPeriod() {
        return retentionPeriod;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see [Resource
     * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}. For more information, see [Resource
     * Tags](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/resourcetags.htm)
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
        sb.append("CreateLongTermBackupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", protectedDatabaseId=").append(String.valueOf(this.protectedDatabaseId));
        sb.append(", retentionScn=").append(String.valueOf(this.retentionScn));
        sb.append(", retentionPointInTime=").append(String.valueOf(this.retentionPointInTime));
        sb.append(", retentionPeriod=").append(String.valueOf(this.retentionPeriod));
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
        if (!(o instanceof CreateLongTermBackupDetails)) {
            return false;
        }

        CreateLongTermBackupDetails other = (CreateLongTermBackupDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.protectedDatabaseId, other.protectedDatabaseId)
                && java.util.Objects.equals(this.retentionScn, other.retentionScn)
                && java.util.Objects.equals(this.retentionPointInTime, other.retentionPointInTime)
                && java.util.Objects.equals(this.retentionPeriod, other.retentionPeriod)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.protectedDatabaseId == null
                                ? 43
                                : this.protectedDatabaseId.hashCode());
        result = (result * PRIME) + (this.retentionScn == null ? 43 : this.retentionScn.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPointInTime == null
                                ? 43
                                : this.retentionPointInTime.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPeriod == null ? 43 : this.retentionPeriod.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
