/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * An object that represents your tenancy's access to a particular region (i.e., a subscription), the status of that
 * access, and whether that region is the home region. For more information, see [Managing Regions](https://docs.cloud.oracle.com/Content/Identity/regions/managingregions.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access,
 * see [Get Started with Policies](https://docs.cloud.oracle.com/Content/Identity/policiesgs/get-started-with-policies.htm).
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
    builder = RegionSubscription.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RegionSubscription extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"regionKey", "regionName", "status", "isHomeRegion"})
    public RegionSubscription(
            String regionKey, String regionName, Status status, Boolean isHomeRegion) {
        super();
        this.regionKey = regionKey;
        this.regionName = regionName;
        this.status = status;
        this.isHomeRegion = isHomeRegion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The region's key. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
         * for the full list of supported 3-letter region codes.
         * <p>
         * Example: {@code PHX}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regionKey")
        private String regionKey;

        /**
         * The region's key. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
         * for the full list of supported 3-letter region codes.
         * <p>
         * Example: {@code PHX}
         *
         * @param regionKey the value to set
         * @return this builder
         **/
        public Builder regionKey(String regionKey) {
            this.regionKey = regionKey;
            this.__explicitlySet__.add("regionKey");
            return this;
        }
        /**
         * The region's name. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
         * for the full list of supported region names.
         * <p>
         * Example: {@code us-phoenix-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regionName")
        private String regionName;

        /**
         * The region's name. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
         * for the full list of supported region names.
         * <p>
         * Example: {@code us-phoenix-1}
         *
         * @param regionName the value to set
         * @return this builder
         **/
        public Builder regionName(String regionName) {
            this.regionName = regionName;
            this.__explicitlySet__.add("regionName");
            return this;
        }
        /**
         * The region subscription status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The region subscription status.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Indicates if the region is the home region or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHomeRegion")
        private Boolean isHomeRegion;

        /**
         * Indicates if the region is the home region or not.
         * @param isHomeRegion the value to set
         * @return this builder
         **/
        public Builder isHomeRegion(Boolean isHomeRegion) {
            this.isHomeRegion = isHomeRegion;
            this.__explicitlySet__.add("isHomeRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RegionSubscription build() {
            RegionSubscription model =
                    new RegionSubscription(
                            this.regionKey, this.regionName, this.status, this.isHomeRegion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RegionSubscription model) {
            if (model.wasPropertyExplicitlySet("regionKey")) {
                this.regionKey(model.getRegionKey());
            }
            if (model.wasPropertyExplicitlySet("regionName")) {
                this.regionName(model.getRegionName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("isHomeRegion")) {
                this.isHomeRegion(model.getIsHomeRegion());
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
     * The region's key. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
     * for the full list of supported 3-letter region codes.
     * <p>
     * Example: {@code PHX}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regionKey")
    private final String regionKey;

    /**
     * The region's key. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
     * for the full list of supported 3-letter region codes.
     * <p>
     * Example: {@code PHX}
     *
     * @return the value
     **/
    public String getRegionKey() {
        return regionKey;
    }

    /**
     * The region's name. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
     * for the full list of supported region names.
     * <p>
     * Example: {@code us-phoenix-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regionName")
    private final String regionName;

    /**
     * The region's name. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
     * for the full list of supported region names.
     * <p>
     * Example: {@code us-phoenix-1}
     *
     * @return the value
     **/
    public String getRegionName() {
        return regionName;
    }

    /**
     * The region subscription status.
     **/
    public enum Status {
        Ready("READY"),
        InProgress("IN_PROGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The region subscription status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The region subscription status.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * Indicates if the region is the home region or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHomeRegion")
    private final Boolean isHomeRegion;

    /**
     * Indicates if the region is the home region or not.
     * @return the value
     **/
    public Boolean getIsHomeRegion() {
        return isHomeRegion;
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
        sb.append("RegionSubscription(");
        sb.append("super=").append(super.toString());
        sb.append("regionKey=").append(String.valueOf(this.regionKey));
        sb.append(", regionName=").append(String.valueOf(this.regionName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", isHomeRegion=").append(String.valueOf(this.isHomeRegion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegionSubscription)) {
            return false;
        }

        RegionSubscription other = (RegionSubscription) o;
        return java.util.Objects.equals(this.regionKey, other.regionKey)
                && java.util.Objects.equals(this.regionName, other.regionName)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.isHomeRegion, other.isHomeRegion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.regionKey == null ? 43 : this.regionKey.hashCode());
        result = (result * PRIME) + (this.regionName == null ? 43 : this.regionName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.isHomeRegion == null ? 43 : this.isHomeRegion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
