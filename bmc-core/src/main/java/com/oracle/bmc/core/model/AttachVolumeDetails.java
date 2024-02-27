/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = AttachVolumeDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AttachServiceDeterminedVolumeDetails.class,
            name = "service_determined"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AttachEmulatedVolumeDetails.class,
            name = "emulated"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AttachIScsiVolumeDetails.class,
            name = "iscsi"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AttachParavirtualizedVolumeDetails.class,
            name = "paravirtualized")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class AttachVolumeDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "device",
        "displayName",
        "instanceId",
        "isReadOnly",
        "isShareable",
        "volumeId"
    })
    protected AttachVolumeDetails(
            String device,
            String displayName,
            String instanceId,
            Boolean isReadOnly,
            Boolean isShareable,
            String volumeId) {
        super();
        this.device = device;
        this.displayName = displayName;
        this.instanceId = instanceId;
        this.isReadOnly = isReadOnly;
        this.isShareable = isShareable;
        this.volumeId = volumeId;
    }

    /**
     * The device name. To retrieve a list of devices for a given instance, see {@link
     * #listInstanceDevices(ListInstanceDevicesRequest) listInstanceDevices}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    private final String device;

    /**
     * The device name. To retrieve a list of devices for a given instance, see {@link
     * #listInstanceDevices(ListInstanceDevicesRequest) listInstanceDevices}.
     *
     * @return the value
     */
    public String getDevice() {
        return device;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the instance. For AttachVolume operation, this is a required field for the
     * request, see {@link #attachVolume(AttachVolumeRequest) attachVolume}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * The OCID of the instance. For AttachVolume operation, this is a required field for the
     * request, see {@link #attachVolume(AttachVolumeRequest) attachVolume}.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /** Whether the attachment was created in read-only mode. */
    @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
    private final Boolean isReadOnly;

    /**
     * Whether the attachment was created in read-only mode.
     *
     * @return the value
     */
    public Boolean getIsReadOnly() {
        return isReadOnly;
    }

    /**
     * Whether the attachment should be created in shareable mode. If an attachment is created in
     * shareable mode, then other instances can attach the same volume, provided that they also
     * create their attachments in shareable mode. Only certain volume types can be attached in
     * shareable mode. Defaults to false if not specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isShareable")
    private final Boolean isShareable;

    /**
     * Whether the attachment should be created in shareable mode. If an attachment is created in
     * shareable mode, then other instances can attach the same volume, provided that they also
     * create their attachments in shareable mode. Only certain volume types can be attached in
     * shareable mode. Defaults to false if not specified.
     *
     * @return the value
     */
    public Boolean getIsShareable() {
        return isShareable;
    }

    /**
     * The OCID of the volume. If CreateVolumeDetails is specified, this field must be omitted from
     * the request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeId")
    private final String volumeId;

    /**
     * The OCID of the volume. If CreateVolumeDetails is specified, this field must be omitted from
     * the request.
     *
     * @return the value
     */
    public String getVolumeId() {
        return volumeId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AttachVolumeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("device=").append(String.valueOf(this.device));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", isReadOnly=").append(String.valueOf(this.isReadOnly));
        sb.append(", isShareable=").append(String.valueOf(this.isShareable));
        sb.append(", volumeId=").append(String.valueOf(this.volumeId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachVolumeDetails)) {
            return false;
        }

        AttachVolumeDetails other = (AttachVolumeDetails) o;
        return java.util.Objects.equals(this.device, other.device)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.isReadOnly, other.isReadOnly)
                && java.util.Objects.equals(this.isShareable, other.isShareable)
                && java.util.Objects.equals(this.volumeId, other.volumeId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.device == null ? 43 : this.device.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.isReadOnly == null ? 43 : this.isReadOnly.hashCode());
        result = (result * PRIME) + (this.isShareable == null ? 43 : this.isShareable.hashCode());
        result = (result * PRIME) + (this.volumeId == null ? 43 : this.volumeId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
