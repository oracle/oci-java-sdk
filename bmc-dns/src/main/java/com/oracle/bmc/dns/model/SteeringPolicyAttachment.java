/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * An attachment between a steering policy and a domain. An attachment constructs
 * DNS responses using its steering policy instead of the records at its defined domain.
 * Only records of the policy's covered rtype are blocked at the domain.
 * A domain can have a maximum of one attachment covering any given rtype.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SteeringPolicyAttachment.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SteeringPolicyAttachment
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "steeringPolicyId",
        "zoneId",
        "domainName",
        "displayName",
        "rtypes",
        "compartmentId",
        "self",
        "id",
        "timeCreated",
        "lifecycleState"
    })
    public SteeringPolicyAttachment(
            String steeringPolicyId,
            String zoneId,
            String domainName,
            String displayName,
            java.util.List<String> rtypes,
            String compartmentId,
            String self,
            String id,
            java.util.Date timeCreated,
            LifecycleState lifecycleState) {
        super();
        this.steeringPolicyId = steeringPolicyId;
        this.zoneId = zoneId;
        this.domainName = domainName;
        this.displayName = displayName;
        this.rtypes = rtypes;
        this.compartmentId = compartmentId;
        this.self = self;
        this.id = id;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the attached steering policy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("steeringPolicyId")
        private String steeringPolicyId;

        /**
         * The OCID of the attached steering policy.
         * @param steeringPolicyId the value to set
         * @return this builder
         **/
        public Builder steeringPolicyId(String steeringPolicyId) {
            this.steeringPolicyId = steeringPolicyId;
            this.__explicitlySet__.add("steeringPolicyId");
            return this;
        }
        /**
         * The OCID of the attached zone.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("zoneId")
        private String zoneId;

        /**
         * The OCID of the attached zone.
         * @param zoneId the value to set
         * @return this builder
         **/
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            this.__explicitlySet__.add("zoneId");
            return this;
        }
        /**
         * The attached domain within the attached zone.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domainName")
        private String domainName;

        /**
         * The attached domain within the attached zone.
         * @param domainName the value to set
         * @return this builder
         **/
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            this.__explicitlySet__.add("domainName");
            return this;
        }
        /**
         * A user-friendly name for the steering policy attachment.
         * Does not have to be unique and can be changed.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the steering policy attachment.
         * Does not have to be unique and can be changed.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The record types covered by the attachment at the domain. The set of record types is
         * determined by aggregating the record types from the answers defined in the steering
         * policy.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rtypes")
        private java.util.List<String> rtypes;

        /**
         * The record types covered by the attachment at the domain. The set of record types is
         * determined by aggregating the record types from the answers defined in the steering
         * policy.
         *
         * @param rtypes the value to set
         * @return this builder
         **/
        public Builder rtypes(java.util.List<String> rtypes) {
            this.rtypes = rtypes;
            this.__explicitlySet__.add("rtypes");
            return this;
        }
        /**
         * The OCID of the compartment containing the steering policy attachment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the steering policy attachment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The canonical absolute URL of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("self")
        private String self;

        /**
         * The canonical absolute URL of the resource.
         * @param self the value to set
         * @return this builder
         **/
        public Builder self(String self) {
            this.self = self;
            this.__explicitlySet__.add("self");
            return this;
        }
        /**
         * The OCID of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the resource.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The date and time the resource was created, expressed in RFC 3339 timestamp format.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:60Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the resource was created, expressed in RFC 3339 timestamp format.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:60Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The current state of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the resource.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyAttachment build() {
            SteeringPolicyAttachment model =
                    new SteeringPolicyAttachment(
                            this.steeringPolicyId,
                            this.zoneId,
                            this.domainName,
                            this.displayName,
                            this.rtypes,
                            this.compartmentId,
                            this.self,
                            this.id,
                            this.timeCreated,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyAttachment model) {
            if (model.wasPropertyExplicitlySet("steeringPolicyId")) {
                this.steeringPolicyId(model.getSteeringPolicyId());
            }
            if (model.wasPropertyExplicitlySet("zoneId")) {
                this.zoneId(model.getZoneId());
            }
            if (model.wasPropertyExplicitlySet("domainName")) {
                this.domainName(model.getDomainName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("rtypes")) {
                this.rtypes(model.getRtypes());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("self")) {
                this.self(model.getSelf());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
     * The OCID of the attached steering policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("steeringPolicyId")
    private final String steeringPolicyId;

    /**
     * The OCID of the attached steering policy.
     * @return the value
     **/
    public String getSteeringPolicyId() {
        return steeringPolicyId;
    }

    /**
     * The OCID of the attached zone.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("zoneId")
    private final String zoneId;

    /**
     * The OCID of the attached zone.
     * @return the value
     **/
    public String getZoneId() {
        return zoneId;
    }

    /**
     * The attached domain within the attached zone.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainName")
    private final String domainName;

    /**
     * The attached domain within the attached zone.
     * @return the value
     **/
    public String getDomainName() {
        return domainName;
    }

    /**
     * A user-friendly name for the steering policy attachment.
     * Does not have to be unique and can be changed.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the steering policy attachment.
     * Does not have to be unique and can be changed.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The record types covered by the attachment at the domain. The set of record types is
     * determined by aggregating the record types from the answers defined in the steering
     * policy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rtypes")
    private final java.util.List<String> rtypes;

    /**
     * The record types covered by the attachment at the domain. The set of record types is
     * determined by aggregating the record types from the answers defined in the steering
     * policy.
     *
     * @return the value
     **/
    public java.util.List<String> getRtypes() {
        return rtypes;
    }

    /**
     * The OCID of the compartment containing the steering policy attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the steering policy attachment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The canonical absolute URL of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("self")
    private final String self;

    /**
     * The canonical absolute URL of the resource.
     * @return the value
     **/
    public String getSelf() {
        return self;
    }

    /**
     * The OCID of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the resource.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The date and time the resource was created, expressed in RFC 3339 timestamp format.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:60Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource was created, expressed in RFC 3339 timestamp format.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:60Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The current state of the resource.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the resource.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("SteeringPolicyAttachment(");
        sb.append("super=").append(super.toString());
        sb.append("steeringPolicyId=").append(String.valueOf(this.steeringPolicyId));
        sb.append(", zoneId=").append(String.valueOf(this.zoneId));
        sb.append(", domainName=").append(String.valueOf(this.domainName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", rtypes=").append(String.valueOf(this.rtypes));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", self=").append(String.valueOf(this.self));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SteeringPolicyAttachment)) {
            return false;
        }

        SteeringPolicyAttachment other = (SteeringPolicyAttachment) o;
        return java.util.Objects.equals(this.steeringPolicyId, other.steeringPolicyId)
                && java.util.Objects.equals(this.zoneId, other.zoneId)
                && java.util.Objects.equals(this.domainName, other.domainName)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.rtypes, other.rtypes)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.self, other.self)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.steeringPolicyId == null ? 43 : this.steeringPolicyId.hashCode());
        result = (result * PRIME) + (this.zoneId == null ? 43 : this.zoneId.hashCode());
        result = (result * PRIME) + (this.domainName == null ? 43 : this.domainName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.rtypes == null ? 43 : this.rtypes.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.self == null ? 43 : this.self.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
