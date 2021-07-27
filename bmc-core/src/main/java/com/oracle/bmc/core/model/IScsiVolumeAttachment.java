/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * An ISCSI volume attachment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IScsiVolumeAttachment.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "attachmentType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class IScsiVolumeAttachment extends VolumeAttachment {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("device")
        private String device;

        public Builder device(String device) {
            this.device = device;
            this.__explicitlySet__.add("device");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
        private Boolean isReadOnly;

        public Builder isReadOnly(Boolean isReadOnly) {
            this.isReadOnly = isReadOnly;
            this.__explicitlySet__.add("isReadOnly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isShareable")
        private Boolean isShareable;

        public Builder isShareable(Boolean isShareable) {
            this.isShareable = isShareable;
            this.__explicitlySet__.add("isShareable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
        private String volumeId;

        public Builder volumeId(String volumeId) {
            this.volumeId = volumeId;
            this.__explicitlySet__.add("volumeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPvEncryptionInTransitEnabled")
        private Boolean isPvEncryptionInTransitEnabled;

        public Builder isPvEncryptionInTransitEnabled(Boolean isPvEncryptionInTransitEnabled) {
            this.isPvEncryptionInTransitEnabled = isPvEncryptionInTransitEnabled;
            this.__explicitlySet__.add("isPvEncryptionInTransitEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMultipath")
        private Boolean isMultipath;

        public Builder isMultipath(Boolean isMultipath) {
            this.isMultipath = isMultipath;
            this.__explicitlySet__.add("isMultipath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("iscsiLoginState")
        private IscsiLoginState iscsiLoginState;

        public Builder iscsiLoginState(IscsiLoginState iscsiLoginState) {
            this.iscsiLoginState = iscsiLoginState;
            this.__explicitlySet__.add("iscsiLoginState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("chapSecret")
        private String chapSecret;

        public Builder chapSecret(String chapSecret) {
            this.chapSecret = chapSecret;
            this.__explicitlySet__.add("chapSecret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("chapUsername")
        private String chapUsername;

        public Builder chapUsername(String chapUsername) {
            this.chapUsername = chapUsername;
            this.__explicitlySet__.add("chapUsername");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipv4")
        private String ipv4;

        public Builder ipv4(String ipv4) {
            this.ipv4 = ipv4;
            this.__explicitlySet__.add("ipv4");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("iqn")
        private String iqn;

        public Builder iqn(String iqn) {
            this.iqn = iqn;
            this.__explicitlySet__.add("iqn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("multipathDevices")
        private java.util.List<MultipathDevice> multipathDevices;

        public Builder multipathDevices(java.util.List<MultipathDevice> multipathDevices) {
            this.multipathDevices = multipathDevices;
            this.__explicitlySet__.add("multipathDevices");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionInTransitType")
        private EncryptionInTransitType encryptionInTransitType;

        public Builder encryptionInTransitType(EncryptionInTransitType encryptionInTransitType) {
            this.encryptionInTransitType = encryptionInTransitType;
            this.__explicitlySet__.add("encryptionInTransitType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IScsiVolumeAttachment build() {
            IScsiVolumeAttachment __instance__ =
                    new IScsiVolumeAttachment(
                            availabilityDomain,
                            compartmentId,
                            device,
                            displayName,
                            id,
                            instanceId,
                            isReadOnly,
                            isShareable,
                            lifecycleState,
                            timeCreated,
                            volumeId,
                            isPvEncryptionInTransitEnabled,
                            isMultipath,
                            iscsiLoginState,
                            chapSecret,
                            chapUsername,
                            ipv4,
                            iqn,
                            port,
                            multipathDevices,
                            encryptionInTransitType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IScsiVolumeAttachment o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .compartmentId(o.getCompartmentId())
                            .device(o.getDevice())
                            .displayName(o.getDisplayName())
                            .id(o.getId())
                            .instanceId(o.getInstanceId())
                            .isReadOnly(o.getIsReadOnly())
                            .isShareable(o.getIsShareable())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .volumeId(o.getVolumeId())
                            .isPvEncryptionInTransitEnabled(o.getIsPvEncryptionInTransitEnabled())
                            .isMultipath(o.getIsMultipath())
                            .iscsiLoginState(o.getIscsiLoginState())
                            .chapSecret(o.getChapSecret())
                            .chapUsername(o.getChapUsername())
                            .ipv4(o.getIpv4())
                            .iqn(o.getIqn())
                            .port(o.getPort())
                            .multipathDevices(o.getMultipathDevices())
                            .encryptionInTransitType(o.getEncryptionInTransitType());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public IScsiVolumeAttachment(
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
            IscsiLoginState iscsiLoginState,
            String chapSecret,
            String chapUsername,
            String ipv4,
            String iqn,
            Integer port,
            java.util.List<MultipathDevice> multipathDevices,
            EncryptionInTransitType encryptionInTransitType) {
        super(
                availabilityDomain,
                compartmentId,
                device,
                displayName,
                id,
                instanceId,
                isReadOnly,
                isShareable,
                lifecycleState,
                timeCreated,
                volumeId,
                isPvEncryptionInTransitEnabled,
                isMultipath,
                iscsiLoginState);
        this.chapSecret = chapSecret;
        this.chapUsername = chapUsername;
        this.ipv4 = ipv4;
        this.iqn = iqn;
        this.port = port;
        this.multipathDevices = multipathDevices;
        this.encryptionInTransitType = encryptionInTransitType;
    }

    /**
     * The Challenge-Handshake-Authentication-Protocol (CHAP) secret
     * valid for the associated CHAP user name.
     * (Also called the "CHAP password".)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chapSecret")
    String chapSecret;

    /**
     * The volume's system-generated Challenge-Handshake-Authentication-Protocol
     * (CHAP) user name. See [RFC 1994](https://tools.ietf.org/html/rfc1994) for more on CHAP.
     * <p>
     * Example: {@code ocid1.volume.oc1.phx.<unique_ID>}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chapUsername")
    String chapUsername;

    /**
     * The volume's iSCSI IP address.
     * <p>
     * Example: {@code 169.254.0.2}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv4")
    String ipv4;

    /**
     * The target volume's iSCSI Qualified Name in the format defined
     * by [RFC 3720](https://tools.ietf.org/html/rfc3720#page-32).
     * <p>
     * Example: {@code iqn.2015-12.us.oracle.com:<CHAP_username>}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("iqn")
    String iqn;

    /**
     * The volume's iSCSI port, usually port 860 or 3260.
     * <p>
     * Example: {@code 3260}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    Integer port;

    /**
     * A list of secondary multipath devices
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("multipathDevices")
    java.util.List<MultipathDevice> multipathDevices;

    /**
     * Refer the top-level definition of encryptionInTransitType.
     * The default value is NONE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionInTransitType")
    EncryptionInTransitType encryptionInTransitType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
