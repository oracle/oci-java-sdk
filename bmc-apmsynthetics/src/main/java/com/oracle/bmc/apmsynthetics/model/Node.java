/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Network node
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Node.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Node extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "ipAddress",
        "displayName",
        "geoInfo",
        "outgoingLinks",
        "consecutiveAnonymousCount",
        "level",
        "avgPacketResponseTimeInMs",
        "avgPacketLossPercent",
        "type"
    })
    public Node(
            String id,
            String ipAddress,
            String displayName,
            String geoInfo,
            java.util.List<String> outgoingLinks,
            Integer consecutiveAnonymousCount,
            Integer level,
            Double avgPacketResponseTimeInMs,
            Double avgPacketLossPercent,
            Type type) {
        super();
        this.id = id;
        this.ipAddress = ipAddress;
        this.displayName = displayName;
        this.geoInfo = geoInfo;
        this.outgoingLinks = outgoingLinks;
        this.consecutiveAnonymousCount = consecutiveAnonymousCount;
        this.level = level;
        this.avgPacketResponseTimeInMs = avgPacketResponseTimeInMs;
        this.avgPacketLossPercent = avgPacketLossPercent;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * id of node
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * id of node
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * ip address of node
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * ip address of node
         * @param ipAddress the value to set
         * @return this builder
         **/
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /**
         * display name of node
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * display name of node
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * geo info
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("geoInfo")
        private String geoInfo;

        /**
         * geo info
         * @param geoInfo the value to set
         * @return this builder
         **/
        public Builder geoInfo(String geoInfo) {
            this.geoInfo = geoInfo;
            this.__explicitlySet__.add("geoInfo");
            return this;
        }
        /**
         * links outgoing from this node
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("outgoingLinks")
        private java.util.List<String> outgoingLinks;

        /**
         * links outgoing from this node
         * @param outgoingLinks the value to set
         * @return this builder
         **/
        public Builder outgoingLinks(java.util.List<String> outgoingLinks) {
            this.outgoingLinks = outgoingLinks;
            this.__explicitlySet__.add("outgoingLinks");
            return this;
        }
        /**
         * consecutive anonymous node count
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("consecutiveAnonymousCount")
        private Integer consecutiveAnonymousCount;

        /**
         * consecutive anonymous node count
         * @param consecutiveAnonymousCount the value to set
         * @return this builder
         **/
        public Builder consecutiveAnonymousCount(Integer consecutiveAnonymousCount) {
            this.consecutiveAnonymousCount = consecutiveAnonymousCount;
            this.__explicitlySet__.add("consecutiveAnonymousCount");
            return this;
        }
        /**
         * level of this node
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("level")
        private Integer level;

        /**
         * level of this node
         * @param level the value to set
         * @return this builder
         **/
        public Builder level(Integer level) {
            this.level = level;
            this.__explicitlySet__.add("level");
            return this;
        }
        /**
         * average packet response time in milli seconds
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("avgPacketResponseTimeInMs")
        private Double avgPacketResponseTimeInMs;

        /**
         * average packet response time in milli seconds
         * @param avgPacketResponseTimeInMs the value to set
         * @return this builder
         **/
        public Builder avgPacketResponseTimeInMs(Double avgPacketResponseTimeInMs) {
            this.avgPacketResponseTimeInMs = avgPacketResponseTimeInMs;
            this.__explicitlySet__.add("avgPacketResponseTimeInMs");
            return this;
        }
        /**
         * average packet loss percentage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("avgPacketLossPercent")
        private Double avgPacketLossPercent;

        /**
         * average packet loss percentage
         * @param avgPacketLossPercent the value to set
         * @return this builder
         **/
        public Builder avgPacketLossPercent(Double avgPacketLossPercent) {
            this.avgPacketLossPercent = avgPacketLossPercent;
            this.__explicitlySet__.add("avgPacketLossPercent");
            return this;
        }
        /**
         * type of node
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * type of node
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Node build() {
            Node model =
                    new Node(
                            this.id,
                            this.ipAddress,
                            this.displayName,
                            this.geoInfo,
                            this.outgoingLinks,
                            this.consecutiveAnonymousCount,
                            this.level,
                            this.avgPacketResponseTimeInMs,
                            this.avgPacketLossPercent,
                            this.type);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Node model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("geoInfo")) {
                this.geoInfo(model.getGeoInfo());
            }
            if (model.wasPropertyExplicitlySet("outgoingLinks")) {
                this.outgoingLinks(model.getOutgoingLinks());
            }
            if (model.wasPropertyExplicitlySet("consecutiveAnonymousCount")) {
                this.consecutiveAnonymousCount(model.getConsecutiveAnonymousCount());
            }
            if (model.wasPropertyExplicitlySet("level")) {
                this.level(model.getLevel());
            }
            if (model.wasPropertyExplicitlySet("avgPacketResponseTimeInMs")) {
                this.avgPacketResponseTimeInMs(model.getAvgPacketResponseTimeInMs());
            }
            if (model.wasPropertyExplicitlySet("avgPacketLossPercent")) {
                this.avgPacketLossPercent(model.getAvgPacketLossPercent());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
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
     * id of node
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * id of node
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * ip address of node
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * ip address of node
     * @return the value
     **/
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * display name of node
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * display name of node
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * geo info
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("geoInfo")
    private final String geoInfo;

    /**
     * geo info
     * @return the value
     **/
    public String getGeoInfo() {
        return geoInfo;
    }

    /**
     * links outgoing from this node
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outgoingLinks")
    private final java.util.List<String> outgoingLinks;

    /**
     * links outgoing from this node
     * @return the value
     **/
    public java.util.List<String> getOutgoingLinks() {
        return outgoingLinks;
    }

    /**
     * consecutive anonymous node count
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consecutiveAnonymousCount")
    private final Integer consecutiveAnonymousCount;

    /**
     * consecutive anonymous node count
     * @return the value
     **/
    public Integer getConsecutiveAnonymousCount() {
        return consecutiveAnonymousCount;
    }

    /**
     * level of this node
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    private final Integer level;

    /**
     * level of this node
     * @return the value
     **/
    public Integer getLevel() {
        return level;
    }

    /**
     * average packet response time in milli seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("avgPacketResponseTimeInMs")
    private final Double avgPacketResponseTimeInMs;

    /**
     * average packet response time in milli seconds
     * @return the value
     **/
    public Double getAvgPacketResponseTimeInMs() {
        return avgPacketResponseTimeInMs;
    }

    /**
     * average packet loss percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("avgPacketLossPercent")
    private final Double avgPacketLossPercent;

    /**
     * average packet loss percentage
     * @return the value
     **/
    public Double getAvgPacketLossPercent() {
        return avgPacketLossPercent;
    }

    /**
     * type of node
     **/
    public enum Type {
        Source("SOURCE"),
        Destination("DESTINATION"),
        Anonymous("ANONYMOUS"),
        Internal("INTERNAL"),
        Dangling("DANGLING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * type of node
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * type of node
     * @return the value
     **/
    public Type getType() {
        return type;
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
        sb.append("Node(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", geoInfo=").append(String.valueOf(this.geoInfo));
        sb.append(", outgoingLinks=").append(String.valueOf(this.outgoingLinks));
        sb.append(", consecutiveAnonymousCount=")
                .append(String.valueOf(this.consecutiveAnonymousCount));
        sb.append(", level=").append(String.valueOf(this.level));
        sb.append(", avgPacketResponseTimeInMs=")
                .append(String.valueOf(this.avgPacketResponseTimeInMs));
        sb.append(", avgPacketLossPercent=").append(String.valueOf(this.avgPacketLossPercent));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Node)) {
            return false;
        }

        Node other = (Node) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.geoInfo, other.geoInfo)
                && java.util.Objects.equals(this.outgoingLinks, other.outgoingLinks)
                && java.util.Objects.equals(
                        this.consecutiveAnonymousCount, other.consecutiveAnonymousCount)
                && java.util.Objects.equals(this.level, other.level)
                && java.util.Objects.equals(
                        this.avgPacketResponseTimeInMs, other.avgPacketResponseTimeInMs)
                && java.util.Objects.equals(this.avgPacketLossPercent, other.avgPacketLossPercent)
                && java.util.Objects.equals(this.type, other.type)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.geoInfo == null ? 43 : this.geoInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.outgoingLinks == null ? 43 : this.outgoingLinks.hashCode());
        result =
                (result * PRIME)
                        + (this.consecutiveAnonymousCount == null
                                ? 43
                                : this.consecutiveAnonymousCount.hashCode());
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        result =
                (result * PRIME)
                        + (this.avgPacketResponseTimeInMs == null
                                ? 43
                                : this.avgPacketResponseTimeInMs.hashCode());
        result =
                (result * PRIME)
                        + (this.avgPacketLossPercent == null
                                ? 43
                                : this.avgPacketLossPercent.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
