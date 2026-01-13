/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.model;

/**
 * Object representing a single service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = BaseService.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = Service.class, name = "Service"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ServiceSummary.class,
            name = "ServiceSummary"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = NotificationsSummary.class,
            name = "NotificationsSummary")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class BaseService extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "serviceName",
        "shortName",
        "teamName",
        "platformType",
        "commsManagerName",
        "excludedRealms",
        "previousServiceNames",
        "timeCreated",
        "timeUpdated",
        "lifecycleState"
    })
    protected BaseService(
            String id,
            String serviceName,
            String shortName,
            String teamName,
            PlatformType platformType,
            CommsManagerName commsManagerName,
            java.util.List<String> excludedRealms,
            java.util.List<String> previousServiceNames,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState) {
        super();
        this.id = id;
        this.serviceName = serviceName;
        this.shortName = shortName;
        this.teamName = teamName;
        this.platformType = platformType;
        this.commsManagerName = commsManagerName;
        this.excludedRealms = excludedRealms;
        this.previousServiceNames = previousServiceNames;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
    }

    /** ID of the service object. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * ID of the service object.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Name of the service represented by this object. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * Name of the service represented by this object.
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** Short name of the team to whom this service object is related. */
    @com.fasterxml.jackson.annotation.JsonProperty("shortName")
    private final String shortName;

    /**
     * Short name of the team to whom this service object is related.
     *
     * @return the value
     */
    public String getShortName() {
        return shortName;
    }

    /** Team name to which this service object is related. */
    @com.fasterxml.jackson.annotation.JsonProperty("teamName")
    private final String teamName;

    /**
     * Team name to which this service object is related.
     *
     * @return the value
     */
    public String getTeamName() {
        return teamName;
    }

    /** The platform type this service object is related to. */
    @com.fasterxml.jackson.annotation.JsonProperty("platformType")
    private final PlatformType platformType;

    /**
     * The platform type this service object is related to.
     *
     * @return the value
     */
    public PlatformType getPlatformType() {
        return platformType;
    }

    /** Name of the comms manager team that manages Notifications to this service. */
    @com.fasterxml.jackson.annotation.JsonProperty("commsManagerName")
    private final CommsManagerName commsManagerName;

    /**
     * Name of the comms manager team that manages Notifications to this service.
     *
     * @return the value
     */
    public CommsManagerName getCommsManagerName() {
        return commsManagerName;
    }

    /** The list of realms where this service is not available to be used. */
    @com.fasterxml.jackson.annotation.JsonProperty("excludedRealms")
    private final java.util.List<String> excludedRealms;

    /**
     * The list of realms where this service is not available to be used.
     *
     * @return the value
     */
    public java.util.List<String> getExcludedRealms() {
        return excludedRealms;
    }

    /** The list of previously used names for this service object. */
    @com.fasterxml.jackson.annotation.JsonProperty("previousServiceNames")
    private final java.util.List<String> previousServiceNames;

    /**
     * The list of previously used names for this service object.
     *
     * @return the value
     */
    public java.util.List<String> getPreviousServiceNames() {
        return previousServiceNames;
    }

    /** The date and time when the service object was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time when the service object was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time when the service object was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time when the service object was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Current state of the service object. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Deleted("DELETED"),

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
    /** Current state of the service object. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Current state of the service object.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("BaseService(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", shortName=").append(String.valueOf(this.shortName));
        sb.append(", teamName=").append(String.valueOf(this.teamName));
        sb.append(", platformType=").append(String.valueOf(this.platformType));
        sb.append(", commsManagerName=").append(String.valueOf(this.commsManagerName));
        sb.append(", excludedRealms=").append(String.valueOf(this.excludedRealms));
        sb.append(", previousServiceNames=").append(String.valueOf(this.previousServiceNames));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseService)) {
            return false;
        }

        BaseService other = (BaseService) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.shortName, other.shortName)
                && java.util.Objects.equals(this.teamName, other.teamName)
                && java.util.Objects.equals(this.platformType, other.platformType)
                && java.util.Objects.equals(this.commsManagerName, other.commsManagerName)
                && java.util.Objects.equals(this.excludedRealms, other.excludedRealms)
                && java.util.Objects.equals(this.previousServiceNames, other.previousServiceNames)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.shortName == null ? 43 : this.shortName.hashCode());
        result = (result * PRIME) + (this.teamName == null ? 43 : this.teamName.hashCode());
        result = (result * PRIME) + (this.platformType == null ? 43 : this.platformType.hashCode());
        result =
                (result * PRIME)
                        + (this.commsManagerName == null ? 43 : this.commsManagerName.hashCode());
        result =
                (result * PRIME)
                        + (this.excludedRealms == null ? 43 : this.excludedRealms.hashCode());
        result =
                (result * PRIME)
                        + (this.previousServiceNames == null
                                ? 43
                                : this.previousServiceNames.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
