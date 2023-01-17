/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Vantage Point Node
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VantagePointNode.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VantagePointNode extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "name", "displayName", "geoInfo", "outgoingLinks"})
    public VantagePointNode(
            String id,
            String name,
            String displayName,
            String geoInfo,
            java.util.List<String> outgoingLinks) {
        super();
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.geoInfo = geoInfo;
        this.outgoingLinks = outgoingLinks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * id of Vantage Point node
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * id of Vantage Point node
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * name of Vantage Point node
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * name of Vantage Point node
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * display name of Vantage Point node
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * display name of Vantage Point node
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
         * links outgoing from this Vantage Point node
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("outgoingLinks")
        private java.util.List<String> outgoingLinks;

        /**
         * links outgoing from this Vantage Point node
         * @param outgoingLinks the value to set
         * @return this builder
         **/
        public Builder outgoingLinks(java.util.List<String> outgoingLinks) {
            this.outgoingLinks = outgoingLinks;
            this.__explicitlySet__.add("outgoingLinks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VantagePointNode build() {
            VantagePointNode model =
                    new VantagePointNode(
                            this.id, this.name, this.displayName, this.geoInfo, this.outgoingLinks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VantagePointNode model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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
     * id of Vantage Point node
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * id of Vantage Point node
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * name of Vantage Point node
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * name of Vantage Point node
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * display name of Vantage Point node
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * display name of Vantage Point node
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
     * links outgoing from this Vantage Point node
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outgoingLinks")
    private final java.util.List<String> outgoingLinks;

    /**
     * links outgoing from this Vantage Point node
     * @return the value
     **/
    public java.util.List<String> getOutgoingLinks() {
        return outgoingLinks;
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
        sb.append("VantagePointNode(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", geoInfo=").append(String.valueOf(this.geoInfo));
        sb.append(", outgoingLinks=").append(String.valueOf(this.outgoingLinks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VantagePointNode)) {
            return false;
        }

        VantagePointNode other = (VantagePointNode) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.geoInfo, other.geoInfo)
                && java.util.Objects.equals(this.outgoingLinks, other.outgoingLinks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.geoInfo == null ? 43 : this.geoInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.outgoingLinks == null ? 43 : this.outgoingLinks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
