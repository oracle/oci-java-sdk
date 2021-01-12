/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Volume attachmentDetails. Please see {@link AttachVolumeDetails}
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
    property = "type",
    defaultImpl = InstanceConfigurationAttachVolumeDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = InstanceConfigurationIscsiAttachVolumeDetails.class,
        name = "iscsi"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = InstanceConfigurationParavirtualizedAttachVolumeDetails.class,
        name = "paravirtualized"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class InstanceConfigurationAttachVolumeDetails {

    /**
     * A user-friendly name. Does not have to be unique, and it cannot be changed. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Whether the attachment should be created in read-only mode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
    Boolean isReadOnly;

    /**
     * The device name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    String device;

    /**
     * Whether the attachment should be created in shareable mode. If an attachment
     * is created in shareable mode, then other instances can attach the same volume, provided
     * that they also create their attachments in shareable mode. Only certain volume types can
     * be attached in shareable mode. Defaults to false if not specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShareable")
    Boolean isShareable;
}
