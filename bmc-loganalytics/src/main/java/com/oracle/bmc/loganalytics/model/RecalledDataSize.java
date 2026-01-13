/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the recall related data size for the given timeframe <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RecalledDataSize.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RecalledDataSize
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeDataStarted",
        "timeDataEnded",
        "recalledDataInBytes",
        "notRecalledDataInBytes"
    })
    public RecalledDataSize(
            java.util.Date timeDataStarted,
            java.util.Date timeDataEnded,
            Long recalledDataInBytes,
            Long notRecalledDataInBytes) {
        super();
        this.timeDataStarted = timeDataStarted;
        this.timeDataEnded = timeDataEnded;
        this.recalledDataInBytes = recalledDataInBytes;
        this.notRecalledDataInBytes = notRecalledDataInBytes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** This is the start of the time range of the archival data */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
        private java.util.Date timeDataStarted;

        /**
         * This is the start of the time range of the archival data
         *
         * @param timeDataStarted the value to set
         * @return this builder
         */
        public Builder timeDataStarted(java.util.Date timeDataStarted) {
            this.timeDataStarted = timeDataStarted;
            this.__explicitlySet__.add("timeDataStarted");
            return this;
        }
        /** This is the end of the time range of the archival data */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
        private java.util.Date timeDataEnded;

        /**
         * This is the end of the time range of the archival data
         *
         * @param timeDataEnded the value to set
         * @return this builder
         */
        public Builder timeDataEnded(java.util.Date timeDataEnded) {
            this.timeDataEnded = timeDataEnded;
            this.__explicitlySet__.add("timeDataEnded");
            return this;
        }
        /** This is the size of the recalled data */
        @com.fasterxml.jackson.annotation.JsonProperty("recalledDataInBytes")
        private Long recalledDataInBytes;

        /**
         * This is the size of the recalled data
         *
         * @param recalledDataInBytes the value to set
         * @return this builder
         */
        public Builder recalledDataInBytes(Long recalledDataInBytes) {
            this.recalledDataInBytes = recalledDataInBytes;
            this.__explicitlySet__.add("recalledDataInBytes");
            return this;
        }
        /** This is the size of the archival data not recalled yet */
        @com.fasterxml.jackson.annotation.JsonProperty("notRecalledDataInBytes")
        private Long notRecalledDataInBytes;

        /**
         * This is the size of the archival data not recalled yet
         *
         * @param notRecalledDataInBytes the value to set
         * @return this builder
         */
        public Builder notRecalledDataInBytes(Long notRecalledDataInBytes) {
            this.notRecalledDataInBytes = notRecalledDataInBytes;
            this.__explicitlySet__.add("notRecalledDataInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecalledDataSize build() {
            RecalledDataSize model =
                    new RecalledDataSize(
                            this.timeDataStarted,
                            this.timeDataEnded,
                            this.recalledDataInBytes,
                            this.notRecalledDataInBytes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecalledDataSize model) {
            if (model.wasPropertyExplicitlySet("timeDataStarted")) {
                this.timeDataStarted(model.getTimeDataStarted());
            }
            if (model.wasPropertyExplicitlySet("timeDataEnded")) {
                this.timeDataEnded(model.getTimeDataEnded());
            }
            if (model.wasPropertyExplicitlySet("recalledDataInBytes")) {
                this.recalledDataInBytes(model.getRecalledDataInBytes());
            }
            if (model.wasPropertyExplicitlySet("notRecalledDataInBytes")) {
                this.notRecalledDataInBytes(model.getNotRecalledDataInBytes());
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

    /** This is the start of the time range of the archival data */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
    private final java.util.Date timeDataStarted;

    /**
     * This is the start of the time range of the archival data
     *
     * @return the value
     */
    public java.util.Date getTimeDataStarted() {
        return timeDataStarted;
    }

    /** This is the end of the time range of the archival data */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
    private final java.util.Date timeDataEnded;

    /**
     * This is the end of the time range of the archival data
     *
     * @return the value
     */
    public java.util.Date getTimeDataEnded() {
        return timeDataEnded;
    }

    /** This is the size of the recalled data */
    @com.fasterxml.jackson.annotation.JsonProperty("recalledDataInBytes")
    private final Long recalledDataInBytes;

    /**
     * This is the size of the recalled data
     *
     * @return the value
     */
    public Long getRecalledDataInBytes() {
        return recalledDataInBytes;
    }

    /** This is the size of the archival data not recalled yet */
    @com.fasterxml.jackson.annotation.JsonProperty("notRecalledDataInBytes")
    private final Long notRecalledDataInBytes;

    /**
     * This is the size of the archival data not recalled yet
     *
     * @return the value
     */
    public Long getNotRecalledDataInBytes() {
        return notRecalledDataInBytes;
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
        sb.append("RecalledDataSize(");
        sb.append("super=").append(super.toString());
        sb.append("timeDataStarted=").append(String.valueOf(this.timeDataStarted));
        sb.append(", timeDataEnded=").append(String.valueOf(this.timeDataEnded));
        sb.append(", recalledDataInBytes=").append(String.valueOf(this.recalledDataInBytes));
        sb.append(", notRecalledDataInBytes=").append(String.valueOf(this.notRecalledDataInBytes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecalledDataSize)) {
            return false;
        }

        RecalledDataSize other = (RecalledDataSize) o;
        return java.util.Objects.equals(this.timeDataStarted, other.timeDataStarted)
                && java.util.Objects.equals(this.timeDataEnded, other.timeDataEnded)
                && java.util.Objects.equals(this.recalledDataInBytes, other.recalledDataInBytes)
                && java.util.Objects.equals(
                        this.notRecalledDataInBytes, other.notRecalledDataInBytes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeDataStarted == null ? 43 : this.timeDataStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataEnded == null ? 43 : this.timeDataEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.recalledDataInBytes == null
                                ? 43
                                : this.recalledDataInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.notRecalledDataInBytes == null
                                ? 43
                                : this.notRecalledDataInBytes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
