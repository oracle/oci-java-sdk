/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@lombok.experimental.NonFinal
@lombok.AllArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = AttachVolumeDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AttachIScsiVolumeDetails.class,
        name = "iscsi"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AttachVolumeDetails {

    /**
     * A user-friendly name. Does not have to be unique, and it cannot be changed. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    String instanceId;

    /**
     * The OCID of the volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
    String volumeId;
}
