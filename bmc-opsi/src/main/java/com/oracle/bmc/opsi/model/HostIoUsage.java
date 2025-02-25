/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Host IO Performance Metrics
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostIoUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HostIoUsage extends HostPerformanceMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /**
         * Mount point
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mountPoint")
        private String mountPoint;

        /**
         * Mount point
         * @param mountPoint the value to set
         * @return this builder
         **/
        public Builder mountPoint(String mountPoint) {
            this.mountPoint = mountPoint;
            this.__explicitlySet__.add("mountPoint");
            return this;
        }
        /**
         * Bytes Read
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskBytesRead")
        private Double diskBytesRead;

        /**
         * Bytes Read
         * @param diskBytesRead the value to set
         * @return this builder
         **/
        public Builder diskBytesRead(Double diskBytesRead) {
            this.diskBytesRead = diskBytesRead;
            this.__explicitlySet__.add("diskBytesRead");
            return this;
        }
        /**
         * Bytes Written
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskBytesWritten")
        private Double diskBytesWritten;

        /**
         * Bytes Written
         * @param diskBytesWritten the value to set
         * @return this builder
         **/
        public Builder diskBytesWritten(Double diskBytesWritten) {
            this.diskBytesWritten = diskBytesWritten;
            this.__explicitlySet__.add("diskBytesWritten");
            return this;
        }
        /**
         * Read transactions per second
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskIopsRead")
        private Double diskIopsRead;

        /**
         * Read transactions per second
         * @param diskIopsRead the value to set
         * @return this builder
         **/
        public Builder diskIopsRead(Double diskIopsRead) {
            this.diskIopsRead = diskIopsRead;
            this.__explicitlySet__.add("diskIopsRead");
            return this;
        }
        /**
         * Write transactions per second
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskIopsWritten")
        private Double diskIopsWritten;

        /**
         * Write transactions per second
         * @param diskIopsWritten the value to set
         * @return this builder
         **/
        public Builder diskIopsWritten(Double diskIopsWritten) {
            this.diskIopsWritten = diskIopsWritten;
            this.__explicitlySet__.add("diskIopsWritten");
            return this;
        }
        /**
         * IO Transactions per second
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskIops")
        private Double diskIops;

        /**
         * IO Transactions per second
         * @param diskIops the value to set
         * @return this builder
         **/
        public Builder diskIops(Double diskIops) {
            this.diskIops = diskIops;
            this.__explicitlySet__.add("diskIops");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostIoUsage build() {
            HostIoUsage model =
                    new HostIoUsage(
                            this.timeCollected,
                            this.mountPoint,
                            this.diskBytesRead,
                            this.diskBytesWritten,
                            this.diskIopsRead,
                            this.diskIopsWritten,
                            this.diskIops);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostIoUsage model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("mountPoint")) {
                this.mountPoint(model.getMountPoint());
            }
            if (model.wasPropertyExplicitlySet("diskBytesRead")) {
                this.diskBytesRead(model.getDiskBytesRead());
            }
            if (model.wasPropertyExplicitlySet("diskBytesWritten")) {
                this.diskBytesWritten(model.getDiskBytesWritten());
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

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public HostIoUsage(
            java.util.Date timeCollected,
            String mountPoint,
            Double diskBytesRead,
            Double diskBytesWritten,
            Double diskIopsRead,
            Double diskIopsWritten,
            Double diskIops) {
        super(timeCollected);
        this.mountPoint = mountPoint;
        this.diskBytesRead = diskBytesRead;
        this.diskBytesWritten = diskBytesWritten;
        this.diskIopsRead = diskIopsRead;
        this.diskIopsWritten = diskIopsWritten;
        this.diskIops = diskIops;
    }

    /**
     * Mount point
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mountPoint")
    private final String mountPoint;

    /**
     * Mount point
     * @return the value
     **/
    public String getMountPoint() {
        return mountPoint;
    }

    /**
     * Bytes Read
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskBytesRead")
    private final Double diskBytesRead;

    /**
     * Bytes Read
     * @return the value
     **/
    public Double getDiskBytesRead() {
        return diskBytesRead;
    }

    /**
     * Bytes Written
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskBytesWritten")
    private final Double diskBytesWritten;

    /**
     * Bytes Written
     * @return the value
     **/
    public Double getDiskBytesWritten() {
        return diskBytesWritten;
    }

    /**
     * Read transactions per second
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskIopsRead")
    private final Double diskIopsRead;

    /**
     * Read transactions per second
     * @return the value
     **/
    public Double getDiskIopsRead() {
        return diskIopsRead;
    }

    /**
     * Write transactions per second
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskIopsWritten")
    private final Double diskIopsWritten;

    /**
     * Write transactions per second
     * @return the value
     **/
    public Double getDiskIopsWritten() {
        return diskIopsWritten;
    }

    /**
     * IO Transactions per second
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskIops")
    private final Double diskIops;

    /**
     * IO Transactions per second
     * @return the value
     **/
    public Double getDiskIops() {
        return diskIops;
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
        sb.append("HostIoUsage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", mountPoint=").append(String.valueOf(this.mountPoint));
        sb.append(", diskBytesRead=").append(String.valueOf(this.diskBytesRead));
        sb.append(", diskBytesWritten=").append(String.valueOf(this.diskBytesWritten));
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
        if (!(o instanceof HostIoUsage)) {
            return false;
        }

        HostIoUsage other = (HostIoUsage) o;
        return java.util.Objects.equals(this.mountPoint, other.mountPoint)
                && java.util.Objects.equals(this.diskBytesRead, other.diskBytesRead)
                && java.util.Objects.equals(this.diskBytesWritten, other.diskBytesWritten)
                && java.util.Objects.equals(this.diskIopsRead, other.diskIopsRead)
                && java.util.Objects.equals(this.diskIopsWritten, other.diskIopsWritten)
                && java.util.Objects.equals(this.diskIops, other.diskIops)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.mountPoint == null ? 43 : this.mountPoint.hashCode());
        result =
                (result * PRIME)
                        + (this.diskBytesRead == null ? 43 : this.diskBytesRead.hashCode());
        result =
                (result * PRIME)
                        + (this.diskBytesWritten == null ? 43 : this.diskBytesWritten.hashCode());
        result = (result * PRIME) + (this.diskIopsRead == null ? 43 : this.diskIopsRead.hashCode());
        result =
                (result * PRIME)
                        + (this.diskIopsWritten == null ? 43 : this.diskIopsWritten.hashCode());
        result = (result * PRIME) + (this.diskIops == null ? 43 : this.diskIops.hashCode());
        return result;
    }
}
