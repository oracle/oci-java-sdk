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

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@NonFinal
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = AttachVolumeDetails.class
)
@JsonSubTypes({@JsonSubTypes.Type(value = AttachIScsiVolumeDetails.class, name = "iscsi")})
public class AttachVolumeDetails {

    /**
     * A user-friendly name. Does not have to be unique, and it cannot be changed.
     *
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the instance.
     **/
    @JsonProperty("instanceId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String instanceId;

    /**
     * The OCID of the volume.
     **/
    @JsonProperty("volumeId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String volumeId;
}
