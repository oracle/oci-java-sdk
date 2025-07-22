/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * If the replica is multi-threaded, error from worker threads. Otherwise, error from the applier
 * thread. <br>
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
        builder = MySqlApplyErrorWorker.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlApplyErrorWorker
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"lastErrorNumber", "lastErrorMessage", "timeLastError"})
    public MySqlApplyErrorWorker(
            Integer lastErrorNumber, String lastErrorMessage, java.util.Date timeLastError) {
        super();
        this.lastErrorNumber = lastErrorNumber;
        this.lastErrorMessage = lastErrorMessage;
        this.timeLastError = timeLastError;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The error number of the most recent error that caused the worker thread to stop. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastErrorNumber")
        private Integer lastErrorNumber;

        /**
         * The error number of the most recent error that caused the worker thread to stop.
         *
         * @param lastErrorNumber the value to set
         * @return this builder
         */
        public Builder lastErrorNumber(Integer lastErrorNumber) {
            this.lastErrorNumber = lastErrorNumber;
            this.__explicitlySet__.add("lastErrorNumber");
            return this;
        }
        /** The error message of the most recent error that caused the worker thread to stop. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastErrorMessage")
        private String lastErrorMessage;

        /**
         * The error message of the most recent error that caused the worker thread to stop.
         *
         * @param lastErrorMessage the value to set
         * @return this builder
         */
        public Builder lastErrorMessage(String lastErrorMessage) {
            this.lastErrorMessage = lastErrorMessage;
            this.__explicitlySet__.add("lastErrorMessage");
            return this;
        }
        /** The timestamp when the most recent worker error occurred. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastError")
        private java.util.Date timeLastError;

        /**
         * The timestamp when the most recent worker error occurred.
         *
         * @param timeLastError the value to set
         * @return this builder
         */
        public Builder timeLastError(java.util.Date timeLastError) {
            this.timeLastError = timeLastError;
            this.__explicitlySet__.add("timeLastError");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlApplyErrorWorker build() {
            MySqlApplyErrorWorker model =
                    new MySqlApplyErrorWorker(
                            this.lastErrorNumber, this.lastErrorMessage, this.timeLastError);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlApplyErrorWorker model) {
            if (model.wasPropertyExplicitlySet("lastErrorNumber")) {
                this.lastErrorNumber(model.getLastErrorNumber());
            }
            if (model.wasPropertyExplicitlySet("lastErrorMessage")) {
                this.lastErrorMessage(model.getLastErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("timeLastError")) {
                this.timeLastError(model.getTimeLastError());
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

    /** The error number of the most recent error that caused the worker thread to stop. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastErrorNumber")
    private final Integer lastErrorNumber;

    /**
     * The error number of the most recent error that caused the worker thread to stop.
     *
     * @return the value
     */
    public Integer getLastErrorNumber() {
        return lastErrorNumber;
    }

    /** The error message of the most recent error that caused the worker thread to stop. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastErrorMessage")
    private final String lastErrorMessage;

    /**
     * The error message of the most recent error that caused the worker thread to stop.
     *
     * @return the value
     */
    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    /** The timestamp when the most recent worker error occurred. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastError")
    private final java.util.Date timeLastError;

    /**
     * The timestamp when the most recent worker error occurred.
     *
     * @return the value
     */
    public java.util.Date getTimeLastError() {
        return timeLastError;
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
        sb.append("MySqlApplyErrorWorker(");
        sb.append("super=").append(super.toString());
        sb.append("lastErrorNumber=").append(String.valueOf(this.lastErrorNumber));
        sb.append(", lastErrorMessage=").append(String.valueOf(this.lastErrorMessage));
        sb.append(", timeLastError=").append(String.valueOf(this.timeLastError));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlApplyErrorWorker)) {
            return false;
        }

        MySqlApplyErrorWorker other = (MySqlApplyErrorWorker) o;
        return java.util.Objects.equals(this.lastErrorNumber, other.lastErrorNumber)
                && java.util.Objects.equals(this.lastErrorMessage, other.lastErrorMessage)
                && java.util.Objects.equals(this.timeLastError, other.timeLastError)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lastErrorNumber == null ? 43 : this.lastErrorNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.lastErrorMessage == null ? 43 : this.lastErrorMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastError == null ? 43 : this.timeLastError.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
