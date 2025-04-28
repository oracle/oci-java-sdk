/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Usage data for IO interface per usage unit. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IoUsageTrend.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IoUsageTrend extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "endTimestamp",
        "diskBytesReadInMBs",
        "diskBytesWrittenInMBs",
        "diskIopsRead",
        "diskIopsWritten",
        "diskIops"
    })
    public IoUsageTrend(
            java.util.Date endTimestamp,
            Double diskBytesReadInMBs,
            Double diskBytesWrittenInMBs,
            Double diskIopsRead,
            Double diskIopsWritten,
            Double diskIops) {
        super();
        this.endTimestamp = endTimestamp;
        this.diskBytesReadInMBs = diskBytesReadInMBs;
        this.diskBytesWrittenInMBs = diskBytesWrittenInMBs;
        this.diskIopsRead = diskIopsRead;
        this.diskIopsWritten = diskIopsWritten;
        this.diskIops = diskIops;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The timestamp in which the current sampling period ends in RFC 3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
        private java.util.Date endTimestamp;

        /**
         * The timestamp in which the current sampling period ends in RFC 3339 format.
         *
         * @param endTimestamp the value to set
         * @return this builder
         */
        public Builder endTimestamp(java.util.Date endTimestamp) {
            this.endTimestamp = endTimestamp;
            this.__explicitlySet__.add("endTimestamp");
            return this;
        }
        /** MBs Read. */
        @com.fasterxml.jackson.annotation.JsonProperty("diskBytesReadInMBs")
        private Double diskBytesReadInMBs;

        /**
         * MBs Read.
         *
         * @param diskBytesReadInMBs the value to set
         * @return this builder
         */
        public Builder diskBytesReadInMBs(Double diskBytesReadInMBs) {
            this.diskBytesReadInMBs = diskBytesReadInMBs;
            this.__explicitlySet__.add("diskBytesReadInMBs");
            return this;
        }
        /** MBs Written. */
        @com.fasterxml.jackson.annotation.JsonProperty("diskBytesWrittenInMBs")
        private Double diskBytesWrittenInMBs;

        /**
         * MBs Written.
         *
         * @param diskBytesWrittenInMBs the value to set
         * @return this builder
         */
        public Builder diskBytesWrittenInMBs(Double diskBytesWrittenInMBs) {
            this.diskBytesWrittenInMBs = diskBytesWrittenInMBs;
            this.__explicitlySet__.add("diskBytesWrittenInMBs");
            return this;
        }
        /** Read IO operations per second. */
        @com.fasterxml.jackson.annotation.JsonProperty("diskIopsRead")
        private Double diskIopsRead;

        /**
         * Read IO operations per second.
         *
         * @param diskIopsRead the value to set
         * @return this builder
         */
        public Builder diskIopsRead(Double diskIopsRead) {
            this.diskIopsRead = diskIopsRead;
            this.__explicitlySet__.add("diskIopsRead");
            return this;
        }
        /** Write IO operations per second. */
        @com.fasterxml.jackson.annotation.JsonProperty("diskIopsWritten")
        private Double diskIopsWritten;

        /**
         * Write IO operations per second.
         *
         * @param diskIopsWritten the value to set
         * @return this builder
         */
        public Builder diskIopsWritten(Double diskIopsWritten) {
            this.diskIopsWritten = diskIopsWritten;
            this.__explicitlySet__.add("diskIopsWritten");
            return this;
        }
        /** IO operations per second. */
        @com.fasterxml.jackson.annotation.JsonProperty("diskIops")
        private Double diskIops;

        /**
         * IO operations per second.
         *
         * @param diskIops the value to set
         * @return this builder
         */
        public Builder diskIops(Double diskIops) {
            this.diskIops = diskIops;
            this.__explicitlySet__.add("diskIops");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IoUsageTrend build() {
            IoUsageTrend model =
                    new IoUsageTrend(
                            this.endTimestamp,
                            this.diskBytesReadInMBs,
                            this.diskBytesWrittenInMBs,
                            this.diskIopsRead,
                            this.diskIopsWritten,
                            this.diskIops);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IoUsageTrend model) {
            if (model.wasPropertyExplicitlySet("endTimestamp")) {
                this.endTimestamp(model.getEndTimestamp());
            }
            if (model.wasPropertyExplicitlySet("diskBytesReadInMBs")) {
                this.diskBytesReadInMBs(model.getDiskBytesReadInMBs());
            }
            if (model.wasPropertyExplicitlySet("diskBytesWrittenInMBs")) {
                this.diskBytesWrittenInMBs(model.getDiskBytesWrittenInMBs());
            }
            if (model.wasPropertyExplicitlySet("diskIopsRead")) {
                this.diskIopsRead(model.getDiskIopsRead());
            }
            if (model.wasPropertyExplicitlySet("diskIopsWritten")) {
                this.diskIopsWritten(model.getDiskIopsWritten());
            }
            if (model.wasPropertyExplicitlySet("diskIops")) {
                this.diskIops(model.getDiskIops());
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

    /** The timestamp in which the current sampling period ends in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("endTimestamp")
    private final java.util.Date endTimestamp;

    /**
     * The timestamp in which the current sampling period ends in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.Date getEndTimestamp() {
        return endTimestamp;
    }

    /** MBs Read. */
    @com.fasterxml.jackson.annotation.JsonProperty("diskBytesReadInMBs")
    private final Double diskBytesReadInMBs;

    /**
     * MBs Read.
     *
     * @return the value
     */
    public Double getDiskBytesReadInMBs() {
        return diskBytesReadInMBs;
    }

    /** MBs Written. */
    @com.fasterxml.jackson.annotation.JsonProperty("diskBytesWrittenInMBs")
    private final Double diskBytesWrittenInMBs;

    /**
     * MBs Written.
     *
     * @return the value
     */
    public Double getDiskBytesWrittenInMBs() {
        return diskBytesWrittenInMBs;
    }

    /** Read IO operations per second. */
    @com.fasterxml.jackson.annotation.JsonProperty("diskIopsRead")
    private final Double diskIopsRead;

    /**
     * Read IO operations per second.
     *
     * @return the value
     */
    public Double getDiskIopsRead() {
        return diskIopsRead;
    }

    /** Write IO operations per second. */
    @com.fasterxml.jackson.annotation.JsonProperty("diskIopsWritten")
    private final Double diskIopsWritten;

    /**
     * Write IO operations per second.
     *
     * @return the value
     */
    public Double getDiskIopsWritten() {
        return diskIopsWritten;
    }

    /** IO operations per second. */
    @com.fasterxml.jackson.annotation.JsonProperty("diskIops")
    private final Double diskIops;

    /**
     * IO operations per second.
     *
     * @return the value
     */
    public Double getDiskIops() {
        return diskIops;
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
        sb.append("IoUsageTrend(");
        sb.append("super=").append(super.toString());
        sb.append("endTimestamp=").append(String.valueOf(this.endTimestamp));
        sb.append(", diskBytesReadInMBs=").append(String.valueOf(this.diskBytesReadInMBs));
        sb.append(", diskBytesWrittenInMBs=").append(String.valueOf(this.diskBytesWrittenInMBs));
        sb.append(", diskIopsRead=").append(String.valueOf(this.diskIopsRead));
        sb.append(", diskIopsWritten=").append(String.valueOf(this.diskIopsWritten));
        sb.append(", diskIops=").append(String.valueOf(this.diskIops));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IoUsageTrend)) {
            return false;
        }

        IoUsageTrend other = (IoUsageTrend) o;
        return java.util.Objects.equals(this.endTimestamp, other.endTimestamp)
                && java.util.Objects.equals(this.diskBytesReadInMBs, other.diskBytesReadInMBs)
                && java.util.Objects.equals(this.diskBytesWrittenInMBs, other.diskBytesWrittenInMBs)
                && java.util.Objects.equals(this.diskIopsRead, other.diskIopsRead)
                && java.util.Objects.equals(this.diskIopsWritten, other.diskIopsWritten)
                && java.util.Objects.equals(this.diskIops, other.diskIops)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.endTimestamp == null ? 43 : this.endTimestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.diskBytesReadInMBs == null
                                ? 43
                                : this.diskBytesReadInMBs.hashCode());
        result =
                (result * PRIME)
                        + (this.diskBytesWrittenInMBs == null
                                ? 43
                                : this.diskBytesWrittenInMBs.hashCode());
        result = (result * PRIME) + (this.diskIopsRead == null ? 43 : this.diskIopsRead.hashCode());
        result =
                (result * PRIME)
                        + (this.diskIopsWritten == null ? 43 : this.diskIopsWritten.hashCode());
        result = (result * PRIME) + (this.diskIops == null ? 43 : this.diskIops.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
