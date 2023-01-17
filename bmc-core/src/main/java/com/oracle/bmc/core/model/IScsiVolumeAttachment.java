/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IScsiVolumeAttachment.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "attachmentType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IScsiVolumeAttachment extends VolumeAttachment {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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
        /**
         * The Challenge-Handshake-Authentication-Protocol (CHAP) secret
         * valid for the associated CHAP user name.
         * (Also called the "CHAP password".)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("chapSecret")
        private String chapSecret;

        /**
         * The Challenge-Handshake-Authentication-Protocol (CHAP) secret
         * valid for the associated CHAP user name.
         * (Also called the "CHAP password".)
         *
         * @param chapSecret the value to set
         * @return this builder
         **/
        public Builder chapSecret(String chapSecret) {
            this.chapSecret = chapSecret;
            this.__explicitlySet__.add("chapSecret");
            return this;
        }
        /**
         * The volume's system-generated Challenge-Handshake-Authentication-Protocol
         * (CHAP) user name. See [RFC 1994](https://tools.ietf.org/html/rfc1994) for more on CHAP.
         * <p>
         * Example: {@code ocid1.volume.oc1.phx.<unique_ID>}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("chapUsername")
        private String chapUsername;

        /**
         * The volume's system-generated Challenge-Handshake-Authentication-Protocol
         * (CHAP) user name. See [RFC 1994](https://tools.ietf.org/html/rfc1994) for more on CHAP.
         * <p>
         * Example: {@code ocid1.volume.oc1.phx.<unique_ID>}
         *
         * @param chapUsername the value to set
         * @return this builder
         **/
        public Builder chapUsername(String chapUsername) {
            this.chapUsername = chapUsername;
            this.__explicitlySet__.add("chapUsername");
            return this;
        }
        /**
         * The volume's iSCSI IP address.
         * <p>
         * Example: {@code 169.254.0.2}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv4")
        private String ipv4;

        /**
         * The volume's iSCSI IP address.
         * <p>
         * Example: {@code 169.254.0.2}
         *
         * @param ipv4 the value to set
         * @return this builder
         **/
        public Builder ipv4(String ipv4) {
            this.ipv4 = ipv4;
            this.__explicitlySet__.add("ipv4");
            return this;
        }
        /**
         * The target volume's iSCSI Qualified Name in the format defined
         * by [RFC 3720](https://tools.ietf.org/html/rfc3720#page-32).
         * <p>
         * Example: {@code iqn.2015-12.us.oracle.com:<CHAP_username>}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("iqn")
        private String iqn;

        /**
         * The target volume's iSCSI Qualified Name in the format defined
         * by [RFC 3720](https://tools.ietf.org/html/rfc3720#page-32).
         * <p>
         * Example: {@code iqn.2015-12.us.oracle.com:<CHAP_username>}
         *
         * @param iqn the value to set
         * @return this builder
         **/
        public Builder iqn(String iqn) {
            this.iqn = iqn;
            this.__explicitlySet__.add("iqn");
            return this;
        }
        /**
         * The volume's iSCSI port, usually port 860 or 3260.
         * <p>
         * Example: {@code 3260}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The volume's iSCSI port, usually port 860 or 3260.
         * <p>
         * Example: {@code 3260}
         *
         * @param port the value to set
         * @return this builder
         **/
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * A list of secondary multipath devices
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("multipathDevices")
        private java.util.List<MultipathDevice> multipathDevices;

        /**
         * A list of secondary multipath devices
         * @param multipathDevices the value to set
         * @return this builder
         **/
        public Builder multipathDevices(java.util.List<MultipathDevice> multipathDevices) {
            this.multipathDevices = multipathDevices;
            this.__explicitlySet__.add("multipathDevices");
            return this;
        }
        /**
         * Refer the top-level definition of encryptionInTransitType.
         * The default value is NONE.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionInTransitType")
        private EncryptionInTransitType encryptionInTransitType;

        /**
         * Refer the top-level definition of encryptionInTransitType.
         * The default value is NONE.
         *
         * @param encryptionInTransitType the value to set
         * @return this builder
         **/
        public Builder encryptionInTransitType(EncryptionInTransitType encryptionInTransitType) {
            this.encryptionInTransitType = encryptionInTransitType;
            this.__explicitlySet__.add("encryptionInTransitType");
            return this;
        }
        /**
         * Whether Oracle Cloud Agent is enabled perform the iSCSI login and logout commands after the volume attach or detach operations for non multipath-enabled iSCSI attachments.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAgentAutoIscsiLoginEnabled")
        private Boolean isAgentAutoIscsiLoginEnabled;

        /**
         * Whether Oracle Cloud Agent is enabled perform the iSCSI login and logout commands after the volume attach or detach operations for non multipath-enabled iSCSI attachments.
         *
         * @param isAgentAutoIscsiLoginEnabled the value to set
         * @return this builder
         **/
        public Builder isAgentAutoIscsiLoginEnabled(Boolean isAgentAutoIscsiLoginEnabled) {
            this.isAgentAutoIscsiLoginEnabled = isAgentAutoIscsiLoginEnabled;
            this.__explicitlySet__.add("isAgentAutoIscsiLoginEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IScsiVolumeAttachment build() {
            IScsiVolumeAttachment model =
                    new IScsiVolumeAttachment(
                            this.availabilityDomain,
                            this.compartmentId,
                            this.device,
                            this.displayName,
                            this.id,
                            this.instanceId,
                            this.isReadOnly,
                            this.isShareable,
                            this.lifecycleState,
                            this.timeCreated,
                            this.volumeId,
                            this.isPvEncryptionInTransitEnabled,
                            this.isMultipath,
                            this.iscsiLoginState,
                            this.chapSecret,
                            this.chapUsername,
                            this.ipv4,
                            this.iqn,
                            this.port,
                            this.multipathDevices,
                            this.encryptionInTransitType,
                            this.isAgentAutoIscsiLoginEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IScsiVolumeAttachment model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("device")) {
                this.device(model.getDevice());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("isReadOnly")) {
                this.isReadOnly(model.getIsReadOnly());
            }
            if (model.wasPropertyExplicitlySet("isShareable")) {
                this.isShareable(model.getIsShareable());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("volumeId")) {
                this.volumeId(model.getVolumeId());
            }
            if (model.wasPropertyExplicitlySet("isPvEncryptionInTransitEnabled")) {
                this.isPvEncryptionInTransitEnabled(model.getIsPvEncryptionInTransitEnabled());
            }
            if (model.wasPropertyExplicitlySet("isMultipath")) {
                this.isMultipath(model.getIsMultipath());
            }
            if (model.wasPropertyExplicitlySet("iscsiLoginState")) {
                this.iscsiLoginState(model.getIscsiLoginState());
            }
            if (model.wasPropertyExplicitlySet("chapSecret")) {
                this.chapSecret(model.getChapSecret());
            }
            if (model.wasPropertyExplicitlySet("chapUsername")) {
                this.chapUsername(model.getChapUsername());
            }
            if (model.wasPropertyExplicitlySet("ipv4")) {
                this.ipv4(model.getIpv4());
            }
            if (model.wasPropertyExplicitlySet("iqn")) {
                this.iqn(model.getIqn());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("multipathDevices")) {
                this.multipathDevices(model.getMultipathDevices());
            }
            if (model.wasPropertyExplicitlySet("encryptionInTransitType")) {
                this.encryptionInTransitType(model.getEncryptionInTransitType());
            }
            if (model.wasPropertyExplicitlySet("isAgentAutoIscsiLoginEnabled")) {
                this.isAgentAutoIscsiLoginEnabled(model.getIsAgentAutoIscsiLoginEnabled());
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
            EncryptionInTransitType encryptionInTransitType,
            Boolean isAgentAutoIscsiLoginEnabled) {
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
        this.isAgentAutoIscsiLoginEnabled = isAgentAutoIscsiLoginEnabled;
    }

    /**
     * The Challenge-Handshake-Authentication-Protocol (CHAP) secret
     * valid for the associated CHAP user name.
     * (Also called the "CHAP password".)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chapSecret")
    private final String chapSecret;

    /**
     * The Challenge-Handshake-Authentication-Protocol (CHAP) secret
     * valid for the associated CHAP user name.
     * (Also called the "CHAP password".)
     *
     * @return the value
     **/
    public String getChapSecret() {
        return chapSecret;
    }

    /**
     * The volume's system-generated Challenge-Handshake-Authentication-Protocol
     * (CHAP) user name. See [RFC 1994](https://tools.ietf.org/html/rfc1994) for more on CHAP.
     * <p>
     * Example: {@code ocid1.volume.oc1.phx.<unique_ID>}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chapUsername")
    private final String chapUsername;

    /**
     * The volume's system-generated Challenge-Handshake-Authentication-Protocol
     * (CHAP) user name. See [RFC 1994](https://tools.ietf.org/html/rfc1994) for more on CHAP.
     * <p>
     * Example: {@code ocid1.volume.oc1.phx.<unique_ID>}
     *
     * @return the value
     **/
    public String getChapUsername() {
        return chapUsername;
    }

    /**
     * The volume's iSCSI IP address.
     * <p>
     * Example: {@code 169.254.0.2}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv4")
    private final String ipv4;

    /**
     * The volume's iSCSI IP address.
     * <p>
     * Example: {@code 169.254.0.2}
     *
     * @return the value
     **/
    public String getIpv4() {
        return ipv4;
    }

    /**
     * The target volume's iSCSI Qualified Name in the format defined
     * by [RFC 3720](https://tools.ietf.org/html/rfc3720#page-32).
     * <p>
     * Example: {@code iqn.2015-12.us.oracle.com:<CHAP_username>}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("iqn")
    private final String iqn;

    /**
     * The target volume's iSCSI Qualified Name in the format defined
     * by [RFC 3720](https://tools.ietf.org/html/rfc3720#page-32).
     * <p>
     * Example: {@code iqn.2015-12.us.oracle.com:<CHAP_username>}
     *
     * @return the value
     **/
    public String getIqn() {
        return iqn;
    }

    /**
     * The volume's iSCSI port, usually port 860 or 3260.
     * <p>
     * Example: {@code 3260}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The volume's iSCSI port, usually port 860 or 3260.
     * <p>
     * Example: {@code 3260}
     *
     * @return the value
     **/
    public Integer getPort() {
        return port;
    }

    /**
     * A list of secondary multipath devices
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("multipathDevices")
    private final java.util.List<MultipathDevice> multipathDevices;

    /**
     * A list of secondary multipath devices
     * @return the value
     **/
    public java.util.List<MultipathDevice> getMultipathDevices() {
        return multipathDevices;
    }

    /**
     * Refer the top-level definition of encryptionInTransitType.
     * The default value is NONE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionInTransitType")
    private final EncryptionInTransitType encryptionInTransitType;

    /**
     * Refer the top-level definition of encryptionInTransitType.
     * The default value is NONE.
     *
     * @return the value
     **/
    public EncryptionInTransitType getEncryptionInTransitType() {
        return encryptionInTransitType;
    }

    /**
     * Whether Oracle Cloud Agent is enabled perform the iSCSI login and logout commands after the volume attach or detach operations for non multipath-enabled iSCSI attachments.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAgentAutoIscsiLoginEnabled")
    private final Boolean isAgentAutoIscsiLoginEnabled;

    /**
     * Whether Oracle Cloud Agent is enabled perform the iSCSI login and logout commands after the volume attach or detach operations for non multipath-enabled iSCSI attachments.
     *
     * @return the value
     **/
    public Boolean getIsAgentAutoIscsiLoginEnabled() {
        return isAgentAutoIscsiLoginEnabled;
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
        sb.append("IScsiVolumeAttachment(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", chapSecret=").append(String.valueOf(this.chapSecret));
        sb.append(", chapUsername=").append(String.valueOf(this.chapUsername));
        sb.append(", ipv4=").append(String.valueOf(this.ipv4));
        sb.append(", iqn=").append(String.valueOf(this.iqn));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", multipathDevices=").append(String.valueOf(this.multipathDevices));
        sb.append(", encryptionInTransitType=")
                .append(String.valueOf(this.encryptionInTransitType));
        sb.append(", isAgentAutoIscsiLoginEnabled=")
                .append(String.valueOf(this.isAgentAutoIscsiLoginEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IScsiVolumeAttachment)) {
            return false;
        }

        IScsiVolumeAttachment other = (IScsiVolumeAttachment) o;
        return java.util.Objects.equals(this.chapSecret, other.chapSecret)
                && java.util.Objects.equals(this.chapUsername, other.chapUsername)
                && java.util.Objects.equals(this.ipv4, other.ipv4)
                && java.util.Objects.equals(this.iqn, other.iqn)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.multipathDevices, other.multipathDevices)
                && java.util.Objects.equals(
                        this.encryptionInTransitType, other.encryptionInTransitType)
                && java.util.Objects.equals(
                        this.isAgentAutoIscsiLoginEnabled, other.isAgentAutoIscsiLoginEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.chapSecret == null ? 43 : this.chapSecret.hashCode());
        result = (result * PRIME) + (this.chapUsername == null ? 43 : this.chapUsername.hashCode());
        result = (result * PRIME) + (this.ipv4 == null ? 43 : this.ipv4.hashCode());
        result = (result * PRIME) + (this.iqn == null ? 43 : this.iqn.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result =
                (result * PRIME)
                        + (this.multipathDevices == null ? 43 : this.multipathDevices.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionInTransitType == null
                                ? 43
                                : this.encryptionInTransitType.hashCode());
        result =
                (result * PRIME)
                        + (this.isAgentAutoIscsiLoginEnabled == null
                                ? 43
                                : this.isAgentAutoIscsiLoginEnabled.hashCode());
        return result;
    }
}
