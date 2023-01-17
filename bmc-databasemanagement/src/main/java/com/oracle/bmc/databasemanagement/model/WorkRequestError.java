/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * An error encountered while executing a work request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WorkRequestError.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WorkRequestError extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "workRequestId",
        "code",
        "message",
        "isRetryable",
        "timestamp"
    })
    public WorkRequestError(
            String id,
            String workRequestId,
            String code,
            String message,
            Boolean isRetryable,
            java.util.Date timestamp) {
        super();
        this.id = id;
        this.workRequestId = workRequestId;
        this.code = code;
        this.message = message;
        this.isRetryable = isRetryable;
        this.timestamp = timestamp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The identifier of the work request error.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The identifier of the work request error.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the work request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        /**
         * The OCID of the work request.
         * @param workRequestId the value to set
         * @return this builder
         **/
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            this.__explicitlySet__.add("workRequestId");
            return this;
        }
        /**
         * A machine-usable code for the error that occurred. Error codes are listed on
         * (https://docs.us-phoenix-1.oraclecloud.com/Content/API/References/apierrors.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private String code;

        /**
         * A machine-usable code for the error that occurred. Error codes are listed on
         * (https://docs.us-phoenix-1.oraclecloud.com/Content/API/References/apierrors.htm).
         *
         * @param code the value to set
         * @return this builder
         **/
        public Builder code(String code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }
        /**
         * A human-readable description of the issue that occurred.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A human-readable description of the issue that occurred.
         * @param message the value to set
         * @return this builder
         **/
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * Determines if the work request error can be reproduced and tried again.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRetryable")
        private Boolean isRetryable;

        /**
         * Determines if the work request error can be reproduced and tried again.
         * @param isRetryable the value to set
         * @return this builder
         **/
        public Builder isRetryable(Boolean isRetryable) {
            this.isRetryable = isRetryable;
            this.__explicitlySet__.add("isRetryable");
            return this;
        }
        /**
         * The date and time the error occurred as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339). The precision for the time object is in milliseconds.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The date and time the error occurred as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339). The precision for the time object is in milliseconds.
         *
         * @param timestamp the value to set
         * @return this builder
         **/
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestError build() {
            WorkRequestError model =
                    new WorkRequestError(
                            this.id,
                            this.workRequestId,
                            this.code,
                            this.message,
                            this.isRetryable,
                            this.timestamp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestError model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("workRequestId")) {
                this.workRequestId(model.getWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("isRetryable")) {
                this.isRetryable(model.getIsRetryable());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
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
     * The identifier of the work request error.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The identifier of the work request error.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    private final String workRequestId;

    /**
     * The OCID of the work request.
     * @return the value
     **/
    public String getWorkRequestId() {
        return workRequestId;
    }

    /**
     * A machine-usable code for the error that occurred. Error codes are listed on
     * (https://docs.us-phoenix-1.oraclecloud.com/Content/API/References/apierrors.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

    /**
     * A machine-usable code for the error that occurred. Error codes are listed on
     * (https://docs.us-phoenix-1.oraclecloud.com/Content/API/References/apierrors.htm).
     *
     * @return the value
     **/
    public String getCode() {
        return code;
    }

    /**
     * A human-readable description of the issue that occurred.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A human-readable description of the issue that occurred.
     * @return the value
     **/
    public String getMessage() {
        return message;
    }

    /**
     * Determines if the work request error can be reproduced and tried again.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRetryable")
    private final Boolean isRetryable;

    /**
     * Determines if the work request error can be reproduced and tried again.
     * @return the value
     **/
    public Boolean getIsRetryable() {
        return isRetryable;
    }

    /**
     * The date and time the error occurred as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339). The precision for the time object is in milliseconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The date and time the error occurred as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339). The precision for the time object is in milliseconds.
     *
     * @return the value
     **/
    public java.util.Date getTimestamp() {
        return timestamp;
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
        sb.append("WorkRequestError(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(", code=").append(String.valueOf(this.code));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", isRetryable=").append(String.valueOf(this.isRetryable));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkRequestError)) {
            return false;
        }

        WorkRequestError other = (WorkRequestError) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.isRetryable, other.isRetryable)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.isRetryable == null ? 43 : this.isRetryable.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
