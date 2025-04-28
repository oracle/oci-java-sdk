/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * A DNS zone.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ZoneSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ZoneSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "zoneType",
        "compartmentId",
        "viewId",
        "scope",
        "freeformTags",
        "definedTags",
        "dnssecState",
        "self",
        "id",
        "timeCreated",
        "version",
        "serial",
        "lifecycleState",
        "isProtected",
        "dnssecConfig"
    })
    public ZoneSummary(
            String name,
            ZoneType zoneType,
            String compartmentId,
            String viewId,
            Scope scope,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            ZoneDnssecState dnssecState,
            String self,
            String id,
            java.util.Date timeCreated,
            String version,
            Long serial,
            LifecycleState lifecycleState,
            Boolean isProtected,
            DnssecConfig dnssecConfig) {
        super();
        this.name = name;
        this.zoneType = zoneType;
        this.compartmentId = compartmentId;
        this.viewId = viewId;
        this.scope = scope;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.dnssecState = dnssecState;
        this.self = self;
        this.id = id;
        this.timeCreated = timeCreated;
        this.version = version;
        this.serial = serial;
        this.lifecycleState = lifecycleState;
        this.isProtected = isProtected;
        this.dnssecConfig = dnssecConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the zone. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the zone.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
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
        /** The OCID of the compartment containing the zone. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the zone.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The OCID of the private view containing the zone. This value will be null for zones in
         * the global DNS, which are publicly resolvable and not part of a private view.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("viewId")
        private String viewId;

        /**
         * The OCID of the private view containing the zone. This value will be null for zones in
         * the global DNS, which are publicly resolvable and not part of a private view.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>**Example:** {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>**Example:** {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>**Example:** {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>**Example:** {@code {"Operations": {"CostCenter": "42"}}}
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
         * The state of DNSSEC on the zone.
         *
         * <p>For DNSSEC to function, every parent zone in the DNS tree up to the top-level domain
         * (or an independent trust anchor) must also have DNSSEC correctly set up. After enabling
         * DNSSEC, you must add a DS record to the zone's parent zone containing the {@code
         * KskDnssecKeyVersion} data. You can find the DS data in the {@code dsData} attribute of
         * the {@code KskDnssecKeyVersion}. Then, use the {@code PromoteZoneDnssecKeyVersion}
         * operation to promote the {@code KskDnssecKeyVersion}.
         *
         * <p>New {@code KskDnssecKeyVersion}s are generated annually, a week before the existing
         * {@code KskDnssecKeyVersion}'s expiration. To rollover a {@code KskDnssecKeyVersion}, you
         * must replace the parent zone's DS record containing the old {@code KskDnssecKeyVersion}
         * data with the data from the new {@code KskDnssecKeyVersion}.
         *
         * <p>To remove the old DS record without causing service disruption, wait until the old DS
         * record's TTL has expired, and the new DS record has propagated. After the DS replacement
         * has been completed, then the {@code PromoteZoneDnssecKeyVersion} operation must be
         * called.
         *
         * <p>Metrics are emitted in the {@code oci_dns} namespace daily for each {@code
         * KskDnssecKeyVersion} indicating how many days are left until expiration. We recommend
         * that you set up alarms and notifications for KskDnssecKeyVersion expiration so that the
         * necessary parent zone updates can be made and the {@code PromoteZoneDnssecKeyVersion}
         * operation can be called.
         *
         * <p>Enabling DNSSEC results in additional records in DNS responses which increases their
         * size and can cause higher response latency.
         *
         * <p>For more information, see
         * [DNSSEC](https://docs.oracle.com/iaas/Content/DNS/Concepts/dnssec.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dnssecState")
        private ZoneDnssecState dnssecState;

        /**
         * The state of DNSSEC on the zone.
         *
         * <p>For DNSSEC to function, every parent zone in the DNS tree up to the top-level domain
         * (or an independent trust anchor) must also have DNSSEC correctly set up. After enabling
         * DNSSEC, you must add a DS record to the zone's parent zone containing the {@code
         * KskDnssecKeyVersion} data. You can find the DS data in the {@code dsData} attribute of
         * the {@code KskDnssecKeyVersion}. Then, use the {@code PromoteZoneDnssecKeyVersion}
         * operation to promote the {@code KskDnssecKeyVersion}.
         *
         * <p>New {@code KskDnssecKeyVersion}s are generated annually, a week before the existing
         * {@code KskDnssecKeyVersion}'s expiration. To rollover a {@code KskDnssecKeyVersion}, you
         * must replace the parent zone's DS record containing the old {@code KskDnssecKeyVersion}
         * data with the data from the new {@code KskDnssecKeyVersion}.
         *
         * <p>To remove the old DS record without causing service disruption, wait until the old DS
         * record's TTL has expired, and the new DS record has propagated. After the DS replacement
         * has been completed, then the {@code PromoteZoneDnssecKeyVersion} operation must be
         * called.
         *
         * <p>Metrics are emitted in the {@code oci_dns} namespace daily for each {@code
         * KskDnssecKeyVersion} indicating how many days are left until expiration. We recommend
         * that you set up alarms and notifications for KskDnssecKeyVersion expiration so that the
         * necessary parent zone updates can be made and the {@code PromoteZoneDnssecKeyVersion}
         * operation can be called.
         *
         * <p>Enabling DNSSEC results in additional records in DNS responses which increases their
         * size and can cause higher response latency.
         *
         * <p>For more information, see
         * [DNSSEC](https://docs.oracle.com/iaas/Content/DNS/Concepts/dnssec.htm).
         *
         * @param dnssecState the value to set
         * @return this builder
         */
        public Builder dnssecState(ZoneDnssecState dnssecState) {
            this.dnssecState = dnssecState;
            this.__explicitlySet__.add("dnssecState");
            return this;
        }
        /** The canonical absolute URL of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("self")
        private String self;

        /**
         * The canonical absolute URL of the resource.
         *
         * @param self the value to set
         * @return this builder
         */
        public Builder self(String self) {
            this.self = self;
            this.__explicitlySet__.add("self");
            return this;
        }
        /** The OCID of the zone. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the zone.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The date and time the resource was created in "YYYY-MM-ddThh:mm:ssZ" format with a Z
         * offset, as defined by RFC 3339.
         *
         * <p>*Example:** {@code 2016-07-22T17:23:59:60Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the resource was created in "YYYY-MM-ddThh:mm:ssZ" format with a Z
         * offset, as defined by RFC 3339.
         *
         * <p>*Example:** {@code 2016-07-22T17:23:59:60Z}
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
         * Version is the never-repeating, totally-orderable, version of the zone, from which the
         * serial field of the zone's SOA record is derived.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Version is the never-repeating, totally-orderable, version of the zone, from which the
         * serial field of the zone's SOA record is derived.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** The current serial of the zone. As seen in the zone's SOA record. */
        @com.fasterxml.jackson.annotation.JsonProperty("serial")
        private Long serial;

        /**
         * The current serial of the zone. As seen in the zone's SOA record.
         *
         * @param serial the value to set
         * @return this builder
         */
        public Builder serial(Long serial) {
            this.serial = serial;
            this.__explicitlySet__.add("serial");
            return this;
        }
        /** The current state of the zone resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the zone resource.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A Boolean flag indicating whether or not parts of the resource are unable to be
         * explicitly managed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isProtected")
        private Boolean isProtected;

        /**
         * A Boolean flag indicating whether or not parts of the resource are unable to be
         * explicitly managed.
         *
         * @param isProtected the value to set
         * @return this builder
         */
        public Builder isProtected(Boolean isProtected) {
            this.isProtected = isProtected;
            this.__explicitlySet__.add("isProtected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dnssecConfig")
        private DnssecConfig dnssecConfig;

        public Builder dnssecConfig(DnssecConfig dnssecConfig) {
            this.dnssecConfig = dnssecConfig;
            this.__explicitlySet__.add("dnssecConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ZoneSummary build() {
            ZoneSummary model =
                    new ZoneSummary(
                            this.name,
                            this.zoneType,
                            this.compartmentId,
                            this.viewId,
                            this.scope,
                            this.freeformTags,
                            this.definedTags,
                            this.dnssecState,
                            this.self,
                            this.id,
                            this.timeCreated,
                            this.version,
                            this.serial,
                            this.lifecycleState,
                            this.isProtected,
                            this.dnssecConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ZoneSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("zoneType")) {
                this.zoneType(model.getZoneType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("viewId")) {
                this.viewId(model.getViewId());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("dnssecState")) {
                this.dnssecState(model.getDnssecState());
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
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("serial")) {
                this.serial(model.getSerial());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("isProtected")) {
                this.isProtected(model.getIsProtected());
            }
            if (model.wasPropertyExplicitlySet("dnssecConfig")) {
                this.dnssecConfig(model.getDnssecConfig());
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

    /** The name of the zone. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the zone.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The type of the zone. Must be either {@code PRIMARY} or {@code SECONDARY}. {@code SECONDARY}
     * is only supported for GLOBAL zones.
     */
    public enum ZoneType implements com.oracle.bmc.http.internal.BmcEnum {
        Primary("PRIMARY"),
        Secondary("SECONDARY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ZoneType.class);

        private final String value;
        private static java.util.Map<String, ZoneType> map;

        static {
            map = new java.util.HashMap<>();
            for (ZoneType v : ZoneType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'ZoneType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
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

    /** The OCID of the compartment containing the zone. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the zone.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the private view containing the zone. This value will be null for zones in the
     * global DNS, which are publicly resolvable and not part of a private view.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("viewId")
    private final String viewId;

    /**
     * The OCID of the private view containing the zone. This value will be null for zones in the
     * global DNS, which are publicly resolvable and not part of a private view.
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
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>**Example:** {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>**Example:** {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>**Example:** {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>**Example:** {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The state of DNSSEC on the zone.
     *
     * <p>For DNSSEC to function, every parent zone in the DNS tree up to the top-level domain (or
     * an independent trust anchor) must also have DNSSEC correctly set up. After enabling DNSSEC,
     * you must add a DS record to the zone's parent zone containing the {@code KskDnssecKeyVersion}
     * data. You can find the DS data in the {@code dsData} attribute of the {@code
     * KskDnssecKeyVersion}. Then, use the {@code PromoteZoneDnssecKeyVersion} operation to promote
     * the {@code KskDnssecKeyVersion}.
     *
     * <p>New {@code KskDnssecKeyVersion}s are generated annually, a week before the existing {@code
     * KskDnssecKeyVersion}'s expiration. To rollover a {@code KskDnssecKeyVersion}, you must
     * replace the parent zone's DS record containing the old {@code KskDnssecKeyVersion} data with
     * the data from the new {@code KskDnssecKeyVersion}.
     *
     * <p>To remove the old DS record without causing service disruption, wait until the old DS
     * record's TTL has expired, and the new DS record has propagated. After the DS replacement has
     * been completed, then the {@code PromoteZoneDnssecKeyVersion} operation must be called.
     *
     * <p>Metrics are emitted in the {@code oci_dns} namespace daily for each {@code
     * KskDnssecKeyVersion} indicating how many days are left until expiration. We recommend that
     * you set up alarms and notifications for KskDnssecKeyVersion expiration so that the necessary
     * parent zone updates can be made and the {@code PromoteZoneDnssecKeyVersion} operation can be
     * called.
     *
     * <p>Enabling DNSSEC results in additional records in DNS responses which increases their size
     * and can cause higher response latency.
     *
     * <p>For more information, see
     * [DNSSEC](https://docs.oracle.com/iaas/Content/DNS/Concepts/dnssec.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dnssecState")
    private final ZoneDnssecState dnssecState;

    /**
     * The state of DNSSEC on the zone.
     *
     * <p>For DNSSEC to function, every parent zone in the DNS tree up to the top-level domain (or
     * an independent trust anchor) must also have DNSSEC correctly set up. After enabling DNSSEC,
     * you must add a DS record to the zone's parent zone containing the {@code KskDnssecKeyVersion}
     * data. You can find the DS data in the {@code dsData} attribute of the {@code
     * KskDnssecKeyVersion}. Then, use the {@code PromoteZoneDnssecKeyVersion} operation to promote
     * the {@code KskDnssecKeyVersion}.
     *
     * <p>New {@code KskDnssecKeyVersion}s are generated annually, a week before the existing {@code
     * KskDnssecKeyVersion}'s expiration. To rollover a {@code KskDnssecKeyVersion}, you must
     * replace the parent zone's DS record containing the old {@code KskDnssecKeyVersion} data with
     * the data from the new {@code KskDnssecKeyVersion}.
     *
     * <p>To remove the old DS record without causing service disruption, wait until the old DS
     * record's TTL has expired, and the new DS record has propagated. After the DS replacement has
     * been completed, then the {@code PromoteZoneDnssecKeyVersion} operation must be called.
     *
     * <p>Metrics are emitted in the {@code oci_dns} namespace daily for each {@code
     * KskDnssecKeyVersion} indicating how many days are left until expiration. We recommend that
     * you set up alarms and notifications for KskDnssecKeyVersion expiration so that the necessary
     * parent zone updates can be made and the {@code PromoteZoneDnssecKeyVersion} operation can be
     * called.
     *
     * <p>Enabling DNSSEC results in additional records in DNS responses which increases their size
     * and can cause higher response latency.
     *
     * <p>For more information, see
     * [DNSSEC](https://docs.oracle.com/iaas/Content/DNS/Concepts/dnssec.htm).
     *
     * @return the value
     */
    public ZoneDnssecState getDnssecState() {
        return dnssecState;
    }

    /** The canonical absolute URL of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("self")
    private final String self;

    /**
     * The canonical absolute URL of the resource.
     *
     * @return the value
     */
    public String getSelf() {
        return self;
    }

    /** The OCID of the zone. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the zone.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The date and time the resource was created in "YYYY-MM-ddThh:mm:ssZ" format with a Z offset,
     * as defined by RFC 3339.
     *
     * <p>*Example:** {@code 2016-07-22T17:23:59:60Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource was created in "YYYY-MM-ddThh:mm:ssZ" format with a Z offset,
     * as defined by RFC 3339.
     *
     * <p>*Example:** {@code 2016-07-22T17:23:59:60Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Version is the never-repeating, totally-orderable, version of the zone, from which the serial
     * field of the zone's SOA record is derived.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Version is the never-repeating, totally-orderable, version of the zone, from which the serial
     * field of the zone's SOA record is derived.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** The current serial of the zone. As seen in the zone's SOA record. */
    @com.fasterxml.jackson.annotation.JsonProperty("serial")
    private final Long serial;

    /**
     * The current serial of the zone. As seen in the zone's SOA record.
     *
     * @return the value
     */
    public Long getSerial() {
        return serial;
    }

    /** The current state of the zone resource. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Creating("CREATING"),
        Deleted("DELETED"),
        Deleting("DELETING"),
        Failed("FAILED"),
        Updating("UPDATING"),

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
    /** The current state of the zone resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the zone resource.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A Boolean flag indicating whether or not parts of the resource are unable to be explicitly
     * managed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isProtected")
    private final Boolean isProtected;

    /**
     * A Boolean flag indicating whether or not parts of the resource are unable to be explicitly
     * managed.
     *
     * @return the value
     */
    public Boolean getIsProtected() {
        return isProtected;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dnssecConfig")
    private final DnssecConfig dnssecConfig;

    public DnssecConfig getDnssecConfig() {
        return dnssecConfig;
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
        sb.append("ZoneSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", zoneType=").append(String.valueOf(this.zoneType));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", viewId=").append(String.valueOf(this.viewId));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", dnssecState=").append(String.valueOf(this.dnssecState));
        sb.append(", self=").append(String.valueOf(this.self));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", serial=").append(String.valueOf(this.serial));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", isProtected=").append(String.valueOf(this.isProtected));
        sb.append(", dnssecConfig=").append(String.valueOf(this.dnssecConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ZoneSummary)) {
            return false;
        }

        ZoneSummary other = (ZoneSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.zoneType, other.zoneType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.viewId, other.viewId)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.dnssecState, other.dnssecState)
                && java.util.Objects.equals(this.self, other.self)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.serial, other.serial)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.isProtected, other.isProtected)
                && java.util.Objects.equals(this.dnssecConfig, other.dnssecConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.zoneType == null ? 43 : this.zoneType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.viewId == null ? 43 : this.viewId.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.dnssecState == null ? 43 : this.dnssecState.hashCode());
        result = (result * PRIME) + (this.self == null ? 43 : this.self.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.serial == null ? 43 : this.serial.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.isProtected == null ? 43 : this.isProtected.hashCode());
        result = (result * PRIME) + (this.dnssecConfig == null ? 43 : this.dnssecConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
