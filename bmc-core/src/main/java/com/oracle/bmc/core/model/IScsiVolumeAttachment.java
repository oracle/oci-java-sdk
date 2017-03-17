/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * An ISCSI volume attachment.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = IScsiVolumeAttachment.Builder.class)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "attachmentType"
)
public class IScsiVolumeAttachment extends VolumeAttachment {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("availabilityDomain")
        private String availabilityDomain;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("id")
        private String id;

        @JsonProperty("instanceId")
        private String instanceId;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        @JsonProperty("volumeId")
        private String volumeId;

        @JsonProperty("chapSecret")
        private String chapSecret;

        @JsonProperty("chapUsername")
        private String chapUsername;

        @JsonProperty("ipv4")
        private String ipv4;

        @JsonProperty("iqn")
        private String iqn;

        @JsonProperty("port")
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

        @JsonIgnore
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
            Date timeCreated,
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
    @JsonProperty("chapSecret")
    String chapSecret;

    /**
     * The volume's system-generated Challenge-Handshake-Authentication-Protocol (CHAP) user name.
     * <p>
     * Example: `ocid1.volume.oc1.phx.abyhqljrgvttnlx73nmrwfaux7kcvzfs3s66izvxf2h4lgvyndsdsnoiwr5q`
     *
     **/
    @JsonProperty("chapUsername")
    String chapUsername;

    /**
     * The volume's iSCSI IP address.
     * <p>
     * Example: `169.254.0.2`
     *
     **/
    @JsonProperty("ipv4")
    @Valid
    @NotNull
    @Size(min = 7, max = 15)
    String ipv4;

    /**
     * The target volume's iSCSI Qualified Name in the format defined by RFC 3720.
     * <p>
     * Example: `iqn.2015-12.us.oracle.com:456b0391-17b8-4122-bbf1-f85fc0bb97d9`
     *
     **/
    @JsonProperty("iqn")
    @Valid
    @NotNull
    @Size(min = 1)
    String iqn;

    /**
     * The volume's iSCSI port.
     * <p>
     * Example: `3260`
     *
     **/
    @JsonProperty("port")
    @Valid
    @NotNull
    @Min(1)
    @Max(65535)
    Integer port;
}
