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
 * An object you create when setting up an IPSec VPN between your on-premise network
 * and VCN. The `Cpe` is a virtual representation of your Customer-Premises Equipment,
 * which is the actual router on-premise at your site at your end of the IPSec VPN connection.
 * For more information,
 * see [Overview of the Networking Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/overview.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = Cpe.Builder.class)
public class Cpe {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("id")
        private String id;

        @JsonProperty("ipAddress")
        private String ipAddress;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        public Cpe build() {
            return new Cpe(compartmentId, displayName, id, ipAddress, timeCreated);
        }

        @JsonIgnore
        public Builder copy(Cpe o) {
            return compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .id(o.getId())
                    .ipAddress(o.getIpAddress())
                    .timeCreated(o.getTimeCreated());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the compartment containing the CPE.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The CPE's Oracle ID (OCID).
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String id;

    /**
     * The public IP address of the on-premise router.
     **/
    @JsonProperty("ipAddress")
    @Valid
    @NotNull
    @Size(min = 1, max = 46)
    String ipAddress;

    /**
     * The date and time the CPE was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    Date timeCreated;
}
