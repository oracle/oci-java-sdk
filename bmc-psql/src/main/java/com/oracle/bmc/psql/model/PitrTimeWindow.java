/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Time interval for which point-in-time recovery (PITR) is supported. The database can be restored
 * to any timestamp between {@code timeRecoveryWindowStart} and {@code timeRecoveryWindowEnd}
 * (inclusive). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PitrTimeWindow.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PitrTimeWindow
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeRecoveryWindowStart", "timeRecoveryWindowEnd"})
    public PitrTimeWindow(
            java.util.Date timeRecoveryWindowStart, java.util.Date timeRecoveryWindowEnd) {
        super();
        this.timeRecoveryWindowStart = timeRecoveryWindowStart;
        this.timeRecoveryWindowEnd = timeRecoveryWindowEnd;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Earliest timestamp in the PITR window to which the database can be restored. Timestamps
         * earlier than this are not recoverable. The value must be an [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp.
         *
         * <p>Example: {@code 2016-08-25T21:10:29Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRecoveryWindowStart")
        private java.util.Date timeRecoveryWindowStart;

        /**
         * Earliest timestamp in the PITR window to which the database can be restored. Timestamps
         * earlier than this are not recoverable. The value must be an [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp.
         *
         * <p>Example: {@code 2016-08-25T21:10:29Z}
         *
         * @param timeRecoveryWindowStart the value to set
         * @return this builder
         */
        public Builder timeRecoveryWindowStart(java.util.Date timeRecoveryWindowStart) {
            this.timeRecoveryWindowStart = timeRecoveryWindowStart;
            this.__explicitlySet__.add("timeRecoveryWindowStart");
            return this;
        }
        /**
         * Latest timestamp in the PITR window to which the database can be restored. Timestamps
         * later than this are not recoverable. The value must be an [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp.
         *
         * <p>Example: {@code 2016-08-25T21:10:29Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRecoveryWindowEnd")
        private java.util.Date timeRecoveryWindowEnd;

        /**
         * Latest timestamp in the PITR window to which the database can be restored. Timestamps
         * later than this are not recoverable. The value must be an [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp.
         *
         * <p>Example: {@code 2016-08-25T21:10:29Z}
         *
         * @param timeRecoveryWindowEnd the value to set
         * @return this builder
         */
        public Builder timeRecoveryWindowEnd(java.util.Date timeRecoveryWindowEnd) {
            this.timeRecoveryWindowEnd = timeRecoveryWindowEnd;
            this.__explicitlySet__.add("timeRecoveryWindowEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PitrTimeWindow build() {
            PitrTimeWindow model =
                    new PitrTimeWindow(this.timeRecoveryWindowStart, this.timeRecoveryWindowEnd);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PitrTimeWindow model) {
            if (model.wasPropertyExplicitlySet("timeRecoveryWindowStart")) {
                this.timeRecoveryWindowStart(model.getTimeRecoveryWindowStart());
            }
            if (model.wasPropertyExplicitlySet("timeRecoveryWindowEnd")) {
                this.timeRecoveryWindowEnd(model.getTimeRecoveryWindowEnd());
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
     * Earliest timestamp in the PITR window to which the database can be restored. Timestamps
     * earlier than this are not recoverable. The value must be an [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp.
     *
     * <p>Example: {@code 2016-08-25T21:10:29Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRecoveryWindowStart")
    private final java.util.Date timeRecoveryWindowStart;

    /**
     * Earliest timestamp in the PITR window to which the database can be restored. Timestamps
     * earlier than this are not recoverable. The value must be an [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp.
     *
     * <p>Example: {@code 2016-08-25T21:10:29Z}
     *
     * @return the value
     */
    public java.util.Date getTimeRecoveryWindowStart() {
        return timeRecoveryWindowStart;
    }

    /**
     * Latest timestamp in the PITR window to which the database can be restored. Timestamps later
     * than this are not recoverable. The value must be an [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp.
     *
     * <p>Example: {@code 2016-08-25T21:10:29Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRecoveryWindowEnd")
    private final java.util.Date timeRecoveryWindowEnd;

    /**
     * Latest timestamp in the PITR window to which the database can be restored. Timestamps later
     * than this are not recoverable. The value must be an [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp.
     *
     * <p>Example: {@code 2016-08-25T21:10:29Z}
     *
     * @return the value
     */
    public java.util.Date getTimeRecoveryWindowEnd() {
        return timeRecoveryWindowEnd;
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
        sb.append("PitrTimeWindow(");
        sb.append("super=").append(super.toString());
        sb.append("timeRecoveryWindowStart=").append(String.valueOf(this.timeRecoveryWindowStart));
        sb.append(", timeRecoveryWindowEnd=").append(String.valueOf(this.timeRecoveryWindowEnd));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PitrTimeWindow)) {
            return false;
        }

        PitrTimeWindow other = (PitrTimeWindow) o;
        return java.util.Objects.equals(this.timeRecoveryWindowStart, other.timeRecoveryWindowStart)
                && java.util.Objects.equals(this.timeRecoveryWindowEnd, other.timeRecoveryWindowEnd)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeRecoveryWindowStart == null
                                ? 43
                                : this.timeRecoveryWindowStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRecoveryWindowEnd == null
                                ? 43
                                : this.timeRecoveryWindowEnd.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
