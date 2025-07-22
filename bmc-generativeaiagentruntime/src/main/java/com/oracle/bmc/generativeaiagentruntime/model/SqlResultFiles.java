/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * Specifies file locations for SQL result data. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlResultFiles.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlResultFiles
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"statusFile", "dataFile"})
    public SqlResultFiles(String statusFile, String dataFile) {
        super();
        this.statusFile = statusFile;
        this.dataFile = dataFile;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Specifies the path or URL to status metadata. */
        @com.fasterxml.jackson.annotation.JsonProperty("statusFile")
        private String statusFile;

        /**
         * Specifies the path or URL to status metadata.
         *
         * @param statusFile the value to set
         * @return this builder
         */
        public Builder statusFile(String statusFile) {
            this.statusFile = statusFile;
            this.__explicitlySet__.add("statusFile");
            return this;
        }
        /** Specifies the path or URL to the full SQL result data. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataFile")
        private String dataFile;

        /**
         * Specifies the path or URL to the full SQL result data.
         *
         * @param dataFile the value to set
         * @return this builder
         */
        public Builder dataFile(String dataFile) {
            this.dataFile = dataFile;
            this.__explicitlySet__.add("dataFile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlResultFiles build() {
            SqlResultFiles model = new SqlResultFiles(this.statusFile, this.dataFile);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlResultFiles model) {
            if (model.wasPropertyExplicitlySet("statusFile")) {
                this.statusFile(model.getStatusFile());
            }
            if (model.wasPropertyExplicitlySet("dataFile")) {
                this.dataFile(model.getDataFile());
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

    /** Specifies the path or URL to status metadata. */
    @com.fasterxml.jackson.annotation.JsonProperty("statusFile")
    private final String statusFile;

    /**
     * Specifies the path or URL to status metadata.
     *
     * @return the value
     */
    public String getStatusFile() {
        return statusFile;
    }

    /** Specifies the path or URL to the full SQL result data. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataFile")
    private final String dataFile;

    /**
     * Specifies the path or URL to the full SQL result data.
     *
     * @return the value
     */
    public String getDataFile() {
        return dataFile;
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
        sb.append("SqlResultFiles(");
        sb.append("super=").append(super.toString());
        sb.append("statusFile=").append(String.valueOf(this.statusFile));
        sb.append(", dataFile=").append(String.valueOf(this.dataFile));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlResultFiles)) {
            return false;
        }

        SqlResultFiles other = (SqlResultFiles) o;
        return java.util.Objects.equals(this.statusFile, other.statusFile)
                && java.util.Objects.equals(this.dataFile, other.dataFile)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.statusFile == null ? 43 : this.statusFile.hashCode());
        result = (result * PRIME) + (this.dataFile == null ? 43 : this.dataFile.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
