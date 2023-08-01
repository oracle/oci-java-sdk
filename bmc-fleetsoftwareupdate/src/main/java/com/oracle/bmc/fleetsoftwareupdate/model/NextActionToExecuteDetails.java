/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Details of the next Exadata Fleet Update Action to execute in a Maintenance Cycle. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NextActionToExecuteDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NextActionToExecuteDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "timeToStart"})
    public NextActionToExecuteDetails(DetailedActionTypes type, java.util.Date timeToStart) {
        super();
        this.type = type;
        this.timeToStart = timeToStart;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of Exadata Fleet Update Action */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private DetailedActionTypes type;

        /**
         * Type of Exadata Fleet Update Action
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(DetailedActionTypes type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The date and time the Exadata Fleet Update Action is expected to start. Null if no Action
         * has been scheduled. [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeToStart")
        private java.util.Date timeToStart;

        /**
         * The date and time the Exadata Fleet Update Action is expected to start. Null if no Action
         * has been scheduled. [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         *
         * @param timeToStart the value to set
         * @return this builder
         */
        public Builder timeToStart(java.util.Date timeToStart) {
            this.timeToStart = timeToStart;
            this.__explicitlySet__.add("timeToStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NextActionToExecuteDetails build() {
            NextActionToExecuteDetails model =
                    new NextActionToExecuteDetails(this.type, this.timeToStart);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NextActionToExecuteDetails model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("timeToStart")) {
                this.timeToStart(model.getTimeToStart());
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

    /** Type of Exadata Fleet Update Action */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final DetailedActionTypes type;

    /**
     * Type of Exadata Fleet Update Action
     *
     * @return the value
     */
    public DetailedActionTypes getType() {
        return type;
    }

    /**
     * The date and time the Exadata Fleet Update Action is expected to start. Null if no Action has
     * been scheduled. [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeToStart")
    private final java.util.Date timeToStart;

    /**
     * The date and time the Exadata Fleet Update Action is expected to start. Null if no Action has
     * been scheduled. [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     */
    public java.util.Date getTimeToStart() {
        return timeToStart;
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
        sb.append("NextActionToExecuteDetails(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", timeToStart=").append(String.valueOf(this.timeToStart));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NextActionToExecuteDetails)) {
            return false;
        }

        NextActionToExecuteDetails other = (NextActionToExecuteDetails) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.timeToStart, other.timeToStart)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.timeToStart == null ? 43 : this.timeToStart.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
