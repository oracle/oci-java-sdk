/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The alarm target of the alarm suppression. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AlarmSuppressionAlarmTarget.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "targetType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AlarmSuppressionAlarmTarget extends AlarmSuppressionTarget {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * alarm that is the target of the alarm suppression.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("alarmId")
        private String alarmId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * alarm that is the target of the alarm suppression.
         *
         * @param alarmId the value to set
         * @return this builder
         */
        public Builder alarmId(String alarmId) {
            this.alarmId = alarmId;
            this.__explicitlySet__.add("alarmId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AlarmSuppressionAlarmTarget build() {
            AlarmSuppressionAlarmTarget model = new AlarmSuppressionAlarmTarget(this.alarmId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AlarmSuppressionAlarmTarget model) {
            if (model.wasPropertyExplicitlySet("alarmId")) {
                this.alarmId(model.getAlarmId());
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

    @Deprecated
    public AlarmSuppressionAlarmTarget(String alarmId) {
        super();
        this.alarmId = alarmId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * alarm that is the target of the alarm suppression.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alarmId")
    private final String alarmId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * alarm that is the target of the alarm suppression.
     *
     * @return the value
     */
    public String getAlarmId() {
        return alarmId;
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
        sb.append("AlarmSuppressionAlarmTarget(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", alarmId=").append(String.valueOf(this.alarmId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlarmSuppressionAlarmTarget)) {
            return false;
        }

        AlarmSuppressionAlarmTarget other = (AlarmSuppressionAlarmTarget) o;
        return java.util.Objects.equals(this.alarmId, other.alarmId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.alarmId == null ? 43 : this.alarmId.hashCode());
        return result;
    }
}
