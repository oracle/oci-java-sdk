/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * OPN membership information <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OpnMembership.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OpnMembership extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeStart",
        "timeEnd",
        "opnStatus",
        "opnNumber",
        "opnMembershipType"
    })
    public OpnMembership(
            java.util.Date timeStart,
            java.util.Date timeEnd,
            OpnStatus opnStatus,
            String opnNumber,
            String opnMembershipType) {
        super();
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.opnStatus = opnStatus;
        this.opnNumber = opnNumber;
        this.opnMembershipType = opnMembershipType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OPN membership start date. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * OPN membership start date. An RFC3339 formatted datetime string
         *
         * @param timeStart the value to set
         * @return this builder
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /** OPN membership end date. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * OPN membership end date. An RFC3339 formatted datetime string
         *
         * @param timeEnd the value to set
         * @return this builder
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /** OPN status */
        @com.fasterxml.jackson.annotation.JsonProperty("opnStatus")
        private OpnStatus opnStatus;

        /**
         * OPN status
         *
         * @param opnStatus the value to set
         * @return this builder
         */
        public Builder opnStatus(OpnStatus opnStatus) {
            this.opnStatus = opnStatus;
            this.__explicitlySet__.add("opnStatus");
            return this;
        }
        /** OPN Number number */
        @com.fasterxml.jackson.annotation.JsonProperty("opnNumber")
        private String opnNumber;

        /**
         * OPN Number number
         *
         * @param opnNumber the value to set
         * @return this builder
         */
        public Builder opnNumber(String opnNumber) {
            this.opnNumber = opnNumber;
            this.__explicitlySet__.add("opnNumber");
            return this;
        }
        /** OPN membership type */
        @com.fasterxml.jackson.annotation.JsonProperty("opnMembershipType")
        private String opnMembershipType;

        /**
         * OPN membership type
         *
         * @param opnMembershipType the value to set
         * @return this builder
         */
        public Builder opnMembershipType(String opnMembershipType) {
            this.opnMembershipType = opnMembershipType;
            this.__explicitlySet__.add("opnMembershipType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpnMembership build() {
            OpnMembership model =
                    new OpnMembership(
                            this.timeStart,
                            this.timeEnd,
                            this.opnStatus,
                            this.opnNumber,
                            this.opnMembershipType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpnMembership model) {
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("opnStatus")) {
                this.opnStatus(model.getOpnStatus());
            }
            if (model.wasPropertyExplicitlySet("opnNumber")) {
                this.opnNumber(model.getOpnNumber());
            }
            if (model.wasPropertyExplicitlySet("opnMembershipType")) {
                this.opnMembershipType(model.getOpnMembershipType());
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

    /** OPN membership start date. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * OPN membership start date. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /** OPN membership end date. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * OPN membership end date. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /** OPN status */
    public enum OpnStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        RenewalInProgress("RENEWAL_IN_PROGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OpnStatus.class);

        private final String value;
        private static java.util.Map<String, OpnStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (OpnStatus v : OpnStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OpnStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OpnStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OpnStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** OPN status */
    @com.fasterxml.jackson.annotation.JsonProperty("opnStatus")
    private final OpnStatus opnStatus;

    /**
     * OPN status
     *
     * @return the value
     */
    public OpnStatus getOpnStatus() {
        return opnStatus;
    }

    /** OPN Number number */
    @com.fasterxml.jackson.annotation.JsonProperty("opnNumber")
    private final String opnNumber;

    /**
     * OPN Number number
     *
     * @return the value
     */
    public String getOpnNumber() {
        return opnNumber;
    }

    /** OPN membership type */
    @com.fasterxml.jackson.annotation.JsonProperty("opnMembershipType")
    private final String opnMembershipType;

    /**
     * OPN membership type
     *
     * @return the value
     */
    public String getOpnMembershipType() {
        return opnMembershipType;
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
        sb.append("OpnMembership(");
        sb.append("super=").append(super.toString());
        sb.append("timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", opnStatus=").append(String.valueOf(this.opnStatus));
        sb.append(", opnNumber=").append(String.valueOf(this.opnNumber));
        sb.append(", opnMembershipType=").append(String.valueOf(this.opnMembershipType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpnMembership)) {
            return false;
        }

        OpnMembership other = (OpnMembership) o;
        return java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.opnStatus, other.opnStatus)
                && java.util.Objects.equals(this.opnNumber, other.opnNumber)
                && java.util.Objects.equals(this.opnMembershipType, other.opnMembershipType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.opnStatus == null ? 43 : this.opnStatus.hashCode());
        result = (result * PRIME) + (this.opnNumber == null ? 43 : this.opnNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.opnMembershipType == null ? 43 : this.opnMembershipType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
