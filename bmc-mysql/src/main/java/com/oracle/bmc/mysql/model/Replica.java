/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * A DB System read replica. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Replica.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Replica extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "dbSystemId",
        "compartmentId",
        "displayName",
        "description",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "mysqlVersion",
        "availabilityDomain",
        "faultDomain",
        "ipAddress",
        "port",
        "portX",
        "freeformTags",
        "definedTags",
        "isDeleteProtected"
    })
    public Replica(
            String id,
            String dbSystemId,
            String compartmentId,
            String displayName,
            String description,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String mysqlVersion,
            String availabilityDomain,
            String faultDomain,
            String ipAddress,
            Integer port,
            Integer portX,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Boolean isDeleteProtected) {
        super();
        this.id = id;
        this.dbSystemId = dbSystemId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.mysqlVersion = mysqlVersion;
        this.availabilityDomain = availabilityDomain;
        this.faultDomain = faultDomain;
        this.ipAddress = ipAddress;
        this.port = port;
        this.portX = portX;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.isDeleteProtected = isDeleteProtected;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the read replica. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the read replica.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the DB System the read replica is associated with. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The OCID of the DB System the read replica is associated with.
         *
         * @param dbSystemId the value to set
         * @return this builder
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /** The OCID of the compartment that contains the read replica. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the read replica.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The user-friendly name for the read replica. It does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the read replica. It does not have to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** User provided description of the read replica. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User provided description of the read replica.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The state of the read replica. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The state of the read replica.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** A message describing the state of the read replica. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the state of the read replica.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The date and time the read replica was created, as described by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the read replica was created, as described by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the read replica was last updated, as described by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the read replica was last updated, as described by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The MySQL version used by the read replica. */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
        private String mysqlVersion;

        /**
         * The MySQL version used by the read replica.
         *
         * @param mysqlVersion the value to set
         * @return this builder
         */
        public Builder mysqlVersion(String mysqlVersion) {
            this.mysqlVersion = mysqlVersion;
            this.__explicitlySet__.add("mysqlVersion");
            return this;
        }
        /** The name of the Availability Domain the read replica is located in. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the Availability Domain the read replica is located in.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /** The name of the Fault Domain the read replica is located in. */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * The name of the Fault Domain the read replica is located in.
         *
         * @param faultDomain the value to set
         * @return this builder
         */
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /** The IP address the read replica is configured to listen on. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The IP address the read replica is configured to listen on.
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /** The port the read replica is configured to listen on. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port the read replica is configured to listen on.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * The TCP network port on which X Plugin listens for connections. This is the X Plugin
         * equivalent of port.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("portX")
        private Integer portX;

        /**
         * The TCP network port on which X Plugin listens for connections. This is the X Plugin
         * equivalent of port.
         *
         * @param portX the value to set
         * @return this builder
         */
        public Builder portX(Integer portX) {
            this.portX = portX;
            this.__explicitlySet__.add("portX");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Specifies whether the read replica can be deleted. Set to true to prevent deletion, false
         * (default) to allow. Note that if a read replica is delete protected it also prevents the
         * entire DB System from being deleted. If the DB System is delete protected, read replicas
         * can still be deleted individually if they are not delete protected themselves.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDeleteProtected")
        private Boolean isDeleteProtected;

        /**
         * Specifies whether the read replica can be deleted. Set to true to prevent deletion, false
         * (default) to allow. Note that if a read replica is delete protected it also prevents the
         * entire DB System from being deleted. If the DB System is delete protected, read replicas
         * can still be deleted individually if they are not delete protected themselves.
         *
         * @param isDeleteProtected the value to set
         * @return this builder
         */
        public Builder isDeleteProtected(Boolean isDeleteProtected) {
            this.isDeleteProtected = isDeleteProtected;
            this.__explicitlySet__.add("isDeleteProtected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Replica build() {
            Replica model =
                    new Replica(
                            this.id,
                            this.dbSystemId,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.mysqlVersion,
                            this.availabilityDomain,
                            this.faultDomain,
                            this.ipAddress,
                            this.port,
                            this.portX,
                            this.freeformTags,
                            this.definedTags,
                            this.isDeleteProtected);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Replica model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("mysqlVersion")) {
                this.mysqlVersion(model.getMysqlVersion());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("portX")) {
                this.portX(model.getPortX());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("isDeleteProtected")) {
                this.isDeleteProtected(model.getIsDeleteProtected());
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

    /** The OCID of the read replica. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the read replica.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the DB System the read replica is associated with. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The OCID of the DB System the read replica is associated with.
     *
     * @return the value
     */
    public String getDbSystemId() {
        return dbSystemId;
    }

    /** The OCID of the compartment that contains the read replica. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the read replica.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The user-friendly name for the read replica. It does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the read replica. It does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** User provided description of the read replica. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User provided description of the read replica.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The state of the read replica. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        NeedsAttention("NEEDS_ATTENTION"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The state of the read replica. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The state of the read replica.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** A message describing the state of the read replica. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the state of the read replica.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time the read replica was created, as described by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the read replica was created, as described by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the read replica was last updated, as described by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the read replica was last updated, as described by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The MySQL version used by the read replica. */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
    private final String mysqlVersion;

    /**
     * The MySQL version used by the read replica.
     *
     * @return the value
     */
    public String getMysqlVersion() {
        return mysqlVersion;
    }

    /** The name of the Availability Domain the read replica is located in. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the Availability Domain the read replica is located in.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /** The name of the Fault Domain the read replica is located in. */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * The name of the Fault Domain the read replica is located in.
     *
     * @return the value
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    /** The IP address the read replica is configured to listen on. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The IP address the read replica is configured to listen on.
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /** The port the read replica is configured to listen on. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port the read replica is configured to listen on.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /**
     * The TCP network port on which X Plugin listens for connections. This is the X Plugin
     * equivalent of port.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("portX")
    private final Integer portX;

    /**
     * The TCP network port on which X Plugin listens for connections. This is the X Plugin
     * equivalent of port.
     *
     * @return the value
     */
    public Integer getPortX() {
        return portX;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Specifies whether the read replica can be deleted. Set to true to prevent deletion, false
     * (default) to allow. Note that if a read replica is delete protected it also prevents the
     * entire DB System from being deleted. If the DB System is delete protected, read replicas can
     * still be deleted individually if they are not delete protected themselves.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDeleteProtected")
    private final Boolean isDeleteProtected;

    /**
     * Specifies whether the read replica can be deleted. Set to true to prevent deletion, false
     * (default) to allow. Note that if a read replica is delete protected it also prevents the
     * entire DB System from being deleted. If the DB System is delete protected, read replicas can
     * still be deleted individually if they are not delete protected themselves.
     *
     * @return the value
     */
    public Boolean getIsDeleteProtected() {
        return isDeleteProtected;
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
        sb.append("Replica(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", mysqlVersion=").append(String.valueOf(this.mysqlVersion));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", portX=").append(String.valueOf(this.portX));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", isDeleteProtected=").append(String.valueOf(this.isDeleteProtected));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Replica)) {
            return false;
        }

        Replica other = (Replica) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.mysqlVersion, other.mysqlVersion)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.portX, other.portX)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.isDeleteProtected, other.isDeleteProtected)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.mysqlVersion == null ? 43 : this.mysqlVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.portX == null ? 43 : this.portX.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.isDeleteProtected == null ? 43 : this.isDeleteProtected.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
