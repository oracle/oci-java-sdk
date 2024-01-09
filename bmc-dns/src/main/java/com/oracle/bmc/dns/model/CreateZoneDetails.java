/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * The body for defining a new zone.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateZoneDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "migrationSource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateZoneDetails extends CreateZoneBaseDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The type of the zone. Must be either {@code PRIMARY} or {@code SECONDARY}. {@code
         * SECONDARY} is only supported for GLOBAL zones.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("zoneType")
        private ZoneType zoneType;

        /**
         * The type of the zone. Must be either {@code PRIMARY} or {@code SECONDARY}. {@code
         * SECONDARY} is only supported for GLOBAL zones.
         *
         * @param zoneType the value to set
         * @return this builder
         */
        public Builder zoneType(ZoneType zoneType) {
            this.zoneType = zoneType;
            this.__explicitlySet__.add("zoneType");
            return this;
        }
        /** This value will be null for zones in the global DNS. */
        @com.fasterxml.jackson.annotation.JsonProperty("viewId")
        private String viewId;

        /**
         * This value will be null for zones in the global DNS.
         *
         * @param viewId the value to set
         * @return this builder
         */
        public Builder viewId(String viewId) {
            this.viewId = viewId;
            this.__explicitlySet__.add("viewId");
            return this;
        }
        /** The scope of the zone. */
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private Scope scope;

        /**
         * The scope of the zone.
         *
         * @param scope the value to set
         * @return this builder
         */
        public Builder scope(Scope scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /**
         * External master servers for the zone. {@code externalMasters} becomes a required
         * parameter when the {@code zoneType} value is {@code SECONDARY}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalMasters")
        private java.util.List<ExternalMaster> externalMasters;

        /**
         * External master servers for the zone. {@code externalMasters} becomes a required
         * parameter when the {@code zoneType} value is {@code SECONDARY}.
         *
         * @param externalMasters the value to set
         * @return this builder
         */
        public Builder externalMasters(java.util.List<ExternalMaster> externalMasters) {
            this.externalMasters = externalMasters;
            this.__explicitlySet__.add("externalMasters");
            return this;
        }
        /**
         * External secondary servers for the zone. This field is currently not supported when
         * {@code zoneType} is {@code SECONDARY} or {@code scope} is {@code PRIVATE}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalDownstreams")
        private java.util.List<ExternalDownstream> externalDownstreams;

        /**
         * External secondary servers for the zone. This field is currently not supported when
         * {@code zoneType} is {@code SECONDARY} or {@code scope} is {@code PRIVATE}.
         *
         * @param externalDownstreams the value to set
         * @return this builder
         */
        public Builder externalDownstreams(java.util.List<ExternalDownstream> externalDownstreams) {
            this.externalDownstreams = externalDownstreams;
            this.__explicitlySet__.add("externalDownstreams");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateZoneDetails build() {
            CreateZoneDetails model =
                    new CreateZoneDetails(
                            this.name,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.zoneType,
                            this.viewId,
                            this.scope,
                            this.externalMasters,
                            this.externalDownstreams);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateZoneDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("zoneType")) {
                this.zoneType(model.getZoneType());
            }
            if (model.wasPropertyExplicitlySet("viewId")) {
                this.viewId(model.getViewId());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("externalMasters")) {
                this.externalMasters(model.getExternalMasters());
            }
            if (model.wasPropertyExplicitlySet("externalDownstreams")) {
                this.externalDownstreams(model.getExternalDownstreams());
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

    @Deprecated
    public CreateZoneDetails(
            String name,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            ZoneType zoneType,
            String viewId,
            Scope scope,
            java.util.List<ExternalMaster> externalMasters,
            java.util.List<ExternalDownstream> externalDownstreams) {
        super(name, compartmentId, freeformTags, definedTags);
        this.zoneType = zoneType;
        this.viewId = viewId;
        this.scope = scope;
        this.externalMasters = externalMasters;
        this.externalDownstreams = externalDownstreams;
    }

    /**
     * The type of the zone. Must be either {@code PRIMARY} or {@code SECONDARY}. {@code SECONDARY}
     * is only supported for GLOBAL zones.
     */
    public enum ZoneType implements com.oracle.bmc.http.internal.BmcEnum {
        Primary("PRIMARY"),
        Secondary("SECONDARY"),
        ;

        private final String value;
        private static java.util.Map<String, ZoneType> map;

        static {
            map = new java.util.HashMap<>();
            for (ZoneType v : ZoneType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ZoneType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ZoneType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ZoneType: " + key);
        }
    };
    /**
     * The type of the zone. Must be either {@code PRIMARY} or {@code SECONDARY}. {@code SECONDARY}
     * is only supported for GLOBAL zones.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("zoneType")
    private final ZoneType zoneType;

    /**
     * The type of the zone. Must be either {@code PRIMARY} or {@code SECONDARY}. {@code SECONDARY}
     * is only supported for GLOBAL zones.
     *
     * @return the value
     */
    public ZoneType getZoneType() {
        return zoneType;
    }

    /** This value will be null for zones in the global DNS. */
    @com.fasterxml.jackson.annotation.JsonProperty("viewId")
    private final String viewId;

    /**
     * This value will be null for zones in the global DNS.
     *
     * @return the value
     */
    public String getViewId() {
        return viewId;
    }

    /** The scope of the zone. */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final Scope scope;

    /**
     * The scope of the zone.
     *
     * @return the value
     */
    public Scope getScope() {
        return scope;
    }

    /**
     * External master servers for the zone. {@code externalMasters} becomes a required parameter
     * when the {@code zoneType} value is {@code SECONDARY}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalMasters")
    private final java.util.List<ExternalMaster> externalMasters;

    /**
     * External master servers for the zone. {@code externalMasters} becomes a required parameter
     * when the {@code zoneType} value is {@code SECONDARY}.
     *
     * @return the value
     */
    public java.util.List<ExternalMaster> getExternalMasters() {
        return externalMasters;
    }

    /**
     * External secondary servers for the zone. This field is currently not supported when {@code
     * zoneType} is {@code SECONDARY} or {@code scope} is {@code PRIVATE}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalDownstreams")
    private final java.util.List<ExternalDownstream> externalDownstreams;

    /**
     * External secondary servers for the zone. This field is currently not supported when {@code
     * zoneType} is {@code SECONDARY} or {@code scope} is {@code PRIVATE}.
     *
     * @return the value
     */
    public java.util.List<ExternalDownstream> getExternalDownstreams() {
        return externalDownstreams;
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
        sb.append("CreateZoneDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", zoneType=").append(String.valueOf(this.zoneType));
        sb.append(", viewId=").append(String.valueOf(this.viewId));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", externalMasters=").append(String.valueOf(this.externalMasters));
        sb.append(", externalDownstreams=").append(String.valueOf(this.externalDownstreams));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateZoneDetails)) {
            return false;
        }

        CreateZoneDetails other = (CreateZoneDetails) o;
        return java.util.Objects.equals(this.zoneType, other.zoneType)
                && java.util.Objects.equals(this.viewId, other.viewId)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.externalMasters, other.externalMasters)
                && java.util.Objects.equals(this.externalDownstreams, other.externalDownstreams)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.zoneType == null ? 43 : this.zoneType.hashCode());
        result = (result * PRIME) + (this.viewId == null ? 43 : this.viewId.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result =
                (result * PRIME)
                        + (this.externalMasters == null ? 43 : this.externalMasters.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDownstreams == null
                                ? 43
                                : this.externalDownstreams.hashCode());
        return result;
    }
}
