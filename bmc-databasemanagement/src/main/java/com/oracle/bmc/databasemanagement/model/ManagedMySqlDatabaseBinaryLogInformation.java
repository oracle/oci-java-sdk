/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Information pertaining to the binary logs of a MySQL server. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagedMySqlDatabaseBinaryLogInformation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedMySqlDatabaseBinaryLogInformation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "binaryLogging",
        "binaryLogFormat",
        "binaryLogCompression",
        "binaryLogCompressionPercent",
        "binaryLogName",
        "binaryLogPosition"
    })
    public ManagedMySqlDatabaseBinaryLogInformation(
            String binaryLogging,
            String binaryLogFormat,
            String binaryLogCompression,
            Integer binaryLogCompressionPercent,
            String binaryLogName,
            Long binaryLogPosition) {
        super();
        this.binaryLogging = binaryLogging;
        this.binaryLogFormat = binaryLogFormat;
        this.binaryLogCompression = binaryLogCompression;
        this.binaryLogCompressionPercent = binaryLogCompressionPercent;
        this.binaryLogName = binaryLogName;
        this.binaryLogPosition = binaryLogPosition;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The status of binary logging on the MySQL server. */
        @com.fasterxml.jackson.annotation.JsonProperty("binaryLogging")
        private String binaryLogging;

        /**
         * The status of binary logging on the MySQL server.
         *
         * @param binaryLogging the value to set
         * @return this builder
         */
        public Builder binaryLogging(String binaryLogging) {
            this.binaryLogging = binaryLogging;
            this.__explicitlySet__.add("binaryLogging");
            return this;
        }
        /** The binary logging format used by the MySQL server. */
        @com.fasterxml.jackson.annotation.JsonProperty("binaryLogFormat")
        private String binaryLogFormat;

        /**
         * The binary logging format used by the MySQL server.
         *
         * @param binaryLogFormat the value to set
         * @return this builder
         */
        public Builder binaryLogFormat(String binaryLogFormat) {
            this.binaryLogFormat = binaryLogFormat;
            this.__explicitlySet__.add("binaryLogFormat");
            return this;
        }
        /**
         * Indicates whether compression is enabled for transactions written to binary log files on
         * the MySQL server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("binaryLogCompression")
        private String binaryLogCompression;

        /**
         * Indicates whether compression is enabled for transactions written to binary log files on
         * the MySQL server.
         *
         * @param binaryLogCompression the value to set
         * @return this builder
         */
        public Builder binaryLogCompression(String binaryLogCompression) {
            this.binaryLogCompression = binaryLogCompression;
            this.__explicitlySet__.add("binaryLogCompression");
            return this;
        }
        /** The compression ratio for the binary log, expressed as a percentage. */
        @com.fasterxml.jackson.annotation.JsonProperty("binaryLogCompressionPercent")
        private Integer binaryLogCompressionPercent;

        /**
         * The compression ratio for the binary log, expressed as a percentage.
         *
         * @param binaryLogCompressionPercent the value to set
         * @return this builder
         */
        public Builder binaryLogCompressionPercent(Integer binaryLogCompressionPercent) {
            this.binaryLogCompressionPercent = binaryLogCompressionPercent;
            this.__explicitlySet__.add("binaryLogCompressionPercent");
            return this;
        }
        /** The name of the binary log file. */
        @com.fasterxml.jackson.annotation.JsonProperty("binaryLogName")
        private String binaryLogName;

        /**
         * The name of the binary log file.
         *
         * @param binaryLogName the value to set
         * @return this builder
         */
        public Builder binaryLogName(String binaryLogName) {
            this.binaryLogName = binaryLogName;
            this.__explicitlySet__.add("binaryLogName");
            return this;
        }
        /** The position within the binary log file. */
        @com.fasterxml.jackson.annotation.JsonProperty("binaryLogPosition")
        private Long binaryLogPosition;

        /**
         * The position within the binary log file.
         *
         * @param binaryLogPosition the value to set
         * @return this builder
         */
        public Builder binaryLogPosition(Long binaryLogPosition) {
            this.binaryLogPosition = binaryLogPosition;
            this.__explicitlySet__.add("binaryLogPosition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedMySqlDatabaseBinaryLogInformation build() {
            ManagedMySqlDatabaseBinaryLogInformation model =
                    new ManagedMySqlDatabaseBinaryLogInformation(
                            this.binaryLogging,
                            this.binaryLogFormat,
                            this.binaryLogCompression,
                            this.binaryLogCompressionPercent,
                            this.binaryLogName,
                            this.binaryLogPosition);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedMySqlDatabaseBinaryLogInformation model) {
            if (model.wasPropertyExplicitlySet("binaryLogging")) {
                this.binaryLogging(model.getBinaryLogging());
            }
            if (model.wasPropertyExplicitlySet("binaryLogFormat")) {
                this.binaryLogFormat(model.getBinaryLogFormat());
            }
            if (model.wasPropertyExplicitlySet("binaryLogCompression")) {
                this.binaryLogCompression(model.getBinaryLogCompression());
            }
            if (model.wasPropertyExplicitlySet("binaryLogCompressionPercent")) {
                this.binaryLogCompressionPercent(model.getBinaryLogCompressionPercent());
            }
            if (model.wasPropertyExplicitlySet("binaryLogName")) {
                this.binaryLogName(model.getBinaryLogName());
            }
            if (model.wasPropertyExplicitlySet("binaryLogPosition")) {
                this.binaryLogPosition(model.getBinaryLogPosition());
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

    /** The status of binary logging on the MySQL server. */
    @com.fasterxml.jackson.annotation.JsonProperty("binaryLogging")
    private final String binaryLogging;

    /**
     * The status of binary logging on the MySQL server.
     *
     * @return the value
     */
    public String getBinaryLogging() {
        return binaryLogging;
    }

    /** The binary logging format used by the MySQL server. */
    @com.fasterxml.jackson.annotation.JsonProperty("binaryLogFormat")
    private final String binaryLogFormat;

    /**
     * The binary logging format used by the MySQL server.
     *
     * @return the value
     */
    public String getBinaryLogFormat() {
        return binaryLogFormat;
    }

    /**
     * Indicates whether compression is enabled for transactions written to binary log files on the
     * MySQL server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("binaryLogCompression")
    private final String binaryLogCompression;

    /**
     * Indicates whether compression is enabled for transactions written to binary log files on the
     * MySQL server.
     *
     * @return the value
     */
    public String getBinaryLogCompression() {
        return binaryLogCompression;
    }

    /** The compression ratio for the binary log, expressed as a percentage. */
    @com.fasterxml.jackson.annotation.JsonProperty("binaryLogCompressionPercent")
    private final Integer binaryLogCompressionPercent;

    /**
     * The compression ratio for the binary log, expressed as a percentage.
     *
     * @return the value
     */
    public Integer getBinaryLogCompressionPercent() {
        return binaryLogCompressionPercent;
    }

    /** The name of the binary log file. */
    @com.fasterxml.jackson.annotation.JsonProperty("binaryLogName")
    private final String binaryLogName;

    /**
     * The name of the binary log file.
     *
     * @return the value
     */
    public String getBinaryLogName() {
        return binaryLogName;
    }

    /** The position within the binary log file. */
    @com.fasterxml.jackson.annotation.JsonProperty("binaryLogPosition")
    private final Long binaryLogPosition;

    /**
     * The position within the binary log file.
     *
     * @return the value
     */
    public Long getBinaryLogPosition() {
        return binaryLogPosition;
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
        sb.append("ManagedMySqlDatabaseBinaryLogInformation(");
        sb.append("super=").append(super.toString());
        sb.append("binaryLogging=").append(String.valueOf(this.binaryLogging));
        sb.append(", binaryLogFormat=").append(String.valueOf(this.binaryLogFormat));
        sb.append(", binaryLogCompression=").append(String.valueOf(this.binaryLogCompression));
        sb.append(", binaryLogCompressionPercent=")
                .append(String.valueOf(this.binaryLogCompressionPercent));
        sb.append(", binaryLogName=").append(String.valueOf(this.binaryLogName));
        sb.append(", binaryLogPosition=").append(String.valueOf(this.binaryLogPosition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedMySqlDatabaseBinaryLogInformation)) {
            return false;
        }

        ManagedMySqlDatabaseBinaryLogInformation other =
                (ManagedMySqlDatabaseBinaryLogInformation) o;
        return java.util.Objects.equals(this.binaryLogging, other.binaryLogging)
                && java.util.Objects.equals(this.binaryLogFormat, other.binaryLogFormat)
                && java.util.Objects.equals(this.binaryLogCompression, other.binaryLogCompression)
                && java.util.Objects.equals(
                        this.binaryLogCompressionPercent, other.binaryLogCompressionPercent)
                && java.util.Objects.equals(this.binaryLogName, other.binaryLogName)
                && java.util.Objects.equals(this.binaryLogPosition, other.binaryLogPosition)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.binaryLogging == null ? 43 : this.binaryLogging.hashCode());
        result =
                (result * PRIME)
                        + (this.binaryLogFormat == null ? 43 : this.binaryLogFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.binaryLogCompression == null
                                ? 43
                                : this.binaryLogCompression.hashCode());
        result =
                (result * PRIME)
                        + (this.binaryLogCompressionPercent == null
                                ? 43
                                : this.binaryLogCompressionPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.binaryLogName == null ? 43 : this.binaryLogName.hashCode());
        result =
                (result * PRIME)
                        + (this.binaryLogPosition == null ? 43 : this.binaryLogPosition.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
