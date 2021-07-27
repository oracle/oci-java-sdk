/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
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

    /**
     * The availability domain of an instance.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The device name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    String device;

    /**
     * A user-friendly name. Does not have to be unique, and it cannot be changed.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My volume attachment}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of the volume attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the instance the volume is attached to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    String instanceId;

    /**
     * Whether the attachment was created in read-only mode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
    Boolean isReadOnly;

    /**
     * Whether the attachment should be created in shareable mode. If an attachment
     * is created in shareable mode, then other instances can attach the same volume, provided
     * that they also create their attachments in shareable mode. Only certain volume types can
     * be attached in shareable mode. Defaults to false if not specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShareable")
    Boolean isShareable;
    /**
     * The current state of the volume attachment.
     **/
    @lombok.extern.slf4j.Slf4j
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
    LifecycleState lifecycleState;

    /**
     * The date and time the volume was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The OCID of the volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
    String volumeId;

    /**
     * Whether in-transit encryption for the data volume's paravirtualized attachment is enabled or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
    Boolean isPvEncryptionInTransitEnabled;

    /**
     * Whether the attachment is multipath or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMultipath")
    Boolean isMultipath;
    /**
     * The iscsi login state of the volume attachment. For a multipath volume attachment,
     * all iscsi sessions need to be all logged-in or logged-out to be in logged-in or logged-out state.
     *
     **/
    @lombok.extern.slf4j.Slf4j
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
     * The iscsi login state of the volume attachment. For a multipath volume attachment,
     * all iscsi sessions need to be all logged-in or logged-out to be in logged-in or logged-out state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("iscsiLoginState")
    IscsiLoginState iscsiLoginState;
}
