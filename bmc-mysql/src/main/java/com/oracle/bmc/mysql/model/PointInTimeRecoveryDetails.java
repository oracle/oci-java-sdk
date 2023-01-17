/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Point-in-time Recovery details like earliest and latest recovery time point for the DB System.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PointInTimeRecoveryDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PointInTimeRecoveryDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeEarliestRecoveryPoint", "timeLatestRecoveryPoint"})
    public PointInTimeRecoveryDetails(
            java.util.Date timeEarliestRecoveryPoint, java.util.Date timeLatestRecoveryPoint) {
        super();
        this.timeEarliestRecoveryPoint = timeEarliestRecoveryPoint;
        this.timeLatestRecoveryPoint = timeLatestRecoveryPoint;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Earliest recovery time point for the DB System, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEarliestRecoveryPoint")
        private java.util.Date timeEarliestRecoveryPoint;

        /**
         * Earliest recovery time point for the DB System, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeEarliestRecoveryPoint the value to set
         * @return this builder
         **/
        public Builder timeEarliestRecoveryPoint(java.util.Date timeEarliestRecoveryPoint) {
            this.timeEarliestRecoveryPoint = timeEarliestRecoveryPoint;
            this.__explicitlySet__.add("timeEarliestRecoveryPoint");
            return this;
        }
        /**
         * Latest recovery time point for the DB System, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLatestRecoveryPoint")
        private java.util.Date timeLatestRecoveryPoint;

        /**
         * Latest recovery time point for the DB System, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeLatestRecoveryPoint the value to set
         * @return this builder
         **/
        public Builder timeLatestRecoveryPoint(java.util.Date timeLatestRecoveryPoint) {
            this.timeLatestRecoveryPoint = timeLatestRecoveryPoint;
            this.__explicitlySet__.add("timeLatestRecoveryPoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PointInTimeRecoveryDetails build() {
            PointInTimeRecoveryDetails model =
                    new PointInTimeRecoveryDetails(
                            this.timeEarliestRecoveryPoint, this.timeLatestRecoveryPoint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PointInTimeRecoveryDetails model) {
            if (model.wasPropertyExplicitlySet("timeEarliestRecoveryPoint")) {
                this.timeEarliestRecoveryPoint(model.getTimeEarliestRecoveryPoint());
            }
            if (model.wasPropertyExplicitlySet("timeLatestRecoveryPoint")) {
                this.timeLatestRecoveryPoint(model.getTimeLatestRecoveryPoint());
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
     * Earliest recovery time point for the DB System, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEarliestRecoveryPoint")
    private final java.util.Date timeEarliestRecoveryPoint;

    /**
     * Earliest recovery time point for the DB System, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeEarliestRecoveryPoint() {
        return timeEarliestRecoveryPoint;
    }

    /**
     * Latest recovery time point for the DB System, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLatestRecoveryPoint")
    private final java.util.Date timeLatestRecoveryPoint;

    /**
     * Latest recovery time point for the DB System, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeLatestRecoveryPoint() {
        return timeLatestRecoveryPoint;
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
        sb.append("PointInTimeRecoveryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("timeEarliestRecoveryPoint=")
                .append(String.valueOf(this.timeEarliestRecoveryPoint));
        sb.append(", timeLatestRecoveryPoint=")
                .append(String.valueOf(this.timeLatestRecoveryPoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PointInTimeRecoveryDetails)) {
            return false;
        }

        PointInTimeRecoveryDetails other = (PointInTimeRecoveryDetails) o;
        return java.util.Objects.equals(
                        this.timeEarliestRecoveryPoint, other.timeEarliestRecoveryPoint)
                && java.util.Objects.equals(
                        this.timeLatestRecoveryPoint, other.timeLatestRecoveryPoint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeEarliestRecoveryPoint == null
                                ? 43
                                : this.timeEarliestRecoveryPoint.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLatestRecoveryPoint == null
                                ? 43
                                : this.timeLatestRecoveryPoint.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
