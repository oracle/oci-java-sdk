/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Domain details of the On-premise VP worker. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IdentityInfoDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IdentityInfoDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"regionName", "apmShortId", "collectorEndPoint"})
    public IdentityInfoDetails(String regionName, String apmShortId, String collectorEndPoint) {
        super();
        this.regionName = regionName;
        this.apmShortId = apmShortId;
        this.collectorEndPoint = collectorEndPoint;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Domain region of the On-premise VP worker. */
        @com.fasterxml.jackson.annotation.JsonProperty("regionName")
        private String regionName;

        /**
         * Domain region of the On-premise VP worker.
         *
         * @param regionName the value to set
         * @return this builder
         */
        public Builder regionName(String regionName) {
            this.regionName = regionName;
            this.__explicitlySet__.add("regionName");
            return this;
        }
        /** Domain short id of the On-premise VP worker. */
        @com.fasterxml.jackson.annotation.JsonProperty("apmShortId")
        private String apmShortId;

        /**
         * Domain short id of the On-premise VP worker.
         *
         * @param apmShortId the value to set
         * @return this builder
         */
        public Builder apmShortId(String apmShortId) {
            this.apmShortId = apmShortId;
            this.__explicitlySet__.add("apmShortId");
            return this;
        }
        /** Collector endpoint of the On-premise VP worker. */
        @com.fasterxml.jackson.annotation.JsonProperty("collectorEndPoint")
        private String collectorEndPoint;

        /**
         * Collector endpoint of the On-premise VP worker.
         *
         * @param collectorEndPoint the value to set
         * @return this builder
         */
        public Builder collectorEndPoint(String collectorEndPoint) {
            this.collectorEndPoint = collectorEndPoint;
            this.__explicitlySet__.add("collectorEndPoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdentityInfoDetails build() {
            IdentityInfoDetails model =
                    new IdentityInfoDetails(
                            this.regionName, this.apmShortId, this.collectorEndPoint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentityInfoDetails model) {
            if (model.wasPropertyExplicitlySet("regionName")) {
                this.regionName(model.getRegionName());
            }
            if (model.wasPropertyExplicitlySet("apmShortId")) {
                this.apmShortId(model.getApmShortId());
            }
            if (model.wasPropertyExplicitlySet("collectorEndPoint")) {
                this.collectorEndPoint(model.getCollectorEndPoint());
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

    /** Domain region of the On-premise VP worker. */
    @com.fasterxml.jackson.annotation.JsonProperty("regionName")
    private final String regionName;

    /**
     * Domain region of the On-premise VP worker.
     *
     * @return the value
     */
    public String getRegionName() {
        return regionName;
    }

    /** Domain short id of the On-premise VP worker. */
    @com.fasterxml.jackson.annotation.JsonProperty("apmShortId")
    private final String apmShortId;

    /**
     * Domain short id of the On-premise VP worker.
     *
     * @return the value
     */
    public String getApmShortId() {
        return apmShortId;
    }

    /** Collector endpoint of the On-premise VP worker. */
    @com.fasterxml.jackson.annotation.JsonProperty("collectorEndPoint")
    private final String collectorEndPoint;

    /**
     * Collector endpoint of the On-premise VP worker.
     *
     * @return the value
     */
    public String getCollectorEndPoint() {
        return collectorEndPoint;
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
        sb.append("IdentityInfoDetails(");
        sb.append("super=").append(super.toString());
        sb.append("regionName=").append(String.valueOf(this.regionName));
        sb.append(", apmShortId=").append(String.valueOf(this.apmShortId));
        sb.append(", collectorEndPoint=").append(String.valueOf(this.collectorEndPoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentityInfoDetails)) {
            return false;
        }

        IdentityInfoDetails other = (IdentityInfoDetails) o;
        return java.util.Objects.equals(this.regionName, other.regionName)
                && java.util.Objects.equals(this.apmShortId, other.apmShortId)
                && java.util.Objects.equals(this.collectorEndPoint, other.collectorEndPoint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.regionName == null ? 43 : this.regionName.hashCode());
        result = (result * PRIME) + (this.apmShortId == null ? 43 : this.apmShortId.hashCode());
        result =
                (result * PRIME)
                        + (this.collectorEndPoint == null ? 43 : this.collectorEndPoint.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
