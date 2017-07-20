/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * An ISCSI volume attachment.
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
public class IScsiVolumeAttachment extends VolumeAttachment {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
        private String volumeId;

        @com.fasterxml.jackson.annotation.JsonProperty("chapSecret")
        private String chapSecret;

        @com.fasterxml.jackson.annotation.JsonProperty("chapUsername")
        private String chapUsername;

        @com.fasterxml.jackson.annotation.JsonProperty("ipv4")
        private String ipv4;

        @com.fasterxml.jackson.annotation.JsonProperty("iqn")
        private String iqn;

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public IScsiVolumeAttachment build() {
            return new IScsiVolumeAttachment(
                    availabilityDomain,
                    compartmentId,
                    displayName,
                    id,
                    instanceId,
                    lifecycleState,
                    timeCreated,
                    volumeId,
                    chapSecret,
                    chapUsername,
                    ipv4,
                    iqn,
                    port);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IScsiVolumeAttachment o) {
            return availabilityDomain(o.getAvailabilityDomain())
                    .compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .id(o.getId())
                    .instanceId(o.getInstanceId())
                    .lifecycleState(o.getLifecycleState())
                    .timeCreated(o.getTimeCreated())
                    .volumeId(o.getVolumeId())
                    .chapSecret(o.getChapSecret())
                    .chapUsername(o.getChapUsername())
                    .ipv4(o.getIpv4())
                    .iqn(o.getIqn())
                    .port(o.getPort());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public IScsiVolumeAttachment(
            String availabilityDomain,
            String compartmentId,
            String displayName,
            String id,
            String instanceId,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            String volumeId,
            String chapSecret,
            String chapUsername,
            String ipv4,
            String iqn,
            Integer port) {
        super(
                availabilityDomain,
                compartmentId,
                displayName,
                id,
                instanceId,
                lifecycleState,
                timeCreated,
                volumeId);
        this.chapSecret = chapSecret;
        this.chapUsername = chapUsername;
        this.ipv4 = ipv4;
        this.iqn = iqn;
        this.port = port;
    }

    /**
     * The Challenge-Handshake-Authentication-Protocol (CHAP) secret valid for the associated CHAP user name.
     * (Also called the \"CHAP password\".)
     * <p>
     * Example: `d6866c0d-298b-48ba-95af-309b4faux45e`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chapSecret")
    String chapSecret;

    /**
     * The volume's system-generated Challenge-Handshake-Authentication-Protocol (CHAP) user name.
     * <p>
     * Example: `ocid1.volume.oc1.phx.abyhqljrgvttnlx73nmrwfaux7kcvzfs3s66izvxf2h4lgvyndsdsnoiwr5q`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chapUsername")
    String chapUsername;

    /**
     * The volume's iSCSI IP address.
     * <p>
     * Example: `169.254.0.2`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv4")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 7, max = 15)
    String ipv4;

    /**
     * The target volume's iSCSI Qualified Name in the format defined by RFC 3720.
     * <p>
     * Example: `iqn.2015-12.us.oracle.com:456b0391-17b8-4122-bbf1-f85fc0bb97d9`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("iqn")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1)
    String iqn;

    /**
     * The volume's iSCSI port.
     * <p>
     * Example: `3260`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Min(1)
    @javax.validation.constraints.Max(65535)
    Integer port;
}
