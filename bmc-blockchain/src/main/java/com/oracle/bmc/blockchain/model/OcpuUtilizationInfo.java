/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Ocpu utilization for a VM host <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OcpuUtilizationInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OcpuUtilizationInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"host", "ocpuUtilizationNumber", "ocpuCapacityNumber"})
    public OcpuUtilizationInfo(String host, Float ocpuUtilizationNumber, Float ocpuCapacityNumber) {
        super();
        this.host = host;
        this.ocpuUtilizationNumber = ocpuUtilizationNumber;
        this.ocpuCapacityNumber = ocpuCapacityNumber;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Host name of VM */
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * Host name of VM
         *
         * @param host the value to set
         * @return this builder
         */
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /** Number of OCPU utilized */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuUtilizationNumber")
        private Float ocpuUtilizationNumber;

        /**
         * Number of OCPU utilized
         *
         * @param ocpuUtilizationNumber the value to set
         * @return this builder
         */
        public Builder ocpuUtilizationNumber(Float ocpuUtilizationNumber) {
            this.ocpuUtilizationNumber = ocpuUtilizationNumber;
            this.__explicitlySet__.add("ocpuUtilizationNumber");
            return this;
        }
        /** Number of total OCPU capacity on the host */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCapacityNumber")
        private Float ocpuCapacityNumber;

        /**
         * Number of total OCPU capacity on the host
         *
         * @param ocpuCapacityNumber the value to set
         * @return this builder
         */
        public Builder ocpuCapacityNumber(Float ocpuCapacityNumber) {
            this.ocpuCapacityNumber = ocpuCapacityNumber;
            this.__explicitlySet__.add("ocpuCapacityNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OcpuUtilizationInfo build() {
            OcpuUtilizationInfo model =
                    new OcpuUtilizationInfo(
                            this.host, this.ocpuUtilizationNumber, this.ocpuCapacityNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OcpuUtilizationInfo model) {
            if (model.wasPropertyExplicitlySet("host")) {
                this.host(model.getHost());
            }
            if (model.wasPropertyExplicitlySet("ocpuUtilizationNumber")) {
                this.ocpuUtilizationNumber(model.getOcpuUtilizationNumber());
            }
            if (model.wasPropertyExplicitlySet("ocpuCapacityNumber")) {
                this.ocpuCapacityNumber(model.getOcpuCapacityNumber());
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

    /** Host name of VM */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * Host name of VM
     *
     * @return the value
     */
    public String getHost() {
        return host;
    }

    /** Number of OCPU utilized */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuUtilizationNumber")
    private final Float ocpuUtilizationNumber;

    /**
     * Number of OCPU utilized
     *
     * @return the value
     */
    public Float getOcpuUtilizationNumber() {
        return ocpuUtilizationNumber;
    }

    /** Number of total OCPU capacity on the host */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCapacityNumber")
    private final Float ocpuCapacityNumber;

    /**
     * Number of total OCPU capacity on the host
     *
     * @return the value
     */
    public Float getOcpuCapacityNumber() {
        return ocpuCapacityNumber;
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
        sb.append("OcpuUtilizationInfo(");
        sb.append("super=").append(super.toString());
        sb.append("host=").append(String.valueOf(this.host));
        sb.append(", ocpuUtilizationNumber=").append(String.valueOf(this.ocpuUtilizationNumber));
        sb.append(", ocpuCapacityNumber=").append(String.valueOf(this.ocpuCapacityNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OcpuUtilizationInfo)) {
            return false;
        }

        OcpuUtilizationInfo other = (OcpuUtilizationInfo) o;
        return java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.ocpuUtilizationNumber, other.ocpuUtilizationNumber)
                && java.util.Objects.equals(this.ocpuCapacityNumber, other.ocpuCapacityNumber)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result =
                (result * PRIME)
                        + (this.ocpuUtilizationNumber == null
                                ? 43
                                : this.ocpuUtilizationNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.ocpuCapacityNumber == null
                                ? 43
                                : this.ocpuCapacityNumber.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
