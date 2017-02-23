/**
 * Copyright (c) 2016-2017 Oracle and/or its affiliates. All rights reserved.
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
 * Status of the IPSec connection.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = IPSecConnectionDeviceStatus.Builder.class)
public class IPSecConnectionDeviceStatus {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("id")
        private String id;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        @JsonProperty("tunnels")
        private List<TunnelStatus> tunnels;

        public IPSecConnectionDeviceStatus build() {
            return new IPSecConnectionDeviceStatus(compartmentId, id, timeCreated, tunnels);
        }

        @JsonIgnore
        public Builder copy(IPSecConnectionDeviceStatus o) {
            return compartmentId(o.getCompartmentId())
                    .id(o.getId())
                    .timeCreated(o.getTimeCreated())
                    .tunnels(o.getTunnels());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the compartment containing the IPSec connection.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * The IPSec connection's Oracle ID (OCID).
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String id;

    /**
     * The date and time the IPSec connection was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    Date timeCreated;

    /**
     * Two {@link TunnelStatus} objects.
     **/
    @JsonProperty("tunnels")
    List<TunnelStatus> tunnels;
}
