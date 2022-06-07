/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A base object for all types of attachments between a storage volume and an instance.
 * For specific details about iSCSI attachments, see
 * {@link IScsiVolumeAttachment}.
 * <p>
 * For general information about volume attachments, see
 * [Overview of Block Volume Storage](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/overview.htm).
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API.
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "attachmentType",
    defaultImpl = VolumeAttachment.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = IScsiVolumeAttachment.class,
        name = "iscsi"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = EmulatedVolumeAttachment.class,
        name = "emulated"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ParavirtualizedVolumeAttachment.class,
        name = "paravirtualized"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class VolumeAttachment {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "compartmentId",
        "device",
        "displayName",
        "id",
        "instanceId",
        "isReadOnly",
        "isShareable",
        "lifecycleState",
        "timeCreated",
        "volumeId",
        "isPvEncryptionInTransitEnabled",
        "isMultipath",
        "iscsiLoginState"
    })
    protected VolumeAttachment(
            String availabilityDomain,
            String compartmentId,
            String device,
            String displayName,
            String id,
            String instanceId,
            Boolean isReadOnly,
            Boolean isShareable,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            String volumeId,
            Boolean isPvEncryptionInTransitEnabled,
            Boolean isMultipath,
            IscsiLoginState iscsiLoginState) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.device = device;
        this.displayName = displayName;
        this.id = id;
        this.instanceId = instanceId;
        this.isReadOnly = isReadOnly;
        this.isShareable = isShareable;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.volumeId = volumeId;
        this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
        this.isMultipath = isMultipath;
        this.iscsiLoginState = iscsiLoginState;
    }

    /**
     * The availability domain of an instance.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The device name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    private final String device;

    public String getDevice() {
        return device;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the volume attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The OCID of the instance the volume is attached to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Whether the attachment was created in read-only mode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
    private final Boolean isReadOnly;

    public Boolean getIsReadOnly() {
        return isReadOnly;
    }

    /**
     * Whether the attachment should be created in shareable mode. If an attachment
     * is created in shareable mode, then other instances can attach the same volume, provided
     * that they also create their attachments in shareable mode. Only certain volume types can
     * be attached in shareable mode. Defaults to false if not specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShareable")
    private final Boolean isShareable;

    public Boolean getIsShareable() {
        return isShareable;
    }

    /**
     * The current state of the volume attachment.
     **/
    public enum LifecycleState {
        Attaching("ATTACHING"),
        Attached("ATTACHED"),
        Detaching("DETACHING"),
        Detached("DETACHED"),

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
     * The current state of the volume attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the volume was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The OCID of the volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
    private final String volumeId;

    public String getVolumeId() {
        return volumeId;
    }

    /**
     * Whether in-transit encryption for the data volume's paravirtualized attachment is enabled or not.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
    private final Boolean isPvEncryptionInTransitEnabled;

    public Boolean getIsPvEncryptionInTransitEnabled() {
        return isPvEncryptionInTransitEnabled;
    }

    /**
     * Whether the Iscsi or Paravirtualized attachment is multipath or not, it is not applicable to NVMe attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMultipath")
    private final Boolean isMultipath;

    public Boolean getIsMultipath() {
        return isMultipath;
    }

    /**
     * The iscsi login state of the volume attachment. For a Iscsi volume attachment,
     * all iscsi sessions need to be all logged-in or logged-out to be in logged-in or logged-out state.
     *
     **/
    public enum IscsiLoginState {
        Unknown("UNKNOWN"),
        LoggingIn("LOGGING_IN"),
        LoginSucceeded("LOGIN_SUCCEEDED"),
        LoginFailed("LOGIN_FAILED"),
        LoggingOut("LOGGING_OUT"),
        LogoutSucceeded("LOGOUT_SUCCEEDED"),
        LogoutFailed("LOGOUT_FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IscsiLoginState.class);

        private final String value;
        private static java.util.Map<String, IscsiLoginState> map;

        static {
            map = new java.util.HashMap<>();
            for (IscsiLoginState v : IscsiLoginState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IscsiLoginState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IscsiLoginState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IscsiLoginState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The iscsi login state of the volume attachment. For a Iscsi volume attachment,
     * all iscsi sessions need to be all logged-in or logged-out to be in logged-in or logged-out state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("iscsiLoginState")
    private final IscsiLoginState iscsiLoginState;

    public IscsiLoginState getIscsiLoginState() {
        return iscsiLoginState;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VolumeAttachment(");
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", device=").append(String.valueOf(this.device));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", isReadOnly=").append(String.valueOf(this.isReadOnly));
        sb.append(", isShareable=").append(String.valueOf(this.isShareable));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", volumeId=").append(String.valueOf(this.volumeId));
        sb.append(", isPvEncryptionInTransitEnabled=")
                .append(String.valueOf(this.isPvEncryptionInTransitEnabled));
        sb.append(", isMultipath=").append(String.valueOf(this.isMultipath));
        sb.append(", iscsiLoginState=").append(String.valueOf(this.iscsiLoginState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VolumeAttachment)) {
            return false;
        }

        VolumeAttachment other = (VolumeAttachment) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.device, other.device)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.isReadOnly, other.isReadOnly)
                && java.util.Objects.equals(this.isShareable, other.isShareable)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.volumeId, other.volumeId)
                && java.util.Objects.equals(
                        this.isPvEncryptionInTransitEnabled, other.isPvEncryptionInTransitEnabled)
                && java.util.Objects.equals(this.isMultipath, other.isMultipath)
                && java.util.Objects.equals(this.iscsiLoginState, other.iscsiLoginState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.device == null ? 43 : this.device.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.isReadOnly == null ? 43 : this.isReadOnly.hashCode());
        result = (result * PRIME) + (this.isShareable == null ? 43 : this.isShareable.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.volumeId == null ? 43 : this.volumeId.hashCode());
        result =
                (result * PRIME)
                        + (this.isPvEncryptionInTransitEnabled == null
                                ? 43
                                : this.isPvEncryptionInTransitEnabled.hashCode());
        result = (result * PRIME) + (this.isMultipath == null ? 43 : this.isMultipath.hashCode());
        result =
                (result * PRIME)
                        + (this.iscsiLoginState == null ? 43 : this.iscsiLoginState.hashCode());
        return result;
    }
}
