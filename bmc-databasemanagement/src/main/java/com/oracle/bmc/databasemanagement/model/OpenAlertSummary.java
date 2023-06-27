/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * An alert from the Exadata storage server. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OpenAlertSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OpenAlertSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"severity", "type", "timeStartAt", "message"})
    public OpenAlertSummary(
            AlertSeverityEnum severity,
            AlertTypeEnum type,
            java.util.Date timeStartAt,
            String message) {
        super();
        this.severity = severity;
        this.type = type;
        this.timeStartAt = timeStartAt;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The severity of the alert. */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private AlertSeverityEnum severity;

        /**
         * The severity of the alert.
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(AlertSeverityEnum severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /** The type of alert. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private AlertTypeEnum type;

        /**
         * The type of alert.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(AlertTypeEnum type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The start time of the alert. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStartAt")
        private java.util.Date timeStartAt;

        /**
         * The start time of the alert.
         *
         * @param timeStartAt the value to set
         * @return this builder
         */
        public Builder timeStartAt(java.util.Date timeStartAt) {
            this.timeStartAt = timeStartAt;
            this.__explicitlySet__.add("timeStartAt");
            return this;
        }
        /** The alert message. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * The alert message.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpenAlertSummary build() {
            OpenAlertSummary model =
                    new OpenAlertSummary(this.severity, this.type, this.timeStartAt, this.message);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpenAlertSummary model) {
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("timeStartAt")) {
                this.timeStartAt(model.getTimeStartAt());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
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

    /** The severity of the alert. */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final AlertSeverityEnum severity;

    /**
     * The severity of the alert.
     *
     * @return the value
     */
    public AlertSeverityEnum getSeverity() {
        return severity;
    }

    /** The type of alert. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final AlertTypeEnum type;

    /**
     * The type of alert.
     *
     * @return the value
     */
    public AlertTypeEnum getType() {
        return type;
    }

    /** The start time of the alert. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStartAt")
    private final java.util.Date timeStartAt;

    /**
     * The start time of the alert.
     *
     * @return the value
     */
    public java.util.Date getTimeStartAt() {
        return timeStartAt;
    }

    /** The alert message. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * The alert message.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
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
        sb.append("OpenAlertSummary(");
        sb.append("super=").append(super.toString());
        sb.append("severity=").append(String.valueOf(this.severity));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", timeStartAt=").append(String.valueOf(this.timeStartAt));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpenAlertSummary)) {
            return false;
        }

        OpenAlertSummary other = (OpenAlertSummary) o;
        return java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.timeStartAt, other.timeStartAt)
                && java.util.Objects.equals(this.message, other.message)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.timeStartAt == null ? 43 : this.timeStartAt.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
