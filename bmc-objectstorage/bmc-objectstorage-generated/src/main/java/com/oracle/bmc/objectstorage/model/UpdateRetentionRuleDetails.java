/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * The details to update a retention rule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateRetentionRuleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateRetentionRuleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "duration", "timeRuleLocked"})
    public UpdateRetentionRuleDetails(
            String displayName, Duration duration, java.util.Date timeRuleLocked) {
        super();
        this.displayName = displayName;
        this.duration = duration;
        this.timeRuleLocked = timeRuleLocked;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-specified name for the retention rule. Names can be helpful in identifying
         * retention rules. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-specified name for the retention rule. Names can be helpful in identifying
         * retention rules. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private Duration duration;

        public Builder duration(Duration duration) {
            this.duration = duration;
            this.__explicitlySet__.add("duration");
            return this;
        }
        /**
         * The date and time as per [RFC 3339](https://tools.ietf.org/html/rfc3339) after which this
         * rule is locked and can only be deleted by deleting the bucket. Once a rule is locked,
         * only increases in the duration are allowed and no other properties can be changed. This
         * property cannot be updated for rules that are in a locked state. Specifying it when a
         * duration is not specified is considered an error.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRuleLocked")
        private java.util.Date timeRuleLocked;

        /**
         * The date and time as per [RFC 3339](https://tools.ietf.org/html/rfc3339) after which this
         * rule is locked and can only be deleted by deleting the bucket. Once a rule is locked,
         * only increases in the duration are allowed and no other properties can be changed. This
         * property cannot be updated for rules that are in a locked state. Specifying it when a
         * duration is not specified is considered an error.
         *
         * @param timeRuleLocked the value to set
         * @return this builder
         */
        public Builder timeRuleLocked(java.util.Date timeRuleLocked) {
            this.timeRuleLocked = timeRuleLocked;
            this.__explicitlySet__.add("timeRuleLocked");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateRetentionRuleDetails build() {
            UpdateRetentionRuleDetails model =
                    new UpdateRetentionRuleDetails(
                            this.displayName, this.duration, this.timeRuleLocked);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRetentionRuleDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("duration")) {
                this.duration(model.getDuration());
            }
            if (model.wasPropertyExplicitlySet("timeRuleLocked")) {
                this.timeRuleLocked(model.getTimeRuleLocked());
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
     * A user-specified name for the retention rule. Names can be helpful in identifying retention
     * rules. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-specified name for the retention rule. Names can be helpful in identifying retention
     * rules. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    private final Duration duration;

    public Duration getDuration() {
        return duration;
    }

    /**
     * The date and time as per [RFC 3339](https://tools.ietf.org/html/rfc3339) after which this
     * rule is locked and can only be deleted by deleting the bucket. Once a rule is locked, only
     * increases in the duration are allowed and no other properties can be changed. This property
     * cannot be updated for rules that are in a locked state. Specifying it when a duration is not
     * specified is considered an error.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRuleLocked")
    private final java.util.Date timeRuleLocked;

    /**
     * The date and time as per [RFC 3339](https://tools.ietf.org/html/rfc3339) after which this
     * rule is locked and can only be deleted by deleting the bucket. Once a rule is locked, only
     * increases in the duration are allowed and no other properties can be changed. This property
     * cannot be updated for rules that are in a locked state. Specifying it when a duration is not
     * specified is considered an error.
     *
     * @return the value
     */
    public java.util.Date getTimeRuleLocked() {
        return timeRuleLocked;
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
        sb.append("UpdateRetentionRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", duration=").append(String.valueOf(this.duration));
        sb.append(", timeRuleLocked=").append(String.valueOf(this.timeRuleLocked));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateRetentionRuleDetails)) {
            return false;
        }

        UpdateRetentionRuleDetails other = (UpdateRetentionRuleDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.duration, other.duration)
                && java.util.Objects.equals(this.timeRuleLocked, other.timeRuleLocked)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.duration == null ? 43 : this.duration.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRuleLocked == null ? 43 : this.timeRuleLocked.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
