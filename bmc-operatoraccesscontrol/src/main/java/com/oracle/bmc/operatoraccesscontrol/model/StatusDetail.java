/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Detail of execution.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StatusDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StatusDetail extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"statusId", "commandName", "status", "timeOfValidation"})
    public StatusDetail(
            Integer statusId, String commandName, String status, java.util.Date timeOfValidation) {
        super();
        this.statusId = statusId;
        this.commandName = commandName;
        this.status = status;
        this.timeOfValidation = timeOfValidation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * running unique number of the command executed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statusId")
        private Integer statusId;

        /**
         * running unique number of the command executed
         * @param statusId the value to set
         * @return this builder
         **/
        public Builder statusId(Integer statusId) {
            this.statusId = statusId;
            this.__explicitlySet__.add("statusId");
            return this;
        }
        /**
         * Name of the process or command executed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commandName")
        private String commandName;

        /**
         * Name of the process or command executed.
         * @param commandName the value to set
         * @return this builder
         **/
        public Builder commandName(String commandName) {
            this.commandName = commandName;
            this.__explicitlySet__.add("commandName");
            return this;
        }
        /**
         * Status of the process or command executed Success or Failure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * Status of the process or command executed Success or Failure.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Time when the execution happened in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfValidation")
        private java.util.Date timeOfValidation;

        /**
         * Time when the execution happened in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'.
         *
         * @param timeOfValidation the value to set
         * @return this builder
         **/
        public Builder timeOfValidation(java.util.Date timeOfValidation) {
            this.timeOfValidation = timeOfValidation;
            this.__explicitlySet__.add("timeOfValidation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StatusDetail build() {
            StatusDetail model =
                    new StatusDetail(
                            this.statusId, this.commandName, this.status, this.timeOfValidation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StatusDetail model) {
            if (model.wasPropertyExplicitlySet("statusId")) {
                this.statusId(model.getStatusId());
            }
            if (model.wasPropertyExplicitlySet("commandName")) {
                this.commandName(model.getCommandName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeOfValidation")) {
                this.timeOfValidation(model.getTimeOfValidation());
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
     * running unique number of the command executed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusId")
    private final Integer statusId;

    /**
     * running unique number of the command executed
     * @return the value
     **/
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * Name of the process or command executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commandName")
    private final String commandName;

    /**
     * Name of the process or command executed.
     * @return the value
     **/
    public String getCommandName() {
        return commandName;
    }

    /**
     * Status of the process or command executed Success or Failure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * Status of the process or command executed Success or Failure.
     * @return the value
     **/
    public String getStatus() {
        return status;
    }

    /**
     * Time when the execution happened in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfValidation")
    private final java.util.Date timeOfValidation;

    /**
     * Time when the execution happened in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'.
     *
     * @return the value
     **/
    public java.util.Date getTimeOfValidation() {
        return timeOfValidation;
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
        sb.append("StatusDetail(");
        sb.append("super=").append(super.toString());
        sb.append("statusId=").append(String.valueOf(this.statusId));
        sb.append(", commandName=").append(String.valueOf(this.commandName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeOfValidation=").append(String.valueOf(this.timeOfValidation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StatusDetail)) {
            return false;
        }

        StatusDetail other = (StatusDetail) o;
        return java.util.Objects.equals(this.statusId, other.statusId)
                && java.util.Objects.equals(this.commandName, other.commandName)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeOfValidation, other.timeOfValidation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.statusId == null ? 43 : this.statusId.hashCode());
        result = (result * PRIME) + (this.commandName == null ? 43 : this.commandName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfValidation == null ? 43 : this.timeOfValidation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
