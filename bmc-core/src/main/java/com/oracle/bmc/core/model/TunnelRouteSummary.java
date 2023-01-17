/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A summary of the routes advertised to and received from the on-premises network.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TunnelRouteSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TunnelRouteSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"prefix", "age", "isBestPath", "asPath", "advertiser"})
    public TunnelRouteSummary(
            String prefix,
            Long age,
            Boolean isBestPath,
            java.util.List<Integer> asPath,
            Advertiser advertiser) {
        super();
        this.prefix = prefix;
        this.age = age;
        this.isBestPath = isBestPath;
        this.asPath = asPath;
        this.advertiser = advertiser;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The BGP network layer reachability information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * The BGP network layer reachability information.
         * @param prefix the value to set
         * @return this builder
         **/
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }
        /**
         * The age of the route.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("age")
        private Long age;

        /**
         * The age of the route.
         * @param age the value to set
         * @return this builder
         **/
        public Builder age(Long age) {
            this.age = age;
            this.__explicitlySet__.add("age");
            return this;
        }
        /**
         * Indicates this is the best route.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isBestPath")
        private Boolean isBestPath;

        /**
         * Indicates this is the best route.
         * @param isBestPath the value to set
         * @return this builder
         **/
        public Builder isBestPath(Boolean isBestPath) {
            this.isBestPath = isBestPath;
            this.__explicitlySet__.add("isBestPath");
            return this;
        }
        /**
         * A list of ASNs in AS_Path.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("asPath")
        private java.util.List<Integer> asPath;

        /**
         * A list of ASNs in AS_Path.
         * @param asPath the value to set
         * @return this builder
         **/
        public Builder asPath(java.util.List<Integer> asPath) {
            this.asPath = asPath;
            this.__explicitlySet__.add("asPath");
            return this;
        }
        /**
         * The source of the route advertisement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("advertiser")
        private Advertiser advertiser;

        /**
         * The source of the route advertisement.
         * @param advertiser the value to set
         * @return this builder
         **/
        public Builder advertiser(Advertiser advertiser) {
            this.advertiser = advertiser;
            this.__explicitlySet__.add("advertiser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TunnelRouteSummary build() {
            TunnelRouteSummary model =
                    new TunnelRouteSummary(
                            this.prefix, this.age, this.isBestPath, this.asPath, this.advertiser);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TunnelRouteSummary model) {
            if (model.wasPropertyExplicitlySet("prefix")) {
                this.prefix(model.getPrefix());
            }
            if (model.wasPropertyExplicitlySet("age")) {
                this.age(model.getAge());
            }
            if (model.wasPropertyExplicitlySet("isBestPath")) {
                this.isBestPath(model.getIsBestPath());
            }
            if (model.wasPropertyExplicitlySet("asPath")) {
                this.asPath(model.getAsPath());
            }
            if (model.wasPropertyExplicitlySet("advertiser")) {
                this.advertiser(model.getAdvertiser());
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
     * The BGP network layer reachability information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * The BGP network layer reachability information.
     * @return the value
     **/
    public String getPrefix() {
        return prefix;
    }

    /**
     * The age of the route.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("age")
    private final Long age;

    /**
     * The age of the route.
     * @return the value
     **/
    public Long getAge() {
        return age;
    }

    /**
     * Indicates this is the best route.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBestPath")
    private final Boolean isBestPath;

    /**
     * Indicates this is the best route.
     * @return the value
     **/
    public Boolean getIsBestPath() {
        return isBestPath;
    }

    /**
     * A list of ASNs in AS_Path.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asPath")
    private final java.util.List<Integer> asPath;

    /**
     * A list of ASNs in AS_Path.
     * @return the value
     **/
    public java.util.List<Integer> getAsPath() {
        return asPath;
    }

    /**
     * The source of the route advertisement.
     **/
    public enum Advertiser {
        Customer("CUSTOMER"),
        Oracle("ORACLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Advertiser.class);

        private final String value;
        private static java.util.Map<String, Advertiser> map;

        static {
            map = new java.util.HashMap<>();
            for (Advertiser v : Advertiser.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Advertiser(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Advertiser create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Advertiser', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The source of the route advertisement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("advertiser")
    private final Advertiser advertiser;

    /**
     * The source of the route advertisement.
     * @return the value
     **/
    public Advertiser getAdvertiser() {
        return advertiser;
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
        sb.append("TunnelRouteSummary(");
        sb.append("super=").append(super.toString());
        sb.append("prefix=").append(String.valueOf(this.prefix));
        sb.append(", age=").append(String.valueOf(this.age));
        sb.append(", isBestPath=").append(String.valueOf(this.isBestPath));
        sb.append(", asPath=").append(String.valueOf(this.asPath));
        sb.append(", advertiser=").append(String.valueOf(this.advertiser));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TunnelRouteSummary)) {
            return false;
        }

        TunnelRouteSummary other = (TunnelRouteSummary) o;
        return java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.age, other.age)
                && java.util.Objects.equals(this.isBestPath, other.isBestPath)
                && java.util.Objects.equals(this.asPath, other.asPath)
                && java.util.Objects.equals(this.advertiser, other.advertiser)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result = (result * PRIME) + (this.age == null ? 43 : this.age.hashCode());
        result = (result * PRIME) + (this.isBestPath == null ? 43 : this.isBestPath.hashCode());
        result = (result * PRIME) + (this.asPath == null ? 43 : this.asPath.hashCode());
        result = (result * PRIME) + (this.advertiser == null ? 43 : this.advertiser.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
