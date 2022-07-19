/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * A time series of traffic data for the  Web Application Firewall configured for a policy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WafTrafficDatum.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WafTrafficDatum {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeObserved",
        "timeRangeInSeconds",
        "tenancyId",
        "compartmentId",
        "waasPolicyId",
        "trafficInBytes"
    })
    public WafTrafficDatum(
            java.util.Date timeObserved,
            Integer timeRangeInSeconds,
            String tenancyId,
            String compartmentId,
            String waasPolicyId,
            Integer trafficInBytes) {
        super();
        this.timeObserved = timeObserved;
        this.timeRangeInSeconds = timeRangeInSeconds;
        this.tenancyId = tenancyId;
        this.compartmentId = compartmentId;
        this.waasPolicyId = waasPolicyId;
        this.trafficInBytes = trafficInBytes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The date and time the traffic was observed, rounded down to the start of the range, and expressed in RFC 3339 timestamp format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeObserved")
        private java.util.Date timeObserved;

        /**
         * The date and time the traffic was observed, rounded down to the start of the range, and expressed in RFC 3339 timestamp format.
         * @param timeObserved the value to set
         * @return this builder
         **/
        public Builder timeObserved(java.util.Date timeObserved) {
            this.timeObserved = timeObserved;
            this.__explicitlySet__.add("timeObserved");
            return this;
        }
        /**
         * The number of seconds this data covers.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeRangeInSeconds")
        private Integer timeRangeInSeconds;

        /**
         * The number of seconds this data covers.
         * @param timeRangeInSeconds the value to set
         * @return this builder
         **/
        public Builder timeRangeInSeconds(Integer timeRangeInSeconds) {
            this.timeRangeInSeconds = timeRangeInSeconds;
            this.__explicitlySet__.add("timeRangeInSeconds");
            return this;
        }
        /**
         * The tenancy OCID of the data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * The tenancy OCID of the data.
         * @param tenancyId the value to set
         * @return this builder
         **/
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /**
         * The compartment OCID of the data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment OCID of the data.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The policy OCID of the data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("waasPolicyId")
        private String waasPolicyId;

        /**
         * The policy OCID of the data.
         * @param waasPolicyId the value to set
         * @return this builder
         **/
        public Builder waasPolicyId(String waasPolicyId) {
            this.waasPolicyId = waasPolicyId;
            this.__explicitlySet__.add("waasPolicyId");
            return this;
        }
        /**
         * Traffic in bytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trafficInBytes")
        private Integer trafficInBytes;

        /**
         * Traffic in bytes.
         * @param trafficInBytes the value to set
         * @return this builder
         **/
        public Builder trafficInBytes(Integer trafficInBytes) {
            this.trafficInBytes = trafficInBytes;
            this.__explicitlySet__.add("trafficInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WafTrafficDatum build() {
            WafTrafficDatum __instance__ =
                    new WafTrafficDatum(
                            timeObserved,
                            timeRangeInSeconds,
                            tenancyId,
                            compartmentId,
                            waasPolicyId,
                            trafficInBytes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WafTrafficDatum o) {
            Builder copiedBuilder =
                    timeObserved(o.getTimeObserved())
                            .timeRangeInSeconds(o.getTimeRangeInSeconds())
                            .tenancyId(o.getTenancyId())
                            .compartmentId(o.getCompartmentId())
                            .waasPolicyId(o.getWaasPolicyId())
                            .trafficInBytes(o.getTrafficInBytes());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The date and time the traffic was observed, rounded down to the start of the range, and expressed in RFC 3339 timestamp format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeObserved")
    private final java.util.Date timeObserved;

    /**
     * The date and time the traffic was observed, rounded down to the start of the range, and expressed in RFC 3339 timestamp format.
     * @return the value
     **/
    public java.util.Date getTimeObserved() {
        return timeObserved;
    }

    /**
     * The number of seconds this data covers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRangeInSeconds")
    private final Integer timeRangeInSeconds;

    /**
     * The number of seconds this data covers.
     * @return the value
     **/
    public Integer getTimeRangeInSeconds() {
        return timeRangeInSeconds;
    }

    /**
     * The tenancy OCID of the data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * The tenancy OCID of the data.
     * @return the value
     **/
    public String getTenancyId() {
        return tenancyId;
    }

    /**
     * The compartment OCID of the data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment OCID of the data.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The policy OCID of the data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("waasPolicyId")
    private final String waasPolicyId;

    /**
     * The policy OCID of the data.
     * @return the value
     **/
    public String getWaasPolicyId() {
        return waasPolicyId;
    }

    /**
     * Traffic in bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trafficInBytes")
    private final Integer trafficInBytes;

    /**
     * Traffic in bytes.
     * @return the value
     **/
    public Integer getTrafficInBytes() {
        return trafficInBytes;
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
        sb.append("WafTrafficDatum(");
        sb.append("timeObserved=").append(String.valueOf(this.timeObserved));
        sb.append(", timeRangeInSeconds=").append(String.valueOf(this.timeRangeInSeconds));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", waasPolicyId=").append(String.valueOf(this.waasPolicyId));
        sb.append(", trafficInBytes=").append(String.valueOf(this.trafficInBytes));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WafTrafficDatum)) {
            return false;
        }

        WafTrafficDatum other = (WafTrafficDatum) o;
        return java.util.Objects.equals(this.timeObserved, other.timeObserved)
                && java.util.Objects.equals(this.timeRangeInSeconds, other.timeRangeInSeconds)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.waasPolicyId, other.waasPolicyId)
                && java.util.Objects.equals(this.trafficInBytes, other.trafficInBytes)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeObserved == null ? 43 : this.timeObserved.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRangeInSeconds == null
                                ? 43
                                : this.timeRangeInSeconds.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.waasPolicyId == null ? 43 : this.waasPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.trafficInBytes == null ? 43 : this.trafficInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
