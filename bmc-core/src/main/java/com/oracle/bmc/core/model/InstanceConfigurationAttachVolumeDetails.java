/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Volume attachmentDetails. Please see {@link AttachVolumeDetails} <br>
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
        defaultImpl = InstanceConfigurationAttachVolumeDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InstanceConfigurationIscsiAttachVolumeDetails.class,
            name = "iscsi"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InstanceConfigurationParavirtualizedAttachVolumeDetails.class,
            name = "paravirtualized")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class InstanceConfigurationAttachVolumeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "isReadOnly", "device", "isShareable"})
    protected InstanceConfigurationAttachVolumeDetails(
            String displayName, Boolean isReadOnly, String device, Boolean isShareable) {
        super();
        this.displayName = displayName;
        this.isReadOnly = isReadOnly;
        this.device = device;
        this.isShareable = isShareable;
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

    /** Whether the attachment should be created in read-only mode. */
    @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
    private final Boolean isReadOnly;

    /**
     * Whether the attachment should be created in read-only mode.
     *
     * @return the value
     */
    public Boolean getIsReadOnly() {
        return isReadOnly;
    }

    /** The device name. */
    @com.fasterxml.jackson.annotation.JsonProperty("device")
    private final String device;

    /**
     * The device name.
     *
     * @return the value
     */
    public String getDevice() {
        return device;
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
        sb.append("InstanceConfigurationAttachVolumeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", isReadOnly=").append(String.valueOf(this.isReadOnly));
        sb.append(", device=").append(String.valueOf(this.device));
        sb.append(", isShareable=").append(String.valueOf(this.isShareable));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceConfigurationAttachVolumeDetails)) {
            return false;
        }

        InstanceConfigurationAttachVolumeDetails other =
                (InstanceConfigurationAttachVolumeDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isReadOnly, other.isReadOnly)
                && java.util.Objects.equals(this.device, other.device)
                && java.util.Objects.equals(this.isShareable, other.isShareable)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.isReadOnly == null ? 43 : this.isReadOnly.hashCode());
        result = (result * PRIME) + (this.device == null ? 43 : this.device.hashCode());
        result = (result * PRIME) + (this.isShareable == null ? 43 : this.isShareable.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
