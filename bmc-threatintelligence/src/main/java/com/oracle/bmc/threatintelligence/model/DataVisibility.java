/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.threatintelligence.model;

/**
 * The visibility level of attribution data, including its [Traffic Light Protocol
 * (TLP)](https://www.cisa.gov/tlp) color. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DataVisibility.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataVisibility
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "tlpName"})
    public DataVisibility(String name, TlpName tlpName) {
        super();
        this.name = name;
        this.tlpName = tlpName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the visibility level. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the visibility level.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The Traffic Light Protocol (TLP) color of the visibility level. */
        @com.fasterxml.jackson.annotation.JsonProperty("tlpName")
        private TlpName tlpName;

        /**
         * The Traffic Light Protocol (TLP) color of the visibility level.
         *
         * @param tlpName the value to set
         * @return this builder
         */
        public Builder tlpName(TlpName tlpName) {
            this.tlpName = tlpName;
            this.__explicitlySet__.add("tlpName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataVisibility build() {
            DataVisibility model = new DataVisibility(this.name, this.tlpName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataVisibility model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("tlpName")) {
                this.tlpName(model.getTlpName());
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

    /** The name of the visibility level. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the visibility level.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The Traffic Light Protocol (TLP) color of the visibility level. */
    public enum TlpName implements com.oracle.bmc.http.internal.BmcEnum {
        TlpInternalAudit("TLP_INTERNAL_AUDIT"),
        TlpWhite("TLP_WHITE"),
        TlpGreen("TLP_GREEN"),
        TlpAmber("TLP_AMBER"),
        TlpRed("TLP_RED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TlpName.class);

        private final String value;
        private static java.util.Map<String, TlpName> map;

        static {
            map = new java.util.HashMap<>();
            for (TlpName v : TlpName.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TlpName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TlpName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TlpName', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The Traffic Light Protocol (TLP) color of the visibility level. */
    @com.fasterxml.jackson.annotation.JsonProperty("tlpName")
    private final TlpName tlpName;

    /**
     * The Traffic Light Protocol (TLP) color of the visibility level.
     *
     * @return the value
     */
    public TlpName getTlpName() {
        return tlpName;
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
        sb.append("DataVisibility(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", tlpName=").append(String.valueOf(this.tlpName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataVisibility)) {
            return false;
        }

        DataVisibility other = (DataVisibility) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.tlpName, other.tlpName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.tlpName == null ? 43 : this.tlpName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
