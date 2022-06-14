/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * These configuration details are used for dead peer detection (DPD). DPD periodically checks the stability of the connection to the customer premises (CPE), and may be used to detect that the link to the CPE has gone down.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DpdConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DpdConfig {
    @Deprecated
    @java.beans.ConstructorProperties({"dpdMode", "dpdTimeoutInSec"})
    public DpdConfig(DpdMode dpdMode, Integer dpdTimeoutInSec) {
        super();
        this.dpdMode = dpdMode;
        this.dpdTimeoutInSec = dpdTimeoutInSec;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This option defines whether DPD can be initiated from the Oracle side of the connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dpdMode")
        private DpdMode dpdMode;

        /**
         * This option defines whether DPD can be initiated from the Oracle side of the connection.
         *
         * @param dpdMode the value to set
         * @return this builder
         **/
        public Builder dpdMode(DpdMode dpdMode) {
            this.dpdMode = dpdMode;
            this.__explicitlySet__.add("dpdMode");
            return this;
        }
        /**
         * DPD timeout in seconds. This sets the longest interval between CPE device health messages before the IPSec connection indicates it has lost contact with the CPE. The default is 20 seconds.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dpdTimeoutInSec")
        private Integer dpdTimeoutInSec;

        /**
         * DPD timeout in seconds. This sets the longest interval between CPE device health messages before the IPSec connection indicates it has lost contact with the CPE. The default is 20 seconds.
         *
         * @param dpdTimeoutInSec the value to set
         * @return this builder
         **/
        public Builder dpdTimeoutInSec(Integer dpdTimeoutInSec) {
            this.dpdTimeoutInSec = dpdTimeoutInSec;
            this.__explicitlySet__.add("dpdTimeoutInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DpdConfig build() {
            DpdConfig __instance__ = new DpdConfig(dpdMode, dpdTimeoutInSec);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DpdConfig o) {
            Builder copiedBuilder = dpdMode(o.getDpdMode()).dpdTimeoutInSec(o.getDpdTimeoutInSec());

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
     * This option defines whether DPD can be initiated from the Oracle side of the connection.
     *
     **/
    public enum DpdMode {
        InitiateAndRespond("INITIATE_AND_RESPOND"),
        RespondOnly("RESPOND_ONLY"),
        ;

        private final String value;
        private static java.util.Map<String, DpdMode> map;

        static {
            map = new java.util.HashMap<>();
            for (DpdMode v : DpdMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        DpdMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DpdMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DpdMode: " + key);
        }
    };
    /**
     * This option defines whether DPD can be initiated from the Oracle side of the connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dpdMode")
    private final DpdMode dpdMode;

    /**
     * This option defines whether DPD can be initiated from the Oracle side of the connection.
     *
     * @return the value
     **/
    public DpdMode getDpdMode() {
        return dpdMode;
    }

    /**
     * DPD timeout in seconds. This sets the longest interval between CPE device health messages before the IPSec connection indicates it has lost contact with the CPE. The default is 20 seconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dpdTimeoutInSec")
    private final Integer dpdTimeoutInSec;

    /**
     * DPD timeout in seconds. This sets the longest interval between CPE device health messages before the IPSec connection indicates it has lost contact with the CPE. The default is 20 seconds.
     *
     * @return the value
     **/
    public Integer getDpdTimeoutInSec() {
        return dpdTimeoutInSec;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DpdConfig(");
        sb.append("dpdMode=").append(String.valueOf(this.dpdMode));
        sb.append(", dpdTimeoutInSec=").append(String.valueOf(this.dpdTimeoutInSec));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DpdConfig)) {
            return false;
        }

        DpdConfig other = (DpdConfig) o;
        return java.util.Objects.equals(this.dpdMode, other.dpdMode)
                && java.util.Objects.equals(this.dpdTimeoutInSec, other.dpdTimeoutInSec)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dpdMode == null ? 43 : this.dpdMode.hashCode());
        result =
                (result * PRIME)
                        + (this.dpdTimeoutInSec == null ? 43 : this.dpdTimeoutInSec.hashCode());
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
