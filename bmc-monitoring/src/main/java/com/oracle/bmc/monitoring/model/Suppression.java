/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The configuration details for an alarm-wide suppression. For dimension-specific suppressions, see
 * {@link AlarmSuppression}.
 *
 * <p>For information about alarms, see [Alarms
 * Overview](https://docs.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#AlarmsOverview).
 * <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Suppression.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Suppression extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"description", "timeSuppressFrom", "timeSuppressUntil"})
    public Suppression(
            String description, java.util.Date timeSuppressFrom, java.util.Date timeSuppressUntil) {
        super();
        this.description = description;
        this.timeSuppressFrom = timeSuppressFrom;
        this.timeSuppressUntil = timeSuppressUntil;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Human-readable reason for suppressing alarm notifications. It does not have to be unique,
         * and it's changeable. Avoid entering confidential information.
         *
         * <p>Oracle recommends including tracking information for the event or associated work,
         * such as a ticket number.
         *
         * <p>Example: {@code Planned outage due to change IT-1234.}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Human-readable reason for suppressing alarm notifications. It does not have to be unique,
         * and it's changeable. Avoid entering confidential information.
         *
         * <p>Oracle recommends including tracking information for the event or associated work,
         * such as a ticket number.
         *
         * <p>Example: {@code Planned outage due to change IT-1234.}
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
         * The start date and time for the suppression to take place, inclusive. Format defined by
         * RFC3339.
         *
         * <p>Example: {@code 2023-02-01T01:02:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressFrom")
        private java.util.Date timeSuppressFrom;

        /**
         * The start date and time for the suppression to take place, inclusive. Format defined by
         * RFC3339.
         *
         * <p>Example: {@code 2023-02-01T01:02:29.600Z}
         *
         * @param timeSuppressFrom the value to set
         * @return this builder
         */
        public Builder timeSuppressFrom(java.util.Date timeSuppressFrom) {
            this.timeSuppressFrom = timeSuppressFrom;
            this.__explicitlySet__.add("timeSuppressFrom");
            return this;
        }
        /**
         * The end date and time for the suppression to take place, inclusive. Format defined by
         * RFC3339.
         *
         * <p>Example: {@code 2023-02-01T02:02:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressUntil")
        private java.util.Date timeSuppressUntil;

        /**
         * The end date and time for the suppression to take place, inclusive. Format defined by
         * RFC3339.
         *
         * <p>Example: {@code 2023-02-01T02:02:29.600Z}
         *
         * @param timeSuppressUntil the value to set
         * @return this builder
         */
        public Builder timeSuppressUntil(java.util.Date timeSuppressUntil) {
            this.timeSuppressUntil = timeSuppressUntil;
            this.__explicitlySet__.add("timeSuppressUntil");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Suppression build() {
            Suppression model =
                    new Suppression(
                            this.description, this.timeSuppressFrom, this.timeSuppressUntil);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Suppression model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeSuppressFrom")) {
                this.timeSuppressFrom(model.getTimeSuppressFrom());
            }
            if (model.wasPropertyExplicitlySet("timeSuppressUntil")) {
                this.timeSuppressUntil(model.getTimeSuppressUntil());
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
     * Human-readable reason for suppressing alarm notifications. It does not have to be unique, and
     * it's changeable. Avoid entering confidential information.
     *
     * <p>Oracle recommends including tracking information for the event or associated work, such as
     * a ticket number.
     *
     * <p>Example: {@code Planned outage due to change IT-1234.}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Human-readable reason for suppressing alarm notifications. It does not have to be unique, and
     * it's changeable. Avoid entering confidential information.
     *
     * <p>Oracle recommends including tracking information for the event or associated work, such as
     * a ticket number.
     *
     * <p>Example: {@code Planned outage due to change IT-1234.}
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The start date and time for the suppression to take place, inclusive. Format defined by
     * RFC3339.
     *
     * <p>Example: {@code 2023-02-01T01:02:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressFrom")
    private final java.util.Date timeSuppressFrom;

    /**
     * The start date and time for the suppression to take place, inclusive. Format defined by
     * RFC3339.
     *
     * <p>Example: {@code 2023-02-01T01:02:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeSuppressFrom() {
        return timeSuppressFrom;
    }

    /**
     * The end date and time for the suppression to take place, inclusive. Format defined by
     * RFC3339.
     *
     * <p>Example: {@code 2023-02-01T02:02:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeSuppressUntil")
    private final java.util.Date timeSuppressUntil;

    /**
     * The end date and time for the suppression to take place, inclusive. Format defined by
     * RFC3339.
     *
     * <p>Example: {@code 2023-02-01T02:02:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeSuppressUntil() {
        return timeSuppressUntil;
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
        sb.append("Suppression(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", timeSuppressFrom=").append(String.valueOf(this.timeSuppressFrom));
        sb.append(", timeSuppressUntil=").append(String.valueOf(this.timeSuppressUntil));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Suppression)) {
            return false;
        }

        Suppression other = (Suppression) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeSuppressFrom, other.timeSuppressFrom)
                && java.util.Objects.equals(this.timeSuppressUntil, other.timeSuppressUntil)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSuppressFrom == null ? 43 : this.timeSuppressFrom.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSuppressUntil == null ? 43 : this.timeSuppressUntil.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
