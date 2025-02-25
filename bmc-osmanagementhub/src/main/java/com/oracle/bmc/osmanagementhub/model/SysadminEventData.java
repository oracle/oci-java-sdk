/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Data related to the sysadmin event. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SysadminEventData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SysadminEventData
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "errorCause",
        "errorLog",
        "attemptedResolutions",
        "resolutionStatus",
        "resolutionLog",
        "additionalDetails"
    })
    public SysadminEventData(
            String errorCause,
            String errorLog,
            java.util.List<String> attemptedResolutions,
            EventStatus resolutionStatus,
            String resolutionLog,
            WorkRequestEventDataAdditionalDetails additionalDetails) {
        super();
        this.errorCause = errorCause;
        this.errorLog = errorLog;
        this.attemptedResolutions = attemptedResolutions;
        this.resolutionStatus = resolutionStatus;
        this.resolutionLog = resolutionLog;
        this.additionalDetails = additionalDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The commands executed by the agent that caused the error. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorCause")
        private String errorCause;

        /**
         * The commands executed by the agent that caused the error.
         *
         * @param errorCause the value to set
         * @return this builder
         */
        public Builder errorCause(String errorCause) {
            this.errorCause = errorCause;
            this.__explicitlySet__.add("errorCause");
            return this;
        }
        /** The output log of the error. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorLog")
        private String errorLog;

        /**
         * The output log of the error.
         *
         * @param errorLog the value to set
         * @return this builder
         */
        public Builder errorLog(String errorLog) {
            this.errorLog = errorLog;
            this.__explicitlySet__.add("errorLog");
            return this;
        }
        /** The actions used to attempt fixing the error. */
        @com.fasterxml.jackson.annotation.JsonProperty("attemptedResolutions")
        private java.util.List<String> attemptedResolutions;

        /**
         * The actions used to attempt fixing the error.
         *
         * @param attemptedResolutions the value to set
         * @return this builder
         */
        public Builder attemptedResolutions(java.util.List<String> attemptedResolutions) {
            this.attemptedResolutions = attemptedResolutions;
            this.__explicitlySet__.add("attemptedResolutions");
            return this;
        }
        /** Indicates if the event succeeded. */
        @com.fasterxml.jackson.annotation.JsonProperty("resolutionStatus")
        private EventStatus resolutionStatus;

        /**
         * Indicates if the event succeeded.
         *
         * @param resolutionStatus the value to set
         * @return this builder
         */
        public Builder resolutionStatus(EventStatus resolutionStatus) {
            this.resolutionStatus = resolutionStatus;
            this.__explicitlySet__.add("resolutionStatus");
            return this;
        }
        /** The log output after the resolutions. */
        @com.fasterxml.jackson.annotation.JsonProperty("resolutionLog")
        private String resolutionLog;

        /**
         * The log output after the resolutions.
         *
         * @param resolutionLog the value to set
         * @return this builder
         */
        public Builder resolutionLog(String resolutionLog) {
            this.resolutionLog = resolutionLog;
            this.__explicitlySet__.add("resolutionLog");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private WorkRequestEventDataAdditionalDetails additionalDetails;

        public Builder additionalDetails(WorkRequestEventDataAdditionalDetails additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SysadminEventData build() {
            SysadminEventData model =
                    new SysadminEventData(
                            this.errorCause,
                            this.errorLog,
                            this.attemptedResolutions,
                            this.resolutionStatus,
                            this.resolutionLog,
                            this.additionalDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SysadminEventData model) {
            if (model.wasPropertyExplicitlySet("errorCause")) {
                this.errorCause(model.getErrorCause());
            }
            if (model.wasPropertyExplicitlySet("errorLog")) {
                this.errorLog(model.getErrorLog());
            }
            if (model.wasPropertyExplicitlySet("attemptedResolutions")) {
                this.attemptedResolutions(model.getAttemptedResolutions());
            }
            if (model.wasPropertyExplicitlySet("resolutionStatus")) {
                this.resolutionStatus(model.getResolutionStatus());
            }
            if (model.wasPropertyExplicitlySet("resolutionLog")) {
                this.resolutionLog(model.getResolutionLog());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
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

    /** The commands executed by the agent that caused the error. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorCause")
    private final String errorCause;

    /**
     * The commands executed by the agent that caused the error.
     *
     * @return the value
     */
    public String getErrorCause() {
        return errorCause;
    }

    /** The output log of the error. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorLog")
    private final String errorLog;

    /**
     * The output log of the error.
     *
     * @return the value
     */
    public String getErrorLog() {
        return errorLog;
    }

    /** The actions used to attempt fixing the error. */
    @com.fasterxml.jackson.annotation.JsonProperty("attemptedResolutions")
    private final java.util.List<String> attemptedResolutions;

    /**
     * The actions used to attempt fixing the error.
     *
     * @return the value
     */
    public java.util.List<String> getAttemptedResolutions() {
        return attemptedResolutions;
    }

    /** Indicates if the event succeeded. */
    @com.fasterxml.jackson.annotation.JsonProperty("resolutionStatus")
    private final EventStatus resolutionStatus;

    /**
     * Indicates if the event succeeded.
     *
     * @return the value
     */
    public EventStatus getResolutionStatus() {
        return resolutionStatus;
    }

    /** The log output after the resolutions. */
    @com.fasterxml.jackson.annotation.JsonProperty("resolutionLog")
    private final String resolutionLog;

    /**
     * The log output after the resolutions.
     *
     * @return the value
     */
    public String getResolutionLog() {
        return resolutionLog;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final WorkRequestEventDataAdditionalDetails additionalDetails;

    public WorkRequestEventDataAdditionalDetails getAdditionalDetails() {
        return additionalDetails;
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
        sb.append("SysadminEventData(");
        sb.append("super=").append(super.toString());
        sb.append("errorCause=").append(String.valueOf(this.errorCause));
        sb.append(", errorLog=").append(String.valueOf(this.errorLog));
        sb.append(", attemptedResolutions=").append(String.valueOf(this.attemptedResolutions));
        sb.append(", resolutionStatus=").append(String.valueOf(this.resolutionStatus));
        sb.append(", resolutionLog=").append(String.valueOf(this.resolutionLog));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SysadminEventData)) {
            return false;
        }

        SysadminEventData other = (SysadminEventData) o;
        return java.util.Objects.equals(this.errorCause, other.errorCause)
                && java.util.Objects.equals(this.errorLog, other.errorLog)
                && java.util.Objects.equals(this.attemptedResolutions, other.attemptedResolutions)
                && java.util.Objects.equals(this.resolutionStatus, other.resolutionStatus)
                && java.util.Objects.equals(this.resolutionLog, other.resolutionLog)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.errorCause == null ? 43 : this.errorCause.hashCode());
        result = (result * PRIME) + (this.errorLog == null ? 43 : this.errorLog.hashCode());
        result =
                (result * PRIME)
                        + (this.attemptedResolutions == null
                                ? 43
                                : this.attemptedResolutions.hashCode());
        result =
                (result * PRIME)
                        + (this.resolutionStatus == null ? 43 : this.resolutionStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.resolutionLog == null ? 43 : this.resolutionLog.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
